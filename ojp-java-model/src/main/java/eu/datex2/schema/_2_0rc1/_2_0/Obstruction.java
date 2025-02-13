//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für Obstruction complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Obstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfObstructions" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="mobilityOfObstruction" type="{http://datex2.eu/schema/2_0RC1/2_0}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="obstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obstruction", propOrder = {
    "numberOfObstructions",
    "mobilityOfObstruction",
    "obstructionExtension"
})
@XmlSeeAlso({
    AnimalPresenceObstruction.class,
    EnvironmentalObstruction.class,
    GeneralObstruction.class,
    InfrastructureDamageObstruction.class,
    VehicleObstruction.class
})
public abstract class Obstruction
    extends TrafficElement {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfObstructions;
    protected Mobility mobilityOfObstruction;
    protected ExtensionType obstructionExtension;

    /**
     * Ruft den Wert der numberOfObstructions-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfObstructions() {
        return numberOfObstructions;
    }

    /**
     * Legt den Wert der numberOfObstructions-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfObstructions(BigInteger value) {
        this.numberOfObstructions = value;
    }

    /**
     * Ruft den Wert der mobilityOfObstruction-Eigenschaft ab.
     *
     * @return possible object is {@link Mobility }
     */
    public Mobility getMobilityOfObstruction() {
        return mobilityOfObstruction;
    }

    /**
     * Legt den Wert der mobilityOfObstruction-Eigenschaft fest.
     *
     * @param value allowed object is {@link Mobility }
     */
    public void setMobilityOfObstruction(Mobility value) {
        this.mobilityOfObstruction = value;
    }

    /**
     * Ruft den Wert der obstructionExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getObstructionExtension() {
        return obstructionExtension;
    }

    /**
     * Legt den Wert der obstructionExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setObstructionExtension(ExtensionType value) {
        this.obstructionExtension = value;
    }

    public Obstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    public Obstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    public Obstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public Obstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public Obstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public Obstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public Obstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public Obstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public Obstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public Obstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public Obstruction withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Obstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Obstruction withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Obstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Obstruction withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public Obstruction withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public Obstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public Obstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public Obstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public Obstruction withId(String value) {
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
