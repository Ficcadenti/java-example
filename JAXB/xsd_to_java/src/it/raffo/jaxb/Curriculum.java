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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per curriculum complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="curriculum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="affidabilita" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="curriculum" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="idCurriculum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameTemplate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nominativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outputs" type="{http://hrp.exolab.it/HRPDemo}output" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tokens" type="{http://hrp.exolab.it/HRPDemo}token" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uploader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "curriculum", propOrder = {
    "affidabilita",
    "curriculum",
    "idCurriculum",
    "nameTemplate",
    "nominativo",
    "outputs",
    "processato",
    "tokens",
    "uploader"
})
public class Curriculum {

    protected float affidabilita;
    protected byte[] curriculum;
    protected int idCurriculum;
    protected String nameTemplate;
    protected String nominativo;
    @XmlElement(nillable = true)
    protected List<Output> outputs;
    protected int processato;
    @XmlElement(nillable = true)
    protected List<Token> tokens;
    protected String uploader;

    /**
     * Recupera il valore della proprietà affidabilita.
     * 
     */
    public float getAffidabilita() {
        return affidabilita;
    }

    /**
     * Imposta il valore della proprietà affidabilita.
     * 
     */
    public void setAffidabilita(float value) {
        this.affidabilita = value;
    }

    /**
     * Recupera il valore della proprietà curriculum.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCurriculum() {
        return curriculum;
    }

    /**
     * Imposta il valore della proprietà curriculum.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCurriculum(byte[] value) {
        this.curriculum = value;
    }

    /**
     * Recupera il valore della proprietà idCurriculum.
     * 
     */
    public int getIdCurriculum() {
        return idCurriculum;
    }

    /**
     * Imposta il valore della proprietà idCurriculum.
     * 
     */
    public void setIdCurriculum(int value) {
        this.idCurriculum = value;
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
     * Recupera il valore della proprietà nominativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominativo() {
        return nominativo;
    }

    /**
     * Imposta il valore della proprietà nominativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominativo(String value) {
        this.nominativo = value;
    }

    /**
     * Gets the value of the outputs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outputs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutputs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Output }
     * 
     * 
     */
    public List<Output> getOutputs() {
        if (outputs == null) {
            outputs = new ArrayList<Output>();
        }
        return this.outputs;
    }

    /**
     * Recupera il valore della proprietà processato.
     * 
     */
    public int getProcessato() {
        return processato;
    }

    /**
     * Imposta il valore della proprietà processato.
     * 
     */
    public void setProcessato(int value) {
        this.processato = value;
    }

    /**
     * Gets the value of the tokens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tokens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTokens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Token }
     * 
     * 
     */
    public List<Token> getTokens() {
        if (tokens == null) {
            tokens = new ArrayList<Token>();
        }
        return this.tokens;
    }

    /**
     * Recupera il valore della proprietà uploader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploader() {
        return uploader;
    }

    /**
     * Imposta il valore della proprietà uploader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploader(String value) {
        this.uploader = value;
    }

}
