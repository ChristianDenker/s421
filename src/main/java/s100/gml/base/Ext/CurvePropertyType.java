//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base.Ext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import s100.gml.base.CompositeCurvePropertyType;
import s100.gml.base.OrientableCurvePropertyType;


/**
 * WIP update to spatial property types in profile. Spatial quality for an individual should be indicated by either the generic information association or the SpatialQuality role-element.
 * 
 * <p>Java-Klasse für CurvePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurvePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}curveProperty"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}compositeCurveProperty"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}orientableCurveProperty"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurvePropertyType", propOrder = {
    "curveProperty",
    "compositeCurveProperty",
    "orientableCurveProperty"
})
public class CurvePropertyType {

    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected s100.gml.base.CurvePropertyType curveProperty;
    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected CompositeCurvePropertyType compositeCurveProperty;
    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected OrientableCurvePropertyType orientableCurveProperty;

    /**
     * Ruft den Wert der curveProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link s100.gml.base.CurvePropertyType }
     *     
     */
    public s100.gml.base.CurvePropertyType getCurveProperty() {
        return curveProperty;
    }

    /**
     * Legt den Wert der curveProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link s100.gml.base.CurvePropertyType }
     *     
     */
    public void setCurveProperty(s100.gml.base.CurvePropertyType value) {
        this.curveProperty = value;
    }

    /**
     * Ruft den Wert der compositeCurveProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositeCurvePropertyType }
     *     
     */
    public CompositeCurvePropertyType getCompositeCurveProperty() {
        return compositeCurveProperty;
    }

    /**
     * Legt den Wert der compositeCurveProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositeCurvePropertyType }
     *     
     */
    public void setCompositeCurveProperty(CompositeCurvePropertyType value) {
        this.compositeCurveProperty = value;
    }

    /**
     * Ruft den Wert der orientableCurveProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrientableCurvePropertyType }
     *     
     */
    public OrientableCurvePropertyType getOrientableCurveProperty() {
        return orientableCurveProperty;
    }

    /**
     * Legt den Wert der orientableCurveProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientableCurvePropertyType }
     *     
     */
    public void setOrientableCurveProperty(OrientableCurvePropertyType value) {
        this.orientableCurveProperty = value;
    }

}
