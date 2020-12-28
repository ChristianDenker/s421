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
 * <p>Java-Klasse für RouteActionPoints complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteActionPoints">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="routeActionPointsCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeActionPoint" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="routeActionPointsExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteActionPoints", propOrder = {
    "routeActionPointsCollection",
    "routeActionPoint",
    "routeActionPointsExtensions"
})
public class RouteActionPoints
    extends FeatureType
{

    @XmlElement(required = true)
    protected ReferenceType routeActionPointsCollection;
    protected List<ReferenceType> routeActionPoint;
    protected List<RouteExtensions> routeActionPointsExtensions;

    /**
     * Ruft den Wert der routeActionPointsCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteActionPointsCollection() {
        return routeActionPointsCollection;
    }

    /**
     * Legt den Wert der routeActionPointsCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteActionPointsCollection(ReferenceType value) {
        this.routeActionPointsCollection = value;
    }

    /**
     * Gets the value of the routeActionPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeActionPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteActionPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRouteActionPoint() {
        if (routeActionPoint == null) {
            routeActionPoint = new ArrayList<ReferenceType>();
        }
        return this.routeActionPoint;
    }

    /**
     * Gets the value of the routeActionPointsExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeActionPointsExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteActionPointsExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteActionPointsExtensions() {
        if (routeActionPointsExtensions == null) {
            routeActionPointsExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeActionPointsExtensions;
    }

}
