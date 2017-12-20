package it.raffo.cmis.documentum;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.activation.MimetypesFileTypeMap;

import org.apache.chemistry.opencmis.client.api.ObjectId;
import org.apache.chemistry.opencmis.client.api.OperationContext;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.util.OperationContextUtils;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.impl.IOUtils;
import org.apache.log4j.Logger;

public class CmisUtil {

	private static Logger _log;
	private CMISClientHelperSP cmsClientHlp = null; 
	private Session sessionCMIS = null;
	
	public CmisUtil() {
		_log = org.apache.log4j.Logger.getLogger(CmisUtil.class);
	}
	
	public void close() {
		String METHOD_NAME = "close()"+" - ";
		_log.debug(METHOD_NAME+"session="+System.identityHashCode(sessionCMIS));
		if (sessionCMIS!=null) {
			cmsClientHlp.releaseSession(sessionCMIS);
		}
	}

	public void init(String fileProp)
	{
		String METHOD_NAME = "init()"+" - ";
		_log.debug(METHOD_NAME+" fileProp="+fileProp);
		// carichiamo la configurazione
		@SuppressWarnings("unused")
		java.util.Properties cfgProperties=new java.util.Properties();      

		// instanziamo l'helper
		cmsClientHlp=CMISClientHelperSP.getInstance();
		
		cmsClientHlp.loadProperties(fileProp);
		
		try 
		{
			sessionCMIS = cmsClientHlp.createCmisRepositorySession();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			_log.error(METHOD_NAME+e.getMessage());
		}
		
	}
	
	public String getMimeType(File file) {
		MimetypesFileTypeMap mime = new MimetypesFileTypeMap();
		String contentType = mime.getContentType(file);
		return contentType;
	}

	public ObjDocumentum readByName(String typeDocument, String nameFileCMIS, boolean isCacheEnable) throws Exception 
	{
		String METHOD_NAME          = "read()"+" - ";
		long timeStart              = System.currentTimeMillis();
		OperationContext opCtxMin   = null;
		String id                   = null; 
		ObjectId cmisDocId          = null;
		ObjDocumentum objDocumentum = null;
		byte contenuto[]            = null;  

		_log.debug(METHOD_NAME + "INIZIO " );

		timeStart = System.currentTimeMillis();
		opCtxMin  = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		id        = cmsClientHlp.getFirstIdByName(sessionCMIS, typeDocument, nameFileCMIS, isCacheEnable);
		cmisDocId = sessionCMIS.getObject(id,opCtxMin);
		
		_log.debug(METHOD_NAME + "document_id = " + id );
		
		if (id!=null && id.trim().length()>0) {
			objDocumentum = new ObjDocumentum();
			//preparo lo stream del contenuto da caricare sul repository
	        ContentStream cmisStream=sessionCMIS.getContentStream(cmisDocId);
	        
	        contenuto=org.apache.commons.io.IOUtils.toByteArray(cmisStream.getStream());
	        
	        objDocumentum.setContenuto(contenuto);
	        objDocumentum.setMimeType(cmisStream.getMimeType());
	        objDocumentum.setFileNameOrig(cmisStream.getFileName());
	        objDocumentum.setFileNameCmis(nameFileCMIS);
	        objDocumentum.setObjectID(id);
	        objDocumentum.setCmisType(typeDocument);
	        
	        _log.debug(METHOD_NAME + "Recuperato contenuto Documento con Name Orig: " + cmisStream.getFileName() + " e name CMIS:" +nameFileCMIS);
	        
		}
		else {
			_log.info("Documento non trovato");
			throw new Exception("Documento non trovato");
		}
		_log.info(METHOD_NAME + "FINE: in " + (System.currentTimeMillis()-timeStart) + " msec");
		
		return objDocumentum;
	}
	
	public ObjDocumentum readById(String typeDocument, String id, boolean isCacheEnable) throws Exception 
	{
		String METHOD_NAME          = "read()"+" - ";
		long timeStart              = System.currentTimeMillis();
		OperationContext opCtxMin   = null;
		ObjectId cmisDocId          = null;
		ObjDocumentum objDocumentum = null;
		String fileNameCmis         = null;
		byte contenuto[]            = null;  

		_log.debug(METHOD_NAME + "INIZIO " );

		timeStart    = System.currentTimeMillis();
		opCtxMin     = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		fileNameCmis = cmsClientHlp.getFirstIdByName(sessionCMIS, typeDocument, id, isCacheEnable);
		cmisDocId    = sessionCMIS.getObject(id,opCtxMin);
		
		_log.debug(METHOD_NAME + "document_id = " + id );
		
		if (id!=null && id.trim().length()>0) {
			objDocumentum = new ObjDocumentum();
			//preparo lo stream del contenuto da caricare sul repository
	        ContentStream cmisStream=sessionCMIS.getContentStream(cmisDocId);
	        
	        contenuto=org.apache.commons.io.IOUtils.toByteArray(cmisStream.getStream());
	        
	        objDocumentum.setContenuto(contenuto);
	        objDocumentum.setMimeType(cmisStream.getMimeType());
	        objDocumentum.setFileNameCmis(fileNameCmis);
	        objDocumentum.setFileNameOrig(cmisStream.getFileName());
	        objDocumentum.setObjectID(id);
	        objDocumentum.setCmisType(typeDocument);
	        
	        _log.debug(METHOD_NAME + "Recuperato contenuto Documento con Name Orig: " + cmisStream.getFileName() + " e name ObjectId:" +id);
	        
		}
		else {
			_log.info("Documento non trovato");
			throw new Exception("Documento non trovato");
		}
		_log.info(METHOD_NAME + "FINE: in " + (System.currentTimeMillis()-timeStart) + " msec");
		
		return objDocumentum;
	}
	
	public void update(ObjDocumentum documentum, boolean isCacheEnable, String typeDocument) throws Exception 
	{
		String METHOD_NAME             = "update()"+" - ";
		long timeStart                 = System.currentTimeMillis();
		ContentStream contentStream    = null;
		Map<String, Object> properties = null;
		String docid                   = ""; 
		
		_log.debug(METHOD_NAME+"INIZIO: ");
		
		docid = cmsClientHlp.getFirstIdByName(sessionCMIS, typeDocument, documentum.getFileNameCmis(), isCacheEnable);
		
		try {
			
			
			// eseguiamo l'update su CMIS
			contentStream = cmsClientHlp.cmisLocalFileToContentStream(documentum);
			properties = documentum.getProperties();
				
			cmsClientHlp.updateDoc(sessionCMIS, docid, contentStream, properties);
			
			_log.info(METHOD_NAME+ "FINE: in " + (System.currentTimeMillis()-timeStart) + " msec");
			
		} 
		finally 
		{
			if (contentStream!=null)
			{
				IOUtils.closeQuietly(contentStream);
			}
		}
	}
	
	public void delete(String fileNameCmis, boolean isCacheEnable, String typeDocument) throws Exception 
	{
		String METHOD_NAME             = "update()"+" - ";
		long timeStart                 = System.currentTimeMillis();
		ContentStream contentStream    = null;
		String docid                   = ""; 
		
		_log.debug(METHOD_NAME+"INIZIO: ");
		
		docid = cmsClientHlp.getFirstIdByName(sessionCMIS, typeDocument, fileNameCmis, isCacheEnable);
		
		try {

			cmsClientHlp.deleteDoc(sessionCMIS, docid);
			
			_log.info(METHOD_NAME+ "FINE: in " + (System.currentTimeMillis()-timeStart) + " msec");
			
		} 
		finally 
		{
			if (contentStream!=null)
			{
				IOUtils.closeQuietly(contentStream);
			}
		}
	}
	
	
	public void createNewVersion(ObjDocumentum documentum, boolean isCacheEnable, String typeDocument, boolean majorVersion, String comment) throws Exception 
	{
		String METHOD_NAME             = "createNewVersion()"+" - ";
		long timeStart                 = System.currentTimeMillis();
		ContentStream contentStream    = null;
		Map<String, Object> properties = null;
		String docid                   = ""; 
		
		docid = cmsClientHlp.getFirstIdByName(sessionCMIS, typeDocument, documentum.getFileNameCmis(), isCacheEnable);
		
		try {
			_log.debug(METHOD_NAME+"INIZIO: ");
			
			// eseguiamo l'update su CMIS
			contentStream = cmsClientHlp.cmisLocalFileToContentStream(documentum);
			properties = documentum.getProperties();
				
			cmsClientHlp.createNewVersion(sessionCMIS, docid, contentStream, majorVersion, properties, comment);
			
			_log.info(METHOD_NAME+ "FINE: in " + (System.currentTimeMillis()-timeStart) + " msec");
			
		} 
		finally 
		{
			if (contentStream!=null)
			{
				IOUtils.closeQuietly(contentStream);
			}
		}
	}
	
	public void write(ObjDocumentum documentum, boolean isCacheEnable, String folderID, String typeDocument) throws Exception 
	{
		String METHOD_NAME             = "write()"+" - ";
		long timeStart                 = System.currentTimeMillis();
		ContentStream contentStream    = null;
		Map<String, Object> properties = null;
		ObjectId parentId              = null;
		ObjectId objectID              = null;
		
		try {
			_log.debug(METHOD_NAME+"INIZIO: ");
			
			// eseguiamo la scrittura su CMIS
			contentStream = cmsClientHlp.cmisLocalFileToContentStream(documentum);
					
			properties = documentum.getProperties();
				
			parentId = cmsClientHlp.getFolderId(sessionCMIS, "/"+folderID, isCacheEnable);
			objectID=cmsClientHlp.createDocument(sessionCMIS, properties, contentStream, parentId);
			
			documentum.setObjectID(objectID.getId());
			documentum.setCmisType(typeDocument);
			
			_log.info(METHOD_NAME+ "Scritto file "+documentum.getFileNameCmis()+" con objectID= "+objectID.getId()+" : in " + (System.currentTimeMillis()-timeStart) + " msec");
			
		} finally 
		{
			if (contentStream!=null)
			{
				IOUtils.closeQuietly(contentStream);
			}
		}
	}
	
	
	
	public void listAllDocuments(String typeDocument, List<ObjDocumentum> allIDocuments) 
	{
		cmsClientHlp.listAllDocuments(sessionCMIS,typeDocument,allIDocuments);
	}
	
}
