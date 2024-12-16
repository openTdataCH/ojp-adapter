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
 * <p>Java-Klasse für NonWeatherRelatedRoadConditions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NonWeatherRelatedRoadConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}RoadConditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionType" type="{http://datex2.eu/schema/2_0RC1/2_0}NonWeatherRelatedRoadConditionTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="nonWeatherRelatedRoadConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonWeatherRelatedRoadConditions", propOrder = {
    "nonWeatherRelatedRoadConditionType",
    "nonWeatherRelatedRoadConditionsExtension"
})
public class NonWeatherRelatedRoadConditions
    extends RoadConditions
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<NonWeatherRelatedRoadConditionTypeEnum> nonWeatherRelatedRoadConditionType;
    protected ExtensionType nonWeatherRelatedRoadConditionsExtension;

    /**
     * Gets the value of the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nonWeatherRelatedRoadConditionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWeatherRelatedRoadConditionType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonWeatherRelatedRoadConditionTypeEnum }
     * 
     * 
     */
    public List<NonWeatherRelatedRoadConditionTypeEnum> getNonWeatherRelatedRoadConditionType() {
        if (nonWeatherRelatedRoadConditionType == null) {
            nonWeatherRelatedRoadConditionType = new ArrayList<NonWeatherRelatedRoadConditionTypeEnum>();
        }
        return this.nonWeatherRelatedRoadConditionType;
    }

    /**
     * Ruft den Wert der nonWeatherRelatedRoadConditionsExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonWeatherRelatedRoadConditionsExtension() {
        return nonWeatherRelatedRoadConditionsExtension;
    }

    /**
     * Legt den Wert der nonWeatherRelatedRoadConditionsExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        this.nonWeatherRelatedRoadConditionsExtension = value;
    }

    public NonWeatherRelatedRoadConditions withNonWeatherRelatedRoadConditionType(NonWeatherRelatedRoadConditionTypeEnum... values) {
        if (values!= null) {
            for (NonWeatherRelatedRoadConditionTypeEnum value: values) {
                getNonWeatherRelatedRoadConditionType().add(value);
            }
        }
        return this;
    }

    public NonWeatherRelatedRoadConditions withNonWeatherRelatedRoadConditionType(Collection<NonWeatherRelatedRoadConditionTypeEnum> values) {
        if (values!= null) {
            getNonWeatherRelatedRoadConditionType().addAll(values);
        }
        return this;
    }

    public NonWeatherRelatedRoadConditions withNonWeatherRelatedRoadConditionsExtension(ExtensionType value) {
        setNonWeatherRelatedRoadConditionsExtension(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withRoadConditionsExtension(ExtensionType value) {
        setRoadConditionsExtension(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public NonWeatherRelatedRoadConditions withId(String value) {
        setId(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
