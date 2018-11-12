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
 *         &lt;element name="NUMERO_PRE_FATTURA_CONTROLLATE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PRE_FATTURA_CONTROLLATA" type="{}PRE_FATTURA_CONTROLLATA_TYPE" maxOccurs="unbounded"/>
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
    "numeroprefatturacontrollate",
    "prefatturacontrollata"
})
@XmlRootElement(name = "ERC")
public class ERC {

    @XmlElement(name = "HEADER", required = true)
    protected HEADERTYPE header;
    @XmlElement(name = "NUMERO_PRE_FATTURA_CONTROLLATE")
    protected int numeroprefatturacontrollate;
    @XmlElement(name = "PRE_FATTURA_CONTROLLATA", required = true)
    protected List<PREFATTURACONTROLLATATYPE> prefatturacontrollata;

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
     * Recupera il valore della proprietà numeroprefatturacontrollate.
     * 
     */
    public int getNUMEROPREFATTURACONTROLLATE() {
        return numeroprefatturacontrollate;
    }

    /**
     * Imposta il valore della proprietà numeroprefatturacontrollate.
     * 
     */
    public void setNUMEROPREFATTURACONTROLLATE(int value) {
        this.numeroprefatturacontrollate = value;
    }

    /**
     * Gets the value of the prefatturacontrollata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefatturacontrollata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPREFATTURACONTROLLATA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PREFATTURACONTROLLATATYPE }
     * 
     * 
     */
    public List<PREFATTURACONTROLLATATYPE> getPREFATTURACONTROLLATA() {
        if (prefatturacontrollata == null) {
            prefatturacontrollata = new ArrayList<PREFATTURACONTROLLATATYPE>();
        }
        return this.prefatturacontrollata;
    }

}
