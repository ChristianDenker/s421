//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import s100.gml.profile.ReferenceType;


/**
 * <p>Java-Klasse für RouteWaypoints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteWaypoints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="routeWaypointsCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeWaypoint" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="routeWaypointsExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWaypoints", propOrder = {
    "routeWaypointsCollection",
    "routeWaypoint",
    "routeWaypointsExtensions"
})
public class RouteWaypoints
    extends FeatureType
{

    @XmlElement(required = true)
    protected ReferenceType routeWaypointsCollection;
    @XmlElement(required = true)
    protected List<ReferenceType> routeWaypoint;
    protected List<RouteExtensions> routeWaypointsExtensions;

    /**
     * Ruft den Wert der routeWaypointsCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteWaypointsCollection() {
        return routeWaypointsCollection;
    }

    /**
     * Legt den Wert der routeWaypointsCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteWaypointsCollection(ReferenceType value) {
        this.routeWaypointsCollection = value;
    }

    /**
     * Gets the value of the routeWaypoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeWaypoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteWaypoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRouteWaypoint() {
        if (routeWaypoint == null) {
            routeWaypoint = new ArrayList<ReferenceType>();
        }
        return this.routeWaypoint;
    }

    /**
     * Gets the value of the routeWaypointsExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeWaypointsExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteWaypointsExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteWaypointsExtensions() {
        if (routeWaypointsExtensions == null) {
            routeWaypointsExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeWaypointsExtensions;
    }

}
