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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ERRORE_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ERRORE_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TAG_ERRATO_NOME">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TAG_ERRATO_CONTENUTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_ERRORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_ERRORE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
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
@XmlType(name = "ERRORE_TYPE", propOrder = {
    "tagerratonome",
    "tagerratocontenuto",
    "codiceerrore",
    "tipoerrore"
})
public class ERRORETYPE {

    @XmlElement(name = "TAG_ERRATO_NOME", required = true)
    protected String tagerratonome;
    @XmlElement(name = "TAG_ERRATO_CONTENUTO", required = true)
    protected String tagerratocontenuto;
    @XmlElement(name = "CODICE_ERRORE", required = true)
    protected String codiceerrore;
    @XmlElement(name = "TIPO_ERRORE", required = true)
    protected String tipoerrore;

    /**
     * Recupera il valore della proprietà tagerratonome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGERRATONOME() {
        return tagerratonome;
    }

    /**
     * Imposta il valore della proprietà tagerratonome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGERRATONOME(String value) {
        this.tagerratonome = value;
    }

    /**
     * Recupera il valore della proprietà tagerratocontenuto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAGERRATOCONTENUTO() {
        return tagerratocontenuto;
    }

    /**
     * Imposta il valore della proprietà tagerratocontenuto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAGERRATOCONTENUTO(String value) {
        this.tagerratocontenuto = value;
    }

    /**
     * Recupera il valore della proprietà codiceerrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEERRORE() {
        return codiceerrore;
    }

    /**
     * Imposta il valore della proprietà codiceerrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEERRORE(String value) {
        this.codiceerrore = value;
    }

    /**
     * Recupera il valore della proprietà tipoerrore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOERRORE() {
        return tipoerrore;
    }

    /**
     * Imposta il valore della proprietà tipoerrore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOERRORE(String value) {
        this.tipoerrore = value;
    }

}
