package it.raffo.cmis.documentum;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.chemistry.opencmis.client.SessionFactoryFinder;
import org.apache.chemistry.opencmis.client.api.CmisObject;
import org.apache.chemistry.opencmis.client.api.Document;
import org.apache.chemistry.opencmis.client.api.Folder;
import org.apache.chemistry.opencmis.client.api.ItemIterable;
import org.apache.chemistry.opencmis.client.api.ObjectId;
import org.apache.chemistry.opencmis.client.api.OperationContext;
import org.apache.chemistry.opencmis.client.api.QueryResult;
import org.apache.chemistry.opencmis.client.api.QueryStatement;
import org.apache.chemistry.opencmis.client.api.Session;
import org.apache.chemistry.opencmis.client.api.SessionFactory;
import org.apache.chemistry.opencmis.client.runtime.ObjectIdImpl;
import org.apache.chemistry.opencmis.client.util.ContentStreamUtils;
import org.apache.chemistry.opencmis.client.util.OperationContextUtils;
import org.apache.chemistry.opencmis.commons.SessionParameter;
import org.apache.chemistry.opencmis.commons.data.ContentStream;
import org.apache.chemistry.opencmis.commons.enums.BindingType;
import org.apache.chemistry.opencmis.commons.enums.VersioningState;
import org.apache.chemistry.opencmis.commons.impl.IOUtils;
import org.apache.chemistry.opencmis.commons.impl.dataobjects.ContentStreamImpl;
import org.apache.log4j.Logger;

public class CMISClientHelperSP
{

	private static final String			MAX_POOL_SIZE_PARAM	= "maxCMISPoolSize";
	private static Logger				_log				= Logger.getLogger(CMISClientHelperSP.class);
	private static CMISClientHelperSP	istanza				= null;

	public synchronized static CMISClientHelperSP getInstance()
	{
		_log.debug("CMISClientHelperSP::getInstance()");
		if (istanza == null)
		{
			istanza = new CMISClientHelperSP();
		}
		return istanza;
	}

	private String					ENV_PROPERTIES_FILE	= "/resources/cmisclient.properties";
	private int						maxPoolSize			= 0;;
	private java.util.Properties	cfgProperties		= null;
	private Map<String, String>		cmisParameters		= new HashMap<String, String>();
	private SessionFactory			sessionfactory		= null;

	private Map<String, SessionSP>	pool				= new HashMap<String, SessionSP>();

	private CMISClientHelperSP()
	{
	}

	private String checkParameter(String parameterName, String parameterValue, boolean required)
	{
		if ((parameterValue == null) || (parameterValue.trim().length() == 0))
		{
			if (required)
			{
				throw new IllegalArgumentException("Parametro <" + parameterName + "> non impostato");
			}
			else
			{
				return "";
			}
		}
		return parameterValue.trim();

	}

	public void cmisContentStreamToLocalfile(Session session, ContentStream cmisStream, String localfilename)
	{
		FileOutputStream fout = null;
		InputStream cmisIn = null;
		try
		{
			File file = new File(localfilename);
			fout = new FileOutputStream(file);
			cmisIn = cmisStream.getStream();
			byte[] buffer = new byte[65 * 1024];
			int readedByte = 0;
			while ((readedByte = cmisIn.read(buffer, 0, buffer.length)) >= 0)
			{
				fout.write(buffer, 0, readedByte);
			}
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (fout != null)
			{
				try
				{
					fout.close();
				}
				catch (Exception eignore)
				{
				}
			}

			if (cmisIn != null)
			{
				try
				{
					cmisIn.close();
				}
				catch (Exception eignore)
				{
				}
			}

		}
	}

	public ContentStream cmisLocalFileToContentStream(ObjDocumentum obj)
	{

		ContentStream contentStream = null;
		byte contenuto[] = null;

		// contentStream = ContentStreamUtils.createByteArrayContentStream("pippo.pdf",
		// org.apache.commons.io.IOUtils.toByteArray(obj.getInputStream()),obj.getMimeType());
		contenuto = obj.getContenuto();
		contentStream = new ContentStreamImpl(obj.getFileNameOrig(), BigInteger.valueOf(contenuto.length),
				obj.getMimeType(), new ByteArrayInputStream(contenuto));

		return contentStream;
	}

	public synchronized Session createCmisRepositorySession() throws Exception
	{
		_log.debug("createCmisRepositorySession()");
		for (Map.Entry<String, SessionSP> sessSP : this.pool.entrySet())
		{
			if (!sessSP.getValue().isActive())
			{
				sessSP.getValue().setActive(true);
				_log.debug("createCmisRepositorySession(): sessione = "
						+ System.identityHashCode(sessSP.getValue().getSession()));
				return sessSP.getValue().getSession();
			}
		}

		_log.debug("createCmisRepositorySession(): maxPoolSize = " + this.maxPoolSize);
		if (this.pool.size() == this.maxPoolSize)
		{
			throw new Exception("createCmisRepositorySession(): CMIS ha raggiunto il numero massimo di connessioni");
		}

		// se siamo qui dobbiamo procedere alla creazione della sessione
		SessionFactory sfactory = this.getCmisSessionFactory();
		this.setupCmisCredential();
		// create session
		Session session = sfactory.createSession(this.cmisParameters);

		SessionSP sSP = new SessionSP();
		sSP.setActive(true);
		sSP.setId(System.identityHashCode(session));
		sSP.setSession(session);
		this.pool.put("" + System.identityHashCode(session), sSP);
		_log.debug("createCmisRepositorySession(): sessione = " + System.identityHashCode(session));
		return session;
	}

	public ObjectId createDocument(Session session, Map<String, Object> properties, ContentStream contentStream,
			ObjectId cmisFolderID)
	{
		// si assicura di chiudere lo stream in input poichÃ¨ CMIS non lo fa
		InputStream in = null;
		try
		{

			ObjectId objId = session.createDocument(properties, cmisFolderID, contentStream, VersioningState.NONE);
			if (objId == null)
			{
				throw new RuntimeException("Creazione del documento non riuscita");
			}
			return objId;
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}
		finally
		{
			if (in != null)
			{
				try
				{
					in.close();
				}
				catch (Exception eignore)
				{
					;
				}
			}
		}
	}

	// crea una nuova versione di un documento esistente aggiornado le proprieta'
	// e/o il contenuto
	public ObjectId createNewVersion(Session cmisSession, String docid, ContentStream contentStream,
			boolean majorVersion, Map<String, Object> properties, String comment)
	{
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		Document cmisDoc = (Document) cmisSession.getObject(docid, opCtxMin);
		cmisDoc.checkOut();

		try
		{
			ObjectId checkedInObjID = cmisDoc.checkIn(majorVersion, properties, contentStream, comment);
			return checkedInObjID;
		}
		catch (Exception ex)
		{
			cmisDoc.cancelCheckOut();
			throw new RuntimeException(ex);
		}
		finally
		{
			try
			{
				contentStream.getStream().close();
			}
			catch (Exception eignore)
			{
				;
			}
		}
	}

	public void deleteDoc(Session cmisSession, String docid)
	{
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		CmisObject obj = cmisSession.getObject(docid, opCtxMin);
		obj.delete();

	}

	public SessionFactory getCmisSessionFactory()
	{

		if (this.sessionfactory == null)
		{
			try
			{
				// default factory implementation
				this.sessionfactory = SessionFactoryFinder.find();
			}
			catch (Exception ex)
			{
				// logging
				throw new RuntimeException();
			}
		}
		return this.sessionfactory;
	}

	public void getContent(Session cmisSession, String qualifier, boolean cacheEnable) throws IOException
	{

		// OperationContext oc = cmisSession.createOperationContext();
		OperationContext oc = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		oc.setCacheEnabled(cacheEnable);

		QueryStatement qs = cmisSession.createQueryStatement(
				"SELECT cmis:objectId FROM sg_fascicolo_document WHERE cmis:name = ? order by cmis:creationDate desc");
		qs.setString(1, qualifier);

		_log.debug("Query: " + qs.toQueryString());

		ItemIterable<QueryResult> results = qs.query(false, oc);

		for (QueryResult qResult : results.getPage(1))
		{
			ContentStream contentStream = null;
			try
			{
				contentStream = cmisSession
						.getContentStream(new ObjectIdImpl("" + qResult.getPropertyValueById("cmis:objectId")));
				break;
			}
			finally
			{
				if (contentStream != null)
				{
					IOUtils.closeQuietly(contentStream);
				}
			}
		}
	}

	public void getContentByFetch(Session cmisSession, String qualifier, boolean cacheEnable) throws IOException
	{
		ContentStream contentStream = null;
		String METHOD_NAME = "contentStream()" + " - ";
		_log.debug(METHOD_NAME + "INIZIO ");

		try
		{
			contentStream = cmisSession.getContentStream(new ObjectIdImpl(qualifier));
			int fileLen = (int) contentStream.getLength();
			_log.debug(METHOD_NAME + "fileLen = " + fileLen);
			// response.setContentType("application/pdf");
			// response.setHeader("Content-Disposition", "attachment; filename=\"" +
			// qualifier + "\"");
			//
			// ContentStreamUtils.writeContentStreamToOutputStream(contentStream,
			// response.getOutputStream());
		}
		finally
		{
			if (contentStream != null)
			{
				IOUtils.closeQuietly(contentStream);
			}
		}
	}

	/**
	 * Su Documentum funziona solo con path di folder; funziona anche con i path di
	 * documenti ma devono essere indicati come segue:
	 * "/<CABINET>/<PATH>/<R_OBJECT_ID>_<OBJECT_NAME>
	 *
	 * @param cmisSession
	 * @param path
	 * @param cacheEnable
	 * @param outputStream
	 * @throws IOException
	 */
	public void getContentByPath(Session cmisSession, String path, boolean cacheEnable, OutputStream outputStream)
			throws IOException
	{
		OperationContext oc = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		oc.setCacheEnabled(cacheEnable);
		Document objectByPath = (Document) cmisSession.getObjectByPath(path, oc);

		_log.debug("objectId: " + objectByPath.getId());

		ContentStream contentStream = objectByPath.getContentStream();
		ContentStreamUtils.writeContentStreamToOutputStream(contentStream, outputStream);
	}

	public String getFirstIdByName(Session cmisSession, String typeName, String objectName, boolean cacheEnable)
	{
		String result = null;
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		opCtxMin.setCacheEnabled(cacheEnable);

		QueryStatement qs = cmisSession
				.createQueryStatement("SELECT cmis:objectId FROM ? where cmis:name=? order by cmis:objectId desc");
		qs.setType(1, typeName);
		qs.setString(2, objectName);

		_log.debug("----> typeName: " + typeName);
		_log.debug("----> objectName: " + objectName);
		ItemIterable<QueryResult> results = qs.query(false, opCtxMin);

		Iterator<QueryResult> iterator = results.iterator();
		while (iterator.hasNext())
		{
			QueryResult queryResult = iterator.next();
			result = "" + queryResult.getPropertyValueById("cmis:objectId");
			break;
		}
		return result;
	}

	public String getFirstNameById(Session cmisSession, String typeName, String objectId, boolean cacheEnable)
	{
		String result = null;
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		opCtxMin.setCacheEnabled(cacheEnable);

		QueryStatement qs = cmisSession
				.createQueryStatement("SELECT cmis:name FROM ? where cmis:objectId=? order by cmis:objectId desc");
		qs.setType(1, typeName);
		qs.setString(2, objectId);

		_log.debug("----> typeName: " + typeName);
		_log.debug("----> objectName: " + objectId);

		ItemIterable<QueryResult> results = qs.query(false, opCtxMin);

		Iterator<QueryResult> iterator = results.iterator();
		while (iterator.hasNext())
		{
			QueryResult queryResult = iterator.next();
			result = "" + queryResult.getPropertyValueById("cmis:name");
			break;
		}
		return result;
	}

	public Folder getFolderId(Session session, String myRepositoryFolder, boolean cacheEnable)
	{

		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		opCtxMin.setCacheEnabled(cacheEnable);

		Folder cmisFolder = (Folder) session.getObjectByPath(myRepositoryFolder, opCtxMin);
		return cmisFolder;
	}

	public void listAllDocuments(Session cmisSession, String typeName, List<ObjDocumentum> allIDDocuments)
	{
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		opCtxMin.setCacheEnabled(false);
		ObjDocumentum obj = null;
		QueryStatement qs = cmisSession.createQueryStatement(
				"SELECT cmis:name,cmis:objectId,cmis:contentStreamMimeType,cmis:objectTypeId FROM ? ");
		qs.setType(1, typeName);

		ItemIterable<QueryResult> results = qs.query(false, opCtxMin);

		Iterator<QueryResult> iterator = results.iterator();
		while (iterator.hasNext())
		{
			QueryResult queryResult = iterator.next();

			obj = new ObjDocumentum();

			obj.setFileNameCmis((String) queryResult.getPropertyValueByQueryName("cmis:name"));
			obj.setObjectID((String) queryResult.getPropertyValueByQueryName("cmis:objectId"));
			obj.setMimeType((String) queryResult.getPropertyValueByQueryName("cmis:contentStreamMimeType"));
			obj.setCmisType((String) queryResult.getPropertyValueByQueryName("cmis:objectTypeId"));

			allIDDocuments.add(obj);
		}
	}

	public void loadProperties(String infileProp)
	{
		if (infileProp != null)
		{
			if (!infileProp.equals(""))
			{
				this.ENV_PROPERTIES_FILE = infileProp;
			}
		}

		_log.debug("loadProperties(): infileProp=" + infileProp);
		_log.debug("loadProperties(): ENV_PROPERTIES_FILE=" + this.ENV_PROPERTIES_FILE);

		// carichiamo la configurazione
		this.cfgProperties = new java.util.Properties();

		String fileprop = System.getProperty(this.ENV_PROPERTIES_FILE);
		if (fileprop == null)
		{
			fileprop = this.ENV_PROPERTIES_FILE;
		}

		try
		{
			InputStream in = CMISClientHelperSP.class.getResourceAsStream(fileprop);
			if (in == null)
			{
				in = new FileInputStream(fileprop);
			}
			this.cfgProperties.load(in);
		}
		catch (IOException ex)
		{
			throw new RuntimeException("Impossibile caricare le proprieta'", ex);
		}

		String mp = this.cfgProperties.getProperty(MAX_POOL_SIZE_PARAM);
		if (mp == null)
		{
			throw new RuntimeException("Attributo " + MAX_POOL_SIZE_PARAM + " non impostato");
		}
		else
		{
			_log.debug("loadProperties(): mp=" + mp);
		}

		this.maxPoolSize = Integer.parseInt(mp);

		this.setupCmisBinding();

	}

	public void releaseSession(Session session)
	{
		SessionSP sSP = this.pool.get("" + System.identityHashCode(session));
		sSP.setActive(false);
	}

	public void setDefaultSessionContext(Session session, boolean isCacheEnable)
	{
		// Impostiamo il contesto di default della sessione (gestendo la cache)
		OperationContext oc = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		oc.setCacheEnabled(isCacheEnable);
		session.setDefaultContext(oc);
		if (isCacheEnable)
		{
			// cancelliamo la cache eventualmente già presente
			session.clear();
		}
	}

	private void setupCmisBinding()
	{
		BindingType cmisBindingType;

		try
		{
			cmisBindingType = BindingType.fromValue(this.cfgProperties.getProperty(SessionParameter.BINDING_TYPE));
		}
		catch (Throwable t)
		{
			throw new IllegalArgumentException("Parametro CMIS BINDING_TYPE non impostato o non valido", t);
		}

		this.cmisParameters.put(SessionParameter.BINDING_TYPE, cmisBindingType.value());

		switch (cmisBindingType)
		{
			case ATOMPUB:
				this.cmisParameters.put(SessionParameter.ATOMPUB_URL, this.checkParameter(SessionParameter.ATOMPUB_URL,
						this.cfgProperties.getProperty(SessionParameter.ATOMPUB_URL), true));
				break;
			case BROWSER:
				this.cmisParameters.put(SessionParameter.BROWSER_URL, this.checkParameter(SessionParameter.BROWSER_URL,
						this.cfgProperties.getProperty(SessionParameter.BROWSER_URL), true));
				break;
			case WEBSERVICES:
				this.cmisParameters.put(SessionParameter.WEBSERVICES_REPOSITORY_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_REPOSITORY_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_REPOSITORY_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_NAVIGATION_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_NAVIGATION_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_NAVIGATION_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_OBJECT_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_OBJECT_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_OBJECT_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_VERSIONING_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_VERSIONING_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_VERSIONING_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_DISCOVERY_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_DISCOVERY_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_DISCOVERY_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_RELATIONSHIP_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_RELATIONSHIP_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_RELATIONSHIP_SERVICE),
								true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_MULTIFILING_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_MULTIFILING_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_MULTIFILING_SERVICE),
								true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_POLICY_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_POLICY_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_POLICY_SERVICE), true));

				this.cmisParameters.put(SessionParameter.WEBSERVICES_ACL_SERVICE,
						this.checkParameter(SessionParameter.WEBSERVICES_ACL_SERVICE,
								this.cfgProperties.getProperty(SessionParameter.WEBSERVICES_ACL_SERVICE), true));
				break;
			default:
				throw new IllegalArgumentException("Parametro CMIS BINDING_TYPE non valido");
		}
	}

	private void setupCmisCredential()
	{
		this.cmisParameters.put(SessionParameter.USER, this.cfgProperties.getProperty(SessionParameter.USER));
		this.cmisParameters.put(SessionParameter.PASSWORD, this.cfgProperties.getProperty(SessionParameter.PASSWORD));
		this.cmisParameters.put(SessionParameter.REPOSITORY_ID,
				this.cfgProperties.getProperty(SessionParameter.REPOSITORY_ID));
	}

	public Date toJavaDate(String dataIT)
	{
		SimpleDateFormat dateFormatterIT = new SimpleDateFormat("dd/MM/yyyy");

		try
		{
			return dateFormatterIT.parse(dataIT);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	// aggiorna le proprieta' e/o il contenuto di un documento esistente
	// no restituisce niente poiche' l'id del documento rimane invariato
	public void updateDoc(Session cmisSession, String docid, ContentStream contentStream,
			Map<String, Object> properties)
	{
		OperationContext opCtxMin = OperationContextUtils.createMinimumOperationContext("cmis:objectId");
		Document cmisDoc = (Document) cmisSession.getObject(docid, opCtxMin);

		try
		{
			cmisDoc.setContentStream(contentStream, true, false);// non rinfresco l'oggetto modificato
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
		finally
		{
			try
			{
				contentStream.getStream().close();
			}
			catch (Exception eignore)
			{
				;
			}
		}
		if (properties != null)
		{
			cmisDoc.updateProperties(properties, false);
		}
	}
}
