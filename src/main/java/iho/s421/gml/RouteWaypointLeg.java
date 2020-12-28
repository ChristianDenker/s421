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
 * <p>Java-Klasse für RouteWaypointLeg complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteWaypointLeg">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="routeWaypointLegStarboardXTDL" type="{http://www.iho.int/S421/gml/1.0}XtdType" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegPortXTDL" type="{http://www.iho.int/S421/gml/1.0}XtdType" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegStarboardCL" type="{http://www.iho.int/S421/gml/1.0}XtdType" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegPortCL" type="{http://www.iho.int/S421/gml/1.0}XtdType" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSafetyContour" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSafetyDepth" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegGeometryType" type="{http://www.iho.int/S421/gml/1.0}RouteWaypointLegGeometryType"/>
 *         &lt;element name="routeWaypointLegSOGMin" type="{http://www.iho.int/S421/gml/1.0}NonNegativeReal" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSOGMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeReal" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSTWMin" type="{http://www.iho.int/S421/gml/1.0}NonNegativeReal" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSTWMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeReal" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegDraft" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegDraftForward" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegDraftAft" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegDraftMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegAirDraftMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegBeamMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegLengthMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegStaticUKC" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegDynamicUKC" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegSafetyMargin" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith1DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegNote" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegIssue" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeWaypointLegCollection" type="{http://www.opengis.net/gml/3.2}ReferenceType"/>
 *         &lt;element name="routeWaypointLegExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteWaypointLeg", propOrder = {
    "routeWaypointLegStarboardXTDL",
    "routeWaypointLegPortXTDL",
    "routeWaypointLegStarboardCL",
    "routeWaypointLegPortCL",
    "routeWaypointLegSafetyContour",
    "routeWaypointLegSafetyDepth",
    "routeWaypointLegGeometryType",
    "routeWaypointLegSOGMin",
    "routeWaypointLegSOGMax",
    "routeWaypointLegSTWMin",
    "routeWaypointLegSTWMax",
    "routeWaypointLegDraft",
    "routeWaypointLegDraftForward",
    "routeWaypointLegDraftAft",
    "routeWaypointLegDraftMax",
    "routeWaypointLegAirDraftMax",
    "routeWaypointLegBeamMax",
    "routeWaypointLegLengthMax",
    "routeWaypointLegStaticUKC",
    "routeWaypointLegDynamicUKC",
    "routeWaypointLegSafetyMargin",
    "routeWaypointLegNote",
    "routeWaypointLegIssue",
    "routeWaypointLegCollection",
    "routeWaypointLegExtensions"
})
public class RouteWaypointLeg
    extends FeatureType
{

    protected BigDecimal routeWaypointLegStarboardXTDL;
    protected BigDecimal routeWaypointLegPortXTDL;
    protected BigDecimal routeWaypointLegStarboardCL;
    protected BigDecimal routeWaypointLegPortCL;
    protected BigDecimal routeWaypointLegSafetyContour;
    protected BigDecimal routeWaypointLegSafetyDepth;
    @XmlElement(required = true)
    protected BigInteger routeWaypointLegGeometryType;
    protected BigDecimal routeWaypointLegSOGMin;
    protected BigDecimal routeWaypointLegSOGMax;
    protected BigDecimal routeWaypointLegSTWMin;
    protected BigDecimal routeWaypointLegSTWMax;
    protected BigDecimal routeWaypointLegDraft;
    protected BigDecimal routeWaypointLegDraftForward;
    protected BigDecimal routeWaypointLegDraftAft;
    protected BigDecimal routeWaypointLegDraftMax;
    protected BigDecimal routeWaypointLegAirDraftMax;
    protected BigDecimal routeWaypointLegBeamMax;
    protected BigDecimal routeWaypointLegLengthMax;
    protected BigDecimal routeWaypointLegStaticUKC;
    protected BigDecimal routeWaypointLegDynamicUKC;
    protected BigDecimal routeWaypointLegSafetyMargin;
    protected String routeWaypointLegNote;
    protected String routeWaypointLegIssue;
    @XmlElement(required = true)
    protected ReferenceType routeWaypointLegCollection;
    protected List<RouteExtensions> routeWaypointLegExtensions;

    /**
     * Ruft den Wert der routeWaypointLegStarboardXTDL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegStarboardXTDL() {
        return routeWaypointLegStarboardXTDL;
    }

    /**
     * Legt den Wert der routeWaypointLegStarboardXTDL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegStarboardXTDL(BigDecimal value) {
        this.routeWaypointLegStarboardXTDL = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegPortXTDL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegPortXTDL() {
        return routeWaypointLegPortXTDL;
    }

    /**
     * Legt den Wert der routeWaypointLegPortXTDL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegPortXTDL(BigDecimal value) {
        this.routeWaypointLegPortXTDL = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegStarboardCL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegStarboardCL() {
        return routeWaypointLegStarboardCL;
    }

    /**
     * Legt den Wert der routeWaypointLegStarboardCL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegStarboardCL(BigDecimal value) {
        this.routeWaypointLegStarboardCL = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegPortCL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegPortCL() {
        return routeWaypointLegPortCL;
    }

    /**
     * Legt den Wert der routeWaypointLegPortCL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegPortCL(BigDecimal value) {
        this.routeWaypointLegPortCL = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSafetyContour-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSafetyContour() {
        return routeWaypointLegSafetyContour;
    }

    /**
     * Legt den Wert der routeWaypointLegSafetyContour-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSafetyContour(BigDecimal value) {
        this.routeWaypointLegSafetyContour = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSafetyDepth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSafetyDepth() {
        return routeWaypointLegSafetyDepth;
    }

    /**
     * Legt den Wert der routeWaypointLegSafetyDepth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSafetyDepth(BigDecimal value) {
        this.routeWaypointLegSafetyDepth = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegGeometryType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteWaypointLegGeometryType() {
        return routeWaypointLegGeometryType;
    }

    /**
     * Legt den Wert der routeWaypointLegGeometryType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteWaypointLegGeometryType(BigInteger value) {
        this.routeWaypointLegGeometryType = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSOGMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSOGMin() {
        return routeWaypointLegSOGMin;
    }

    /**
     * Legt den Wert der routeWaypointLegSOGMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSOGMin(BigDecimal value) {
        this.routeWaypointLegSOGMin = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSOGMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSOGMax() {
        return routeWaypointLegSOGMax;
    }

    /**
     * Legt den Wert der routeWaypointLegSOGMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSOGMax(BigDecimal value) {
        this.routeWaypointLegSOGMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSTWMin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSTWMin() {
        return routeWaypointLegSTWMin;
    }

    /**
     * Legt den Wert der routeWaypointLegSTWMin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSTWMin(BigDecimal value) {
        this.routeWaypointLegSTWMin = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSTWMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSTWMax() {
        return routeWaypointLegSTWMax;
    }

    /**
     * Legt den Wert der routeWaypointLegSTWMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSTWMax(BigDecimal value) {
        this.routeWaypointLegSTWMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegDraft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegDraft() {
        return routeWaypointLegDraft;
    }

    /**
     * Legt den Wert der routeWaypointLegDraft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegDraft(BigDecimal value) {
        this.routeWaypointLegDraft = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegDraftForward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegDraftForward() {
        return routeWaypointLegDraftForward;
    }

    /**
     * Legt den Wert der routeWaypointLegDraftForward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegDraftForward(BigDecimal value) {
        this.routeWaypointLegDraftForward = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegDraftAft-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegDraftAft() {
        return routeWaypointLegDraftAft;
    }

    /**
     * Legt den Wert der routeWaypointLegDraftAft-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegDraftAft(BigDecimal value) {
        this.routeWaypointLegDraftAft = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegDraftMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegDraftMax() {
        return routeWaypointLegDraftMax;
    }

    /**
     * Legt den Wert der routeWaypointLegDraftMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegDraftMax(BigDecimal value) {
        this.routeWaypointLegDraftMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegAirDraftMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegAirDraftMax() {
        return routeWaypointLegAirDraftMax;
    }

    /**
     * Legt den Wert der routeWaypointLegAirDraftMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegAirDraftMax(BigDecimal value) {
        this.routeWaypointLegAirDraftMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegBeamMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegBeamMax() {
        return routeWaypointLegBeamMax;
    }

    /**
     * Legt den Wert der routeWaypointLegBeamMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegBeamMax(BigDecimal value) {
        this.routeWaypointLegBeamMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegLengthMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegLengthMax() {
        return routeWaypointLegLengthMax;
    }

    /**
     * Legt den Wert der routeWaypointLegLengthMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegLengthMax(BigDecimal value) {
        this.routeWaypointLegLengthMax = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegStaticUKC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegStaticUKC() {
        return routeWaypointLegStaticUKC;
    }

    /**
     * Legt den Wert der routeWaypointLegStaticUKC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegStaticUKC(BigDecimal value) {
        this.routeWaypointLegStaticUKC = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegDynamicUKC-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegDynamicUKC() {
        return routeWaypointLegDynamicUKC;
    }

    /**
     * Legt den Wert der routeWaypointLegDynamicUKC-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegDynamicUKC(BigDecimal value) {
        this.routeWaypointLegDynamicUKC = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegSafetyMargin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteWaypointLegSafetyMargin() {
        return routeWaypointLegSafetyMargin;
    }

    /**
     * Legt den Wert der routeWaypointLegSafetyMargin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteWaypointLegSafetyMargin(BigDecimal value) {
        this.routeWaypointLegSafetyMargin = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteWaypointLegNote() {
        return routeWaypointLegNote;
    }

    /**
     * Legt den Wert der routeWaypointLegNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteWaypointLegNote(String value) {
        this.routeWaypointLegNote = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegIssue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteWaypointLegIssue() {
        return routeWaypointLegIssue;
    }

    /**
     * Legt den Wert der routeWaypointLegIssue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteWaypointLegIssue(String value) {
        this.routeWaypointLegIssue = value;
    }

    /**
     * Ruft den Wert der routeWaypointLegCollection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceType }
     *     
     */
    public ReferenceType getRouteWaypointLegCollection() {
        return routeWaypointLegCollection;
    }

    /**
     * Legt den Wert der routeWaypointLegCollection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceType }
     *     
     */
    public void setRouteWaypointLegCollection(ReferenceType value) {
        this.routeWaypointLegCollection = value;
    }

    /**
     * Gets the value of the routeWaypointLegExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeWaypointLegExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteWaypointLegExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteWaypointLegExtensions() {
        if (routeWaypointLegExtensions == null) {
            routeWaypointLegExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeWaypointLegExtensions;
    }

}
