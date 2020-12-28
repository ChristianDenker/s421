//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import s100.gml.profile.ReferenceType;


/**
 * 
 *         RTZ files contain a number of waypoints, followed with auxiliary schedules. You can add your own elements to the extension 	section of the RTZ document.
 * 		
 * 
 * <p>Java-Klasse für Route complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Route">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="routeFormatVersion" type="{http://www.iho.int/S421/gml/1.0}Text"/>
 *         &lt;element name="routeID" type="{http://www.iho.int/S421/gml/1.0}NonEmptyText"/>
 *         &lt;element name="routeEditionNo" type="{http://www.iho.int/S421/gml/1.0}PositiveInteger"/>
 *         &lt;element name="routeInfo" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeWaypoints" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeSchedules" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeActionPoints" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "routeFormatVersion",
    "routeID",
    "routeEditionNo",
    "routeInfo",
    "routeWaypoints",
    "routeSchedules",
    "routeActionPoints",
    "routeExtensions"
})
public class Route
    extends FeatureType
{

    @XmlElement(required = true)
    protected String routeFormatVersion;
    @XmlElement(required = true)
    protected String routeID;
    @XmlElement(required = true)
    protected BigInteger routeEditionNo;
    @XmlElement(required = true)
    protected ReferenceType routeInfo;
    protected ReferenceType routeWaypoints;
    protected ReferenceType routeSchedules;
    protected ReferenceType routeActionPoints;
    protected List<RouteExtensions> routeExtensions;

    /**
     * Ruft den Wert der routeFormatVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteFormatVersion() {
        return routeFormatVersion;
    }

    /**
     * Legt den Wert der routeFormatVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteFormatVersion(String value) {
        this.routeFormatVersion = value;
    }

    /**
     * Ruft den Wert der routeID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteID() {
        return routeID;
    }

    /**
     * Legt den Wert der routeID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteID(String value) {
        this.routeID = value;
    }

    /**
     * Ruft den Wert der routeEditionNo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteEditionNo() {
        return routeEditionNo;
    }

    /**
     * Legt den Wert der routeEditionNo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteEditionNo(BigInteger value) {
        this.routeEditionNo = value;
    }

    /**
     * Ruft den Wert der routeInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteInfo() {
        return routeInfo;
    }

    /**
     * Legt den Wert der routeInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteInfo(ReferenceType value) {
        this.routeInfo = value;
    }

    /**
     * Ruft den Wert der routeWaypoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteWaypoints() {
        return routeWaypoints;
    }

    /**
     * Legt den Wert der routeWaypoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteWaypoints(ReferenceType value) {
        this.routeWaypoints = value;
    }

    /**
     * Ruft den Wert der routeSchedules-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteSchedules() {
        return routeSchedules;
    }

    /**
     * Legt den Wert der routeSchedules-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteSchedules(ReferenceType value) {
        this.routeSchedules = value;
    }

    /**
     * Ruft den Wert der routeActionPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteActionPoints() {
        return routeActionPoints;
    }

    /**
     * Legt den Wert der routeActionPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteActionPoints(ReferenceType value) {
        this.routeActionPoints = value;
    }

    /**
     * Gets the value of the routeExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteExtensions() {
        if (routeExtensions == null) {
            routeExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeExtensions;
    }

}
