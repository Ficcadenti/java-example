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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per PRE_FATTURA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRE_FATTURA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGRESSIVO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="CODICE_FORNITORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_CLIENTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_PRE_FATTURA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PERIODO_DAL" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="PERIODO_AL" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="FATTURA_NETTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FATTURA_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FATTURA_TOTALE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
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
@XmlType(name = "PRE_FATTURA_TYPE", propOrder = {
    "progressivo",
    "datacreazionefile",
    "codicefornitore",
    "codicecliente",
    "dataprefattura",
    "periododal",
    "periodoal",
    "fatturanetto",
    "fatturaiva",
    "fatturatotale"
})
@XmlSeeAlso({
    PREFATTURAREPTYPE.class,
    PREFATTURARCPTYPE.class
})
public class PREFATTURATYPE {

    @XmlElement(name = "PROGRESSIVO", required = true)
    protected String progressivo;
    @XmlElement(name = "DATA_CREAZIONE_FILE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefile;
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
    @XmlElement(name = "FATTURA_NETTO", required = true)
    protected BigDecimal fatturanetto;
    @XmlElement(name = "FATTURA_IVA", required = true)
    protected BigDecimal fatturaiva;
    @XmlElement(name = "FATTURA_TOTALE", required = true)
    protected BigDecimal fatturatotale;

    /**
     * Recupera il valore della proprietà progressivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROGRESSIVO() {
        return progressivo;
    }

    /**
     * Imposta il valore della proprietà progressivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROGRESSIVO(String value) {
        this.progressivo = value;
    }

    /**
     * Recupera il valore della proprietà datacreazionefile.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZIONEFILE() {
        return datacreazionefile;
    }

    /**
     * Imposta il valore della proprietà datacreazionefile.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZIONEFILE(XMLGregorianCalendar value) {
        this.datacreazionefile = value;
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
     * Recupera il valore della proprietà fatturanetto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURANETTO() {
        return fatturanetto;
    }

    /**
     * Imposta il valore della proprietà fatturanetto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURANETTO(BigDecimal value) {
        this.fatturanetto = value;
    }

    /**
     * Recupera il valore della proprietà fatturaiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURAIVA() {
        return fatturaiva;
    }

    /**
     * Imposta il valore della proprietà fatturaiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURAIVA(BigDecimal value) {
        this.fatturaiva = value;
    }

    /**
     * Recupera il valore della proprietà fatturatotale.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURATOTALE() {
        return fatturatotale;
    }

    /**
     * Imposta il valore della proprietà fatturatotale.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURATOTALE(BigDecimal value) {
        this.fatturatotale = value;
    }

}
