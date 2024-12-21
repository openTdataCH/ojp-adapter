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
 * <p>Java-Klasse für InfrastructureDamageObstruction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/2_0RC1/2_0}InfrastructureDamageTypeEnum"/&gt;
 *         &lt;element name="infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureDamageObstruction", propOrder = {
    "infrastructureDamageType",
    "infrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected ExtensionType infrastructureDamageObstructionExtension;

    /**
     * Ruft den Wert der infrastructureDamageType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Legt den Wert der infrastructureDamageType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Ruft den Wert der infrastructureDamageObstructionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInfrastructureDamageObstructionExtension() {
        return infrastructureDamageObstructionExtension;
    }

    /**
     * Legt den Wert der infrastructureDamageObstructionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInfrastructureDamageObstructionExtension(ExtensionType value) {
        this.infrastructureDamageObstructionExtension = value;
    }

    public InfrastructureDamageObstruction withInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        setInfrastructureDamageType(value);
        return this;
    }

    public InfrastructureDamageObstruction withInfrastructureDamageObstructionExtension(ExtensionType value) {
        setInfrastructureDamageObstructionExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public InfrastructureDamageObstruction withId(String value) {
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
