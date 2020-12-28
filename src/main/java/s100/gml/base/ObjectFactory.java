//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import s100.gml.profile.OrientableCurveType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the s100.gml.base package. 
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

    private final static QName _InvFeatureAssociation_QNAME = new QName("http://www.iho.int/s100gml/1.0", "invFeatureAssociation");
    private final static QName _OrientableCurveProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "orientableCurveProperty");
    private final static QName _S100CircleByCenterPoint_QNAME = new QName("http://www.iho.int/s100gml/1.0", "S100_CircleByCenterPoint");
    private final static QName _CompositeCurveProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "compositeCurveProperty");
    private final static QName _Curve_QNAME = new QName("http://www.iho.int/s100gml/1.0", "Curve");
    private final static QName _Surface_QNAME = new QName("http://www.iho.int/s100gml/1.0", "Surface");
    private final static QName _FeatureAssociation_QNAME = new QName("http://www.iho.int/s100gml/1.0", "featureAssociation");
    private final static QName _PolygonProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "polygonProperty");
    private final static QName _MultiPointProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "multiPointProperty");
    private final static QName _SurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "surfaceProperty");
    private final static QName _Polygon_QNAME = new QName("http://www.iho.int/s100gml/1.0", "Polygon");
    private final static QName _InformationAssociation_QNAME = new QName("http://www.iho.int/s100gml/1.0", "informationAssociation");
    private final static QName _MultiPoint_QNAME = new QName("http://www.iho.int/s100gml/1.0", "MultiPoint");
    private final static QName _OrientableCurve_QNAME = new QName("http://www.iho.int/s100gml/1.0", "OrientableCurve");
    private final static QName _CompositeCurve_QNAME = new QName("http://www.iho.int/s100gml/1.0", "CompositeCurve");
    private final static QName _InvInformationAssociation_QNAME = new QName("http://www.iho.int/s100gml/1.0", "invInformationAssociation");
    private final static QName _CurveProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "curveProperty");
    private final static QName _S100ArcByCenterPoint_QNAME = new QName("http://www.iho.int/s100gml/1.0", "S100_ArcByCenterPoint");
    private final static QName _Point_QNAME = new QName("http://www.iho.int/s100gml/1.0", "Point");
    private final static QName _PointProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0", "pointProperty");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: s100.gml.base
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiPointType }
     * 
     */
    public MultiPointType createMultiPointType() {
        return new MultiPointType();
    }

    /**
     * Create an instance of {@link MultiPointPropertyType }
     * 
     */
    public MultiPointPropertyType createMultiPointPropertyType() {
        return new MultiPointPropertyType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType }
     * 
     */
    public SurfacePropertyType createSurfacePropertyType() {
        return new SurfacePropertyType();
    }

    /**
     * Create an instance of {@link CurveType }
     * 
     */
    public CurveType createCurveType() {
        return new CurveType();
    }

    /**
     * Create an instance of {@link OrientableCurvePropertyType }
     * 
     */
    public OrientableCurvePropertyType createOrientableCurvePropertyType() {
        return new OrientableCurvePropertyType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link S100CircleByCenterPointType }
     * 
     */
    public S100CircleByCenterPointType createS100CircleByCenterPointType() {
        return new S100CircleByCenterPointType();
    }

    /**
     * Create an instance of {@link S100ArcByCenterPointType }
     * 
     */
    public S100ArcByCenterPointType createS100ArcByCenterPointType() {
        return new S100ArcByCenterPointType();
    }

    /**
     * Create an instance of {@link InformationPropertyType }
     * 
     */
    public InformationPropertyType createInformationPropertyType() {
        return new InformationPropertyType();
    }

    /**
     * Create an instance of {@link SurfaceType }
     * 
     */
    public SurfaceType createSurfaceType() {
        return new SurfaceType();
    }

    /**
     * Create an instance of {@link CurvePropertyType }
     * 
     */
    public CurvePropertyType createCurvePropertyType() {
        return new CurvePropertyType();
    }

    /**
     * Create an instance of {@link FeaturePropertyType }
     * 
     */
    public FeaturePropertyType createFeaturePropertyType() {
        return new FeaturePropertyType();
    }

    /**
     * Create an instance of {@link CompositeCurveType }
     * 
     */
    public CompositeCurveType createCompositeCurveType() {
        return new CompositeCurveType();
    }

    /**
     * Create an instance of {@link PolygonType }
     * 
     */
    public PolygonType createPolygonType() {
        return new PolygonType();
    }

    /**
     * Create an instance of {@link PolygonPropertyType }
     * 
     */
    public PolygonPropertyType createPolygonPropertyType() {
        return new PolygonPropertyType();
    }

    /**
     * Create an instance of {@link InverseInformationAssociationType }
     * 
     */
    public InverseInformationAssociationType createInverseInformationAssociationType() {
        return new InverseInformationAssociationType();
    }

    /**
     * Create an instance of {@link CompositeCurvePropertyType }
     * 
     */
    public CompositeCurvePropertyType createCompositeCurvePropertyType() {
        return new CompositeCurvePropertyType();
    }

    /**
     * Create an instance of {@link DataSetStructureInformationType }
     * 
     */
    public DataSetStructureInformationType createDataSetStructureInformationType() {
        return new DataSetStructureInformationType();
    }

    /**
     * Create an instance of {@link FeatureObjectIdentifier }
     * 
     */
    public FeatureObjectIdentifier createFeatureObjectIdentifier() {
        return new FeatureObjectIdentifier();
    }

    /**
     * Create an instance of {@link AbstractInformationType }
     * 
     */
    public AbstractInformationType createAbstractInformationType() {
        return new AbstractInformationType();
    }

    /**
     * Create an instance of {@link DataSetIdentificationType }
     * 
     */
    public DataSetIdentificationType createDataSetIdentificationType() {
        return new DataSetIdentificationType();
    }

    /**
     * Create an instance of {@link AbstractFeatureType }
     * 
     */
    public AbstractFeatureType createAbstractFeatureType() {
        return new AbstractFeatureType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "invFeatureAssociation")
    public JAXBElement<FeaturePropertyType> createInvFeatureAssociation(FeaturePropertyType value) {
        return new JAXBElement<FeaturePropertyType>(_InvFeatureAssociation_QNAME, FeaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientableCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "orientableCurveProperty")
    public JAXBElement<OrientableCurvePropertyType> createOrientableCurveProperty(OrientableCurvePropertyType value) {
        return new JAXBElement<OrientableCurvePropertyType>(_OrientableCurveProperty_QNAME, OrientableCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100CircleByCenterPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "S100_CircleByCenterPoint", substitutionHeadNamespace = "http://www.iho.int/s100gml/1.0", substitutionHeadName = "S100_ArcByCenterPoint")
    public JAXBElement<S100CircleByCenterPointType> createS100CircleByCenterPoint(S100CircleByCenterPointType value) {
        return new JAXBElement<S100CircleByCenterPointType>(_S100CircleByCenterPoint_QNAME, S100CircleByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "compositeCurveProperty")
    public JAXBElement<CompositeCurvePropertyType> createCompositeCurveProperty(CompositeCurvePropertyType value) {
        return new JAXBElement<CompositeCurvePropertyType>(_CompositeCurveProperty_QNAME, CompositeCurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "Curve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Curve")
    public JAXBElement<CurveType> createCurve(CurveType value) {
        return new JAXBElement<CurveType>(_Curve_QNAME, CurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfaceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "Surface", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Surface")
    public JAXBElement<SurfaceType> createSurface(SurfaceType value) {
        return new JAXBElement<SurfaceType>(_Surface_QNAME, SurfaceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeaturePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "featureAssociation")
    public JAXBElement<FeaturePropertyType> createFeatureAssociation(FeaturePropertyType value) {
        return new JAXBElement<FeaturePropertyType>(_FeatureAssociation_QNAME, FeaturePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "polygonProperty")
    public JAXBElement<PolygonPropertyType> createPolygonProperty(PolygonPropertyType value) {
        return new JAXBElement<PolygonPropertyType>(_PolygonProperty_QNAME, PolygonPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "multiPointProperty")
    public JAXBElement<MultiPointPropertyType> createMultiPointProperty(MultiPointPropertyType value) {
        return new JAXBElement<MultiPointPropertyType>(_MultiPointProperty_QNAME, MultiPointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "surfaceProperty")
    public JAXBElement<SurfacePropertyType> createSurfaceProperty(SurfacePropertyType value) {
        return new JAXBElement<SurfacePropertyType>(_SurfaceProperty_QNAME, SurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolygonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "Polygon", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "Polygon")
    public JAXBElement<PolygonType> createPolygon(PolygonType value) {
        return new JAXBElement<PolygonType>(_Polygon_QNAME, PolygonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "informationAssociation")
    public JAXBElement<InformationPropertyType> createInformationAssociation(InformationPropertyType value) {
        return new JAXBElement<InformationPropertyType>(_InformationAssociation_QNAME, InformationPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "MultiPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricAggregate")
    public JAXBElement<MultiPointType> createMultiPoint(MultiPointType value) {
        return new JAXBElement<MultiPointType>(_MultiPoint_QNAME, MultiPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrientableCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "OrientableCurve", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurve")
    public JAXBElement<OrientableCurveType> createOrientableCurve(OrientableCurveType value) {
        return new JAXBElement<OrientableCurveType>(_OrientableCurve_QNAME, OrientableCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompositeCurveType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "CompositeCurve")
    public JAXBElement<CompositeCurveType> createCompositeCurve(CompositeCurveType value) {
        return new JAXBElement<CompositeCurveType>(_CompositeCurve_QNAME, CompositeCurveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InverseInformationAssociationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "invInformationAssociation")
    public JAXBElement<InverseInformationAssociationType> createInvInformationAssociation(InverseInformationAssociationType value) {
        return new JAXBElement<InverseInformationAssociationType>(_InvInformationAssociation_QNAME, InverseInformationAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "curveProperty")
    public JAXBElement<CurvePropertyType> createCurveProperty(CurvePropertyType value) {
        return new JAXBElement<CurvePropertyType>(_CurveProperty_QNAME, CurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link S100ArcByCenterPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "S100_ArcByCenterPoint", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractCurveSegment")
    public JAXBElement<S100ArcByCenterPointType> createS100ArcByCenterPoint(S100ArcByCenterPointType value) {
        return new JAXBElement<S100ArcByCenterPointType>(_S100ArcByCenterPoint_QNAME, S100ArcByCenterPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "Point", substitutionHeadNamespace = "http://www.opengis.net/gml/3.2", substitutionHeadName = "AbstractGeometricPrimitive")
    public JAXBElement<PointType> createPoint(PointType value) {
        return new JAXBElement<PointType>(_Point_QNAME, PointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0", name = "pointProperty")
    public JAXBElement<PointPropertyType> createPointProperty(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_PointProperty_QNAME, PointPropertyType.class, null, value);
    }

}
