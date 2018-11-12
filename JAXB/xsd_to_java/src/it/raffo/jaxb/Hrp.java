//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.12 alle 11:21:55 PM CEST 
//


package it.raffo.jaxb;

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
 *         &lt;element name="Curriculum" type="{http://hrp.exolab.it/HRPDemo}curriculum"/>
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
    "curriculum"
})
@XmlRootElement(name = "hrp")
public class Hrp {

    @XmlElement(name = "Curriculum", required = true)
    protected Curriculum curriculum;

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

}
