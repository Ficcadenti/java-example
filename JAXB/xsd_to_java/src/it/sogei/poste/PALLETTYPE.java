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
 * <p>Classe Java per PALLET_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PALLET_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PROGR_PALLET">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_SCATOLE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SCATOLA" type="{}SCATOLA_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PALLET_TYPE", propOrder = {
    "progrpallet",
    "numscatole",
    "scatola"
})
public class PALLETTYPE {

    @XmlElement(name = "PROGR_PALLET")
    protected int progrpallet;
    @XmlElement(name = "NUM_SCATOLE")
    protected int numscatole;
    @XmlElement(name = "SCATOLA", required = true)
    protected List<SCATOLATYPE> scatola;

    /**
     * Recupera il valore della proprietà progrpallet.
     * 
     */
    public int getPROGRPALLET() {
        return progrpallet;
    }

    /**
     * Imposta il valore della proprietà progrpallet.
     * 
     */
    public void setPROGRPALLET(int value) {
        this.progrpallet = value;
    }

    /**
     * Recupera il valore della proprietà numscatole.
     * 
     */
    public int getNUMSCATOLE() {
        return numscatole;
    }

    /**
     * Imposta il valore della proprietà numscatole.
     * 
     */
    public void setNUMSCATOLE(int value) {
        this.numscatole = value;
    }

    /**
     * Gets the value of the scatola property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scatola property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSCATOLA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SCATOLATYPE }
     * 
     * 
     */
    public List<SCATOLATYPE> getSCATOLA() {
        if (scatola == null) {
            scatola = new ArrayList<SCATOLATYPE>();
        }
        return this.scatola;
    }

}
