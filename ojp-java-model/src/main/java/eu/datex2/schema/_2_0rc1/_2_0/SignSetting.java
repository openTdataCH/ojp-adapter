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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * <p>Java-Klasse für SignSetting complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}OperatorAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datexPictogram" type="{http://datex2.eu/schema/2_0RC1/2_0}DatexPictogramEnum" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="pictogramList" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="pictogramListEntry" type="{http://datex2.eu/schema/2_0RC1/2_0}String" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="reasonForSetting" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="setBy" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="signAddress" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="timeLastSet" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "datexPictogram",
    "pictogramList",
    "pictogramListEntry",
    "reasonForSetting",
    "setBy",
    "signAddress",
    "timeLastSet",
    "signSettingExtension"
})
@XmlSeeAlso({
    MatrixSignSetting.class,
    VariableMessageSignSetting.class
})
public abstract class SignSetting
    extends OperatorAction {

    @XmlSchemaType(name = "string")
    protected List<DatexPictogramEnum> datexPictogram;
    protected String pictogramList;
    protected List<String> pictogramListEntry;
    protected MultilingualString reasonForSetting;
    protected MultilingualString setBy;
    protected String signAddress;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeLastSet;
    protected ExtensionType signSettingExtension;

    /**
     * Gets the value of the datexPictogram property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the datexPictogram property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatexPictogram().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DatexPictogramEnum }
     */
    public List<DatexPictogramEnum> getDatexPictogram() {
        if (datexPictogram == null) {
            datexPictogram = new ArrayList<DatexPictogramEnum>();
        }
        return this.datexPictogram;
    }

    /**
     * Ruft den Wert der pictogramList-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPictogramList() {
        return pictogramList;
    }

    /**
     * Legt den Wert der pictogramList-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPictogramList(String value) {
        this.pictogramList = value;
    }

    /**
     * Gets the value of the pictogramListEntry property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the pictogramListEntry property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramListEntry().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getPictogramListEntry() {
        if (pictogramListEntry == null) {
            pictogramListEntry = new ArrayList<String>();
        }
        return this.pictogramListEntry;
    }

    /**
     * Ruft den Wert der reasonForSetting-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getReasonForSetting() {
        return reasonForSetting;
    }

    /**
     * Legt den Wert der reasonForSetting-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setReasonForSetting(MultilingualString value) {
        this.reasonForSetting = value;
    }

    /**
     * Ruft den Wert der setBy-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getSetBy() {
        return setBy;
    }

    /**
     * Legt den Wert der setBy-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setSetBy(MultilingualString value) {
        this.setBy = value;
    }

    /**
     * Ruft den Wert der signAddress-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSignAddress() {
        return signAddress;
    }

    /**
     * Legt den Wert der signAddress-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSignAddress(String value) {
        this.signAddress = value;
    }

    /**
     * Ruft den Wert der timeLastSet-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getTimeLastSet() {
        return timeLastSet;
    }

    /**
     * Legt den Wert der timeLastSet-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeLastSet(ZonedDateTime value) {
        this.timeLastSet = value;
    }

    /**
     * Ruft den Wert der signSettingExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Legt den Wert der signSettingExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

    public SignSetting withDatexPictogram(DatexPictogramEnum... values) {
        if (values != null) {
            for (DatexPictogramEnum value : values) {
                getDatexPictogram().add(value);
            }
        }
        return this;
    }

    public SignSetting withDatexPictogram(Collection<DatexPictogramEnum> values) {
        if (values != null) {
            getDatexPictogram().addAll(values);
        }
        return this;
    }

    public SignSetting withPictogramList(String value) {
        setPictogramList(value);
        return this;
    }

    public SignSetting withPictogramListEntry(String... values) {
        if (values != null) {
            for (String value : values) {
                getPictogramListEntry().add(value);
            }
        }
        return this;
    }

    public SignSetting withPictogramListEntry(Collection<String> values) {
        if (values != null) {
            getPictogramListEntry().addAll(values);
        }
        return this;
    }

    public SignSetting withReasonForSetting(MultilingualString value) {
        setReasonForSetting(value);
        return this;
    }

    public SignSetting withSetBy(MultilingualString value) {
        setSetBy(value);
        return this;
    }

    public SignSetting withSignAddress(String value) {
        setSignAddress(value);
        return this;
    }

    public SignSetting withTimeLastSet(ZonedDateTime value) {
        setTimeLastSet(value);
        return this;
    }

    public SignSetting withSignSettingExtension(ExtensionType value) {
        setSignSettingExtension(value);
        return this;
    }

    @Override
    public SignSetting withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public SignSetting withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public SignSetting withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public SignSetting withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public SignSetting withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public SignSetting withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public SignSetting withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public SignSetting withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public SignSetting withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public SignSetting withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public SignSetting withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public SignSetting withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public SignSetting withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public SignSetting withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public SignSetting withId(String value) {
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
