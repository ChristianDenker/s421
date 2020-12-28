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
 * <p>Java-Klasse für RouteScheduleCalculated complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteScheduleCalculated">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}InformationTypeType">
 *       &lt;sequence>
 *         &lt;element name="routeScheduleCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeScheduleElement" type="{http://www.opengis.net/gml/3.2}ReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="routeScheduleCalculatedExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteScheduleCalculated", propOrder = {
    "routeScheduleCollection",
    "routeScheduleElement",
    "routeScheduleCalculatedExtensions"
})
public class RouteScheduleCalculated
    extends InformationTypeType
{

    @XmlElement(required = true)
    protected ReferenceType routeScheduleCollection;
    protected List<ReferenceType> routeScheduleElement;
    protected List<RouteExtensions> routeScheduleCalculatedExtensions;

    /**
     * Ruft den Wert der routeScheduleCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleCollection() {
        return routeScheduleCollection;
    }

    /**
     * Legt den Wert der routeScheduleCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleCollection(ReferenceType value) {
        this.routeScheduleCollection = value;
    }

    /**
     * Gets the value of the routeScheduleElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeScheduleElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteScheduleElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getRouteScheduleElement() {
        if (routeScheduleElement == null) {
            routeScheduleElement = new ArrayList<ReferenceType>();
        }
        return this.routeScheduleElement;
    }

    /**
     * Gets the value of the routeScheduleCalculatedExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeScheduleCalculatedExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteScheduleCalculatedExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteScheduleCalculatedExtensions() {
        if (routeScheduleCalculatedExtensions == null) {
            routeScheduleCalculatedExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeScheduleCalculatedExtensions;
    }

}
