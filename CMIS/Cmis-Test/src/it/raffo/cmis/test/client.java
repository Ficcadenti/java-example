package it.raffo.cmis.test;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import it.raffo.cmis.documentum.CmisUtil;
import it.raffo.cmis.documentum.ObjDocumentum;


public class client {

	private static Logger _log;

	public static void main(String[] args) {
		String METHOD_NAME = "main()"+" - ";
		_log = org.apache.log4j.Logger.getLogger(client.class);
		String log4jConfPath = "/resources/log4j-client.properties";
		PropertyConfigurator.configure(client.class.getResourceAsStream(log4jConfPath));

		_log.info(METHOD_NAME+"START");
		
		CmisUtil cmisUtil=new CmisUtil();
		cmisUtil.init("/resources/test-cmisclient.properties");
		
		String typeFile     = "testFile";
		String folder       = "test_raffo";
		String nameFileCmis = "DOC2.pdf";
		String ObjectID     = "145";
		
		_log.info(METHOD_NAME+"typeFile     = "+typeFile);
		_log.info(METHOD_NAME+"folder       = "+folder);
		_log.info(METHOD_NAME+"nameFileCmis = "+nameFileCmis);
		
		
		_log.info(METHOD_NAME+"**********TEST LISTA DA DOCUMENTUM *********");
		
		// TEST Lista
		List<ObjDocumentum> allNameDocuments = new ArrayList<ObjDocumentum>();
		cmisUtil.listAllDocuments(typeFile, allNameDocuments);
		
		for (ObjDocumentum item : allNameDocuments) {
			_log.info(METHOD_NAME+"Name CIMIS: "+item.getFileNameCmis()+" OBJECT_ID: "+item.getObjectID());
		}

		_log.info(METHOD_NAME+"**********TEST LETTURA DA DOCUMENTUM BY NAME *********");
		
		// TEST LETTURA da documentum
		try {
			ObjDocumentum obj=cmisUtil.readByName(typeFile,nameFileCmis,false);
			if(obj!=null)
			{
				//cmisUtil.writeDoc(obj.getCmisStream(), "d:/raffo.pdf");
				writeStreamToLocalfile(obj.getContenuto(), "d:/"+obj.getFileNameOrig());
				_log.info(obj.info());
			}
		} catch (Exception e) {
			_log.error(METHOD_NAME+e.getMessage());
		}
		finally {
			cmisUtil.close();
		}
		
		_log.info(METHOD_NAME+"**********TEST LETTURA DA DOCUMENTUM BY ID *********");
		
		// TEST LETTURA da documentum
		try {
			ObjDocumentum obj=cmisUtil.readById(typeFile,ObjectID,false);
			if(obj!=null)
			{
				//cmisUtil.writeDoc(obj.getCmisStream(), "d:/raffo.pdf");
				writeStreamToLocalfile(obj.getContenuto(), "d:/"+obj.getFileNameOrig());
				_log.info(obj.info());
			}
		} catch (Exception e) {
			_log.error(METHOD_NAME+e.getMessage());
		}
		finally {
			cmisUtil.close();
		}
		
//		_log.info(METHOD_NAME+"**********TEST SCRITTURA SU DOCUMENTUM *********");
//		
//		try {
//			String nameFileOrig="polar.pdf";
//			nameFileCmis="DOC3.pdf";
//			File file = new File("D:/"+nameFileOrig);
//		    InputStream inputStream = new FileInputStream(file);
//			
//		    // setto opportunamento l'oggetto obj di tipo ObjDocumentum
//		    
//		    Map<String, Object> properties = new HashMap<String, Object>();
//			properties.put(ObjDocumentum.OBJECT_TYPE_ID, typeFile);
//			properties.put("descrizione", "Descrizione del file caricato sul documentum!!!!!");
//			properties.put(ObjDocumentum.NAME, nameFileCmis);
//		    
//		    
//		    ObjDocumentum obj = new ObjDocumentum();
//		    byte contenuto[]=org.apache.commons.io.IOUtils.toByteArray(inputStream);
//			obj.setContenuto(contenuto);
//			obj.setMimeType(cmisUtil.getMimeType(file));
//			obj.setFileNameOrig(file.getName());
//			obj.setFileNameCmis(nameFileCmis);
//			obj.setProperties(properties);
//			cmisUtil.write(obj, false, folder, typeFile);
//			
//		} catch (Exception e) {
//			_log.error(e.getMessage());
//		}
//		finally {
//			cmisUtil.close();
//		}
		
		

		_log.info(METHOD_NAME+"**********TEST UPDATE SU DOCUMENTUM *********");
		
		try {
			String nameFileOrig="tc.pdf";
			nameFileCmis="DOC3.pdf";
			File file = new File("D:/"+nameFileOrig);
		    InputStream inputStream = new FileInputStream(file);
			
		    // setto opportunamento l'oggetto obj di tipo ObjDocumentum
		    
		    Map<String, Object> properties = new HashMap<String, Object>();
			properties.put(ObjDocumentum.OBJECT_TYPE_ID, typeFile);
			properties.put("descrizione", "Descrizione del file caricato sul documentum!!!!!");
			properties.put(ObjDocumentum.NAME, nameFileCmis);
		    
		    
		    ObjDocumentum obj = new ObjDocumentum();
		    byte contenuto[]=org.apache.commons.io.IOUtils.toByteArray(inputStream);
			obj.setContenuto(contenuto);
			obj.setMimeType(cmisUtil.getMimeType(file));
			obj.setFileNameOrig(file.getName());
			obj.setFileNameCmis(nameFileCmis);
			obj.setProperties(properties);
			cmisUtil.update(obj, false, typeFile);
			
		} catch (Exception e) {
			_log.error(e.getMessage());
		}
		finally {
			cmisUtil.close();
		}
//		
//		_log.info(METHOD_NAME+"**********TEST NEW VERSION SU DOCUMENTUM *********");
//		
//		try {
//			String nameFileOrig="polar.pdf";
//			File file = new File("D:/"+nameFileOrig);
//		    InputStream inputStream = new FileInputStream(file);
//			
//		    // setto opportunamento l'oggetto obj di tipo ObjDocumentum
//		    
//		    Map<String, Object> properties = new HashMap<String, Object>();
//			properties.put(ObjDocumentum.OBJECT_TYPE_ID, typeFile);
//			properties.put("descrizione", "Descrizione del file caricato sul documentum!!!!!");
//			properties.put(ObjDocumentum.NAME, nameFileCmis);
//		    
//		    
//		    ObjDocumentum obj = new ObjDocumentum();
//		    byte contenuto[]=org.apache.commons.io.IOUtils.toByteArray(inputStream);
//			obj.setContenuto(contenuto);
//			obj.setMimeType(cmisUtil.getMimeType(file));
//			obj.setFileNameOrig(file.getName());
//			obj.setFileNameCmis(file.getName());
//			obj.setProperties(properties);
//			cmisUtil.createNewVersion(obj, false, typeFile,false,"Versione 1.1");
//			
//		} catch (Exception e) {
//			_log.error(e.getMessage());
//		}
//		finally {
//			cmisUtil.close();
//		}
//		
//		
//		_log.info(METHOD_NAME+"**********TEST DELETE SU DOCUMENTUM *********");
//		
//		try {
//			String fileNameCmis="polar.pdf";
//			cmisUtil.delete(fileNameCmis, false, typeFile);
//			
//		} catch (Exception e) {
//			_log.error(e.getMessage());
//		}
//		finally {
//			cmisUtil.close();
//		}

	}
	
	public static void writeStreamToLocalfile(byte cmisInByte[],String localfilename){
        FileOutputStream fout=null;
        InputStream cmisIn=new ByteArrayInputStream(cmisInByte);
        try{
            File file=new File(localfilename);
            fout=new FileOutputStream(file);
            byte[] buffer=new byte[65*1024];
            int readedByte=0;
            while((readedByte=cmisIn.read(buffer, 0, buffer.length))>=0)
                fout.write(buffer, 0, readedByte);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }
        finally{
            if(fout!=null)
                try{fout.close();}catch(Exception eignore){};
            if(cmisIn!=null)
                try{cmisIn.close();}catch(Exception eignore){};
        
        }
    }

}
