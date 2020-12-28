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
import s100.gml.base.AbstractInformationType;


/**
 * Generalized information type which carry all the common attributes
 * 
 * <p>Java-Klasse für InformationTypeType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InformationTypeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/s100gml/1.0}AbstractInformationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationTypeType")
@XmlSeeAlso({
    RouteScheduleCalculated.class,
    RouteScheduleRecommended.class,
    RouteScheduleManual.class,
    RouteScheduleElement.class,
    RouteSchedule.class,
    RouteInfo.class,
    RouteSchedules.class,
    RouteExtensions.class
})
public abstract class InformationTypeType
    extends AbstractInformationType
{


}
