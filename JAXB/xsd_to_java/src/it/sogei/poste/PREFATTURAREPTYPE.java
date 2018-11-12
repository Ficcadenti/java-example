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
 * <p>Classe Java per PRE_FATTURA_REP_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="PRE_FATTURA_REP_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}PRE_FATTURA_TYPE">
 *       &lt;sequence>
 *         &lt;element name="IDENTIFICATIVO_FILE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="28"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUMERO_DOC_FATTURATI">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENTO" type="{}DOCUMENTO_REP_TYPE" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PRE_FATTURA_REP_TYPE", propOrder = {
    "identificativofile",
    "numerodocfatturati",
    "documento"
})
public class PREFATTURAREPTYPE
    extends PREFATTURATYPE
{

    @XmlElement(name = "IDENTIFICATIVO_FILE", required = true)
    protected String identificativofile;
    @XmlElement(name = "NUMERO_DOC_FATTURATI")
    protected int numerodocfatturati;
    @XmlElement(name = "DOCUMENTO", required = true)
    protected List<DOCUMENTOREPTYPE> documento;

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
     * Recupera il valore della proprietà numerodocfatturati.
     * 
     */
    public int getNUMERODOCFATTURATI() {
        return numerodocfatturati;
    }

    /**
     * Imposta il valore della proprietà numerodocfatturati.
     * 
     */
    public void setNUMERODOCFATTURATI(int value) {
        this.numerodocfatturati = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOCUMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOCUMENTOREPTYPE }
     * 
     * 
     */
    public List<DOCUMENTOREPTYPE> getDOCUMENTO() {
        if (documento == null) {
            documento = new ArrayList<DOCUMENTOREPTYPE>();
        }
        return this.documento;
    }

}
