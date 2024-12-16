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
 * <p>Java-Klasse für EnvironmentalObstruction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depth" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="environmentalObstructionType" type="{http://datex2.eu/schema/2_0RC1/2_0}EnvironmentalObstructionTypeEnum"/&gt;
 *         &lt;element name="environmentalObstructionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalObstruction", propOrder = {
    "depth",
    "environmentalObstructionType",
    "environmentalObstructionExtension"
})
public class EnvironmentalObstruction
    extends Obstruction
{

    protected Float depth;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EnvironmentalObstructionTypeEnum environmentalObstructionType;
    protected ExtensionType environmentalObstructionExtension;

    /**
     * Ruft den Wert der depth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDepth() {
        return depth;
    }

    /**
     * Legt den Wert der depth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDepth(Float value) {
        this.depth = value;
    }

    /**
     * Ruft den Wert der environmentalObstructionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public EnvironmentalObstructionTypeEnum getEnvironmentalObstructionType() {
        return environmentalObstructionType;
    }

    /**
     * Legt den Wert der environmentalObstructionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalObstructionTypeEnum }
     *     
     */
    public void setEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        this.environmentalObstructionType = value;
    }

    /**
     * Ruft den Wert der environmentalObstructionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnvironmentalObstructionExtension() {
        return environmentalObstructionExtension;
    }

    /**
     * Legt den Wert der environmentalObstructionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnvironmentalObstructionExtension(ExtensionType value) {
        this.environmentalObstructionExtension = value;
    }

    public EnvironmentalObstruction withDepth(Float value) {
        setDepth(value);
        return this;
    }

    public EnvironmentalObstruction withEnvironmentalObstructionType(EnvironmentalObstructionTypeEnum value) {
        setEnvironmentalObstructionType(value);
        return this;
    }

    public EnvironmentalObstruction withEnvironmentalObstructionExtension(ExtensionType value) {
        setEnvironmentalObstructionExtension(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withNumberOfObstructions(BigInteger value) {
        setNumberOfObstructions(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withMobilityOfObstruction(Mobility value) {
        setMobilityOfObstruction(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withObstructionExtension(ExtensionType value) {
        setObstructionExtension(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public EnvironmentalObstruction withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public EnvironmentalObstruction withId(String value) {
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
