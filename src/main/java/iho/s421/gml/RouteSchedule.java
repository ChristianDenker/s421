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
 * <p>Java-Klasse für RouteSchedule complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteSchedule">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}InformationTypeType">
 *       &lt;sequence>
 *         &lt;element name="routeScheduleID" type="{http://www.iho.int/S421/gml/1.0}PositiveInteger"/>
 *         &lt;element name="routeScheduleName" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeScheduleCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeScheduleManual" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleCalculated" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleRecommended" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteSchedule", propOrder = {
    "routeScheduleID",
    "routeScheduleName",
    "routeScheduleCollection",
    "routeScheduleManual",
    "routeScheduleCalculated",
    "routeScheduleRecommended",
    "routeScheduleExtensions"
})
public class RouteSchedule
    extends InformationTypeType
{

    @XmlElement(required = true)
    protected BigInteger routeScheduleID;
    protected String routeScheduleName;
    @XmlElement(required = true)
    protected ReferenceType routeScheduleCollection;
    protected ReferenceType routeScheduleManual;
    protected ReferenceType routeScheduleCalculated;
    protected ReferenceType routeScheduleRecommended;
    protected List<RouteExtensions> routeScheduleExtensions;

    /**
     * Ruft den Wert der routeScheduleID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleID() {
        return routeScheduleID;
    }

    /**
     * Legt den Wert der routeScheduleID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleID(BigInteger value) {
        this.routeScheduleID = value;
    }

    /**
     * Ruft den Wert der routeScheduleName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteScheduleName() {
        return routeScheduleName;
    }

    /**
     * Legt den Wert der routeScheduleName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteScheduleName(String value) {
        this.routeScheduleName = value;
    }

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
     * Ruft den Wert der routeScheduleManual-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleManual() {
        return routeScheduleManual;
    }

    /**
     * Legt den Wert der routeScheduleManual-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleManual(ReferenceType value) {
        this.routeScheduleManual = value;
    }

    /**
     * Ruft den Wert der routeScheduleCalculated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleCalculated() {
        return routeScheduleCalculated;
    }

    /**
     * Legt den Wert der routeScheduleCalculated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleCalculated(ReferenceType value) {
        this.routeScheduleCalculated = value;
    }

    /**
     * Ruft den Wert der routeScheduleRecommended-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleRecommended() {
        return routeScheduleRecommended;
    }

    /**
     * Legt den Wert der routeScheduleRecommended-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleRecommended(ReferenceType value) {
        this.routeScheduleRecommended = value;
    }

    /**
     * Gets the value of the routeScheduleExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeScheduleExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteScheduleExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteScheduleExtensions() {
        if (routeScheduleExtensions == null) {
            routeScheduleExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeScheduleExtensions;
    }

}
