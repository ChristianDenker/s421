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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * S-100 Data Set Identification. The fields correspond to S-100 10a-5.1.2.1 fields.
 *             Attributes encodingSpecification and encodingSpecificationEdition are actually redundant here because in an XML schema the encoding specification and encoding specification edition are usually implicit in the namespace URI.
 * 
 * <p>Java-Klasse für DataSetIdentificationType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataSetIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="encodingSpecification" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="encodingSpecificationEdition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productEdition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="applicationProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasetFileIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasetTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasetReferenceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="datasetLanguage" type="{http://www.iho.int/s100gml/1.0}ISO-639-1"/>
 *         &lt;element name="datasetAbstract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="datasetTopicCategory" type="{http://www.iho.int/s100gml/1.0}MD_TopicCategoryCode" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetIdentificationType", propOrder = {
    "encodingSpecification",
    "encodingSpecificationEdition",
    "productIdentifier",
    "productEdition",
    "applicationProfile",
    "datasetFileIdentifier",
    "datasetTitle",
    "datasetReferenceDate",
    "datasetLanguage",
    "datasetAbstract",
    "datasetTopicCategory"
})
public class DataSetIdentificationType {

    @XmlElement(required = true)
    protected String encodingSpecification;
    @XmlElement(required = true)
    protected String encodingSpecificationEdition;
    @XmlElement(required = true)
    protected String productIdentifier;
    @XmlElement(required = true)
    protected String productEdition;
    @XmlElement(required = true)
    protected String applicationProfile;
    @XmlElement(required = true)
    protected String datasetFileIdentifier;
    @XmlElement(required = true)
    protected String datasetTitle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datasetReferenceDate;
    @XmlElement(required = true, defaultValue = "en")
    @XmlSchemaType(name = "string")
    protected ISO6391 datasetLanguage;
    protected String datasetAbstract;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<MDTopicCategoryCode> datasetTopicCategory;

    /**
     * Ruft den Wert der encodingSpecification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingSpecification() {
        return encodingSpecification;
    }

    /**
     * Legt den Wert der encodingSpecification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingSpecification(String value) {
        this.encodingSpecification = value;
    }

    /**
     * Ruft den Wert der encodingSpecificationEdition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingSpecificationEdition() {
        return encodingSpecificationEdition;
    }

    /**
     * Legt den Wert der encodingSpecificationEdition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingSpecificationEdition(String value) {
        this.encodingSpecificationEdition = value;
    }

    /**
     * Ruft den Wert der productIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Legt den Wert der productIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductIdentifier(String value) {
        this.productIdentifier = value;
    }

    /**
     * Ruft den Wert der productEdition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductEdition() {
        return productEdition;
    }

    /**
     * Legt den Wert der productEdition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductEdition(String value) {
        this.productEdition = value;
    }

    /**
     * Ruft den Wert der applicationProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationProfile() {
        return applicationProfile;
    }

    /**
     * Legt den Wert der applicationProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationProfile(String value) {
        this.applicationProfile = value;
    }

    /**
     * Ruft den Wert der datasetFileIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetFileIdentifier() {
        return datasetFileIdentifier;
    }

    /**
     * Legt den Wert der datasetFileIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetFileIdentifier(String value) {
        this.datasetFileIdentifier = value;
    }

    /**
     * Ruft den Wert der datasetTitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetTitle() {
        return datasetTitle;
    }

    /**
     * Legt den Wert der datasetTitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetTitle(String value) {
        this.datasetTitle = value;
    }

    /**
     * Ruft den Wert der datasetReferenceDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatasetReferenceDate() {
        return datasetReferenceDate;
    }

    /**
     * Legt den Wert der datasetReferenceDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatasetReferenceDate(XMLGregorianCalendar value) {
        this.datasetReferenceDate = value;
    }

    /**
     * Ruft den Wert der datasetLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ISO6391 }
     *     
     */
    public ISO6391 getDatasetLanguage() {
        return datasetLanguage;
    }

    /**
     * Legt den Wert der datasetLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO6391 }
     *     
     */
    public void setDatasetLanguage(ISO6391 value) {
        this.datasetLanguage = value;
    }

    /**
     * Ruft den Wert der datasetAbstract-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetAbstract() {
        return datasetAbstract;
    }

    /**
     * Legt den Wert der datasetAbstract-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetAbstract(String value) {
        this.datasetAbstract = value;
    }

    /**
     * Gets the value of the datasetTopicCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datasetTopicCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatasetTopicCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDTopicCategoryCode }
     * 
     * 
     */
    public List<MDTopicCategoryCode> getDatasetTopicCategory() {
        if (datasetTopicCategory == null) {
            datasetTopicCategory = new ArrayList<MDTopicCategoryCode>();
        }
        return this.datasetTopicCategory;
    }

}
