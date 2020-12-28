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


/**
 * 
 * 			list of route information
 * 			
 * 
 * <p>Java-Klasse für RouteInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}InformationTypeType">
 *       &lt;sequence>
 *         &lt;element name="routeInfoName" type="{http://www.iho.int/S421/gml/1.0}NonEmptyText"/>
 *         &lt;element name="routeInfoAuthor" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoEditionTime" type="{http://www.iho.int/S421/gml/1.0}DateTime" minOccurs="0"/>
 *         &lt;element name="routeInfoDescription" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoStatus" type="{http://www.iho.int/S421/gml/1.0}RouteInfoStatus"/>
 *         &lt;element name="routeInfoValidityStart" type="{http://www.iho.int/S421/gml/1.0}DateTime" minOccurs="0"/>
 *         &lt;element name="routeInfoValidityEnd" type="{http://www.iho.int/S421/gml/1.0}DateTime" minOccurs="0"/>
 *         &lt;element name="routeInfoDeparturePortID1" type="{http://www.iho.int/S421/gml/1.0}PortIDType" minOccurs="0"/>
 *         &lt;element name="routeInfoDeparturePortID2" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoDeparturePortCall" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoArrivalPortID1" type="{http://www.iho.int/S421/gml/1.0}PortIDType" minOccurs="0"/>
 *         &lt;element name="routeInfoArrivalPortID2" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoArrivalPortCall" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoReferencePrevRoute" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoReferenceNextRoute" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselType" type="{http://www.iho.int/S421/gml/1.0}RouteInfoVesselType" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselName" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselMMSI" type="{http://www.iho.int/S421/gml/1.0}MMSINumberText" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselCallsign" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselIMO" type="{http://www.iho.int/S421/gml/1.0}IMONumberText" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselVoyage" type="{http://www.iho.int/S421/gml/1.0}Text" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselHeight" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselLength" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoVesselBeam" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoDraftMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoAirDraftMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoBeamMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoLengthMax" type="{http://www.iho.int/S421/gml/1.0}NonNegativeRealWith2DecimalPlace" minOccurs="0"/>
 *         &lt;element name="routeInfoExtensions" type="{http://www.iho.int/S421/gml/1.0}RouteExtensions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteInfo", propOrder = {
    "routeInfoName",
    "routeInfoAuthor",
    "routeInfoEditionTime",
    "routeInfoDescription",
    "routeInfoStatus",
    "routeInfoValidityStart",
    "routeInfoValidityEnd",
    "routeInfoDeparturePortID1",
    "routeInfoDeparturePortID2",
    "routeInfoDeparturePortCall",
    "routeInfoArrivalPortID1",
    "routeInfoArrivalPortID2",
    "routeInfoArrivalPortCall",
    "routeInfoReferencePrevRoute",
    "routeInfoReferenceNextRoute",
    "routeInfoVesselType",
    "routeInfoVesselName",
    "routeInfoVesselMMSI",
    "routeInfoVesselCallsign",
    "routeInfoVesselIMO",
    "routeInfoVesselVoyage",
    "routeInfoVesselHeight",
    "routeInfoVesselLength",
    "routeInfoVesselBeam",
    "routeInfoDraftMax",
    "routeInfoAirDraftMax",
    "routeInfoBeamMax",
    "routeInfoLengthMax",
    "routeInfoExtensions"
})
public class RouteInfo
    extends InformationTypeType
{

    @XmlElement(required = true)
    protected String routeInfoName;
    protected String routeInfoAuthor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeInfoEditionTime;
    protected String routeInfoDescription;
    @XmlElement(required = true)
    protected BigInteger routeInfoStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeInfoValidityStart;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar routeInfoValidityEnd;
    protected String routeInfoDeparturePortID1;
    protected String routeInfoDeparturePortID2;
    protected String routeInfoDeparturePortCall;
    protected String routeInfoArrivalPortID1;
    protected String routeInfoArrivalPortID2;
    protected String routeInfoArrivalPortCall;
    protected String routeInfoReferencePrevRoute;
    protected String routeInfoReferenceNextRoute;
    protected BigInteger routeInfoVesselType;
    protected String routeInfoVesselName;
    protected String routeInfoVesselMMSI;
    protected String routeInfoVesselCallsign;
    protected String routeInfoVesselIMO;
    protected String routeInfoVesselVoyage;
    protected BigDecimal routeInfoVesselHeight;
    protected BigDecimal routeInfoVesselLength;
    protected BigDecimal routeInfoVesselBeam;
    protected BigDecimal routeInfoDraftMax;
    protected BigDecimal routeInfoAirDraftMax;
    protected BigDecimal routeInfoBeamMax;
    protected BigDecimal routeInfoLengthMax;
    protected List<RouteExtensions> routeInfoExtensions;

    /**
     * Ruft den Wert der routeInfoName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoName() {
        return routeInfoName;
    }

    /**
     * Legt den Wert der routeInfoName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoName(String value) {
        this.routeInfoName = value;
    }

    /**
     * Ruft den Wert der routeInfoAuthor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoAuthor() {
        return routeInfoAuthor;
    }

    /**
     * Legt den Wert der routeInfoAuthor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoAuthor(String value) {
        this.routeInfoAuthor = value;
    }

    /**
     * Ruft den Wert der routeInfoEditionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteInfoEditionTime() {
        return routeInfoEditionTime;
    }

    /**
     * Legt den Wert der routeInfoEditionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteInfoEditionTime(XMLGregorianCalendar value) {
        this.routeInfoEditionTime = value;
    }

    /**
     * Ruft den Wert der routeInfoDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoDescription() {
        return routeInfoDescription;
    }

    /**
     * Legt den Wert der routeInfoDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoDescription(String value) {
        this.routeInfoDescription = value;
    }

    /**
     * Ruft den Wert der routeInfoStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteInfoStatus() {
        return routeInfoStatus;
    }

    /**
     * Legt den Wert der routeInfoStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteInfoStatus(BigInteger value) {
        this.routeInfoStatus = value;
    }

    /**
     * Ruft den Wert der routeInfoValidityStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteInfoValidityStart() {
        return routeInfoValidityStart;
    }

    /**
     * Legt den Wert der routeInfoValidityStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteInfoValidityStart(XMLGregorianCalendar value) {
        this.routeInfoValidityStart = value;
    }

    /**
     * Ruft den Wert der routeInfoValidityEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRouteInfoValidityEnd() {
        return routeInfoValidityEnd;
    }

    /**
     * Legt den Wert der routeInfoValidityEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRouteInfoValidityEnd(XMLGregorianCalendar value) {
        this.routeInfoValidityEnd = value;
    }

    /**
     * Ruft den Wert der routeInfoDeparturePortID1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoDeparturePortID1() {
        return routeInfoDeparturePortID1;
    }

    /**
     * Legt den Wert der routeInfoDeparturePortID1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoDeparturePortID1(String value) {
        this.routeInfoDeparturePortID1 = value;
    }

    /**
     * Ruft den Wert der routeInfoDeparturePortID2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoDeparturePortID2() {
        return routeInfoDeparturePortID2;
    }

    /**
     * Legt den Wert der routeInfoDeparturePortID2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoDeparturePortID2(String value) {
        this.routeInfoDeparturePortID2 = value;
    }

    /**
     * Ruft den Wert der routeInfoDeparturePortCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoDeparturePortCall() {
        return routeInfoDeparturePortCall;
    }

    /**
     * Legt den Wert der routeInfoDeparturePortCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoDeparturePortCall(String value) {
        this.routeInfoDeparturePortCall = value;
    }

    /**
     * Ruft den Wert der routeInfoArrivalPortID1-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoArrivalPortID1() {
        return routeInfoArrivalPortID1;
    }

    /**
     * Legt den Wert der routeInfoArrivalPortID1-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoArrivalPortID1(String value) {
        this.routeInfoArrivalPortID1 = value;
    }

    /**
     * Ruft den Wert der routeInfoArrivalPortID2-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoArrivalPortID2() {
        return routeInfoArrivalPortID2;
    }

    /**
     * Legt den Wert der routeInfoArrivalPortID2-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoArrivalPortID2(String value) {
        this.routeInfoArrivalPortID2 = value;
    }

    /**
     * Ruft den Wert der routeInfoArrivalPortCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoArrivalPortCall() {
        return routeInfoArrivalPortCall;
    }

    /**
     * Legt den Wert der routeInfoArrivalPortCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoArrivalPortCall(String value) {
        this.routeInfoArrivalPortCall = value;
    }

    /**
     * Ruft den Wert der routeInfoReferencePrevRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoReferencePrevRoute() {
        return routeInfoReferencePrevRoute;
    }

    /**
     * Legt den Wert der routeInfoReferencePrevRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoReferencePrevRoute(String value) {
        this.routeInfoReferencePrevRoute = value;
    }

    /**
     * Ruft den Wert der routeInfoReferenceNextRoute-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoReferenceNextRoute() {
        return routeInfoReferenceNextRoute;
    }

    /**
     * Legt den Wert der routeInfoReferenceNextRoute-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoReferenceNextRoute(String value) {
        this.routeInfoReferenceNextRoute = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRouteInfoVesselType() {
        return routeInfoVesselType;
    }

    /**
     * Legt den Wert der routeInfoVesselType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRouteInfoVesselType(BigInteger value) {
        this.routeInfoVesselType = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoVesselName() {
        return routeInfoVesselName;
    }

    /**
     * Legt den Wert der routeInfoVesselName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoVesselName(String value) {
        this.routeInfoVesselName = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselMMSI-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoVesselMMSI() {
        return routeInfoVesselMMSI;
    }

    /**
     * Legt den Wert der routeInfoVesselMMSI-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoVesselMMSI(String value) {
        this.routeInfoVesselMMSI = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselCallsign-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoVesselCallsign() {
        return routeInfoVesselCallsign;
    }

    /**
     * Legt den Wert der routeInfoVesselCallsign-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoVesselCallsign(String value) {
        this.routeInfoVesselCallsign = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselIMO-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoVesselIMO() {
        return routeInfoVesselIMO;
    }

    /**
     * Legt den Wert der routeInfoVesselIMO-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoVesselIMO(String value) {
        this.routeInfoVesselIMO = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselVoyage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteInfoVesselVoyage() {
        return routeInfoVesselVoyage;
    }

    /**
     * Legt den Wert der routeInfoVesselVoyage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteInfoVesselVoyage(String value) {
        this.routeInfoVesselVoyage = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselHeight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoVesselHeight() {
        return routeInfoVesselHeight;
    }

    /**
     * Legt den Wert der routeInfoVesselHeight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoVesselHeight(BigDecimal value) {
        this.routeInfoVesselHeight = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoVesselLength() {
        return routeInfoVesselLength;
    }

    /**
     * Legt den Wert der routeInfoVesselLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoVesselLength(BigDecimal value) {
        this.routeInfoVesselLength = value;
    }

    /**
     * Ruft den Wert der routeInfoVesselBeam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoVesselBeam() {
        return routeInfoVesselBeam;
    }

    /**
     * Legt den Wert der routeInfoVesselBeam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoVesselBeam(BigDecimal value) {
        this.routeInfoVesselBeam = value;
    }

    /**
     * Ruft den Wert der routeInfoDraftMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoDraftMax() {
        return routeInfoDraftMax;
    }

    /**
     * Legt den Wert der routeInfoDraftMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoDraftMax(BigDecimal value) {
        this.routeInfoDraftMax = value;
    }

    /**
     * Ruft den Wert der routeInfoAirDraftMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoAirDraftMax() {
        return routeInfoAirDraftMax;
    }

    /**
     * Legt den Wert der routeInfoAirDraftMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoAirDraftMax(BigDecimal value) {
        this.routeInfoAirDraftMax = value;
    }

    /**
     * Ruft den Wert der routeInfoBeamMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoBeamMax() {
        return routeInfoBeamMax;
    }

    /**
     * Legt den Wert der routeInfoBeamMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoBeamMax(BigDecimal value) {
        this.routeInfoBeamMax = value;
    }

    /**
     * Ruft den Wert der routeInfoLengthMax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRouteInfoLengthMax() {
        return routeInfoLengthMax;
    }

    /**
     * Legt den Wert der routeInfoLengthMax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRouteInfoLengthMax(BigDecimal value) {
        this.routeInfoLengthMax = value;
    }

    /**
     * Gets the value of the routeInfoExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeInfoExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteInfoExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteExtensions }
     * 
     * 
     */
    public List<RouteExtensions> getRouteInfoExtensions() {
        if (routeInfoExtensions == null) {
            routeInfoExtensions = new ArrayList<RouteExtensions>();
        }
        return this.routeInfoExtensions;
    }

}
