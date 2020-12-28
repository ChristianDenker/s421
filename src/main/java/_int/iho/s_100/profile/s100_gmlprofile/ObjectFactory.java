//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package _int.iho.s_100.profile.s100_gmlprofile;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the _int.iho.s_100.profile.s100_gmlprofile package. 
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

    private final static QName _GmlProfileSchema_QNAME = new QName("http://www.iho.int/S-100/profile/s100_gmlProfile", "gmlProfileSchema");
    private final static QName _ComplianceLevel_QNAME = new QName("http://www.iho.int/S-100/profile/s100_gmlProfile", "complianceLevel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: _int.iho.s_100.profile.s100_gmlprofile
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S-100/profile/s100_gmlProfile", name = "gmlProfileSchema")
    public JAXBElement<String> createGmlProfileSchema(String value) {
        return new JAXBElement<String>(_GmlProfileSchema_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.iho.int/S-100/profile/s100_gmlProfile", name = "complianceLevel")
    public JAXBElement<BigInteger> createComplianceLevel(BigInteger value) {
        return new JAXBElement<BigInteger>(_ComplianceLevel_QNAME, BigInteger.class, null, value);
    }

}
