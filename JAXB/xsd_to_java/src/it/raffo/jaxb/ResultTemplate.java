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
 * <p>Classe Java per resultTemplate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="resultTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idResultTemplate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="output" type="{http://hrp.exolab.it/HRPDemo}output" minOccurs="0"/>
 *         &lt;element name="template" type="{http://hrp.exolab.it/HRPDemo}template" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultTemplate", propOrder = {
    "idResultTemplate",
    "output",
    "template"
})
public class ResultTemplate {

    protected int idResultTemplate;
    protected Output output;
    protected Template template;

    /**
     * Recupera il valore della proprietà idResultTemplate.
     * 
     */
    public int getIdResultTemplate() {
        return idResultTemplate;
    }

    /**
     * Imposta il valore della proprietà idResultTemplate.
     * 
     */
    public void setIdResultTemplate(int value) {
        this.idResultTemplate = value;
    }

    /**
     * Recupera il valore della proprietà output.
     * 
     * @return
     *     possible object is
     *     {@link Output }
     *     
     */
    public Output getOutput() {
        return output;
    }

    /**
     * Imposta il valore della proprietà output.
     * 
     * @param value
     *     allowed object is
     *     {@link Output }
     *     
     */
    public void setOutput(Output value) {
        this.output = value;
    }

    /**
     * Recupera il valore della proprietà template.
     * 
     * @return
     *     possible object is
     *     {@link Template }
     *     
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Imposta il valore della proprietà template.
     * 
     * @param value
     *     allowed object is
     *     {@link Template }
     *     
     */
    public void setTemplate(Template value) {
        this.template = value;
    }

}
