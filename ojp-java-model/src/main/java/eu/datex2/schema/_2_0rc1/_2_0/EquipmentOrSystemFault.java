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
 * <p>Java-Klasse für EquipmentOrSystemFault complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EquipmentOrSystemFault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="equipmentOrSystemFaultType" type="{http://datex2.eu/schema/2_0RC1/2_0}EquipmentOrSystemFaultTypeEnum"/&gt;
 *         &lt;element name="faultyEquipmentOrSystemType" type="{http://datex2.eu/schema/2_0RC1/2_0}EquipmentOrSystemTypeEnum"/&gt;
 *         &lt;element name="equipmentOrSystemFaultExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentOrSystemFault", propOrder = {
    "equipmentOrSystemFaultType",
    "faultyEquipmentOrSystemType",
    "equipmentOrSystemFaultExtension"
})
public class EquipmentOrSystemFault
    extends TrafficElement {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EquipmentOrSystemFaultTypeEnum equipmentOrSystemFaultType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected EquipmentOrSystemTypeEnum faultyEquipmentOrSystemType;
    protected ExtensionType equipmentOrSystemFaultExtension;

    /**
     * Ruft den Wert der equipmentOrSystemFaultType-Eigenschaft ab.
     *
     * @return possible object is {@link EquipmentOrSystemFaultTypeEnum }
     */
    public EquipmentOrSystemFaultTypeEnum getEquipmentOrSystemFaultType() {
        return equipmentOrSystemFaultType;
    }

    /**
     * Legt den Wert der equipmentOrSystemFaultType-Eigenschaft fest.
     *
     * @param value allowed object is {@link EquipmentOrSystemFaultTypeEnum }
     */
    public void setEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        this.equipmentOrSystemFaultType = value;
    }

    /**
     * Ruft den Wert der faultyEquipmentOrSystemType-Eigenschaft ab.
     *
     * @return possible object is {@link EquipmentOrSystemTypeEnum }
     */
    public EquipmentOrSystemTypeEnum getFaultyEquipmentOrSystemType() {
        return faultyEquipmentOrSystemType;
    }

    /**
     * Legt den Wert der faultyEquipmentOrSystemType-Eigenschaft fest.
     *
     * @param value allowed object is {@link EquipmentOrSystemTypeEnum }
     */
    public void setFaultyEquipmentOrSystemType(EquipmentOrSystemTypeEnum value) {
        this.faultyEquipmentOrSystemType = value;
    }

    /**
     * Ruft den Wert der equipmentOrSystemFaultExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getEquipmentOrSystemFaultExtension() {
        return equipmentOrSystemFaultExtension;
    }

    /**
     * Legt den Wert der equipmentOrSystemFaultExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setEquipmentOrSystemFaultExtension(ExtensionType value) {
        this.equipmentOrSystemFaultExtension = value;
    }

    public EquipmentOrSystemFault withEquipmentOrSystemFaultType(EquipmentOrSystemFaultTypeEnum value) {
        setEquipmentOrSystemFaultType(value);
        return this;
    }

    public EquipmentOrSystemFault withFaultyEquipmentOrSystemType(EquipmentOrSystemTypeEnum value) {
        setFaultyEquipmentOrSystemType(value);
        return this;
    }

    public EquipmentOrSystemFault withEquipmentOrSystemFaultExtension(ExtensionType value) {
        setEquipmentOrSystemFaultExtension(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public EquipmentOrSystemFault withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public EquipmentOrSystemFault withId(String value) {
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
