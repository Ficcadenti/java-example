//
// Questo file � stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andr� persa durante la ricompilazione dello schema di origine. 
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
 * <p>Classe Java per DETTAGLIO_RED_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DETTAGLIO_RED_TYPE">
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
 *         &lt;element name="RIGA1_DESTINATARIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGA2_AGGIUNTIVE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGA3_EDIFICIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGA4_INDIRIZZO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RIGA5_LOCALITA" type="{}LOCALITA_TYPE"/>
 *         &lt;element name="RIGA6_STATO_ESTERO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CONSEGNA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODICE_ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_MOTIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CANALE_CONSEGNA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_ESITO" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODICE_SCATOLA_PLICO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="12"/>
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
 *         &lt;element name="DATA_ORA_1_TENTATIVO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DATA_ORA_2_TENTATIVO" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "DETTAGLIO_RED_TYPE", propOrder = {
    "progressivodettaglio",
    "numraccomandata",
    "numdocumento",
    "riga1DESTINATARIO",
    "riga2AGGIUNTIVE",
    "riga3EDIFICIO",
    "riga4INDIRIZZO",
    "riga5LOCALITA",
    "riga6STATOESTERO",
    "dataconsegna",
    "codiceesito",
    "codicemotivo",
    "canaleconsegna",
    "dataesito",
    "codicescatolaplico",
    "flagcoperturacap",
    "dataora1TENTATIVO",
    "dataora2TENTATIVO",
    "identificativo"
})
public class DETTAGLIOREDTYPE {

    @XmlElement(name = "PROGRESSIVO_DETTAGLIO", required = true)
    protected String progressivodettaglio;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "RIGA1_DESTINATARIO", required = true)
    protected String riga1DESTINATARIO;
    @XmlElement(name = "RIGA2_AGGIUNTIVE", required = true)
    protected String riga2AGGIUNTIVE;
    @XmlElement(name = "RIGA3_EDIFICIO", required = true)
    protected String riga3EDIFICIO;
    @XmlElement(name = "RIGA4_INDIRIZZO", required = true)
    protected String riga4INDIRIZZO;
    @XmlElement(name = "RIGA5_LOCALITA", required = true)
    protected LOCALITATYPE riga5LOCALITA;
    @XmlElement(name = "RIGA6_STATO_ESTERO", required = true)
    protected String riga6STATOESTERO;
    @XmlElement(name = "DATA_CONSEGNA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataconsegna;
    @XmlElement(name = "CODICE_ESITO", required = true)
    protected String codiceesito;
    @XmlElement(name = "CODICE_MOTIVO", required = true)
    protected String codicemotivo;
    @XmlElement(name = "CANALE_CONSEGNA", required = true)
    protected String canaleconsegna;
    @XmlElement(name = "DATA_ESITO", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataesito;
    @XmlElement(name = "CODICE_SCATOLA_PLICO", required = true)
    protected String codicescatolaplico;
    @XmlElement(name = "FLAG_COPERTURA_CAP", required = true)
    protected String flagcoperturacap;
    @XmlElement(name = "DATA_ORA_1_TENTATIVO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataora1TENTATIVO;
    @XmlElement(name = "DATA_ORA_2_TENTATIVO", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataora2TENTATIVO;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

    /**
     * Recupera il valore della propriet� progressivodettaglio.
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
     * Imposta il valore della propriet� progressivodettaglio.
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
     * Recupera il valore della propriet� numraccomandata.
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
     * Imposta il valore della propriet� numraccomandata.
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
     * Recupera il valore della propriet� numdocumento.
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
     * Imposta il valore della propriet� numdocumento.
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
     * Recupera il valore della propriet� riga1DESTINATARIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA1DESTINATARIO() {
        return riga1DESTINATARIO;
    }

    /**
     * Imposta il valore della propriet� riga1DESTINATARIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA1DESTINATARIO(String value) {
        this.riga1DESTINATARIO = value;
    }

    /**
     * Recupera il valore della propriet� riga2AGGIUNTIVE.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA2AGGIUNTIVE() {
        return riga2AGGIUNTIVE;
    }

    /**
     * Imposta il valore della propriet� riga2AGGIUNTIVE.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA2AGGIUNTIVE(String value) {
        this.riga2AGGIUNTIVE = value;
    }

    /**
     * Recupera il valore della propriet� riga3EDIFICIO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA3EDIFICIO() {
        return riga3EDIFICIO;
    }

    /**
     * Imposta il valore della propriet� riga3EDIFICIO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA3EDIFICIO(String value) {
        this.riga3EDIFICIO = value;
    }

    /**
     * Recupera il valore della propriet� riga4INDIRIZZO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA4INDIRIZZO() {
        return riga4INDIRIZZO;
    }

    /**
     * Imposta il valore della propriet� riga4INDIRIZZO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA4INDIRIZZO(String value) {
        this.riga4INDIRIZZO = value;
    }

    /**
     * Recupera il valore della propriet� riga5LOCALITA.
     * 
     * @return
     *     possible object is
     *     {@link LOCALITATYPE }
     *     
     */
    public LOCALITATYPE getRIGA5LOCALITA() {
        return riga5LOCALITA;
    }

    /**
     * Imposta il valore della propriet� riga5LOCALITA.
     * 
     * @param value
     *     allowed object is
     *     {@link LOCALITATYPE }
     *     
     */
    public void setRIGA5LOCALITA(LOCALITATYPE value) {
        this.riga5LOCALITA = value;
    }

    /**
     * Recupera il valore della propriet� riga6STATOESTERO.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIGA6STATOESTERO() {
        return riga6STATOESTERO;
    }

    /**
     * Imposta il valore della propriet� riga6STATOESTERO.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIGA6STATOESTERO(String value) {
        this.riga6STATOESTERO = value;
    }

    /**
     * Recupera il valore della propriet� dataconsegna.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACONSEGNA() {
        return dataconsegna;
    }

    /**
     * Imposta il valore della propriet� dataconsegna.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACONSEGNA(XMLGregorianCalendar value) {
        this.dataconsegna = value;
    }

    /**
     * Recupera il valore della propriet� codiceesito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEESITO() {
        return codiceesito;
    }

    /**
     * Imposta il valore della propriet� codiceesito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEESITO(String value) {
        this.codiceesito = value;
    }

    /**
     * Recupera il valore della propriet� codicemotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEMOTIVO() {
        return codicemotivo;
    }

    /**
     * Imposta il valore della propriet� codicemotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEMOTIVO(String value) {
        this.codicemotivo = value;
    }

    /**
     * Recupera il valore della propriet� canaleconsegna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCANALECONSEGNA() {
        return canaleconsegna;
    }

    /**
     * Imposta il valore della propriet� canaleconsegna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCANALECONSEGNA(String value) {
        this.canaleconsegna = value;
    }

    /**
     * Recupera il valore della propriet� dataesito.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAESITO() {
        return dataesito;
    }

    /**
     * Imposta il valore della propriet� dataesito.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAESITO(XMLGregorianCalendar value) {
        this.dataesito = value;
    }

    /**
     * Recupera il valore della propriet� codicescatolaplico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESCATOLAPLICO() {
        return codicescatolaplico;
    }

    /**
     * Imposta il valore della propriet� codicescatolaplico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESCATOLAPLICO(String value) {
        this.codicescatolaplico = value;
    }

    /**
     * Recupera il valore della propriet� flagcoperturacap.
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
     * Imposta il valore della propriet� flagcoperturacap.
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
     * Recupera il valore della propriet� dataora1TENTATIVO.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAORA1TENTATIVO() {
        return dataora1TENTATIVO;
    }

    /**
     * Imposta il valore della propriet� dataora1TENTATIVO.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAORA1TENTATIVO(XMLGregorianCalendar value) {
        this.dataora1TENTATIVO = value;
    }

    /**
     * Recupera il valore della propriet� dataora2TENTATIVO.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAORA2TENTATIVO() {
        return dataora2TENTATIVO;
    }

    /**
     * Imposta il valore della propriet� dataora2TENTATIVO.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAORA2TENTATIVO(XMLGregorianCalendar value) {
        this.dataora2TENTATIVO = value;
    }

    /**
     * Recupera il valore della propriet� identificativo.
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
     * Imposta il valore della propriet� identificativo.
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
