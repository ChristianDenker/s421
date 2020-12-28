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
import iho.s421.gml.InformationTypeType;
import s100.gml.profile.AbstractGMLType;


/**
 * Abstract type for an S-100 information type. This is the base type from which domain application schemas derive definitions for their individual information types. It provides for all information types in the data product's GML application schema to have properties for information associations and inverse information associations.
 * 
 * <p>Java-Klasse für AbstractInformationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractGMLType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}informationAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.iho.int/s100gml/1.0}invInformationAssociation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractInformationType", propOrder = {
    "informationAssociation",
    "invInformationAssociation"
})
@XmlSeeAlso({
    InformationTypeType.class
})
public class AbstractInformationType
    extends AbstractGMLType
{

    protected List<InformationPropertyType> informationAssociation;
    protected List<InverseInformationAssociationType> invInformationAssociation;

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
     * Gets the value of the invInformationAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invInformationAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvInformationAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InverseInformationAssociationType }
     * 
     * 
     */
    public List<InverseInformationAssociationType> getInvInformationAssociation() {
        if (invInformationAssociation == null) {
            invInformationAssociation = new ArrayList<InverseInformationAssociationType>();
        }
        return this.invInformationAssociation;
    }

}
