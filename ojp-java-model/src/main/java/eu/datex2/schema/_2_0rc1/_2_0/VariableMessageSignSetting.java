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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für VariableMessageSignSetting complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VariableMessageSignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SignSetting"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfCharacters" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfRows" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vmsFault" type="{http://datex2.eu/schema/2_0RC1/2_0}VmsFaultEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="vmsLegend" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="vmsType" type="{http://datex2.eu/schema/2_0RC1/2_0}VmsTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="variableMessageSignSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableMessageSignSetting", propOrder = {
    "numberOfCharacters",
    "numberOfRows",
    "vmsFault",
    "vmsIdentifier",
    "vmsLegend",
    "vmsType",
    "variableMessageSignSettingExtension"
})
public class VariableMessageSignSetting
    extends SignSetting {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfCharacters;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfRows;
    @XmlSchemaType(name = "string")
    protected List<VmsFaultEnum> vmsFault;
    protected String vmsIdentifier;
    protected List<MultilingualString> vmsLegend;
    @XmlSchemaType(name = "string")
    protected VmsTypeEnum vmsType;
    protected ExtensionType variableMessageSignSettingExtension;

    /**
     * Ruft den Wert der numberOfCharacters-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfCharacters() {
        return numberOfCharacters;
    }

    /**
     * Legt den Wert der numberOfCharacters-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfCharacters(BigInteger value) {
        this.numberOfCharacters = value;
    }

    /**
     * Ruft den Wert der numberOfRows-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfRows() {
        return numberOfRows;
    }

    /**
     * Legt den Wert der numberOfRows-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfRows(BigInteger value) {
        this.numberOfRows = value;
    }

    /**
     * Gets the value of the vmsFault property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vmsFault property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsFault().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VmsFaultEnum }
     */
    public List<VmsFaultEnum> getVmsFault() {
        if (vmsFault == null) {
            vmsFault = new ArrayList<VmsFaultEnum>();
        }
        return this.vmsFault;
    }

    /**
     * Ruft den Wert der vmsIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getVmsIdentifier() {
        return vmsIdentifier;
    }

    /**
     * Legt den Wert der vmsIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setVmsIdentifier(String value) {
        this.vmsIdentifier = value;
    }

    /**
     * Gets the value of the vmsLegend property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vmsLegend property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsLegend().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link MultilingualString }
     */
    public List<MultilingualString> getVmsLegend() {
        if (vmsLegend == null) {
            vmsLegend = new ArrayList<MultilingualString>();
        }
        return this.vmsLegend;
    }

    /**
     * Ruft den Wert der vmsType-Eigenschaft ab.
     *
     * @return possible object is {@link VmsTypeEnum }
     */
    public VmsTypeEnum getVmsType() {
        return vmsType;
    }

    /**
     * Legt den Wert der vmsType-Eigenschaft fest.
     *
     * @param value allowed object is {@link VmsTypeEnum }
     */
    public void setVmsType(VmsTypeEnum value) {
        this.vmsType = value;
    }

    /**
     * Ruft den Wert der variableMessageSignSettingExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getVariableMessageSignSettingExtension() {
        return variableMessageSignSettingExtension;
    }

    /**
     * Legt den Wert der variableMessageSignSettingExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setVariableMessageSignSettingExtension(ExtensionType value) {
        this.variableMessageSignSettingExtension = value;
    }

    public VariableMessageSignSetting withNumberOfCharacters(BigInteger value) {
        setNumberOfCharacters(value);
        return this;
    }

    public VariableMessageSignSetting withNumberOfRows(BigInteger value) {
        setNumberOfRows(value);
        return this;
    }

    public VariableMessageSignSetting withVmsFault(VmsFaultEnum... values) {
        if (values != null) {
            for (VmsFaultEnum value : values) {
                getVmsFault().add(value);
            }
        }
        return this;
    }

    public VariableMessageSignSetting withVmsFault(Collection<VmsFaultEnum> values) {
        if (values != null) {
            getVmsFault().addAll(values);
        }
        return this;
    }

    public VariableMessageSignSetting withVmsIdentifier(String value) {
        setVmsIdentifier(value);
        return this;
    }

    public VariableMessageSignSetting withVmsLegend(MultilingualString... values) {
        if (values != null) {
            for (MultilingualString value : values) {
                getVmsLegend().add(value);
            }
        }
        return this;
    }

    public VariableMessageSignSetting withVmsLegend(Collection<MultilingualString> values) {
        if (values != null) {
            getVmsLegend().addAll(values);
        }
        return this;
    }

    public VariableMessageSignSetting withVmsType(VmsTypeEnum value) {
        setVmsType(value);
        return this;
    }

    public VariableMessageSignSetting withVariableMessageSignSettingExtension(ExtensionType value) {
        setVariableMessageSignSettingExtension(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withDatexPictogram(DatexPictogramEnum... values) {
        if (values != null) {
            for (DatexPictogramEnum value : values) {
                getDatexPictogram().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withDatexPictogram(Collection<DatexPictogramEnum> values) {
        if (values != null) {
            getDatexPictogram().addAll(values);
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withPictogramList(String value) {
        setPictogramList(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withPictogramListEntry(String... values) {
        if (values != null) {
            for (String value : values) {
                getPictogramListEntry().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withPictogramListEntry(Collection<String> values) {
        if (values != null) {
            getPictogramListEntry().addAll(values);
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withReasonForSetting(MultilingualString value) {
        setReasonForSetting(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSetBy(MultilingualString value) {
        setSetBy(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSignAddress(String value) {
        setSignAddress(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withTimeLastSet(ZonedDateTime value) {
        setTimeLastSet(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSignSettingExtension(ExtensionType value) {
        setSignSettingExtension(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public VariableMessageSignSetting withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public VariableMessageSignSetting withId(String value) {
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
