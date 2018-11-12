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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HEADER" type="{}HEADER_TYPE"/>
 *         &lt;element name="NUMERO_IMMAGINI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ZIP_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HASH_CODE_ZIP_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IMMAGINI">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IMMAGINE" type="{}IMMAGINE_TYPE" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "", propOrder = {
    "header",
    "numeroimmagini",
    "zipfile",
    "hashcodezipfile",
    "immagini"
})
@XmlRootElement(name = "IMD")
public class IMD {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERTYPE header;
    @XmlElement(name = "NUMERO_IMMAGINI")
    protected int numeroimmagini;
    @XmlElement(name = "ZIP_FILE", required = true)
    protected String zipfile;
    @XmlElement(name = "HASH_CODE_ZIP_FILE", required = true)
    protected String hashcodezipfile;
    @XmlElement(name = "IMMAGINI", required = true)
    protected IMD.IMMAGINI immagini;

    /**
     * Recupera il valore della proprietà header.
     * 
     * @return
     *     possible object is
     *     {@link HEADERTYPE }
     *     
     */
    public HEADERTYPE getHEADER() {
        return header;
    }

    /**
     * Imposta il valore della proprietà header.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADERTYPE }
     *     
     */
    public void setHEADER(HEADERTYPE value) {
        this.header = value;
    }

    /**
     * Recupera il valore della proprietà numeroimmagini.
     * 
     */
    public int getNUMEROIMMAGINI() {
        return numeroimmagini;
    }

    /**
     * Imposta il valore della proprietà numeroimmagini.
     * 
     */
    public void setNUMEROIMMAGINI(int value) {
        this.numeroimmagini = value;
    }

    /**
     * Recupera il valore della proprietà zipfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIPFILE() {
        return zipfile;
    }

    /**
     * Imposta il valore della proprietà zipfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIPFILE(String value) {
        this.zipfile = value;
    }

    /**
     * Recupera il valore della proprietà hashcodezipfile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHASHCODEZIPFILE() {
        return hashcodezipfile;
    }

    /**
     * Imposta il valore della proprietà hashcodezipfile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHASHCODEZIPFILE(String value) {
        this.hashcodezipfile = value;
    }

    /**
     * Recupera il valore della proprietà immagini.
     * 
     * @return
     *     possible object is
     *     {@link IMD.IMMAGINI }
     *     
     */
    public IMD.IMMAGINI getIMMAGINI() {
        return immagini;
    }

    /**
     * Imposta il valore della proprietà immagini.
     * 
     * @param value
     *     allowed object is
     *     {@link IMD.IMMAGINI }
     *     
     */
    public void setIMMAGINI(IMD.IMMAGINI value) {
        this.immagini = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IMMAGINE" type="{}IMMAGINE_TYPE" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "immagine"
    })
    public static class IMMAGINI {

        @XmlElement(name = "IMMAGINE", required = true)
        protected List<IMMAGINETYPE> immagine;

        /**
         * Gets the value of the immagine property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the immagine property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIMMAGINE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IMMAGINETYPE }
         * 
         * 
         */
        public List<IMMAGINETYPE> getIMMAGINE() {
            if (immagine == null) {
                immagine = new ArrayList<IMMAGINETYPE>();
            }
            return this.immagine;
        }

    }

}
