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
import s100.gml.base.CurvePropertyType;
import s100.gml.base.SurfacePropertyType;


/**
 * <p>Java-Klasse für CurveOrSurfacePropertyType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CurveOrSurfacePropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}curveProperty"/>
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
@XmlType(name = "CurveOrSurfacePropertyType", propOrder = {
    "curveProperty",
    "surfaceProperty"
})
public class CurveOrSurfacePropertyType {

    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected CurvePropertyType curveProperty;
    @XmlElement(namespace = "http://www.iho.int/s100gml/1.0")
    protected SurfacePropertyType surfaceProperty;

    /**
     * Ruft den Wert der curveProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getCurveProperty() {
        return curveProperty;
    }

    /**
     * Legt den Wert der curveProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setCurveProperty(CurvePropertyType value) {
        this.curveProperty = value;
    }

    /**
     * Ruft den Wert der surfaceProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePropertyType }
     *     
     */
    public SurfacePropertyType getSurfaceProperty() {
        return surfaceProperty;
    }

    /**
     * Legt den Wert der surfaceProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePropertyType }
     *     
     */
    public void setSurfaceProperty(SurfacePropertyType value) {
        this.surfaceProperty = value;
    }

}
