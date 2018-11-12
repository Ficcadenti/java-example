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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MAZZETTA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MAZZETTA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_ID_MAZZETTA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_CARTACEI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CARTACEO" type="{}CARTACEO_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAZZETTA_TYPE", propOrder = {
    "numidmazzetta",
    "numcartacei",
    "cartaceo"
})
public class MAZZETTATYPE {

    @XmlElement(name = "NUM_ID_MAZZETTA", required = true)
    protected String numidmazzetta;
    @XmlElement(name = "NUM_CARTACEI")
    protected int numcartacei;
    @XmlElement(name = "CARTACEO", required = true)
    protected List<CARTACEOTYPE> cartaceo;

    /**
     * Recupera il valore della proprietà numidmazzetta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMIDMAZZETTA() {
        return numidmazzetta;
    }

    /**
     * Imposta il valore della proprietà numidmazzetta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMIDMAZZETTA(String value) {
        this.numidmazzetta = value;
    }

    /**
     * Recupera il valore della proprietà numcartacei.
     * 
     */
    public int getNUMCARTACEI() {
        return numcartacei;
    }

    /**
     * Imposta il valore della proprietà numcartacei.
     * 
     */
    public void setNUMCARTACEI(int value) {
        this.numcartacei = value;
    }

    /**
     * Gets the value of the cartaceo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartaceo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARTACEO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARTACEOTYPE }
     * 
     * 
     */
    public List<CARTACEOTYPE> getCARTACEO() {
        if (cartaceo == null) {
            cartaceo = new ArrayList<CARTACEOTYPE>();
        }
        return this.cartaceo;
    }

}
