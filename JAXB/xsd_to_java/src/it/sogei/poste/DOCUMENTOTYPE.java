//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11-b140731.1112 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.10.22 alle 10:52:22 PM CEST 
//


package it.sogei.poste;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DOCUMENTO_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DOCUMENTO_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NUM_DOCUMENTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="NUM_RACCOMANDATA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TIPO_MODELLO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CODICE_AMBITO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CENTRO_COSTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENTO_COSTO">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DOCUMENTO_IVA">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0.01"/>
 *               &lt;maxInclusive value="999999999.99"/>
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IDENTIFICATIVO" type="{}IDENTIFICATIVO_TYPE"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DOCUMENTO_TYPE", propOrder = {
    "numdocumento",
    "numraccomandata",
    "tipomodello",
    "codiceambito",
    "centrocosto",
    "documentocosto",
    "documentoiva",
    "identificativo"
})
@XmlSeeAlso({
    DOCUMENTOREPTYPE.class,
    DOCUMENTORCPTYPE.class
})
public class DOCUMENTOTYPE {

    @XmlElement(name = "NUM_DOCUMENTO", required = true)
    protected String numdocumento;
    @XmlElement(name = "NUM_RACCOMANDATA", required = true)
    protected String numraccomandata;
    @XmlElement(name = "TIPO_MODELLO", required = true)
    protected String tipomodello;
    @XmlElement(name = "CODICE_AMBITO", required = true)
    protected String codiceambito;
    @XmlElement(name = "CENTRO_COSTO", required = true)
    protected String centrocosto;
    @XmlElement(name = "DOCUMENTO_COSTO", required = true)
    protected BigDecimal documentocosto;
    @XmlElement(name = "DOCUMENTO_IVA", required = true)
    protected BigDecimal documentoiva;
    @XmlElement(name = "IDENTIFICATIVO", required = true)
    protected IDENTIFICATIVOTYPE identificativo;

    /**
     * Recupera il valore della proprietà numdocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMDOCUMENTO() {
        return numdocumento;
    }

    /**
     * Imposta il valore della proprietà numdocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMDOCUMENTO(String value) {
        this.numdocumento = value;
    }

    /**
     * Recupera il valore della proprietà numraccomandata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMRACCOMANDATA() {
        return numraccomandata;
    }

    /**
     * Imposta il valore della proprietà numraccomandata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMRACCOMANDATA(String value) {
        this.numraccomandata = value;
    }

    /**
     * Recupera il valore della proprietà tipomodello.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOMODELLO() {
        return tipomodello;
    }

    /**
     * Imposta il valore della proprietà tipomodello.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOMODELLO(String value) {
        this.tipomodello = value;
    }

    /**
     * Recupera il valore della proprietà codiceambito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODICEAMBITO() {
        return codiceambito;
    }

    /**
     * Imposta il valore della proprietà codiceambito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODICEAMBITO(String value) {
        this.codiceambito = value;
    }

    /**
     * Recupera il valore della proprietà centrocosto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCENTROCOSTO() {
        return centrocosto;
    }

    /**
     * Imposta il valore della proprietà centrocosto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCENTROCOSTO(String value) {
        this.centrocosto = value;
    }

    /**
     * Recupera il valore della proprietà documentocosto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDOCUMENTOCOSTO() {
        return documentocosto;
    }

    /**
     * Imposta il valore della proprietà documentocosto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDOCUMENTOCOSTO(BigDecimal value) {
        this.documentocosto = value;
    }

    /**
     * Recupera il valore della proprietà documentoiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDOCUMENTOIVA() {
        return documentoiva;
    }

    /**
     * Imposta il valore della proprietà documentoiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDOCUMENTOIVA(BigDecimal value) {
        this.documentoiva = value;
    }

    /**
     * Recupera il valore della proprietà identificativo.
     * 
     * @return
     *     possible object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public IDENTIFICATIVOTYPE getIDENTIFICATIVO() {
        return identificativo;
    }

    /**
     * Imposta il valore della proprietà identificativo.
     * 
     * @param value
     *     allowed object is
     *     {@link IDENTIFICATIVOTYPE }
     *     
     */
    public void setIDENTIFICATIVO(IDENTIFICATIVOTYPE value) {
        this.identificativo = value;
    }

}
