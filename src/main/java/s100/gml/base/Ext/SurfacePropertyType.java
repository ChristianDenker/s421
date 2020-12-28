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


/**
 * WIP update to spatial property types in profile. Spatial quality for an individual should be indicated by either the generic information association or the SpatialQuality role-element.
 * 
 * <p>Java-Klasse für SurfacePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfacePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}surfaceProperty"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfacePropertyType", propOrder = {
    "surfaceProperty"
})
public class SurfacePropertyType {

    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected s100.gml.base.SurfacePropertyType surfaceProperty;

    /**
     * Ruft den Wert der surfaceProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link s100.gml.base.SurfacePropertyType }
     *     
     */
    public s100.gml.base.SurfacePropertyType getSurfaceProperty() {
        return surfaceProperty;
    }

    /**
     * Legt den Wert der surfaceProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link s100.gml.base.SurfacePropertyType }
     *     
     */
    public void setSurfaceProperty(s100.gml.base.SurfacePropertyType value) {
        this.surfaceProperty = value;
    }

}
