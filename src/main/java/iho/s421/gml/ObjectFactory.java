//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iho.s421.gml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RouteSchedules_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeSchedules");
    private final static QName _InformationType_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "InformationType");
    private final static QName _RouteInfo_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeInfo");
    private final static QName _RouteSchedule_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeSchedule");
    private final static QName _RouteWaypoints_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeWaypoints");
    private final static QName _DataSet_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "DataSet");
    private final static QName _RouteScheduleRecommended_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeScheduleRecommended");
    private final static QName _RouteActionPoints_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeActionPoints");
    private final static QName _RouteActionPoint_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeActionPoint");
    private final static QName _RouteScheduleCalculated_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeScheduleCalculated");
    private final static QName _Route_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "route");
    private final static QName _RouteScheduleElement_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeScheduleElement");
    private final static QName _RouteScheduleManual_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeScheduleManual");
    private final static QName _FeatureType_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "FeatureType");
    private final static QName _RouteWaypointLeg_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeWaypointLeg");
    private final static QName _RouteWaypoint_QNAME = new QName("http://www.iho.int/S421/gml/1.0", "routeWaypoint");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iho.s421.gml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteActionPoints }
     * 
     */
    public RouteActionPoints createRouteActionPoints() {
        return new RouteActionPoints();
    }

    /**
     * Create an instance of {@link RouteScheduleCalculated }
     * 
     */
    public RouteScheduleCalculated createRouteScheduleCalculated() {
        return new RouteScheduleCalculated();
    }

    /**
     * Create an instance of {@link RouteScheduleRecommended }
     * 
     */
    public RouteScheduleRecommended createRouteScheduleRecommended() {
        return new RouteScheduleRecommended();
    }

    /**
     * Create an instance of {@link DatasetType }
     * 
     */
    public DatasetType createDatasetType() {
        return new DatasetType();
    }

    /**
     * Create an instance of {@link RouteScheduleManual }
     * 
     */
    public RouteScheduleManual createRouteScheduleManual() {
        return new RouteScheduleManual();
    }

    /**
     * Create an instance of {@link RouteScheduleElement }
     * 
     */
    public RouteScheduleElement createRouteScheduleElement() {
        return new RouteScheduleElement();
    }

    /**
     * Create an instance of {@link RouteWaypoint }
     * 
     */
    public RouteWaypoint createRouteWaypoint() {
        return new RouteWaypoint();
    }

    /**
     * Create an instance of {@link RouteSchedule }
     * 
     */
    public RouteSchedule createRouteSchedule() {
        return new RouteSchedule();
    }

    /**
     * Create an instance of {@link RouteInfo }
     * 
     */
    public RouteInfo createRouteInfo() {
        return new RouteInfo();
    }

    /**
     * Create an instance of {@link RouteSchedules }
     * 
     */
    public RouteSchedules createRouteSchedules() {
        return new RouteSchedules();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link RouteWaypointLeg }
     * 
     */
    public RouteWaypointLeg createRouteWaypointLeg() {
        return new RouteWaypointLeg();
    }

    /**
     * Create an instance of {@link RouteActionPoint }
     * 
     */
    public RouteActionPoint createRouteActionPoint() {
        return new RouteActionPoint();
    }

    /**
     * Create an instance of {@link RouteWaypoints }
     * 
     */
    public RouteWaypoints createRouteWaypoints() {
        return new RouteWaypoints();
    }

    /**
     * Create an instance of {@link GMCurve }
     * 
     */
    public GMCurve createGMCurve() {
        return new GMCurve();
    }

    /**
     * Create an instance of {@link IMemberType }
     * 
     */
    public IMemberType createIMemberType() {
        return new IMemberType();
    }

    /**
     * Create an instance of {@link GenericFeatureType }
     * 
     */
    public GenericFeatureType createGenericFeatureType() {
        return new GenericFeatureType();
    }

    /**
     * Create an instance of {@link RouteActionPointSpaceGeometry }
     * 
     */
    public RouteActionPointSpaceGeometry createRouteActionPointSpaceGeometry() {
        return new RouteActionPointSpaceGeometry();
    }

    /**
     * Create an instance of {@link RouteExtensions }
     * 
     */
    public RouteExtensions createRouteExtensions() {
        return new RouteExtensions();
    }

    /**
     * Create an instance of {@link GMSurface }
     * 
     */
    public GMSurface createGMSurface() {
        return new GMSurface();
    }

    /**
     * Create an instance of {@link MemberType }
     * 
     */
    public MemberType createMemberType() {
        return new MemberType();
    }

    /**
     * Create an instance of {@link GMPoint }
     * 
     */
    public GMPoint createGMPoint() {
        return new GMPoint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSchedules }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeSchedules", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteSchedules> createRouteSchedules(RouteSchedules value) {
        return new JAXBElement<RouteSchedules>(_RouteSchedules_QNAME, RouteSchedules.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "InformationType")
    public JAXBElement<InformationTypeType> createInformationType(InformationTypeType value) {
        return new JAXBElement<InformationTypeType>(_InformationType_QNAME, InformationTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeInfo", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteInfo> createRouteInfo(RouteInfo value) {
        return new JAXBElement<RouteInfo>(_RouteInfo_QNAME, RouteInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteSchedule }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeSchedule", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteSchedule> createRouteSchedule(RouteSchedule value) {
        return new JAXBElement<RouteSchedule>(_RouteSchedule_QNAME, RouteSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteWaypoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeWaypoints", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<RouteWaypoints> createRouteWaypoints(RouteWaypoints value) {
        return new JAXBElement<RouteWaypoints>(_RouteWaypoints_QNAME, RouteWaypoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatasetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "DataSet")
    public JAXBElement<DatasetType> createDataSet(DatasetType value) {
        return new JAXBElement<DatasetType>(_DataSet_QNAME, DatasetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteScheduleRecommended }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeScheduleRecommended", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteScheduleRecommended> createRouteScheduleRecommended(RouteScheduleRecommended value) {
        return new JAXBElement<RouteScheduleRecommended>(_RouteScheduleRecommended_QNAME, RouteScheduleRecommended.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteActionPoints }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeActionPoints", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<RouteActionPoints> createRouteActionPoints(RouteActionPoints value) {
        return new JAXBElement<RouteActionPoints>(_RouteActionPoints_QNAME, RouteActionPoints.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteActionPoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeActionPoint", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<RouteActionPoint> createRouteActionPoint(RouteActionPoint value) {
        return new JAXBElement<RouteActionPoint>(_RouteActionPoint_QNAME, RouteActionPoint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteScheduleCalculated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeScheduleCalculated", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteScheduleCalculated> createRouteScheduleCalculated(RouteScheduleCalculated value) {
        return new JAXBElement<RouteScheduleCalculated>(_RouteScheduleCalculated_QNAME, RouteScheduleCalculated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "route", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<Route> createRoute(Route value) {
        return new JAXBElement<Route>(_Route_QNAME, Route.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteScheduleElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeScheduleElement", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteScheduleElement> createRouteScheduleElement(RouteScheduleElement value) {
        return new JAXBElement<RouteScheduleElement>(_RouteScheduleElement_QNAME, RouteScheduleElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteScheduleManual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeScheduleManual", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "InformationType")
    public JAXBElement<RouteScheduleManual> createRouteScheduleManual(RouteScheduleManual value) {
        return new JAXBElement<RouteScheduleManual>(_RouteScheduleManual_QNAME, RouteScheduleManual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "FeatureType", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractFeature")
    public JAXBElement<FeatureType> createFeatureType(FeatureType value) {
        return new JAXBElement<FeatureType>(_FeatureType_QNAME, FeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteWaypointLeg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeWaypointLeg", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<RouteWaypointLeg> createRouteWaypointLeg(RouteWaypointLeg value) {
        return new JAXBElement<RouteWaypointLeg>(_RouteWaypointLeg_QNAME, RouteWaypointLeg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteWaypoint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S421/gml/1.0", name = "routeWaypoint", substitutionHeadNamespace = "http://www.iho.int/S421/gml/1.0", substitutionHeadName = "FeatureType")
    public JAXBElement<RouteWaypoint> createRouteWaypoint(RouteWaypoint value) {
        return new JAXBElement<RouteWaypoint>(_RouteWaypoint_QNAME, RouteWaypoint.class, null, value);
    }

}
