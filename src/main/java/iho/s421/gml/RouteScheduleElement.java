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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import s100.gml.profile.ReferenceType;


/**
 * <p>Java-Klasse für RouteScheduleElement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteScheduleElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}InformationTypeType">
 *       &lt;sequence>
 *         &lt;element name="routeWaypointId" type="{http://www.iho.int/S421/gml/1.0}PositiveInteger"/>
 *         &lt;element name="routeScheduleElementPlanSOG" type="{http://www.iho.int/S421/gml/1.0}NonNegativeReal" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETD" type="{http://www.iho.int/S421/gml/1.0}DateTime" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETA" type="{http://www.iho.int/S421/gml/1.0}DateTime" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETDWindowBefore" type="{http://www.iho.int/S421/gml/1.0}Integer" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETDWindowAfter" type="{http://www.iho.int/S421/gml/1.0}Integer" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETAWindowBefore" type="{http://www.iho.int/S421/gml/1.0}Integer" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementETAWindowAfter" type="{http://www.iho.int/S421/gml/1.0}Integer" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementNote" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementManualCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementCalculatedCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementRecommendedCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType" minOccurs="0"/>
 *         &lt;element name="routeScheduleElementExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteScheduleElement", propOrder = {
    "routeWaypointId",
    "routeScheduleElementPlanSOG",
    "routeScheduleElementETD",
    "routeScheduleElementETA",
    "routeScheduleElementETDWindowBefore",
    "routeScheduleElementETDWindowAfter",
    "routeScheduleElementETAWindowBefore",
    "routeScheduleElementETAWindowAfter",
    "routeScheduleElementNote",
    "routeScheduleElementManualCollection",
    "routeScheduleElementCalculatedCollection",
    "routeScheduleElementRecommendedCollection",
    "routeScheduleElementExtensions"
})
public class RouteScheduleElement
    extends InformationTypeType
{

    @XmlElement(required = true)
    protected BigInteger routeWaypointId;
    protected BigDecimal routeScheduleElementPlanSOG;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeScheduleElementETD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeScheduleElementETA;
    protected BigInteger routeScheduleElementETDWindowBefore;
    protected BigInteger routeScheduleElementETDWindowAfter;
    protected BigInteger routeScheduleElementETAWindowBefore;
    protected BigInteger routeScheduleElementETAWindowAfter;
    protected String routeScheduleElementNote;
    protected ReferenceType routeScheduleElementManualCollection;
    protected ReferenceType routeScheduleElementCalculatedCollection;
    protected ReferenceType routeScheduleElementRecommendedCollection;
    protected List<RouteExtensions> routeScheduleElementExtensions;

    /**
     * Ruft den Wert der routeWaypointId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteWaypointId() {
        return routeWaypointId;
    }

    /**
     * Legt den Wert der routeWaypointId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteWaypointId(BigInteger value) {
        this.routeWaypointId = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementPlanSOG-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteScheduleElementPlanSOG() {
        return routeScheduleElementPlanSOG;
    }

    /**
     * Legt den Wert der routeScheduleElementPlanSOG-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteScheduleElementPlanSOG(BigDecimal value) {
        this.routeScheduleElementPlanSOG = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETD-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteScheduleElementETD() {
        return routeScheduleElementETD;
    }

    /**
     * Legt den Wert der routeScheduleElementETD-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteScheduleElementETD(XMLGregorianCalendar value) {
        this.routeScheduleElementETD = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETA-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteScheduleElementETA() {
        return routeScheduleElementETA;
    }

    /**
     * Legt den Wert der routeScheduleElementETA-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteScheduleElementETA(XMLGregorianCalendar value) {
        this.routeScheduleElementETA = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETDWindowBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleElementETDWindowBefore() {
        return routeScheduleElementETDWindowBefore;
    }

    /**
     * Legt den Wert der routeScheduleElementETDWindowBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleElementETDWindowBefore(BigInteger value) {
        this.routeScheduleElementETDWindowBefore = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETDWindowAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleElementETDWindowAfter() {
        return routeScheduleElementETDWindowAfter;
    }

    /**
     * Legt den Wert der routeScheduleElementETDWindowAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleElementETDWindowAfter(BigInteger value) {
        this.routeScheduleElementETDWindowAfter = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETAWindowBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleElementETAWindowBefore() {
        return routeScheduleElementETAWindowBefore;
    }

    /**
     * Legt den Wert der routeScheduleElementETAWindowBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleElementETAWindowBefore(BigInteger value) {
        this.routeScheduleElementETAWindowBefore = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementETAWindowAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteScheduleElementETAWindowAfter() {
        return routeScheduleElementETAWindowAfter;
    }

    /**
     * Legt den Wert der routeScheduleElementETAWindowAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteScheduleElementETAWindowAfter(BigInteger value) {
        this.routeScheduleElementETAWindowAfter = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteScheduleElementNote() {
        return routeScheduleElementNote;
    }

    /**
     * Legt den Wert der routeScheduleElementNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteScheduleElementNote(String value) {
        this.routeScheduleElementNote = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementManualCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleElementManualCollection() {
        return routeScheduleElementManualCollection;
    }

    /**
     * Legt den Wert der routeScheduleElementManualCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleElementManualCollection(ReferenceType value) {
        this.routeScheduleElementManualCollection = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementCalculatedCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleElementCalculatedCollection() {
        return routeScheduleElementCalculatedCollection;
    }

    /**
     * Legt den Wert der routeScheduleElementCalculatedCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleElementCalculatedCollection(ReferenceType value) {
        this.routeScheduleElementCalculatedCollection = value;
    }

    /**
     * Ruft den Wert der routeScheduleElementRecommendedCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteScheduleElementRecommendedCollection() {
        return routeScheduleElementRecommendedCollection;
    }

    /**
     * Legt den Wert der routeScheduleElementRecommendedCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteScheduleElementRecommendedCollection(ReferenceType value) {
        this.routeScheduleElementRecommendedCollection = value;
    }

    /**
     * Gets the value of the routeScheduleElementExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeScheduleElementExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteScheduleElementExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteScheduleElementExtensions() {
        if (routeScheduleElementExtensions == null) {
            routeScheduleElementExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeScheduleElementExtensions;
    }

}
