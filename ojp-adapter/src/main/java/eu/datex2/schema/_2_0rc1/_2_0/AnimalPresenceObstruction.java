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
 * <p>Java-Klasse für AnimalPresenceObstruction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnimalPresenceObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alive" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="animalPresenceType" type="{http://datex2.eu/schema/2_0RC1/2_0}AnimalPresenceTypeEnum"/&gt;
 *         &lt;element name="animalPresenceObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalPresenceObstruction", propOrder = {
    "alive",
    "animalPresenceType",
    "animalPresenceObstructionExtension"
})
public class AnimalPresenceObstruction
    extends Obstruction
{

    protected Boolean alive;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AnimalPresenceTypeEnum animalPresenceType;
    protected ExtensionType animalPresenceObstructionExtension;

    /**
     * Ruft den Wert der alive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlive() {
        return alive;
    }

    /**
     * Legt den Wert der alive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlive(Boolean value) {
        this.alive = value;
    }

    /**
     * Ruft den Wert der animalPresenceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Legt den Wert der animalPresenceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    /**
     * Ruft den Wert der animalPresenceObstructionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAnimalPresenceObstructionExtension() {
        return animalPresenceObstructionExtension;
    }

    /**
     * Legt den Wert der animalPresenceObstructionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAnimalPresenceObstructionExtension(ExtensionType value) {
        this.animalPresenceObstructionExtension = value;
    }

    public AnimalPresenceObstruction withAlive(Boolean value) {
        setAlive(value);
        return this;
    }

    public AnimalPresenceObstruction withAnimalPresenceType(AnimalPresenceTypeEnum value) {
        setAnimalPresenceType(value);
        return this;
    }

    public AnimalPresenceObstruction withAnimalPresenceObstructionExtension(ExtensionType value) {
        setAnimalPresenceObstructionExtension(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public AnimalPresenceObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public AnimalPresenceObstruction withId(String value) {
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
