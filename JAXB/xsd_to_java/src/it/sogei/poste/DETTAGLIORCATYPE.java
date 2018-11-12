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
 * <p>Classe Java per DETTAGLIO_RCA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DETTAGLIO_RCA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGRESSIVO_DETTAGLIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_RACCOMANDATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_FINE_STAMPA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DATA_POSTALIZZAZIONE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DATA_INIZIO_RECAPITO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="FLAG_COPERTURA_CAP">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFICATIVO" type="{}IDENTIFICATIVO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DETTAGLIO_RCA_TYPE", propOrder = {
    "progressivodettaglio",
    "numraccomandata",
    "numdocumento",
    "datafinestampa",
    "datapostalizzazione",
    "datainiziorecapito",
    "flagcoperturacap",
    "identificativo"
})
public class DETTAGLIORCATYPE {

    @XmlElement(name = "PROGRESSIVO_DETTAGLIO", required = true)
    protected String progressivodettaglio;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "DATA_FINE_STAMPA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datafinestampa;
    @XmlElement(name = "DATA_POSTALIZZAZIONE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datapostalizzazione;
    @XmlElement(name = "DATA_INIZIO_RECAPITO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datainiziorecapito;
    @XmlElement(name = "FLAG_COPERTURA_CAP", required = true)
    protected String flagcoperturacap;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

    /**
     * Recupera il valore della proprietà progressivodettaglio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRESSIVODETTAGLIO() {
        return progressivodettaglio;
    }

    /**
     * Imposta il valore della proprietà progressivodettaglio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRESSIVODETTAGLIO(String value) {
        this.progressivodettaglio = value;
    }

    /**
     * Recupera il valore della proprietà numraccomandata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMRACCOMANDATA() {
        return numraccomandata;
    }

    /**
     * Imposta il valore della proprietà numraccomandata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMRACCOMANDATA(String value) {
        this.numraccomandata = value;
    }

    /**
     * Recupera il valore della proprietà numdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMDOCUMENTO() {
        return numdocumento;
    }

    /**
     * Imposta il valore della proprietà numdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMDOCUMENTO(String value) {
        this.numdocumento = value;
    }

    /**
     * Recupera il valore della proprietà datafinestampa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAFINESTAMPA() {
        return datafinestampa;
    }

    /**
     * Imposta il valore della proprietà datafinestampa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAFINESTAMPA(XMLGregorianCalendar value) {
        this.datafinestampa = value;
    }

    /**
     * Recupera il valore della proprietà datapostalizzazione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPOSTALIZZAZIONE() {
        return datapostalizzazione;
    }

    /**
     * Imposta il valore della proprietà datapostalizzazione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPOSTALIZZAZIONE(XMLGregorianCalendar value) {
        this.datapostalizzazione = value;
    }

    /**
     * Recupera il valore della proprietà datainiziorecapito.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAINIZIORECAPITO() {
        return datainiziorecapito;
    }

    /**
     * Imposta il valore della proprietà datainiziorecapito.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAINIZIORECAPITO(XMLGregorianCalendar value) {
        this.datainiziorecapito = value;
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

    /**
     * Recupera il valore della proprietà identificativo.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public IDENTIFICATIVOTYPE getIDENTIFICATIVO() {
        return identificativo;
    }

    /**
     * Imposta il valore della proprietà identificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public void setIDENTIFICATIVO(IDENTIFICATIVOTYPE value) {
        this.identificativo = value;
    }

}
