//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.profile;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r SurfaceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SurfaceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}patches"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurfaceType", propOrder = {
    "patches"
})
@XmlSeeAlso({
    s100.gml.base.SurfaceType.class
})
public class SurfaceType
    extends AbstractSurfaceType
{

    @XmlElement(required = true)
    protected SurfacePatchArrayPropertyType patches;

    /**
     * Ruft den Wert der patches-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SurfacePatchArrayPropertyType }
     *     
     */
    public SurfacePatchArrayPropertyType getPatches() {
        return patches;
    }

    /**
     * Legt den Wert der patches-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SurfacePatchArrayPropertyType }
     *     
     */
    public void setPatches(SurfacePatchArrayPropertyType value) {
        this.patches = value;
    }

}
