//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per template complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="template">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template", propOrder = {
    "idTemplate",
    "nameTemplate",
    "valore"
})
public class Template {

    protected int idTemplate;
    protected String nameTemplate;
    protected String valore;

    /**
     * Recupera il valore della proprietà idTemplate.
     * 
     */
    public int getIdTemplate() {
        return idTemplate;
    }

    /**
     * Imposta il valore della proprietà idTemplate.
     * 
     */
    public void setIdTemplate(int value) {
        this.idTemplate = value;
    }

    /**
     * Recupera il valore della proprietà nameTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTemplate() {
        return nameTemplate;
    }

    /**
     * Imposta il valore della proprietà nameTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTemplate(String value) {
        this.nameTemplate = value;
    }

    /**
     * Recupera il valore della proprietà valore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValore() {
        return valore;
    }

    /**
     * Imposta il valore della proprietà valore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValore(String value) {
        this.valore = value;
    }

}
