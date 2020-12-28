//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für S100_CircleByCenterPointType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="S100_CircleByCenterPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.iho.int/s100gml/1.0}S100_ArcByCenterPointType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/>
 *         &lt;/choice>
 *         &lt;element name="radius" type="{http://www.opengis.net/gml/3.2}LengthType"/>
 *         &lt;element name="startAngle" type="{http://www.iho.int/s100gml/1.0}BearingType"/>
 *         &lt;element name="angularDistance">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.iho.int/s100gml/1.0}PlusOrMinus360Degrees">
 *               &lt;enumeration value="360.0"/>
 *               &lt;enumeration value="-360.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CircleByCenterPointType")
public class S100CircleByCenterPointType
    extends S100ArcByCenterPointType
{


}
