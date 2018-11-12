//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RISCONTRO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RISCONTRO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FATTURA_NETTO_AUTORIZZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FATTURA_IVA_AUTORIZZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FATTURA_TOTALE_AUTORIZZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOC_AUTORIZZ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOC_ERRATI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENTO_AUTORIZZ" type="{}DOCUMENTO_AUTORIZZ_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DOCUMENTO_ERRATO" type="{}DOCUMENTO_ERRATO_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RISCONTRO_TYPE", propOrder = {
    "fatturanettoautorizz",
    "fatturaivaautorizz",
    "fatturatotaleautorizz",
    "numerodocautorizz",
    "numerodocerrati",
    "documentoautorizz",
    "documentoerrato"
})
public class RISCONTROTYPE {

    @XmlElement(name = "FATTURA_NETTO_AUTORIZZ", required = true)
    protected BigDecimal fatturanettoautorizz;
    @XmlElement(name = "FATTURA_IVA_AUTORIZZ", required = true)
    protected BigDecimal fatturaivaautorizz;
    @XmlElement(name = "FATTURA_TOTALE_AUTORIZZ", required = true)
    protected BigDecimal fatturatotaleautorizz;
    @XmlElement(name = "NUMERO_DOC_AUTORIZZ")
    protected int numerodocautorizz;
    @XmlElement(name = "NUMERO_DOC_ERRATI")
    protected int numerodocerrati;
    @XmlElement(name = "DOCUMENTO_AUTORIZZ")
    protected List<DOCUMENTOAUTORIZZTYPE> documentoautorizz;
    @XmlElement(name = "DOCUMENTO_ERRATO")
    protected List<DOCUMENTOERRATOTYPE> documentoerrato;

    /**
     * Recupera il valore della proprietà fatturanettoautorizz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURANETTOAUTORIZZ() {
        return fatturanettoautorizz;
    }

    /**
     * Imposta il valore della proprietà fatturanettoautorizz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURANETTOAUTORIZZ(BigDecimal value) {
        this.fatturanettoautorizz = value;
    }

    /**
     * Recupera il valore della proprietà fatturaivaautorizz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURAIVAAUTORIZZ() {
        return fatturaivaautorizz;
    }

    /**
     * Imposta il valore della proprietà fatturaivaautorizz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURAIVAAUTORIZZ(BigDecimal value) {
        this.fatturaivaautorizz = value;
    }

    /**
     * Recupera il valore della proprietà fatturatotaleautorizz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFATTURATOTALEAUTORIZZ() {
        return fatturatotaleautorizz;
    }

    /**
     * Imposta il valore della proprietà fatturatotaleautorizz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFATTURATOTALEAUTORIZZ(BigDecimal value) {
        this.fatturatotaleautorizz = value;
    }

    /**
     * Recupera il valore della proprietà numerodocautorizz.
     * 
     */
    public int getNUMERODOCAUTORIZZ() {
        return numerodocautorizz;
    }

    /**
     * Imposta il valore della proprietà numerodocautorizz.
     * 
     */
    public void setNUMERODOCAUTORIZZ(int value) {
        this.numerodocautorizz = value;
    }

    /**
     * Recupera il valore della proprietà numerodocerrati.
     * 
     */
    public int getNUMERODOCERRATI() {
        return numerodocerrati;
    }

    /**
     * Imposta il valore della proprietà numerodocerrati.
     * 
     */
    public void setNUMERODOCERRATI(int value) {
        this.numerodocerrati = value;
    }

    /**
     * Gets the value of the documentoautorizz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoautorizz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENTOAUTORIZZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENTOAUTORIZZTYPE }
     * 
     * 
     */
    public List<DOCUMENTOAUTORIZZTYPE> getDOCUMENTOAUTORIZZ() {
        if (documentoautorizz == null) {
            documentoautorizz = new ArrayList<DOCUMENTOAUTORIZZTYPE>();
        }
        return this.documentoautorizz;
    }

    /**
     * Gets the value of the documentoerrato property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoerrato property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENTOERRATO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENTOERRATOTYPE }
     * 
     * 
     */
    public List<DOCUMENTOERRATOTYPE> getDOCUMENTOERRATO() {
        if (documentoerrato == null) {
            documentoerrato = new ArrayList<DOCUMENTOERRATOTYPE>();
        }
        return this.documentoerrato;
    }

}
