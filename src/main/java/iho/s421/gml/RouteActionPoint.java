//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import s100.gml.profile.ReferenceType;


/**
 * <p>Java-Klasse für RouteActionPoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteActionPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="geometry" type="{http://www.iho.int/S421/gml/1.0}RouteActionPointSpaceGeometry"/>
 *         &lt;element name="routeActionPointID" type="{http://www.iho.int/S421/gml/1.0}PositiveInteger"/>
 *         &lt;element name="routeActionPointName" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeActionPointExternalReference" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeActionPointRadius" type="{http://www.iho.int/S421/gml/1.0}Real" minOccurs="0"/>
 *         &lt;element name="routeActionPointTimeToAct" type="{http://www.iho.int/S421/gml/1.0}Integer" minOccurs="0"/>
 *         &lt;element name="routeActionPointRequiredAction" type="{http://www.iho.int/S421/gml/1.0}RouteActionPointRequiredAction"/>
 *         &lt;element name="routeActionPointRequiredActionDescription" type="{http://www.iho.int/S421/gml/1.0}Text"/>
 *         &lt;element name="routeActionPointCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeActionPointExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteActionPoint", propOrder = {
    "geometry",
    "routeActionPointID",
    "routeActionPointName",
    "routeActionPointExternalReference",
    "routeActionPointRadius",
    "routeActionPointTimeToAct",
    "routeActionPointRequiredAction",
    "routeActionPointRequiredActionDescription",
    "routeActionPointCollection",
    "routeActionPointExtensions"
})
public class RouteActionPoint
    extends FeatureType
{

    @XmlElement(required = true)
    protected RouteActionPointSpaceGeometry geometry;
    @XmlElement(required = true)
    protected BigInteger routeActionPointID;
    protected String routeActionPointName;
    protected String routeActionPointExternalReference;
    protected BigDecimal routeActionPointRadius;
    protected BigInteger routeActionPointTimeToAct;
    @XmlElement(required = true)
    protected BigInteger routeActionPointRequiredAction;
    @XmlElement(required = true)
    protected String routeActionPointRequiredActionDescription;
    @XmlElement(required = true)
    protected ReferenceType routeActionPointCollection;
    protected List<RouteExtensions> routeActionPointExtensions;

    /**
     * Ruft den Wert der geometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RouteActionPointSpaceGeometry }
     *     
     */
    public RouteActionPointSpaceGeometry getGeometry() {
        return geometry;
    }

    /**
     * Legt den Wert der geometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteActionPointSpaceGeometry }
     *     
     */
    public void setGeometry(RouteActionPointSpaceGeometry value) {
        this.geometry = value;
    }

    /**
     * Ruft den Wert der routeActionPointID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteActionPointID() {
        return routeActionPointID;
    }

    /**
     * Legt den Wert der routeActionPointID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteActionPointID(BigInteger value) {
        this.routeActionPointID = value;
    }

    /**
     * Ruft den Wert der routeActionPointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteActionPointName() {
        return routeActionPointName;
    }

    /**
     * Legt den Wert der routeActionPointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteActionPointName(String value) {
        this.routeActionPointName = value;
    }

    /**
     * Ruft den Wert der routeActionPointExternalReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteActionPointExternalReference() {
        return routeActionPointExternalReference;
    }

    /**
     * Legt den Wert der routeActionPointExternalReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteActionPointExternalReference(String value) {
        this.routeActionPointExternalReference = value;
    }

    /**
     * Ruft den Wert der routeActionPointRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteActionPointRadius() {
        return routeActionPointRadius;
    }

    /**
     * Legt den Wert der routeActionPointRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteActionPointRadius(BigDecimal value) {
        this.routeActionPointRadius = value;
    }

    /**
     * Ruft den Wert der routeActionPointTimeToAct-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteActionPointTimeToAct() {
        return routeActionPointTimeToAct;
    }

    /**
     * Legt den Wert der routeActionPointTimeToAct-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteActionPointTimeToAct(BigInteger value) {
        this.routeActionPointTimeToAct = value;
    }

    /**
     * Ruft den Wert der routeActionPointRequiredAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteActionPointRequiredAction() {
        return routeActionPointRequiredAction;
    }

    /**
     * Legt den Wert der routeActionPointRequiredAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteActionPointRequiredAction(BigInteger value) {
        this.routeActionPointRequiredAction = value;
    }

    /**
     * Ruft den Wert der routeActionPointRequiredActionDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteActionPointRequiredActionDescription() {
        return routeActionPointRequiredActionDescription;
    }

    /**
     * Legt den Wert der routeActionPointRequiredActionDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteActionPointRequiredActionDescription(String value) {
        this.routeActionPointRequiredActionDescription = value;
    }

    /**
     * Ruft den Wert der routeActionPointCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteActionPointCollection() {
        return routeActionPointCollection;
    }

    /**
     * Legt den Wert der routeActionPointCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteActionPointCollection(ReferenceType value) {
        this.routeActionPointCollection = value;
    }

    /**
     * Gets the value of the routeActionPointExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeActionPointExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteActionPointExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteActionPointExtensions() {
        if (routeActionPointExtensions == null) {
            routeActionPointExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeActionPointExtensions;
    }

}
