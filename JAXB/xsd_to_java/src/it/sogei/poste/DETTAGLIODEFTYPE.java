//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DETTAGLIO_DEF_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DETTAGLIO_DEF_TYPE">
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
 *         &lt;element name="NOME_LOTTO_S">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_GESTIONE_RESO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
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
 *         &lt;element name="DESTINATARIO" type="{}DESTINATARIO_DEF_TYPE" maxOccurs="unbounded"/>
 *         &lt;element name="MITTENTE" type="{}MITTENTE_DEF_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GRAMMATURA_REALE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG_COPERTURA_CAP" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "DETTAGLIO_DEF_TYPE", propOrder = {
    "progressivodettaglio",
    "nomelottos",
    "codicegestionereso",
    "numraccomandata",
    "numdocumento",
    "destinatario",
    "mittente",
    "grammaturareale",
    "flagcoperturacap",
    "identificativo"
})
public class DETTAGLIODEFTYPE {

    @XmlElement(name = "PROGRESSIVO_DETTAGLIO", required = true)
    protected String progressivodettaglio;
    @XmlElement(name = "NOME_LOTTO_S", required = true)
    protected String nomelottos;
    @XmlElement(name = "CODICE_GESTIONE_RESO", required = true)
    protected String codicegestionereso;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "DESTINATARIO", required = true)
    protected List<DESTINATARIODEFTYPE> destinatario;
    @XmlElement(name = "MITTENTE")
    protected List<MITTENTEDEFTYPE> mittente;
    @XmlElement(name = "GRAMMATURA_REALE", required = true)
    protected String grammaturareale;
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
     * Recupera il valore della proprietà nomelottos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMELOTTOS() {
        return nomelottos;
    }

    /**
     * Imposta il valore della proprietà nomelottos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMELOTTOS(String value) {
        this.nomelottos = value;
    }

    /**
     * Recupera il valore della proprietà codicegestionereso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEGESTIONERESO() {
        return codicegestionereso;
    }

    /**
     * Imposta il valore della proprietà codicegestionereso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEGESTIONERESO(String value) {
        this.codicegestionereso = value;
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
     * Gets the value of the destinatario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinatario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDESTINATARIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESTINATARIODEFTYPE }
     * 
     * 
     */
    public List<DESTINATARIODEFTYPE> getDESTINATARIO() {
        if (destinatario == null) {
            destinatario = new ArrayList<DESTINATARIODEFTYPE>();
        }
        return this.destinatario;
    }

    /**
     * Gets the value of the mittente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mittente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMITTENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MITTENTEDEFTYPE }
     * 
     * 
     */
    public List<MITTENTEDEFTYPE> getMITTENTE() {
        if (mittente == null) {
            mittente = new ArrayList<MITTENTEDEFTYPE>();
        }
        return this.mittente;
    }

    /**
     * Recupera il valore della proprietà grammaturareale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRAMMATURAREALE() {
        return grammaturareale;
    }

    /**
     * Imposta il valore della proprietà grammaturareale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRAMMATURAREALE(String value) {
        this.grammaturareale = value;
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
