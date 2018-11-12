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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per HEADER_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="HEADER_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NOME_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MITTENTE_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZ_FLUSSO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DESTINATARIO_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_FLUSSO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HEADER_TYPE", propOrder = {
    "nomeflusso",
    "mittenteflusso",
    "datacreazflusso",
    "destinatarioflusso",
    "tipoflusso"
})
public class HEADERTYPE {

    @XmlElement(name = "NOME_FLUSSO", required = true)
    protected String nomeflusso;
    @XmlElement(name = "MITTENTE_FLUSSO", required = true)
    protected String mittenteflusso;
    @XmlElement(name = "DATA_CREAZ_FLUSSO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazflusso;
    @XmlElement(name = "DESTINATARIO_FLUSSO", required = true)
    protected String destinatarioflusso;
    @XmlElement(name = "TIPO_FLUSSO", required = true)
    protected String tipoflusso;

    /**
     * Recupera il valore della proprietà nomeflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEFLUSSO() {
        return nomeflusso;
    }

    /**
     * Imposta il valore della proprietà nomeflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEFLUSSO(String value) {
        this.nomeflusso = value;
    }

    /**
     * Recupera il valore della proprietà mittenteflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTENTEFLUSSO() {
        return mittenteflusso;
    }

    /**
     * Imposta il valore della proprietà mittenteflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTENTEFLUSSO(String value) {
        this.mittenteflusso = value;
    }

    /**
     * Recupera il valore della proprietà datacreazflusso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZFLUSSO() {
        return datacreazflusso;
    }

    /**
     * Imposta il valore della proprietà datacreazflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZFLUSSO(XMLGregorianCalendar value) {
        this.datacreazflusso = value;
    }

    /**
     * Recupera il valore della proprietà destinatarioflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESTINATARIOFLUSSO() {
        return destinatarioflusso;
    }

    /**
     * Imposta il valore della proprietà destinatarioflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESTINATARIOFLUSSO(String value) {
        this.destinatarioflusso = value;
    }

    /**
     * Recupera il valore della proprietà tipoflusso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOFLUSSO() {
        return tipoflusso;
    }

    /**
     * Imposta il valore della proprietà tipoflusso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOFLUSSO(String value) {
        this.tipoflusso = value;
    }

}
