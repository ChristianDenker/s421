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
 * <p>Java-Klasse für RouteWaypoint complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteWaypoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="geometry" type="{http://www.iho.int/S421/gml/1.0}GM_Point"/>
 *         &lt;element name="routeWaypointID" type="{http://www.iho.int/S421/gml/1.0}PositiveInteger"/>
 *         &lt;element name="routeWaypointName" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeWaypointExternalReferenceID" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeWaypointFixed" type="{http://www.iho.int/S421/gml/1.0}Boolean" minOccurs="0"/>
 *         &lt;element name="routeWaypointTurnRadius" type="{http://www.iho.int/S421/gml/1.0}RadiusType"/>
 *         &lt;element name="routeWaypointCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeWaypointLeg" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeWaypointExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWaypoint", propOrder = {
    "geometry",
    "routeWaypointID",
    "routeWaypointName",
    "routeWaypointExternalReferenceID",
    "routeWaypointFixed",
    "routeWaypointTurnRadius",
    "routeWaypointCollection",
    "routeWaypointLeg",
    "routeWaypointExtensions"
})
public class RouteWaypoint
    extends FeatureType
{

    @XmlElement(required = true)
    protected GMPoint geometry;
    @XmlElement(required = true)
    protected BigInteger routeWaypointID;
    protected String routeWaypointName;
    protected String routeWaypointExternalReferenceID;
    protected Boolean routeWaypointFixed;
    @XmlElement(required = true)
    protected BigDecimal routeWaypointTurnRadius;
    @XmlElement(required = true)
    protected ReferenceType routeWaypointCollection;
    protected ReferenceType routeWaypointLeg;
    protected List<RouteExtensions> routeWaypointExtensions;

    /**
     * Ruft den Wert der geometry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GMPoint }
     *     
     */
    public GMPoint getGeometry() {
        return geometry;
    }

    /**
     * Legt den Wert der geometry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GMPoint }
     *     
     */
    public void setGeometry(GMPoint value) {
        this.geometry = value;
    }

    /**
     * Ruft den Wert der routeWaypointID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteWaypointID() {
        return routeWaypointID;
    }

    /**
     * Legt den Wert der routeWaypointID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteWaypointID(BigInteger value) {
        this.routeWaypointID = value;
    }

    /**
     * Ruft den Wert der routeWaypointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteWaypointName() {
        return routeWaypointName;
    }

    /**
     * Legt den Wert der routeWaypointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteWaypointName(String value) {
        this.routeWaypointName = value;
    }

    /**
     * Ruft den Wert der routeWaypointExternalReferenceID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteWaypointExternalReferenceID() {
        return routeWaypointExternalReferenceID;
    }

    /**
     * Legt den Wert der routeWaypointExternalReferenceID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteWaypointExternalReferenceID(String value) {
        this.routeWaypointExternalReferenceID = value;
    }

    /**
     * Ruft den Wert der routeWaypointFixed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRouteWaypointFixed() {
        return routeWaypointFixed;
    }

    /**
     * Legt den Wert der routeWaypointFixed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRouteWaypointFixed(Boolean value) {
        this.routeWaypointFixed = value;
    }

    /**
     * Ruft den Wert der routeWaypointTurnRadius-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointTurnRadius() {
        return routeWaypointTurnRadius;
    }

    /**
     * Legt den Wert der routeWaypointTurnRadius-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointTurnRadius(BigDecimal value) {
        this.routeWaypointTurnRadius = value;
    }

    /**
     * Ruft den Wert der routeWaypointCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteWaypointCollection() {
        return routeWaypointCollection;
    }

    /**
     * Legt den Wert der routeWaypointCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteWaypointCollection(ReferenceType value) {
        this.routeWaypointCollection = value;
    }

    /**
     * Ruft den Wert der routeWaypointLeg-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteWaypointLeg() {
        return routeWaypointLeg;
    }

    /**
     * Legt den Wert der routeWaypointLeg-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteWaypointLeg(ReferenceType value) {
        this.routeWaypointLeg = value;
    }

    /**
     * Gets the value of the routeWaypointExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeWaypointExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteWaypointExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteWaypointExtensions() {
        if (routeWaypointExtensions == null) {
            routeWaypointExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeWaypointExtensions;
    }

}
