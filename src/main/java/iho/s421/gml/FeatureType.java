//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import s100.gml.base.AbstractFeatureType;


/**
 * Generalized feature type which carry all the common attributes
 * 
 * <p>Java-Klasse für FeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/s100gml/1.0}AbstractFeatureType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureType")
@XmlSeeAlso({
    RouteActionPoints.class,
    RouteWaypoint.class,
    Route.class,
    RouteWaypointLeg.class,
    RouteActionPoint.class,
    RouteWaypoints.class
})
public abstract class FeatureType
    extends AbstractFeatureType
{


}
