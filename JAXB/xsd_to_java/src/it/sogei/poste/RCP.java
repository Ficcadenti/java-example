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
 *         &lt;element name="NUMERO_PRE_FATTURE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRE_FATTURA_RCP" type="{}PRE_FATTURA_RCP_TYPE"/>
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
    "numeroprefatture",
    "prefatturarcp"
})
@XmlRootElement(name = "RCP")
public class RCP {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERTYPE header;
    @XmlElement(name = "NUMERO_PRE_FATTURE")
    protected int numeroprefatture;
    @XmlElement(name = "PRE_FATTURA_RCP", required = true)
    protected PREFATTURARCPTYPE prefatturarcp;

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
     * Recupera il valore della proprietà numeroprefatture.
     * 
     */
    public int getNUMEROPREFATTURE() {
        return numeroprefatture;
    }

    /**
     * Imposta il valore della proprietà numeroprefatture.
     * 
     */
    public void setNUMEROPREFATTURE(int value) {
        this.numeroprefatture = value;
    }

    /**
     * Recupera il valore della proprietà prefatturarcp.
     * 
     * @return
     *     possible object is
     *     {@link PREFATTURARCPTYPE }
     *     
     */
    public PREFATTURARCPTYPE getPREFATTURARCP() {
        return prefatturarcp;
    }

    /**
     * Imposta il valore della proprietà prefatturarcp.
     * 
     * @param value
     *     allowed object is
     *     {@link PREFATTURARCPTYPE }
     *     
     */
    public void setPREFATTURARCP(PREFATTURARCPTYPE value) {
        this.prefatturarcp = value;
    }

}
