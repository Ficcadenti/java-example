package it.raffo.cmis.documentum;

import java.util.Map;

import org.apache.chemistry.opencmis.commons.PropertyIds;


public class ObjDocumentum {
	
	/* Mappatura costanti prese da PropertyIds per il file di properties */
	public static final String NAME = PropertyIds.NAME;
	public static final String OBJECT_TYPE_ID = PropertyIds.OBJECT_TYPE_ID;
	
	
	private byte contenuto[] = null;
	private String mimeType = "";
	private String cmisType = "";
	private String fileNameCmis = null;
	private String fileNameOrig = null;
	private String ObjectID     = null;
	private Map<String, Object> properties = null;
	
	public String info()
	{
		String str = "";
		str=str+"\n";
		str=str+"fileNameCmis = "+fileNameCmis+"\n";
		str=str+"fileNameOrig = "+fileNameOrig+"\n";
		str=str+"ObjectID     = "+ObjectID+"\n";
		str=str+"mimeType     = "+mimeType+"\n";
		str=str+"cmisType     = "+cmisType+"\n";
		return str;
		
	}

	public String getFileNameCmis() {
		return fileNameCmis;
	}
	
	public void setFileNameCmis(String fileNameCmis) {
		this.fileNameCmis = fileNameCmis;
	}
	
	public String getFileNameOrig() {
		return fileNameOrig;
	}
	
	public void setFileNameOrig(String fileNameOrig) {
		this.fileNameOrig = fileNameOrig;
	}
	
	public String getMimeType() {
		return mimeType;
	}
	
	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}
	public Map<String, Object> getProperties() {
		return properties;
	}
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
	public byte[] getContenuto() {
		return contenuto;
	}
	public void setContenuto(byte contenuto[]) {
		this.contenuto = contenuto;
	}

	public String getObjectID() {
		return ObjectID;
	}

	public void setObjectID(String objectID) {
		ObjectID = objectID;
	}
	
	public String getCmisType() {
		return cmisType;
	}

	public void setCmisType(String cmisType) {
		this.cmisType = cmisType;
	}
	
}
