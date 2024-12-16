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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für MatrixSignSetting complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MatrixSignSetting"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}SignSetting"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aspectDisplayed" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="matrixFault" type="{http://datex2.eu/schema/2_0RC1/2_0}MatrixFaultEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="matrixIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="matrixSignSettingExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixSignSetting", propOrder = {
    "aspectDisplayed",
    "matrixFault",
    "matrixIdentifier",
    "matrixSignSettingExtension"
})
public class MatrixSignSetting
    extends SignSetting
{

    @XmlElement(required = true)
    protected String aspectDisplayed;
    @XmlSchemaType(name = "string")
    protected List<MatrixFaultEnum> matrixFault;
    @XmlElement(required = true)
    protected String matrixIdentifier;
    protected ExtensionType matrixSignSettingExtension;

    /**
     * Ruft den Wert der aspectDisplayed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectDisplayed() {
        return aspectDisplayed;
    }

    /**
     * Legt den Wert der aspectDisplayed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectDisplayed(String value) {
        this.aspectDisplayed = value;
    }

    /**
     * Gets the value of the matrixFault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the matrixFault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatrixFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatrixFaultEnum }
     * 
     * 
     */
    public List<MatrixFaultEnum> getMatrixFault() {
        if (matrixFault == null) {
            matrixFault = new ArrayList<MatrixFaultEnum>();
        }
        return this.matrixFault;
    }

    /**
     * Ruft den Wert der matrixIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixIdentifier() {
        return matrixIdentifier;
    }

    /**
     * Legt den Wert der matrixIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixIdentifier(String value) {
        this.matrixIdentifier = value;
    }

    /**
     * Ruft den Wert der matrixSignSettingExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMatrixSignSettingExtension() {
        return matrixSignSettingExtension;
    }

    /**
     * Legt den Wert der matrixSignSettingExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMatrixSignSettingExtension(ExtensionType value) {
        this.matrixSignSettingExtension = value;
    }

    public MatrixSignSetting withAspectDisplayed(String value) {
        setAspectDisplayed(value);
        return this;
    }

    public MatrixSignSetting withMatrixFault(MatrixFaultEnum... values) {
        if (values!= null) {
            for (MatrixFaultEnum value: values) {
                getMatrixFault().add(value);
            }
        }
        return this;
    }

    public MatrixSignSetting withMatrixFault(Collection<MatrixFaultEnum> values) {
        if (values!= null) {
            getMatrixFault().addAll(values);
        }
        return this;
    }

    public MatrixSignSetting withMatrixIdentifier(String value) {
        setMatrixIdentifier(value);
        return this;
    }

    public MatrixSignSetting withMatrixSignSettingExtension(ExtensionType value) {
        setMatrixSignSettingExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withDatexPictogram(DatexPictogramEnum... values) {
        if (values!= null) {
            for (DatexPictogramEnum value: values) {
                getDatexPictogram().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withDatexPictogram(Collection<DatexPictogramEnum> values) {
        if (values!= null) {
            getDatexPictogram().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramList(String value) {
        setPictogramList(value);
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramListEntry(String... values) {
        if (values!= null) {
            for (String value: values) {
                getPictogramListEntry().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withPictogramListEntry(Collection<String> values) {
        if (values!= null) {
            getPictogramListEntry().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withReasonForSetting(MultilingualString value) {
        setReasonForSetting(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSetBy(MultilingualString value) {
        setSetBy(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSignAddress(String value) {
        setSignAddress(value);
        return this;
    }

    @Override
    public MatrixSignSetting withTimeLastSet(ZonedDateTime value) {
        setTimeLastSet(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSignSettingExtension(ExtensionType value) {
        setSignSettingExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withActionOrigin(OperatorActionOriginEnum value) {
        setActionOrigin(value);
        return this;
    }

    @Override
    public MatrixSignSetting withOperatorActionStatus(OperatorActionStatusEnum value) {
        setOperatorActionStatus(value);
        return this;
    }

    @Override
    public MatrixSignSetting withOperatorActionExtension(ExtensionType value) {
        setOperatorActionExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public MatrixSignSetting withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public MatrixSignSetting withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public MatrixSignSetting withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public MatrixSignSetting withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public MatrixSignSetting withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public MatrixSignSetting withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public MatrixSignSetting withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public MatrixSignSetting withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public MatrixSignSetting withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public MatrixSignSetting withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public MatrixSignSetting withId(String value) {
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
