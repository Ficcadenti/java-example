//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per output complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="output">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chiave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curriculum" type="{http://hrp.exolab.it/HRPDemo}curriculum" minOccurs="0"/>
 *         &lt;element name="idOutput" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modulo" type="{http://hrp.exolab.it/HRPDemo}modulo" minOccurs="0"/>
 *         &lt;element name="resultTemplates" type="{http://hrp.exolab.it/HRPDemo}resultTemplate" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "output", propOrder = {
    "chiave",
    "curriculum",
    "idOutput",
    "modulo",
    "resultTemplates",
    "valore"
})
public class Output {

    protected String chiave;
    protected Curriculum curriculum;
    protected int idOutput;
    @XmlSchemaType(name = "string")
    protected Modulo modulo;
    @XmlElement(nillable = true)
    protected List<ResultTemplate> resultTemplates;
    protected String valore;

    /**
     * Recupera il valore della proprietà chiave.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChiave() {
        return chiave;
    }

    /**
     * Imposta il valore della proprietà chiave.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChiave(String value) {
        this.chiave = value;
    }

    /**
     * Recupera il valore della proprietà curriculum.
     * 
     * @return
     *     possible object is
     *     {@link Curriculum }
     *     
     */
    public Curriculum getCurriculum() {
        return curriculum;
    }

    /**
     * Imposta il valore della proprietà curriculum.
     * 
     * @param value
     *     allowed object is
     *     {@link Curriculum }
     *     
     */
    public void setCurriculum(Curriculum value) {
        this.curriculum = value;
    }

    /**
     * Recupera il valore della proprietà idOutput.
     * 
     */
    public int getIdOutput() {
        return idOutput;
    }

    /**
     * Imposta il valore della proprietà idOutput.
     * 
     */
    public void setIdOutput(int value) {
        this.idOutput = value;
    }

    /**
     * Recupera il valore della proprietà modulo.
     * 
     * @return
     *     possible object is
     *     {@link Modulo }
     *     
     */
    public Modulo getModulo() {
        return modulo;
    }

    /**
     * Imposta il valore della proprietà modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Modulo }
     *     
     */
    public void setModulo(Modulo value) {
        this.modulo = value;
    }

    /**
     * Gets the value of the resultTemplates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultTemplates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultTemplates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultTemplate }
     * 
     * 
     */
    public List<ResultTemplate> getResultTemplates() {
        if (resultTemplates == null) {
            resultTemplates = new ArrayList<ResultTemplate>();
        }
        return this.resultTemplates;
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
