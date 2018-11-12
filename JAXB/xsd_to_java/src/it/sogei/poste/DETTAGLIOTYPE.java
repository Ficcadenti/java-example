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
 * <p>Classe Java per DETTAGLIO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DETTAGLIO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
 *         &lt;element name="PROGRESSIVO_DETTAGLIO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_ERRORI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ERRORE" type="{}ERRORE_TYPE" maxOccurs="unbounded"/>
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
@XmlType(name = "DETTAGLIO_TYPE", propOrder = {
    "tipomodello",
    "codiceambito",
    "progressivodettaglio",
    "numeroerrori",
    "errore",
    "identificativo"
})
public class DETTAGLIOTYPE {

    @XmlElement(name = "TIPO_MODELLO", required = true)
    protected String tipomodello;
    @XmlElement(name = "CODICE_AMBITO", required = true)
    protected String codiceambito;
    @XmlElement(name = "PROGRESSIVO_DETTAGLIO", required = true)
    protected String progressivodettaglio;
    @XmlElement(name = "NUMERO_ERRORI")
    protected int numeroerrori;
    @XmlElement(name = "ERRORE", required = true)
    protected List<ERRORETYPE> errore;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

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
     * Recupera il valore della proprietà numeroerrori.
     * 
     */
    public int getNUMEROERRORI() {
        return numeroerrori;
    }

    /**
     * Imposta il valore della proprietà numeroerrori.
     * 
     */
    public void setNUMEROERRORI(int value) {
        this.numeroerrori = value;
    }

    /**
     * Gets the value of the errore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getERRORE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ERRORETYPE }
     * 
     * 
     */
    public List<ERRORETYPE> getERRORE() {
        if (errore == null) {
            errore = new ArrayList<ERRORETYPE>();
        }
        return this.errore;
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
