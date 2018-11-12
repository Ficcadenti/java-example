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
 * <p>Classe Java per SCATOLA_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="SCATOLA_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_ID_SCATOLA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_MAZZETTE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MAZZETTA" type="{}MAZZETTA_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCATOLA_TYPE", propOrder = {
    "numidscatola",
    "nummazzette",
    "mazzetta"
})
public class SCATOLATYPE {

    @XmlElement(name = "NUM_ID_SCATOLA", required = true)
    protected String numidscatola;
    @XmlElement(name = "NUM_MAZZETTE")
    protected int nummazzette;
    @XmlElement(name = "MAZZETTA", required = true)
    protected List<MAZZETTATYPE> mazzetta;

    /**
     * Recupera il valore della proprietà numidscatola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMIDSCATOLA() {
        return numidscatola;
    }

    /**
     * Imposta il valore della proprietà numidscatola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMIDSCATOLA(String value) {
        this.numidscatola = value;
    }

    /**
     * Recupera il valore della proprietà nummazzette.
     * 
     */
    public int getNUMMAZZETTE() {
        return nummazzette;
    }

    /**
     * Imposta il valore della proprietà nummazzette.
     * 
     */
    public void setNUMMAZZETTE(int value) {
        this.nummazzette = value;
    }

    /**
     * Gets the value of the mazzetta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mazzetta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAZZETTA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAZZETTATYPE }
     * 
     * 
     */
    public List<MAZZETTATYPE> getMAZZETTA() {
        if (mazzetta == null) {
            mazzetta = new ArrayList<MAZZETTATYPE>();
        }
        return this.mazzetta;
    }

}
