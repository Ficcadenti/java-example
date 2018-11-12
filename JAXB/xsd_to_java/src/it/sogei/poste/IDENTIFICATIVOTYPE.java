//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IDENTIFICATIVO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IDENTIFICATIVO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GUID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATAMATRIX">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="72"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MORE_INFO" type="{}MORE_INFO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDENTIFICATIVO_TYPE", propOrder = {
    "guid",
    "datamatrix",
    "moreinfo"
})
public class IDENTIFICATIVOTYPE {

    @XmlElement(name = "GUID", required = true)
    protected String guid;
    @XmlElement(name = "DATAMATRIX", required = true)
    protected String datamatrix;
    @XmlElement(name = "MORE_INFO", required = true)
    protected MOREINFOTYPE moreinfo;

    /**
     * Recupera il valore della proprietà guid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Imposta il valore della proprietà guid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Recupera il valore della proprietà datamatrix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAMATRIX() {
        return datamatrix;
    }

    /**
     * Imposta il valore della proprietà datamatrix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAMATRIX(String value) {
        this.datamatrix = value;
    }

    /**
     * Recupera il valore della proprietà moreinfo.
     * 
     * @return
     *     possible object is
     *     {@link MOREINFOTYPE }
     *     
     */
    public MOREINFOTYPE getMOREINFO() {
        return moreinfo;
    }

    /**
     * Imposta il valore della proprietà moreinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MOREINFOTYPE }
     *     
     */
    public void setMOREINFO(MOREINFOTYPE value) {
        this.moreinfo = value;
    }

}
