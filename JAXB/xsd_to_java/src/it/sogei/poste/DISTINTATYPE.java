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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DISTINTA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DISTINTA_TYPE">
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
 *         &lt;element name="IDENTIFICATIVO_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="TIPO_MODELLO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_AMBITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
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
 *         &lt;element name="TIPO_SPEDIZIONE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LOTTO_TERRITORIALE">
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
@XmlType(name = "DISTINTA_TYPE", propOrder = {
    "progressivo",
    "identificativofile",
    "datacreazionefile",
    "tipomodello",
    "codiceambito",
    "codicecliente",
    "tipospedizione",
    "lottoterritoriale"
})
@XmlSeeAlso({
    DISTINTADEFTYPE.class,
    DISTINTADEPTYPE.class,
    RENDICONTAZIONECONSEGNATYPE.class,
    ACCETTAZIONERECAPITOTYPE.class
})
public class DISTINTATYPE {

    @XmlElement(name = "PROGRESSIVO", required = true)
    protected String progressivo;
    @XmlElement(name = "IDENTIFICATIVO_FILE", required = true)
    protected String identificativofile;
    @XmlElement(name = "DATA_CREAZIONE_FILE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefile;
    @XmlElement(name = "TIPO_MODELLO", required = true)
    protected String tipomodello;
    @XmlElement(name = "CODICE_AMBITO", required = true)
    protected String codiceambito;
    @XmlElement(name = "CODICE_CLIENTE", required = true)
    protected String codicecliente;
    @XmlElement(name = "TIPO_SPEDIZIONE", required = true)
    protected String tipospedizione;
    @XmlElement(name = "LOTTO_TERRITORIALE", required = true)
    protected String lottoterritoriale;

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
     * Recupera il valore della proprietà identificativofile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIVOFILE() {
        return identificativofile;
    }

    /**
     * Imposta il valore della proprietà identificativofile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIVOFILE(String value) {
        this.identificativofile = value;
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
     * Recupera il valore della proprietà tipomodello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMODELLO() {
        return tipomodello;
    }

    /**
     * Imposta il valore della proprietà tipomodello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMODELLO(String value) {
        this.tipomodello = value;
    }

    /**
     * Recupera il valore della proprietà codiceambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAMBITO() {
        return codiceambito;
    }

    /**
     * Imposta il valore della proprietà codiceambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAMBITO(String value) {
        this.codiceambito = value;
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
     * Recupera il valore della proprietà lottoterritoriale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTTOTERRITORIALE() {
        return lottoterritoriale;
    }

    /**
     * Imposta il valore della proprietà lottoterritoriale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTTOTERRITORIALE(String value) {
        this.lottoterritoriale = value;
    }

}
