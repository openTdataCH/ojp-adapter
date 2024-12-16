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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für DisturbanceActivity complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DisturbanceActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disturbanceActivityType" type="{http://datex2.eu/schema/2_0RC1/2_0}DisturbanceActivityTypeEnum"/&gt;
 *         &lt;element name="disturbanceActivityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisturbanceActivity", propOrder = {
    "disturbanceActivityType",
    "disturbanceActivityExtension"
})
public class DisturbanceActivity
    extends Activity
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DisturbanceActivityTypeEnum disturbanceActivityType;
    protected ExtensionType disturbanceActivityExtension;

    /**
     * Ruft den Wert der disturbanceActivityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Legt den Wert der disturbanceActivityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    /**
     * Ruft den Wert der disturbanceActivityExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDisturbanceActivityExtension() {
        return disturbanceActivityExtension;
    }

    /**
     * Legt den Wert der disturbanceActivityExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDisturbanceActivityExtension(ExtensionType value) {
        this.disturbanceActivityExtension = value;
    }

    public DisturbanceActivity withDisturbanceActivityType(DisturbanceActivityTypeEnum value) {
        setDisturbanceActivityType(value);
        return this;
    }

    public DisturbanceActivity withDisturbanceActivityExtension(ExtensionType value) {
        setDisturbanceActivityExtension(value);
        return this;
    }

    @Override
    public DisturbanceActivity withMobilityOfActivity(Mobility value) {
        setMobilityOfActivity(value);
        return this;
    }

    @Override
    public DisturbanceActivity withActivityExtension(ExtensionType value) {
        setActivityExtension(value);
        return this;
    }

    @Override
    public DisturbanceActivity withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public DisturbanceActivity withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public DisturbanceActivity withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public DisturbanceActivity withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public DisturbanceActivity withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public DisturbanceActivity withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public DisturbanceActivity withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public DisturbanceActivity withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public DisturbanceActivity withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public DisturbanceActivity withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public DisturbanceActivity withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public DisturbanceActivity withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public DisturbanceActivity withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public DisturbanceActivity withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public DisturbanceActivity withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public DisturbanceActivity withId(String value) {
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
