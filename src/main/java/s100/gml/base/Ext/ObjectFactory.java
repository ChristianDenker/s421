//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base.Ext;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the s100.gml.base.Ext package. 
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

    private final static QName _PointOrSurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "PointOrSurfaceProperty");
    private final static QName _CurveProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "CurveProperty");
    private final static QName _PointCurveSurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "PointCurveSurfaceProperty");
    private final static QName _CurveOrSurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "CurveOrSurfaceProperty");
    private final static QName _SurfaceProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "SurfaceProperty");
    private final static QName _PointProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "PointProperty");
    private final static QName _PointOrCurveProperty_QNAME = new QName("http://www.iho.int/s100gml/1.0+EXT", "PointOrCurveProperty");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: s100.gml.base.Ext
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PointCurveSurfacePropertyType }
     * 
     */
    public PointCurveSurfacePropertyType createPointCurveSurfacePropertyType() {
        return new PointCurveSurfacePropertyType();
    }

    /**
     * Create an instance of {@link CurvePropertyType }
     * 
     */
    public CurvePropertyType createCurvePropertyType() {
        return new CurvePropertyType();
    }

    /**
     * Create an instance of {@link SurfacePropertyType }
     * 
     */
    public SurfacePropertyType createSurfacePropertyType() {
        return new SurfacePropertyType();
    }

    /**
     * Create an instance of {@link PointOrSurfacePropertyType }
     * 
     */
    public PointOrSurfacePropertyType createPointOrSurfacePropertyType() {
        return new PointOrSurfacePropertyType();
    }

    /**
     * Create an instance of {@link CurveOrSurfacePropertyType }
     * 
     */
    public CurveOrSurfacePropertyType createCurveOrSurfacePropertyType() {
        return new CurveOrSurfacePropertyType();
    }

    /**
     * Create an instance of {@link PointPropertyType }
     * 
     */
    public PointPropertyType createPointPropertyType() {
        return new PointPropertyType();
    }

    /**
     * Create an instance of {@link PointOrCurvePropertyType }
     * 
     */
    public PointOrCurvePropertyType createPointOrCurvePropertyType() {
        return new PointOrCurvePropertyType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOrSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "PointOrSurfaceProperty")
    public JAXBElement<PointOrSurfacePropertyType> createPointOrSurfaceProperty(PointOrSurfacePropertyType value) {
        return new JAXBElement<PointOrSurfacePropertyType>(_PointOrSurfaceProperty_QNAME, PointOrSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "CurveProperty")
    public JAXBElement<CurvePropertyType> createCurveProperty(CurvePropertyType value) {
        return new JAXBElement<CurvePropertyType>(_CurveProperty_QNAME, CurvePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointCurveSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "PointCurveSurfaceProperty")
    public JAXBElement<PointCurveSurfacePropertyType> createPointCurveSurfaceProperty(PointCurveSurfacePropertyType value) {
        return new JAXBElement<PointCurveSurfacePropertyType>(_PointCurveSurfaceProperty_QNAME, PointCurveSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurveOrSurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "CurveOrSurfaceProperty")
    public JAXBElement<CurveOrSurfacePropertyType> createCurveOrSurfaceProperty(CurveOrSurfacePropertyType value) {
        return new JAXBElement<CurveOrSurfacePropertyType>(_CurveOrSurfaceProperty_QNAME, CurveOrSurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurfacePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "SurfaceProperty")
    public JAXBElement<SurfacePropertyType> createSurfaceProperty(SurfacePropertyType value) {
        return new JAXBElement<SurfacePropertyType>(_SurfaceProperty_QNAME, SurfacePropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointPropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "PointProperty")
    public JAXBElement<PointPropertyType> createPointProperty(PointPropertyType value) {
        return new JAXBElement<PointPropertyType>(_PointProperty_QNAME, PointPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOrCurvePropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/s100gml/1.0+EXT", name = "PointOrCurveProperty")
    public JAXBElement<PointOrCurvePropertyType> createPointOrCurveProperty(PointOrCurvePropertyType value) {
        return new JAXBElement<PointOrCurvePropertyType>(_PointOrCurveProperty_QNAME, PointOrCurvePropertyType.class, null, value);
    }

}
