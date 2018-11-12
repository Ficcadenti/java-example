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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PRE_FATTURA_CONTROLLATA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRE_FATTURA_CONTROLLATA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFICATIVO_FILE_ESITI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE_ESITI" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="IDENTIF_FILE_CONTROLLATO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_FORNITORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_PRE_FATTURA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PERIODO_DAL" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PERIODO_AL" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TIPO_ESITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RISCONTRO" type="{}RISCONTRO_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRE_FATTURA_CONTROLLATA_TYPE", propOrder = {
    "identificativofileesiti",
    "datacreazionefileesiti",
    "identiffilecontrollato",
    "codicefornitore",
    "codicecliente",
    "dataprefattura",
    "periododal",
    "periodoal",
    "tipoesito",
    "riscontro"
})
public class PREFATTURACONTROLLATATYPE {

    @XmlElement(name = "IDENTIFICATIVO_FILE_ESITI", required = true)
    protected String identificativofileesiti;
    @XmlElement(name = "DATA_CREAZIONE_FILE_ESITI", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefileesiti;
    @XmlElement(name = "IDENTIF_FILE_CONTROLLATO", required = true)
    protected String identiffilecontrollato;
    @XmlElement(name = "CODICE_FORNITORE", required = true)
    protected String codicefornitore;
    @XmlElement(name = "CODICE_CLIENTE", required = true)
    protected String codicecliente;
    @XmlElement(name = "DATA_PRE_FATTURA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataprefattura;
    @XmlElement(name = "PERIODO_DAL", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periododal;
    @XmlElement(name = "PERIODO_AL", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoal;
    @XmlElement(name = "TIPO_ESITO", required = true)
    protected String tipoesito;
    @XmlElement(name = "RISCONTRO", required = true)
    protected List<RISCONTROTYPE> riscontro;

    /**
     * Recupera il valore della proprietà identificativofileesiti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIVOFILEESITI() {
        return identificativofileesiti;
    }

    /**
     * Imposta il valore della proprietà identificativofileesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIVOFILEESITI(String value) {
        this.identificativofileesiti = value;
    }

    /**
     * Recupera il valore della proprietà datacreazionefileesiti.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZIONEFILEESITI() {
        return datacreazionefileesiti;
    }

    /**
     * Imposta il valore della proprietà datacreazionefileesiti.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZIONEFILEESITI(XMLGregorianCalendar value) {
        this.datacreazionefileesiti = value;
    }

    /**
     * Recupera il valore della proprietà identiffilecontrollato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFFILECONTROLLATO() {
        return identiffilecontrollato;
    }

    /**
     * Imposta il valore della proprietà identiffilecontrollato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFFILECONTROLLATO(String value) {
        this.identiffilecontrollato = value;
    }

    /**
     * Recupera il valore della proprietà codicefornitore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEFORNITORE() {
        return codicefornitore;
    }

    /**
     * Imposta il valore della proprietà codicefornitore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEFORNITORE(String value) {
        this.codicefornitore = value;
    }

    /**
     * Recupera il valore della proprietà codicecliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICECLIENTE() {
        return codicecliente;
    }

    /**
     * Imposta il valore della proprietà codicecliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICECLIENTE(String value) {
        this.codicecliente = value;
    }

    /**
     * Recupera il valore della proprietà dataprefattura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATAPREFATTURA() {
        return dataprefattura;
    }

    /**
     * Imposta il valore della proprietà dataprefattura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATAPREFATTURA(XMLGregorianCalendar value) {
        this.dataprefattura = value;
    }

    /**
     * Recupera il valore della proprietà periododal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPERIODODAL() {
        return periododal;
    }

    /**
     * Imposta il valore della proprietà periododal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPERIODODAL(XMLGregorianCalendar value) {
        this.periododal = value;
    }

    /**
     * Recupera il valore della proprietà periodoal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPERIODOAL() {
        return periodoal;
    }

    /**
     * Imposta il valore della proprietà periodoal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPERIODOAL(XMLGregorianCalendar value) {
        this.periodoal = value;
    }

    /**
     * Recupera il valore della proprietà tipoesito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOESITO() {
        return tipoesito;
    }

    /**
     * Imposta il valore della proprietà tipoesito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOESITO(String value) {
        this.tipoesito = value;
    }

    /**
     * Gets the value of the riscontro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the riscontro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRISCONTRO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RISCONTROTYPE }
     * 
     * 
     */
    public List<RISCONTROTYPE> getRISCONTRO() {
        if (riscontro == null) {
            riscontro = new ArrayList<RISCONTROTYPE>();
        }
        return this.riscontro;
    }

}
