//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AuthorityOperation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AuthorityOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Activity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authorityOperationType" type="{http://datex2.eu/schema/2_0RC1/2_0}AuthorityOperationTypeEnum"/&gt;
 *         &lt;element name="authorityOperationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityOperation", propOrder = {
    "authorityOperationType",
    "authorityOperationExtension"
})
public class AuthorityOperation
    extends Activity {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AuthorityOperationTypeEnum authorityOperationType;
    protected ExtensionType authorityOperationExtension;

    /**
     * Ruft den Wert der authorityOperationType-Eigenschaft ab.
     *
     * @return possible object is {@link AuthorityOperationTypeEnum }
     */
    public AuthorityOperationTypeEnum getAuthorityOperationType() {
        return authorityOperationType;
    }

    /**
     * Legt den Wert der authorityOperationType-Eigenschaft fest.
     *
     * @param value allowed object is {@link AuthorityOperationTypeEnum }
     */
    public void setAuthorityOperationType(AuthorityOperationTypeEnum value) {
        this.authorityOperationType = value;
    }

    /**
     * Ruft den Wert der authorityOperationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAuthorityOperationExtension() {
        return authorityOperationExtension;
    }

    /**
     * Legt den Wert der authorityOperationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAuthorityOperationExtension(ExtensionType value) {
        this.authorityOperationExtension = value;
    }

    public AuthorityOperation withAuthorityOperationType(AuthorityOperationTypeEnum value) {
        setAuthorityOperationType(value);
        return this;
    }

    public AuthorityOperation withAuthorityOperationExtension(ExtensionType value) {
        setAuthorityOperationExtension(value);
        return this;
    }

    @Override
    public AuthorityOperation withMobilityOfActivity(Mobility value) {
        setMobilityOfActivity(value);
        return this;
    }

    @Override
    public AuthorityOperation withActivityExtension(ExtensionType value) {
        setActivityExtension(value);
        return this;
    }

    @Override
    public AuthorityOperation withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public AuthorityOperation withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public AuthorityOperation withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public AuthorityOperation withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public AuthorityOperation withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public AuthorityOperation withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public AuthorityOperation withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public AuthorityOperation withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AuthorityOperation withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AuthorityOperation withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AuthorityOperation withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AuthorityOperation withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public AuthorityOperation withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public AuthorityOperation withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public AuthorityOperation withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public AuthorityOperation withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public AuthorityOperation withId(String value) {
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
