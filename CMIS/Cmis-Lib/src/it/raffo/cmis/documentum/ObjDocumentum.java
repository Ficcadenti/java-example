package it.raffo.cmis.documentum;

import java.util.Map;

import org.apache.chemistry.opencmis.commons.PropertyIds;

public class ObjDocumentum
{

	/* Mappatura costanti prese da PropertyIds per il file di properties */
	public static final String	NAME			= PropertyIds.NAME;
	public static final String	OBJECT_TYPE_ID	= PropertyIds.OBJECT_TYPE_ID;

	private byte				contenuto[]		= null;
	private String				mimeType		= "";
	private String				cmisType		= "";
	private String				fileNameCmis	= null;
	private String				fileNameOrig	= null;
	private String				ObjectID		= null;
	private Map<String, Object>	properties		= null;

	public String getCmisType()
	{
		return this.cmisType;
	}

	public byte[] getContenuto()
	{
		return this.contenuto;
	}

	public String getFileNameCmis()
	{
		return this.fileNameCmis;
	}

	public String getFileNameOrig()
	{
		return this.fileNameOrig;
	}

	public String getMimeType()
	{
		return this.mimeType;
	}

	public String getObjectID()
	{
		return this.ObjectID;
	}

	public Map<String, Object> getProperties()
	{
		return this.properties;
	}

	public String info()
	{
		String str = "";
		str = str + "\n";
		str = str + "fileNameCmis = " + this.fileNameCmis + "\n";
		str = str + "fileNameOrig = " + this.fileNameOrig + "\n";
		str = str + "ObjectID     = " + this.ObjectID + "\n";
		str = str + "mimeType     = " + this.mimeType + "\n";
		str = str + "cmisType     = " + this.cmisType + "\n";
		return str;

	}

	public void setCmisType(String cmisType)
	{
		this.cmisType = cmisType;
	}

	public void setContenuto(byte contenuto[])
	{
		this.contenuto = contenuto;
	}

	public void setFileNameCmis(String fileNameCmis)
	{
		this.fileNameCmis = fileNameCmis;
	}

	public void setFileNameOrig(String fileNameOrig)
	{
		this.fileNameOrig = fileNameOrig;
	}

	public void setMimeType(String mimeType)
	{
		this.mimeType = mimeType;
	}

	public void setObjectID(String objectID)
	{
		this.ObjectID = objectID;
	}

	public void setProperties(Map<String, Object> properties)
	{
		this.properties = properties;
	}

}
