//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type for feature object identifier combines agency, FIDN, FIDS
 * 
 * <p>Java-Klasse für FeatureObjectIdentifier complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureObjectIdentifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agency" type="{http://www.iho.int/s100gml/1.0}AgencyCodeType"/>
 *         &lt;element name="featureIdentificationNumber" type="{http://www.iho.int/s100gml/1.0}IdentificationNumberType"/>
 *         &lt;element name="featureIdentificationSubdivision" type="{http://www.iho.int/s100gml/1.0}IdentificationSubdivisionType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureObjectIdentifier", propOrder = {
    "agency",
    "featureIdentificationNumber",
    "featureIdentificationSubdivision"
})
public class FeatureObjectIdentifier {

    @XmlElement(required = true)
    protected String agency;
    @XmlSchemaType(name = "positiveInteger")
    protected long featureIdentificationNumber;
    @XmlSchemaType(name = "positiveInteger")
    protected int featureIdentificationSubdivision;

    /**
     * Ruft den Wert der agency-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgency() {
        return agency;
    }

    /**
     * Legt den Wert der agency-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgency(String value) {
        this.agency = value;
    }

    /**
     * Ruft den Wert der featureIdentificationNumber-Eigenschaft ab.
     * 
     */
    public long getFeatureIdentificationNumber() {
        return featureIdentificationNumber;
    }

    /**
     * Legt den Wert der featureIdentificationNumber-Eigenschaft fest.
     * 
     */
    public void setFeatureIdentificationNumber(long value) {
        this.featureIdentificationNumber = value;
    }

    /**
     * Ruft den Wert der featureIdentificationSubdivision-Eigenschaft ab.
     * 
     */
    public int getFeatureIdentificationSubdivision() {
        return featureIdentificationSubdivision;
    }

    /**
     * Legt den Wert der featureIdentificationSubdivision-Eigenschaft fest.
     * 
     */
    public void setFeatureIdentificationSubdivision(int value) {
        this.featureIdentificationSubdivision = value;
    }

}
