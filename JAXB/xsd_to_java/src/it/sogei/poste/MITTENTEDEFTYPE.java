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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MITTENTE_DEF_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MITTENTE_DEF_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MITT_RIGA1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MITT_RIGA2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MITT_INDIR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MITT_CAPCOMPROV" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MITTENTE_DEF_TYPE", propOrder = {
    "mittriga1",
    "mittriga2",
    "mittindir",
    "mittcapcomprov"
})
public class MITTENTEDEFTYPE {

    @XmlElement(name = "MITT_RIGA1", required = true)
    protected String mittriga1;
    @XmlElement(name = "MITT_RIGA2", required = true)
    protected String mittriga2;
    @XmlElement(name = "MITT_INDIR", required = true)
    protected String mittindir;
    @XmlElement(name = "MITT_CAPCOMPROV", required = true)
    protected String mittcapcomprov;

    /**
     * Recupera il valore della proprietà mittriga1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTRIGA1() {
        return mittriga1;
    }

    /**
     * Imposta il valore della proprietà mittriga1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTRIGA1(String value) {
        this.mittriga1 = value;
    }

    /**
     * Recupera il valore della proprietà mittriga2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTRIGA2() {
        return mittriga2;
    }

    /**
     * Imposta il valore della proprietà mittriga2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTRIGA2(String value) {
        this.mittriga2 = value;
    }

    /**
     * Recupera il valore della proprietà mittindir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTINDIR() {
        return mittindir;
    }

    /**
     * Imposta il valore della proprietà mittindir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTINDIR(String value) {
        this.mittindir = value;
    }

    /**
     * Recupera il valore della proprietà mittcapcomprov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTCAPCOMPROV() {
        return mittcapcomprov;
    }

    /**
     * Imposta il valore della proprietà mittcapcomprov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTCAPCOMPROV(String value) {
        this.mittcapcomprov = value;
    }

}
