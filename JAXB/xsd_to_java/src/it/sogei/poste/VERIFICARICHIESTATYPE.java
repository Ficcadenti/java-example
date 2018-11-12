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
 * <p>Classe Java per VERIFICA_RICHIESTA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="VERIFICA_RICHIESTA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="NUMERO_DETTAGLI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DETTAGLIO" type="{}DETTAGLIO_VDE_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VERIFICA_RICHIESTA_TYPE", propOrder = {
    "identificativofile",
    "datacreazionefile",
    "tipomodello",
    "codiceambito",
    "codicecliente",
    "numerodettagli",
    "dettaglio"
})
public class VERIFICARICHIESTATYPE {

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
    @XmlElement(name = "NUMERO_DETTAGLI")
    protected int numerodettagli;
    @XmlElement(name = "DETTAGLIO", required = true)
    protected List<DETTAGLIOVDETYPE> dettaglio;

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
     * {@link DETTAGLIOVDETYPE }
     * 
     * 
     */
    public List<DETTAGLIOVDETYPE> getDETTAGLIO() {
        if (dettaglio == null) {
            dettaglio = new ArrayList<DETTAGLIOVDETYPE>();
        }
        return this.dettaglio;
    }

}
