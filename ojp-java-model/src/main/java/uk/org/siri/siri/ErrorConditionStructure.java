//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import de.vdv.ojp.v2.model.OJPErrorStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for RequestErrorCondition.
 *
 * <p>Java-Klasse für ErrorConditionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ErrorConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ApplicationErrorGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorConditionStructure", propOrder = {
    "serviceNotAvailableError",
    "capabilityNotSupportedError",
    "accessNotAllowedError",
    "invalidDataReferencesError",
    "beyondDataHorizon",
    "noInfoForTopicError",
    "parametersIgnoredError",
    "unknownExtensionsError",
    "allowedResourceUsageExceededError",
    "otherError",
    "description"
})
public class ErrorConditionStructure {

    @XmlElement(name = "ServiceNotAvailableError")
    protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
    @XmlElement(name = "CapabilityNotSupportedError")
    protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
    @XmlElement(name = "AccessNotAllowedError")
    protected AccessNotAllowedErrorStructure accessNotAllowedError;
    @XmlElement(name = "InvalidDataReferencesError")
    protected InvalidDataReferencesErrorStructure invalidDataReferencesError;
    @XmlElement(name = "BeyondDataHorizon")
    protected BeyondDataHorizonErrorStructure beyondDataHorizon;
    @XmlElement(name = "NoInfoForTopicError")
    protected NoInfoForTopicErrorStructure noInfoForTopicError;
    @XmlElement(name = "ParametersIgnoredError")
    protected ParametersIgnoredErrorStructure parametersIgnoredError;
    @XmlElement(name = "UnknownExtensionsError")
    protected UnknownExtensionsErrorStructure unknownExtensionsError;
    @XmlElement(name = "AllowedResourceUsageExceededError")
    protected AllowedResourceUsageExceededErrorStructure allowedResourceUsageExceededError;
    @XmlElementRef(name = "OtherError", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends OtherErrorStructure> otherError;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;

    /**
     * Ruft den Wert der serviceNotAvailableError-Eigenschaft ab.
     *
     * @return possible object is {@link ServiceNotAvailableErrorStructure }
     */
    public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
        return serviceNotAvailableError;
    }

    /**
     * Legt den Wert der serviceNotAvailableError-Eigenschaft fest.
     *
     * @param value allowed object is {@link ServiceNotAvailableErrorStructure }
     */
    public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        this.serviceNotAvailableError = value;
    }

    /**
     * Ruft den Wert der capabilityNotSupportedError-Eigenschaft ab.
     *
     * @return possible object is {@link CapabilityNotSupportedErrorStructure }
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Legt den Wert der capabilityNotSupportedError-Eigenschaft fest.
     *
     * @param value allowed object is {@link CapabilityNotSupportedErrorStructure }
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Ruft den Wert der accessNotAllowedError-Eigenschaft ab.
     *
     * @return possible object is {@link AccessNotAllowedErrorStructure }
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Legt den Wert der accessNotAllowedError-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessNotAllowedErrorStructure }
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Ruft den Wert der invalidDataReferencesError-Eigenschaft ab.
     *
     * @return possible object is {@link InvalidDataReferencesErrorStructure }
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Legt den Wert der invalidDataReferencesError-Eigenschaft fest.
     *
     * @param value allowed object is {@link InvalidDataReferencesErrorStructure }
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    /**
     * Error: Data period or subscription period is outside of period covered by service.   (since SIRI 2.0).
     *
     * @return possible object is {@link BeyondDataHorizonErrorStructure }
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Legt den Wert der beyondDataHorizon-Eigenschaft fest.
     *
     * @param value allowed object is {@link BeyondDataHorizonErrorStructure }
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    /**
     * Ruft den Wert der noInfoForTopicError-Eigenschaft ab.
     *
     * @return possible object is {@link NoInfoForTopicErrorStructure }
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Legt den Wert der noInfoForTopicError-Eigenschaft fest.
     *
     * @param value allowed object is {@link NoInfoForTopicErrorStructure }
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Ruft den Wert der parametersIgnoredError-Eigenschaft ab.
     *
     * @return possible object is {@link ParametersIgnoredErrorStructure }
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Legt den Wert der parametersIgnoredError-Eigenschaft fest.
     *
     * @param value allowed object is {@link ParametersIgnoredErrorStructure }
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    /**
     * Error: Request contained extensions that were not supported by the producer. A response has been provided but some or all extensions have been ignored.  (since SIRI 2.0).
     *
     * @return possible object is {@link UnknownExtensionsErrorStructure }
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Legt den Wert der unknownExtensionsError-Eigenschaft fest.
     *
     * @param value allowed object is {@link UnknownExtensionsErrorStructure }
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    /**
     * Ruft den Wert der allowedResourceUsageExceededError-Eigenschaft ab.
     *
     * @return possible object is {@link AllowedResourceUsageExceededErrorStructure }
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Legt den Wert der allowedResourceUsageExceededError-Eigenschaft fest.
     *
     * @param value allowed object is {@link AllowedResourceUsageExceededErrorStructure }
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Ruft den Wert der otherError-Eigenschaft ab.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >} {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     */
    public JAXBElement<? extends OtherErrorStructure> getOtherError() {
        return otherError;
    }

    /**
     * Legt den Wert der otherError-Eigenschaft fest.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >} {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     */
    public void setOtherError(JAXBElement<? extends OtherErrorStructure> value) {
        this.otherError = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    public ErrorConditionStructure withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        setServiceNotAvailableError(value);
        return this;
    }

    public ErrorConditionStructure withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        setCapabilityNotSupportedError(value);
        return this;
    }

    public ErrorConditionStructure withAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        setAccessNotAllowedError(value);
        return this;
    }

    public ErrorConditionStructure withInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        setInvalidDataReferencesError(value);
        return this;
    }

    public ErrorConditionStructure withBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        setBeyondDataHorizon(value);
        return this;
    }

    public ErrorConditionStructure withNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        setNoInfoForTopicError(value);
        return this;
    }

    public ErrorConditionStructure withParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        setParametersIgnoredError(value);
        return this;
    }

    public ErrorConditionStructure withUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        setUnknownExtensionsError(value);
        return this;
    }

    public ErrorConditionStructure withAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        setAllowedResourceUsageExceededError(value);
        return this;
    }

    public ErrorConditionStructure withOtherError(JAXBElement<? extends OtherErrorStructure> value) {
        setOtherError(value);
        return this;
    }

    public ErrorConditionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
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
