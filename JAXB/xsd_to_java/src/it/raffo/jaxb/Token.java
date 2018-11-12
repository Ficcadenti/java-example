//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per token complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="token">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curriculum" type="{http://hrp.exolab.it/HRPDemo}curriculum" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modulo" type="{http://hrp.exolab.it/HRPDemo}modulo" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "token", propOrder = {
    "curriculum",
    "id",
    "idUtente",
    "modulo",
    "token"
})
public class Token {

    protected Curriculum curriculum;
    protected int id;
    protected String idUtente;
    @XmlSchemaType(name = "string")
    protected Modulo modulo;
    protected String token;

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
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà idUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUtente() {
        return idUtente;
    }

    /**
     * Imposta il valore della proprietà idUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUtente(String value) {
        this.idUtente = value;
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
     * Recupera il valore della proprietà token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Imposta il valore della proprietà token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
