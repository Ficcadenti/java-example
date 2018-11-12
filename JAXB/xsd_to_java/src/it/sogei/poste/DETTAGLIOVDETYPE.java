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
 * <p>Classe Java per DETTAGLIO_VDE_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DETTAGLIO_VDE_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGRESSIVO_DETTAGLIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPOLOGIA_CONTESTAZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="7"/>
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
 *         &lt;element name="DATA_SPEDIZIONE" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
@XmlType(name = "DETTAGLIO_VDE_TYPE", propOrder = {
    "progressivodettaglio",
    "tipologiacontestazione",
    "numraccomandata",
    "numdocumento",
    "dataspedizione",
    "identificativo"
})
public class DETTAGLIOVDETYPE {

    @XmlElement(name = "PROGRESSIVO_DETTAGLIO", required = true)
    protected String progressivodettaglio;
    @XmlElement(name = "TIPOLOGIA_CONTESTAZIONE")
    protected int tipologiacontestazione;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "DATA_SPEDIZIONE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataspedizione;
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
     * Recupera il valore della proprietà tipologiacontestazione.
     * 
     */
    public int getTIPOLOGIACONTESTAZIONE() {
        return tipologiacontestazione;
    }

    /**
     * Imposta il valore della proprietà tipologiacontestazione.
     * 
     */
    public void setTIPOLOGIACONTESTAZIONE(int value) {
        this.tipologiacontestazione = value;
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
     * Recupera il valore della proprietà dataspedizione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATASPEDIZIONE() {
        return dataspedizione;
    }

    /**
     * Imposta il valore della proprietà dataspedizione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATASPEDIZIONE(XMLGregorianCalendar value) {
        this.dataspedizione = value;
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
