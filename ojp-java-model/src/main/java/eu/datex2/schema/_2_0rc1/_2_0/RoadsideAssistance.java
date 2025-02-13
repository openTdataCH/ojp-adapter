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
 * <p>Java-Klasse für RoadsideAssistance complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RoadsideAssistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideAssistanceType" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideAssistanceTypeEnum"/&gt;
 *         &lt;element name="roadsideAssistanceExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideAssistance", propOrder = {
    "roadsideAssistanceType",
    "roadsideAssistanceExtension"
})
public class RoadsideAssistance
    extends OperatorAction {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoadsideAssistanceTypeEnum roadsideAssistanceType;
    protected ExtensionType roadsideAssistanceExtension;

    /**
     * Ruft den Wert der roadsideAssistanceType-Eigenschaft ab.
     *
     * @return possible object is {@link RoadsideAssistanceTypeEnum }
     */
    public RoadsideAssistanceTypeEnum getRoadsideAssistanceType() {
        return roadsideAssistanceType;
    }

    /**
     * Legt den Wert der roadsideAssistanceType-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadsideAssistanceTypeEnum }
     */
    public void setRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        this.roadsideAssistanceType = value;
    }

    /**
     * Ruft den Wert der roadsideAssistanceExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getRoadsideAssistanceExtension() {
        return roadsideAssistanceExtension;
    }

    /**
     * Legt den Wert der roadsideAssistanceExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setRoadsideAssistanceExtension(ExtensionType value) {
        this.roadsideAssistanceExtension = value;
    }

    public RoadsideAssistance withRoadsideAssistanceType(RoadsideAssistanceTypeEnum value) {
        setRoadsideAssistanceType(value);
        return this;
    }

    public RoadsideAssistance withRoadsideAssistanceExtension(ExtensionType value) {
        setRoadsideAssistanceExtension(value);
        return this;
    }

    @Override
    public RoadsideAssistance withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public RoadsideAssistance withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public RoadsideAssistance withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public RoadsideAssistance withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public RoadsideAssistance withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public RoadsideAssistance withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public RoadsideAssistance withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public RoadsideAssistance withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public RoadsideAssistance withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideAssistance withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideAssistance withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideAssistance withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideAssistance withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public RoadsideAssistance withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public RoadsideAssistance withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public RoadsideAssistance withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public RoadsideAssistance withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public RoadsideAssistance withId(String value) {
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
