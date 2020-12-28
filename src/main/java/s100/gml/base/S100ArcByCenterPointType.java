//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import s100.gml.profile.AbstractCurveSegmentType;
import s100.gml.profile.CurveInterpolationType;
import s100.gml.profile.DirectPositionType;
import s100.gml.profile.LengthType;
import s100.gml.profile.PointPropertyType;


/**
 * Type for S-100 arc by center point geometry
 * 
 * <p>Java-Klasse für S100_ArcByCenterPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="S100_ArcByCenterPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveSegmentType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="startAngle" type="{http://www.iho.int/s100gml/1.0}BearingType" minOccurs="0"/>
 *         &lt;element name="angularDistance" type="{http://www.iho.int/s100gml/1.0}PlusOrMinus360Degrees" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="interpolation" type="{http://www.opengis.net/gml/3.2}CurveInterpolationType" fixed="circularArcCenterPointWithRadius" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_ArcByCenterPointType", propOrder = {
    "pos",
    "pointProperty",
    "radius",
    "startAngle",
    "angularDistance"
})
@XmlSeeAlso({
    S100CircleByCenterPointType.class
})
public class S100ArcByCenterPointType
    extends AbstractCurveSegmentType
{

    @XmlElement(namespace = "http://www.opengis.net/gml/3.2")
    protected DirectPositionType pos;
    @XmlElement(namespace = "http://www.opengis.net/gml/3.2")
    protected PointPropertyType pointProperty;
    @XmlElement(required = true)
    protected LengthType radius;
    protected BigDecimal startAngle;
    protected BigDecimal angularDistance;
    @XmlAttribute(name = "interpolation")
    protected CurveInterpolationType interpolation;

    /**
     * Ruft den Wert der pos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionType }
     *     
     */
    public DirectPositionType getPos() {
        return pos;
    }

    /**
     * Legt den Wert der pos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionType }
     *     
     */
    public void setPos(DirectPositionType value) {
        this.pos = value;
    }

    /**
     * Ruft den Wert der pointProperty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointPropertyType }
     *     
     */
    public PointPropertyType getPointProperty() {
        return pointProperty;
    }

    /**
     * Legt den Wert der pointProperty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointPropertyType }
     *     
     */
    public void setPointProperty(PointPropertyType value) {
        this.pointProperty = value;
    }

    /**
     * Ruft den Wert der radius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LengthType }
     *     
     */
    public LengthType getRadius() {
        return radius;
    }

    /**
     * Legt den Wert der radius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthType }
     *     
     */
    public void setRadius(LengthType value) {
        this.radius = value;
    }

    /**
     * Ruft den Wert der startAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartAngle() {
        return startAngle;
    }

    /**
     * Legt den Wert der startAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartAngle(BigDecimal value) {
        this.startAngle = value;
    }

    /**
     * Ruft den Wert der angularDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAngularDistance() {
        return angularDistance;
    }

    /**
     * Legt den Wert der angularDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAngularDistance(BigDecimal value) {
        this.angularDistance = value;
    }

    /**
     * Ruft den Wert der interpolation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurveInterpolationType }
     *     
     */
    public CurveInterpolationType getInterpolation() {
        if (interpolation == null) {
            return CurveInterpolationType.CIRCULAR_ARC_CENTER_POINT_WITH_RADIUS;
        } else {
            return interpolation;
        }
    }

    /**
     * Legt den Wert der interpolation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveInterpolationType }
     *     
     */
    public void setInterpolation(CurveInterpolationType value) {
        this.interpolation = value;
    }

}
