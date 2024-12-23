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
 * <p>Java-Klasse für PublicEvent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublicEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="publicEventType" type="{http://datex2.eu/schema/2_0RC1/2_0}PublicEventTypeEnum"/&gt;
 *         &lt;element name="publicEventExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicEvent", propOrder = {
    "publicEventType",
    "publicEventExtension"
})
public class PublicEvent
    extends Activity
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PublicEventTypeEnum publicEventType;
    protected ExtensionType publicEventExtension;

    /**
     * Ruft den Wert der publicEventType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public PublicEventTypeEnum getPublicEventType() {
        return publicEventType;
    }

    /**
     * Legt den Wert der publicEventType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicEventTypeEnum }
     *     
     */
    public void setPublicEventType(PublicEventTypeEnum value) {
        this.publicEventType = value;
    }

    /**
     * Ruft den Wert der publicEventExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPublicEventExtension() {
        return publicEventExtension;
    }

    /**
     * Legt den Wert der publicEventExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPublicEventExtension(ExtensionType value) {
        this.publicEventExtension = value;
    }

    public PublicEvent withPublicEventType(PublicEventTypeEnum value) {
        setPublicEventType(value);
        return this;
    }

    public PublicEvent withPublicEventExtension(ExtensionType value) {
        setPublicEventExtension(value);
        return this;
    }

    @Override
    public PublicEvent withMobilityOfActivity(Mobility value) {
        setMobilityOfActivity(value);
        return this;
    }

    @Override
    public PublicEvent withActivityExtension(ExtensionType value) {
        setActivityExtension(value);
        return this;
    }

    @Override
    public PublicEvent withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public PublicEvent withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public PublicEvent withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public PublicEvent withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public PublicEvent withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public PublicEvent withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public PublicEvent withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public PublicEvent withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public PublicEvent withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public PublicEvent withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public PublicEvent withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public PublicEvent withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public PublicEvent withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public PublicEvent withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public PublicEvent withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public PublicEvent withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public PublicEvent withId(String value) {
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
