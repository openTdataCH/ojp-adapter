//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für RoadConditions complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Conditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadConditions", propOrder = {
    "roadConditionsExtension"
})
@XmlSeeAlso({
    NonWeatherRelatedRoadConditions.class,
    WeatherRelatedRoadConditions.class
})
public abstract class RoadConditions
    extends Conditions {

    protected ExtensionType roadConditionsExtension;

    /**
     * Ruft den Wert der roadConditionsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getRoadConditionsExtension() {
        return roadConditionsExtension;
    }

    /**
     * Legt den Wert der roadConditionsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setRoadConditionsExtension(ExtensionType value) {
        this.roadConditionsExtension = value;
    }

    public RoadConditions withRoadConditionsExtension(ExtensionType value) {
        setRoadConditionsExtension(value);
        return this;
    }

    @Override
    public RoadConditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    @Override
    public RoadConditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public RoadConditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public RoadConditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public RoadConditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public RoadConditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadConditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public RoadConditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public RoadConditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public RoadConditions withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadConditions withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadConditions withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadConditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadConditions withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadConditions withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public RoadConditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public RoadConditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public RoadConditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public RoadConditions withId(String value) {
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
