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
 * <p>Classe Java per DISTINTA_DEF_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DISTINTA_DEF_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}DISTINTA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="ID_FUSIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_COMPLETAMENTO_STAMPA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="DATA_POSTALIZZAZIONE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NUMERO_RIFERIMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_RECAPITISTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_SERVICE_STAMPA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORMATO_BUSTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FORMATO_FOGLI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DETTAGLI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}DETTAGLIO_DEF_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISTINTA_DEF_TYPE", propOrder = {
    "idfusione",
    "datacompletamentostampa",
    "datapostalizzazione",
    "numeroriferimento",
    "codicerecapitista",
    "codiceservicestampa",
    "formatobusta",
    "formatofogli",
    "numerodettagli",
    "dettaglio"
})
public class DISTINTADEFTYPE
    extends DISTINTATYPE
{

    @XmlElement(name = "ID_FUSIONE", required = true)
    protected String idfusione;
    @XmlElement(name = "DATA_COMPLETAMENTO_STAMPA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacompletamentostampa;
    @XmlElement(name = "DATA_POSTALIZZAZIONE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datapostalizzazione;
    @XmlElement(name = "NUMERO_RIFERIMENTO", required = true)
    protected String numeroriferimento;
    @XmlElement(name = "CODICE_RECAPITISTA", required = true)
    protected String codicerecapitista;
    @XmlElement(name = "CODICE_SERVICE_STAMPA", required = true)
    protected String codiceservicestampa;
    @XmlElement(name = "FORMATO_BUSTA", required = true)
    protected String formatobusta;
    @XmlElement(name = "FORMATO_FOGLI", required = true)
    protected String formatofogli;
    @XmlElement(name = "NUMERO_DETTAGLI")
    protected int numerodettagli;
    @XmlElement(name = "DETTAGLIO", required = true)
    protected List<DETTAGLIODEFTYPE> dettaglio;

    /**
     * Recupera il valore della proprietà idfusione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDFUSIONE() {
        return idfusione;
    }

    /**
     * Imposta il valore della proprietà idfusione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDFUSIONE(String value) {
        this.idfusione = value;
    }

    /**
     * Recupera il valore della proprietà datacompletamentostampa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACOMPLETAMENTOSTAMPA() {
        return datacompletamentostampa;
    }

    /**
     * Imposta il valore della proprietà datacompletamentostampa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACOMPLETAMENTOSTAMPA(XMLGregorianCalendar value) {
        this.datacompletamentostampa = value;
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
     * Recupera il valore della proprietà numeroriferimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERORIFERIMENTO() {
        return numeroriferimento;
    }

    /**
     * Imposta il valore della proprietà numeroriferimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERORIFERIMENTO(String value) {
        this.numeroriferimento = value;
    }

    /**
     * Recupera il valore della proprietà codicerecapitista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICERECAPITISTA() {
        return codicerecapitista;
    }

    /**
     * Imposta il valore della proprietà codicerecapitista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICERECAPITISTA(String value) {
        this.codicerecapitista = value;
    }

    /**
     * Recupera il valore della proprietà codiceservicestampa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICESERVICESTAMPA() {
        return codiceservicestampa;
    }

    /**
     * Imposta il valore della proprietà codiceservicestampa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICESERVICESTAMPA(String value) {
        this.codiceservicestampa = value;
    }

    /**
     * Recupera il valore della proprietà formatobusta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATOBUSTA() {
        return formatobusta;
    }

    /**
     * Imposta il valore della proprietà formatobusta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATOBUSTA(String value) {
        this.formatobusta = value;
    }

    /**
     * Recupera il valore della proprietà formatofogli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATOFOGLI() {
        return formatofogli;
    }

    /**
     * Imposta il valore della proprietà formatofogli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATOFOGLI(String value) {
        this.formatofogli = value;
    }

    /**
     * Recupera il valore della proprietà numerodettagli.
     * 
     */
    public int getNUMERODETTAGLI() {
        return numerodettagli;
    }

    /**
     * Imposta il valore della proprietà numerodettagli.
     * 
     */
    public void setNUMERODETTAGLI(int value) {
        this.numerodettagli = value;
    }

    /**
     * Gets the value of the dettaglio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDETTAGLIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DETTAGLIODEFTYPE }
     * 
     * 
     */
    public List<DETTAGLIODEFTYPE> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<DETTAGLIODEFTYPE>();
        }
        return this.dettaglio;
    }

}
