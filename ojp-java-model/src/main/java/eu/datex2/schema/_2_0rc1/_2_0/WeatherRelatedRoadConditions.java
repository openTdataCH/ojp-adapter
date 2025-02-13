//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für WeatherRelatedRoadConditions complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="WeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}RoadConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}WeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="roadSurfaceConditionMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadSurfaceConditionMeasurements" minOccurs="0"/&gt;
 *         &lt;element name="weatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherRelatedRoadConditions", propOrder = {
    "weatherRelatedRoadConditionType",
    "roadSurfaceConditionMeasurements",
    "weatherRelatedRoadConditionsExtension"
})
public class WeatherRelatedRoadConditions
    extends RoadConditions {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<WeatherRelatedRoadConditionTypeEnum> weatherRelatedRoadConditionType;
    protected RoadSurfaceConditionMeasurements roadSurfaceConditionMeasurements;
    protected ExtensionType weatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the weatherRelatedRoadConditionType property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the weatherRelatedRoadConditionType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link WeatherRelatedRoadConditionTypeEnum }
     */
    public List<WeatherRelatedRoadConditionTypeEnum> getWeatherRelatedRoadConditionType() {
        if (weatherRelatedRoadConditionType == null) {
            weatherRelatedRoadConditionType = new ArrayList<WeatherRelatedRoadConditionTypeEnum>();
        }
        return this.weatherRelatedRoadConditionType;
    }

    /**
     * Ruft den Wert der roadSurfaceConditionMeasurements-Eigenschaft ab.
     *
     * @return possible object is {@link RoadSurfaceConditionMeasurements }
     */
    public RoadSurfaceConditionMeasurements getRoadSurfaceConditionMeasurements() {
        return roadSurfaceConditionMeasurements;
    }

    /**
     * Legt den Wert der roadSurfaceConditionMeasurements-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadSurfaceConditionMeasurements }
     */
    public void setRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        this.roadSurfaceConditionMeasurements = value;
    }

    /**
     * Ruft den Wert der weatherRelatedRoadConditionsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getWeatherRelatedRoadConditionsExtension() {
        return weatherRelatedRoadConditionsExtension;
    }

    /**
     * Legt den Wert der weatherRelatedRoadConditionsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.weatherRelatedRoadConditionsExtension = value;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionType(WeatherRelatedRoadConditionTypeEnum... values) {
        if (values != null) {
            for (WeatherRelatedRoadConditionTypeEnum value : values) {
                getWeatherRelatedRoadConditionType().add(value);
            }
        }
        return this;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionType(Collection<WeatherRelatedRoadConditionTypeEnum> values) {
        if (values != null) {
            getWeatherRelatedRoadConditionType().addAll(values);
        }
        return this;
    }

    public WeatherRelatedRoadConditions withRoadSurfaceConditionMeasurements(RoadSurfaceConditionMeasurements value) {
        setRoadSurfaceConditionMeasurements(value);
        return this;
    }

    public WeatherRelatedRoadConditions withWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        setWeatherRelatedRoadConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withRoadConditionsExtension(ExtensionType value) {
        setRoadConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public WeatherRelatedRoadConditions withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
