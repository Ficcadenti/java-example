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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ELENCO_CAP_NON_GESTITI_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ELENCO_CAP_NON_GESTITI_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFICATIVO_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DATA_CREAZIONE_FILE" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="NUMERO_CAP_NON_GESTITI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAP_NON_GESTITI" type="{}CAP_NON_GESTITI_TYPE" maxOccurs="unbounded"/>
 *         &lt;element name="MORE_INFO" type="{}MORE_INFO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ELENCO_CAP_NON_GESTITI_TYPE", propOrder = {
    "identificativofile",
    "datacreazionefile",
    "numerocapnongestiti",
    "capnongestiti",
    "moreinfo"
})
public class ELENCOCAPNONGESTITITYPE {

    @XmlElement(name = "IDENTIFICATIVO_FILE", required = true)
    protected String identificativofile;
    @XmlElement(name = "DATA_CREAZIONE_FILE", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datacreazionefile;
    @XmlElement(name = "NUMERO_CAP_NON_GESTITI")
    protected int numerocapnongestiti;
    @XmlElement(name = "CAP_NON_GESTITI", required = true)
    protected List<CAPNONGESTITITYPE> capnongestiti;
    @XmlElement(name = "MORE_INFO", required = true)
    protected MOREINFOTYPE moreinfo;

    /**
     * Recupera il valore della proprietà identificativofile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICATIVOFILE() {
        return identificativofile;
    }

    /**
     * Imposta il valore della proprietà identificativofile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICATIVOFILE(String value) {
        this.identificativofile = value;
    }

    /**
     * Recupera il valore della proprietà datacreazionefile.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATACREAZIONEFILE() {
        return datacreazionefile;
    }

    /**
     * Imposta il valore della proprietà datacreazionefile.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATACREAZIONEFILE(XMLGregorianCalendar value) {
        this.datacreazionefile = value;
    }

    /**
     * Recupera il valore della proprietà numerocapnongestiti.
     * 
     */
    public int getNUMEROCAPNONGESTITI() {
        return numerocapnongestiti;
    }

    /**
     * Imposta il valore della proprietà numerocapnongestiti.
     * 
     */
    public void setNUMEROCAPNONGESTITI(int value) {
        this.numerocapnongestiti = value;
    }

    /**
     * Gets the value of the capnongestiti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the capnongestiti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAPNONGESTITI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAPNONGESTITITYPE }
     * 
     * 
     */
    public List<CAPNONGESTITITYPE> getCAPNONGESTITI() {
        if (capnongestiti == null) {
            capnongestiti = new ArrayList<CAPNONGESTITITYPE>();
        }
        return this.capnongestiti;
    }

    /**
     * Recupera il valore della proprietà moreinfo.
     * 
     * @return
     *     possible object is
     *     {@link MOREINFOTYPE }
     *     
     */
    public MOREINFOTYPE getMOREINFO() {
        return moreinfo;
    }

    /**
     * Imposta il valore della proprietà moreinfo.
     * 
     * @param value
     *     allowed object is
     *     {@link MOREINFOTYPE }
     *     
     */
    public void setMOREINFO(MOREINFOTYPE value) {
        this.moreinfo = value;
    }

}
