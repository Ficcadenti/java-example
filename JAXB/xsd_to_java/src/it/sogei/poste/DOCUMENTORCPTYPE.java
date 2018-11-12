//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DOCUMENTO_RCP_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO_RCP_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}DOCUMENTO_TYPE">
 *       &lt;sequence>
 *         &lt;element name="CAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_SPEDIZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_SPEDIZIONE_RECAPITISTA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="GRAMMATURA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="1"/>
 *               &lt;minInclusive value="0.1"/>
 *               &lt;maxInclusive value="99999.9"/>
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_SMARRITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_FURTATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FLAG_COPERTURA_CAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO_RCP_TYPE", propOrder = {
    "cap",
    "tipospedizione",
    "dataspedizionerecapitista",
    "grammatura",
    "flagsmarrito",
    "flagfurtato",
    "flagcoperturacap"
})
public class DOCUMENTORCPTYPE
    extends DOCUMENTOTYPE
{

    @XmlElement(name = "CAP", required = true)
    protected String cap;
    @XmlElement(name = "TIPO_SPEDIZIONE", required = true)
    protected String tipospedizione;
    @XmlElement(name = "DATA_SPEDIZIONE_RECAPITISTA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataspedizionerecapitista;
    @XmlElement(name = "GRAMMATURA", required = true)
    protected BigDecimal grammatura;
    @XmlElement(name = "FLAG_SMARRITO", required = true)
    protected String flagsmarrito;
    @XmlElement(name = "FLAG_FURTATO", required = true)
    protected String flagfurtato;
    @XmlElement(name = "FLAG_COPERTURA_CAP", required = true)
    protected String flagcoperturacap;

    /**
     * Recupera il valore della proprietà cap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAP() {
        return cap;
    }

    /**
     * Imposta il valore della proprietà cap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAP(String value) {
        this.cap = value;
    }

    /**
     * Recupera il valore della proprietà tipospedizione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOSPEDIZIONE() {
        return tipospedizione;
    }

    /**
     * Imposta il valore della proprietà tipospedizione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOSPEDIZIONE(String value) {
        this.tipospedizione = value;
    }

    /**
     * Recupera il valore della proprietà dataspedizionerecapitista.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATASPEDIZIONERECAPITISTA() {
        return dataspedizionerecapitista;
    }

    /**
     * Imposta il valore della proprietà dataspedizionerecapitista.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATASPEDIZIONERECAPITISTA(XMLGregorianCalendar value) {
        this.dataspedizionerecapitista = value;
    }

    /**
     * Recupera il valore della proprietà grammatura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGRAMMATURA() {
        return grammatura;
    }

    /**
     * Imposta il valore della proprietà grammatura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGRAMMATURA(BigDecimal value) {
        this.grammatura = value;
    }

    /**
     * Recupera il valore della proprietà flagsmarrito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGSMARRITO() {
        return flagsmarrito;
    }

    /**
     * Imposta il valore della proprietà flagsmarrito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGSMARRITO(String value) {
        this.flagsmarrito = value;
    }

    /**
     * Recupera il valore della proprietà flagfurtato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGFURTATO() {
        return flagfurtato;
    }

    /**
     * Imposta il valore della proprietà flagfurtato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGFURTATO(String value) {
        this.flagfurtato = value;
    }

    /**
     * Recupera il valore della proprietà flagcoperturacap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCOPERTURACAP() {
        return flagcoperturacap;
    }

    /**
     * Imposta il valore della proprietà flagcoperturacap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCOPERTURACAP(String value) {
        this.flagcoperturacap = value;
    }

}
