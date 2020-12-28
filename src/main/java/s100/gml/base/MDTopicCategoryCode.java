//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.12.28 um 03:44:33 PM CET 
//


package s100.gml.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r MD_TopicCategoryCode.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="MD_TopicCategoryCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="farming"/>
 *     &lt;enumeration value="biota"/>
 *     &lt;enumeration value="boundaries"/>
 *     &lt;enumeration value="climatologyMeteorologyAtmosphere"/>
 *     &lt;enumeration value="economy"/>
 *     &lt;enumeration value="elevation"/>
 *     &lt;enumeration value="environment"/>
 *     &lt;enumeration value="geoscientificInformation"/>
 *     &lt;enumeration value="health"/>
 *     &lt;enumeration value="imageryBaseMapsEarthCover"/>
 *     &lt;enumeration value="intelligenceMilitary"/>
 *     &lt;enumeration value="inlandWaters"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="oceans"/>
 *     &lt;enumeration value="planningCadastre"/>
 *     &lt;enumeration value="society"/>
 *     &lt;enumeration value="structure"/>
 *     &lt;enumeration value="transportation"/>
 *     &lt;enumeration value="utilitiesCommunication"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MD_TopicCategoryCode")
@XmlEnum
public enum MDTopicCategoryCode {


    /**
     * rearing of animals and/or cultivation of plants. Examples: agriculture, irrigation, aquaculture, plantations, herding, pests and diseases affecting crops and livestock
     * 
     */
    @XmlEnumValue("farming")
    FARMING("farming"),

    /**
     * flora and/or fauna in natural environment. Examples: wildlife, vegetation, biological sciences, ecology, wilderness, sealife, wetlands, habitat
     * 
     */
    @XmlEnumValue("biota")
    BIOTA("biota"),

    /**
     * legal land descriptions. Examples: political and administrative boundaries
     * 
     */
    @XmlEnumValue("boundaries")
    BOUNDARIES("boundaries"),

    /**
     * processes and phenomena of the atmosphere. Examples: cloud cover, weather, climate, atmospheric conditions, climate change, precipitation
     * 
     */
    @XmlEnumValue("climatologyMeteorologyAtmosphere")
    CLIMATOLOGY_METEOROLOGY_ATMOSPHERE("climatologyMeteorologyAtmosphere"),

    /**
     * economic activities, conditions and employment. Examples: production, labour, revenue, commerce, industry, tourism and ecotourism, forestry, fisheries, commercial or subsistence hunting, exploration and exploitation of resources such as minerals, oil and gas
     * 
     */
    @XmlEnumValue("economy")
    ECONOMY("economy"),

    /**
     * height above or below sea level. Examples: altitude, bathymetry, digital elevation models, slope, derived products
     * 
     */
    @XmlEnumValue("elevation")
    ELEVATION("elevation"),

    /**
     * environmental resources, protection and conservation. Examples: environmental pollution, waste storage and treatment, environmental impact assessment, monitoring environmental risk, nature reserves, landscape
     * 
     */
    @XmlEnumValue("environment")
    ENVIRONMENT("environment"),

    /**
     * information pertaining to earth sciences. Examples: geophysical features and processes, geology, minerals, sciences dealing with the composition, structure and origin of the earth s rocks, risks of earthquakes, volcanic activity, landslides, gravity information, soils, permafrost, hydrogeology, erosion
     * 
     */
    @XmlEnumValue("geoscientificInformation")
    GEOSCIENTIFIC_INFORMATION("geoscientificInformation"),

    /**
     * health, health services, human ecology, and safety. Examples: disease and illness, factors affecting health, hygiene, substance abuse, mental and physical health, health services
     * 
     */
    @XmlEnumValue("health")
    HEALTH("health"),

    /**
     * base maps. Examples: land cover, topographic maps, imagery, unclassified images, annotations
     * 
     */
    @XmlEnumValue("imageryBaseMapsEarthCover")
    IMAGERY_BASE_MAPS_EARTH_COVER("imageryBaseMapsEarthCover"),

    /**
     * military bases, structures, activities. Examples: barracks, training grounds, military transportation, information collection
     * 
     */
    @XmlEnumValue("intelligenceMilitary")
    INTELLIGENCE_MILITARY("intelligenceMilitary"),

    /**
     * inland water features, drainage systems and their characteristics. Examples: rivers and glaciers, salt lakes, water utilization plans, dams, currents, floods, water quality, hydrographic charts
     * 
     */
    @XmlEnumValue("inlandWaters")
    INLAND_WATERS("inlandWaters"),

    /**
     * positional information and services. Examples: addresses, geodetic networks, control points, postal zones and services, place names
     * 
     */
    @XmlEnumValue("location")
    LOCATION("location"),

    /**
     * features and characteristics of salt water bodies (excluding inland waters). Examples: tides, tidal waves, coastal information, reefs
     * 
     */
    @XmlEnumValue("oceans")
    OCEANS("oceans"),

    /**
     * information used for appropriate actions for future use of the land. Examples: land use maps, zoning maps, cadastral surveys, land ownership
     * 
     */
    @XmlEnumValue("planningCadastre")
    PLANNING_CADASTRE("planningCadastre"),

    /**
     * characteristics of society and cultures. Examples: settlements, anthropology, archaeology, education, traditional beliefs, manners and customs, demographic data, recreational areas and activities, social impact assessments, crime and justice, census information
     * 
     */
    @XmlEnumValue("society")
    SOCIETY("society"),

    /**
     * man-made construction. Examples: buildings, museums, churches, factories, housing, monuments, shops, towers
     * 
     */
    @XmlEnumValue("structure")
    STRUCTURE("structure"),

    /**
     * means and aids for conveying persons and/or goods. Examples: roads, airports/airstrips, shipping routes, tunnels, nautical charts, vehicle or vessel location, aeronautical charts, railways
     * 
     */
    @XmlEnumValue("transportation")
    TRANSPORTATION("transportation"),

    /**
     * energy, water and waste systems and communications infrastructure and services. Examples: hydroelectricity, geothermal, solar and nuclear sources of energy, water purification and distribution, sewage collection and disposal, electricity and gas distribution, data communication, telecommunication, radio, communication networks
     * 
     */
    @XmlEnumValue("utilitiesCommunication")
    UTILITIES_COMMUNICATION("utilitiesCommunication");
    private final String value;

    MDTopicCategoryCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MDTopicCategoryCode fromValue(String v) {
        for (MDTopicCategoryCode c: MDTopicCategoryCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
