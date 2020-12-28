//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Data Set Structure information
 * 
 * <p>Java-Klasse für DataSetStructureInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSetStructureInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datasetCoordOriginX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="datasetCoordOriginY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="datasetCoordOriginZ" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordMultFactorX" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="coordMultFactorY" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="coordMultFactorZ" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="nInfoRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nPointRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nMultiPointRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nCurveRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nCompositeCurveRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nSurfaceRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="nFeatureRec" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetStructureInformationType", propOrder = {
    "datasetCoordOriginX",
    "datasetCoordOriginY",
    "datasetCoordOriginZ",
    "coordMultFactorX",
    "coordMultFactorY",
    "coordMultFactorZ",
    "nInfoRec",
    "nPointRec",
    "nMultiPointRec",
    "nCurveRec",
    "nCompositeCurveRec",
    "nSurfaceRec",
    "nFeatureRec"
})
public class DataSetStructureInformationType {

    protected Double datasetCoordOriginX;
    protected Double datasetCoordOriginY;
    protected Double datasetCoordOriginZ;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger coordMultFactorX;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger coordMultFactorY;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger coordMultFactorZ;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nInfoRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nPointRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nMultiPointRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nCurveRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nCompositeCurveRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nSurfaceRec;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nFeatureRec;

    /**
     * Ruft den Wert der datasetCoordOriginX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDatasetCoordOriginX() {
        return datasetCoordOriginX;
    }

    /**
     * Legt den Wert der datasetCoordOriginX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDatasetCoordOriginX(Double value) {
        this.datasetCoordOriginX = value;
    }

    /**
     * Ruft den Wert der datasetCoordOriginY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDatasetCoordOriginY() {
        return datasetCoordOriginY;
    }

    /**
     * Legt den Wert der datasetCoordOriginY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDatasetCoordOriginY(Double value) {
        this.datasetCoordOriginY = value;
    }

    /**
     * Ruft den Wert der datasetCoordOriginZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDatasetCoordOriginZ() {
        return datasetCoordOriginZ;
    }

    /**
     * Legt den Wert der datasetCoordOriginZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDatasetCoordOriginZ(Double value) {
        this.datasetCoordOriginZ = value;
    }

    /**
     * Ruft den Wert der coordMultFactorX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoordMultFactorX() {
        return coordMultFactorX;
    }

    /**
     * Legt den Wert der coordMultFactorX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoordMultFactorX(BigInteger value) {
        this.coordMultFactorX = value;
    }

    /**
     * Ruft den Wert der coordMultFactorY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoordMultFactorY() {
        return coordMultFactorY;
    }

    /**
     * Legt den Wert der coordMultFactorY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoordMultFactorY(BigInteger value) {
        this.coordMultFactorY = value;
    }

    /**
     * Ruft den Wert der coordMultFactorZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoordMultFactorZ() {
        return coordMultFactorZ;
    }

    /**
     * Legt den Wert der coordMultFactorZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoordMultFactorZ(BigInteger value) {
        this.coordMultFactorZ = value;
    }

    /**
     * Ruft den Wert der nInfoRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNInfoRec() {
        return nInfoRec;
    }

    /**
     * Legt den Wert der nInfoRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNInfoRec(BigInteger value) {
        this.nInfoRec = value;
    }

    /**
     * Ruft den Wert der nPointRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNPointRec() {
        return nPointRec;
    }

    /**
     * Legt den Wert der nPointRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNPointRec(BigInteger value) {
        this.nPointRec = value;
    }

    /**
     * Ruft den Wert der nMultiPointRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNMultiPointRec() {
        return nMultiPointRec;
    }

    /**
     * Legt den Wert der nMultiPointRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNMultiPointRec(BigInteger value) {
        this.nMultiPointRec = value;
    }

    /**
     * Ruft den Wert der nCurveRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNCurveRec() {
        return nCurveRec;
    }

    /**
     * Legt den Wert der nCurveRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNCurveRec(BigInteger value) {
        this.nCurveRec = value;
    }

    /**
     * Ruft den Wert der nCompositeCurveRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNCompositeCurveRec() {
        return nCompositeCurveRec;
    }

    /**
     * Legt den Wert der nCompositeCurveRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNCompositeCurveRec(BigInteger value) {
        this.nCompositeCurveRec = value;
    }

    /**
     * Ruft den Wert der nSurfaceRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNSurfaceRec() {
        return nSurfaceRec;
    }

    /**
     * Legt den Wert der nSurfaceRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNSurfaceRec(BigInteger value) {
        this.nSurfaceRec = value;
    }

    /**
     * Ruft den Wert der nFeatureRec-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNFeatureRec() {
        return nFeatureRec;
    }

    /**
     * Legt den Wert der nFeatureRec-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNFeatureRec(BigInteger value) {
        this.nFeatureRec = value;
    }

}
