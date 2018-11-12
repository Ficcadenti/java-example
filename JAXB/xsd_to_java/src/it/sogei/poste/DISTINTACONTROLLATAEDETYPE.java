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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per DISTINTA_CONTROLLATA_EDE_TYPE complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DISTINTA_CONTROLLATA_EDE_TYPE">
 *   &lt;complexContent>
 *     &lt;extension base="{}CONTROLLATA_BASE_TYPE">
 *       &lt;sequence>
 *         &lt;element name="DATA_RITIRO_MATERIALITA" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DISTINTA_CONTROLLATA_EDE_TYPE", propOrder = {
    "dataritiromaterialita"
})
public class DISTINTACONTROLLATAEDETYPE
    extends CONTROLLATABASETYPE
{

    @XmlElement(name = "DATA_RITIRO_MATERIALITA", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataritiromaterialita;

    /**
     * Recupera il valore della proprietà dataritiromaterialita.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATARITIROMATERIALITA() {
        return dataritiromaterialita;
    }

    /**
     * Imposta il valore della proprietà dataritiromaterialita.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATARITIROMATERIALITA(XMLGregorianCalendar value) {
        this.dataritiromaterialita = value;
    }

}
