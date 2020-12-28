//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ISO-3166-1-alpha2.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ISO-3166-1-alpha2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="JS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ISO-3166-1-alpha2")
@XmlEnum
public enum ISO31661Alpha2 {

    KR,
    US,

    /**
     * Jussland - Not ISO 3166, but needed for sample datasets
     * 
     */
    JS;

    public String value() {
        return name();
    }

    public static ISO31661Alpha2 fromValue(String v) {
        return valueOf(v);
    }

}
