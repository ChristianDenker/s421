//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import iho.s421.gml.FeatureType;
import iho.s421.gml.GenericFeatureType;


/**
 * Abstract type for an S-100 feature. This is the base type from which domain application schemas derive definitions for their individual features. It derives from GML AbstractFeatureType. It provides for all information types in the data product's GML application schema to have feature identifiers and properties for feature associations, information associations and inverse information associations.
 * 
 * <p>Java-Klasse für AbstractFeatureType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractFeatureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="featureObjectIdentifier" type="{http://www.iho.int/s100gml/1.0}FeatureObjectIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}informationAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}featureAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}invFeatureAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractFeatureType", propOrder = {
    "featureObjectIdentifier",
    "informationAssociation",
    "featureAssociation",
    "invFeatureAssociation"
})
@XmlSeeAlso({
    FeatureType.class,
    GenericFeatureType.class
})
public class AbstractFeatureType
    extends s100.gml.profile.AbstractFeatureType
{

    protected FeatureObjectIdentifier featureObjectIdentifier;
    protected List<InformationPropertyType> informationAssociation;
    protected List<FeaturePropertyType> featureAssociation;
    protected List<FeaturePropertyType> invFeatureAssociation;

    /**
     * Ruft den Wert der featureObjectIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FeatureObjectIdentifier }
     *     
     */
    public FeatureObjectIdentifier getFeatureObjectIdentifier() {
        return featureObjectIdentifier;
    }

    /**
     * Legt den Wert der featureObjectIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureObjectIdentifier }
     *     
     */
    public void setFeatureObjectIdentifier(FeatureObjectIdentifier value) {
        this.featureObjectIdentifier = value;
    }

    /**
     * Gets the value of the informationAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the informationAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformationPropertyType }
     * 
     * 
     */
    public List<InformationPropertyType> getInformationAssociation() {
        if (informationAssociation == null) {
            informationAssociation = new ArrayList<InformationPropertyType>();
        }
        return this.informationAssociation;
    }

    /**
     * Gets the value of the featureAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featureAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeatureAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getFeatureAssociation() {
        if (featureAssociation == null) {
            featureAssociation = new ArrayList<FeaturePropertyType>();
        }
        return this.featureAssociation;
    }

    /**
     * Gets the value of the invFeatureAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invFeatureAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvFeatureAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeaturePropertyType }
     * 
     * 
     */
    public List<FeaturePropertyType> getInvFeatureAssociation() {
        if (invFeatureAssociation == null) {
            invFeatureAssociation = new ArrayList<FeaturePropertyType>();
        }
        return this.invFeatureAssociation;
    }

}
