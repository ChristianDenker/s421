//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			Route Extensions
 * 			
 * 
 * <p>Java-Klasse für RouteExtensions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RouteExtensions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iho.int/S421/gml/1.0}InformationTypeType">
 *       &lt;sequence>
 *         &lt;element name="routeExtensionsNote" type="{http://www.iho.int/S421/gml/1.0}Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="routeExtensionsManufacturerId" use="required" type="{http://www.iho.int/S421/gml/1.0}Text" />
 *       &lt;attribute name="routeExtensionsName" type="{http://www.iho.int/S421/gml/1.0}Text" />
 *       &lt;attribute name="routeExtensionsVersion" type="{http://www.iho.int/S421/gml/1.0}Text" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteExtensions", propOrder = {
    "routeExtensionsNote"
})
public class RouteExtensions
    extends InformationTypeType
{

    protected List<String> routeExtensionsNote;
    @XmlAttribute(name = "routeExtensionsManufacturerId", required = true)
    protected String routeExtensionsManufacturerId;
    @XmlAttribute(name = "routeExtensionsName")
    protected String routeExtensionsName;
    @XmlAttribute(name = "routeExtensionsVersion")
    protected String routeExtensionsVersion;

    /**
     * Gets the value of the routeExtensionsNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeExtensionsNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteExtensionsNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRouteExtensionsNote() {
        if (routeExtensionsNote == null) {
            routeExtensionsNote = new ArrayList<String>();
        }
        return this.routeExtensionsNote;
    }

    /**
     * Ruft den Wert der routeExtensionsManufacturerId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteExtensionsManufacturerId() {
        return routeExtensionsManufacturerId;
    }

    /**
     * Legt den Wert der routeExtensionsManufacturerId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteExtensionsManufacturerId(String value) {
        this.routeExtensionsManufacturerId = value;
    }

    /**
     * Ruft den Wert der routeExtensionsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteExtensionsName() {
        return routeExtensionsName;
    }

    /**
     * Legt den Wert der routeExtensionsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteExtensionsName(String value) {
        this.routeExtensionsName = value;
    }

    /**
     * Ruft den Wert der routeExtensionsVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteExtensionsVersion() {
        return routeExtensionsVersion;
    }

    /**
     * Legt den Wert der routeExtensionsVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteExtensionsVersion(String value) {
        this.routeExtensionsVersion = value;
    }

}
