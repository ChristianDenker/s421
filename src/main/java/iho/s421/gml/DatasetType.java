//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package iho.s421.gml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import s100.gml.base.CompositeCurveType;
import s100.gml.base.CurveType;
import s100.gml.base.DataSetIdentificationType;
import s100.gml.base.DataSetStructureInformationType;
import s100.gml.base.MultiPointType;
import s100.gml.base.PointType;
import s100.gml.base.PolygonType;
import s100.gml.base.SurfaceType;
import s100.gml.profile.AbstractFeatureMemberType;
import s100.gml.profile.AbstractFeatureType;
import s100.gml.profile.AbstractGeometryType;
import s100.gml.profile.OrientableCurveType;


/**
 * Dataset element for S-100 Based Route dataset as "GML document"
 * 
 * <p>Java-Klasse f�r DatasetType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatasetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType">
 *       &lt;sequence>
 *         &lt;element name="DatasetIdentificationInformation" type="{http://www.iho.int/s100gml/1.0}DataSetIdentificationType" minOccurs="0"/>
 *         &lt;element name="DatasetStructureInformation" type="{http://www.iho.int/s100gml/1.0}DataSetStructureInformationType" minOccurs="0"/>
 *         &lt;group ref="{http://www.iho.int/s100gml/1.0}Geometry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="imember" type="{http://www.iho.int/S421/gml/1.0}IMemberType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="member" type="{http://www.iho.int/S421/gml/1.0}MemberType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatasetType", propOrder = {
    "datasetIdentificationInformation",
    "datasetStructureInformation",
    "geometry",
    "imemberOrMember"
})
public class DatasetType
    extends AbstractFeatureType
{

    @XmlElement(name = "DatasetIdentificationInformation")
    protected DataSetIdentificationType datasetIdentificationInformation;
    @XmlElement(name = "DatasetStructureInformation")
    protected DataSetStructureInformationType datasetStructureInformation;
    @XmlElements({
        @XmlElement(name = "Point", namespace = "http://www.iho.int/s100gml/1.0", type = PointType.class),
        @XmlElement(name = "MultiPoint", namespace = "http://www.iho.int/s100gml/1.0", type = MultiPointType.class),
        @XmlElement(name = "Curve", namespace = "http://www.iho.int/s100gml/1.0", type = CurveType.class),
        @XmlElement(name = "CompositeCurve", namespace = "http://www.iho.int/s100gml/1.0", type = CompositeCurveType.class),
        @XmlElement(name = "OrientableCurve", namespace = "http://www.iho.int/s100gml/1.0", type = OrientableCurveType.class),
        @XmlElement(name = "Surface", namespace = "http://www.iho.int/s100gml/1.0", type = SurfaceType.class),
        @XmlElement(name = "Polygon", namespace = "http://www.iho.int/s100gml/1.0", type = PolygonType.class)
    })
    protected List<AbstractGeometryType> geometry;
    @XmlElements({
        @XmlElement(name = "imember", type = IMemberType.class),
        @XmlElement(name = "member", type = MemberType.class)
    })
    protected List<AbstractFeatureMemberType> imemberOrMember;

    /**
     * Ruft den Wert der datasetIdentificationInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentificationType }
     *     
     */
    public DataSetIdentificationType getDatasetIdentificationInformation() {
        return datasetIdentificationInformation;
    }

    /**
     * Legt den Wert der datasetIdentificationInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentificationType }
     *     
     */
    public void setDatasetIdentificationInformation(DataSetIdentificationType value) {
        this.datasetIdentificationInformation = value;
    }

    /**
     * Ruft den Wert der datasetStructureInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DataSetStructureInformationType }
     *     
     */
    public DataSetStructureInformationType getDatasetStructureInformation() {
        return datasetStructureInformation;
    }

    /**
     * Legt den Wert der datasetStructureInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetStructureInformationType }
     *     
     */
    public void setDatasetStructureInformation(DataSetStructureInformationType value) {
        this.datasetStructureInformation = value;
    }

    /**
     * Allows spatial objects to be located outside feature objects (for references, and compatibility with ISO 8211 encoding) Gets the value of the geometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointType }
     * {@link MultiPointType }
     * {@link CurveType }
     * {@link CompositeCurveType }
     * {@link OrientableCurveType }
     * {@link SurfaceType }
     * {@link PolygonType }
     * 
     * 
     */
    public List<AbstractGeometryType> getGeometry() {
        if (geometry == null) {
            geometry = new ArrayList<AbstractGeometryType>();
        }
        return this.geometry;
    }

    /**
     * Gets the value of the imemberOrMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imemberOrMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImemberOrMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IMemberType }
     * {@link MemberType }
     * 
     * 
     */
    public List<AbstractFeatureMemberType> getImemberOrMember() {
        if (imemberOrMember == null) {
            imemberOrMember = new ArrayList<AbstractFeatureMemberType>();
        }
        return this.imemberOrMember;
    }

}
