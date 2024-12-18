//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import de.vdv.ojp.release2.model.OJPErrorStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for Standard ErrorConditiosn for Service request.
 * 
 * <p>Java-Klasse für ServiceDeliveryErrorConditionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryErrorConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}ServiceRequestErrorGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryErrorConditionStructure", propOrder = {
    "unapprovedKeyAccessError",
    "unknownParticipantError",
    "unknownEndpointError",
    "endpointDeniedAccessError",
    "endpointNotAvailableAccessError",
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
public class ServiceDeliveryErrorConditionStructure {

    @XmlElement(name = "UnapprovedKeyAccessError")
    protected UnapprovedKeyAccessStructure unapprovedKeyAccessError;
    @XmlElement(name = "UnknownParticipantError")
    protected UnknownParticipantErrorStructure unknownParticipantError;
    @XmlElement(name = "UnknownEndpointError")
    protected UnknownEndpointErrorStructure unknownEndpointError;
    @XmlElement(name = "EndpointDeniedAccessError")
    protected EndpointDeniedAccessStructure endpointDeniedAccessError;
    @XmlElement(name = "EndpointNotAvailableAccessError")
    protected EndpointNotAvailableAccessStructure endpointNotAvailableAccessError;
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
    protected ErrorDescriptionStructure description;

    /**
     * Ruft den Wert der unapprovedKeyAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public UnapprovedKeyAccessStructure getUnapprovedKeyAccessError() {
        return unapprovedKeyAccessError;
    }

    /**
     * Legt den Wert der unapprovedKeyAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnapprovedKeyAccessStructure }
     *     
     */
    public void setUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        this.unapprovedKeyAccessError = value;
    }

    /**
     * Error: Recipient for a message to be distributed is unknown. I.e. delegatior is found, but  (since SIRI 2.0)
     * 
     * @return
     *     possible object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public UnknownParticipantErrorStructure getUnknownParticipantError() {
        return unknownParticipantError;
    }

    /**
     * Legt den Wert der unknownParticipantError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownParticipantErrorStructure }
     *     
     */
    public void setUnknownParticipantError(UnknownParticipantErrorStructure value) {
        this.unknownParticipantError = value;
    }

    /**
     * Ruft den Wert der unknownEndpointError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public UnknownEndpointErrorStructure getUnknownEndpointError() {
        return unknownEndpointError;
    }

    /**
     * Legt den Wert der unknownEndpointError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownEndpointErrorStructure }
     *     
     */
    public void setUnknownEndpointError(UnknownEndpointErrorStructure value) {
        this.unknownEndpointError = value;
    }

    /**
     * Ruft den Wert der endpointDeniedAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public EndpointDeniedAccessStructure getEndpointDeniedAccessError() {
        return endpointDeniedAccessError;
    }

    /**
     * Legt den Wert der endpointDeniedAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointDeniedAccessStructure }
     *     
     */
    public void setEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        this.endpointDeniedAccessError = value;
    }

    /**
     * Ruft den Wert der endpointNotAvailableAccessError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public EndpointNotAvailableAccessStructure getEndpointNotAvailableAccessError() {
        return endpointNotAvailableAccessError;
    }

    /**
     * Legt den Wert der endpointNotAvailableAccessError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EndpointNotAvailableAccessStructure }
     *     
     */
    public void setEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        this.endpointNotAvailableAccessError = value;
    }

    /**
     * Ruft den Wert der serviceNotAvailableError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public ServiceNotAvailableErrorStructure getServiceNotAvailableError() {
        return serviceNotAvailableError;
    }

    /**
     * Legt den Wert der serviceNotAvailableError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceNotAvailableErrorStructure }
     *     
     */
    public void setServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        this.serviceNotAvailableError = value;
    }

    /**
     * Ruft den Wert der capabilityNotSupportedError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public CapabilityNotSupportedErrorStructure getCapabilityNotSupportedError() {
        return capabilityNotSupportedError;
    }

    /**
     * Legt den Wert der capabilityNotSupportedError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CapabilityNotSupportedErrorStructure }
     *     
     */
    public void setCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        this.capabilityNotSupportedError = value;
    }

    /**
     * Ruft den Wert der accessNotAllowedError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public AccessNotAllowedErrorStructure getAccessNotAllowedError() {
        return accessNotAllowedError;
    }

    /**
     * Legt den Wert der accessNotAllowedError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessNotAllowedErrorStructure }
     *     
     */
    public void setAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        this.accessNotAllowedError = value;
    }

    /**
     * Ruft den Wert der invalidDataReferencesError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public InvalidDataReferencesErrorStructure getInvalidDataReferencesError() {
        return invalidDataReferencesError;
    }

    /**
     * Legt den Wert der invalidDataReferencesError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidDataReferencesErrorStructure }
     *     
     */
    public void setInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        this.invalidDataReferencesError = value;
    }

    /**
     * Error: Data period or subscription period is outside of period covered by service.   (since SIRI 2.0).
     * 
     * @return
     *     possible object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public BeyondDataHorizonErrorStructure getBeyondDataHorizon() {
        return beyondDataHorizon;
    }

    /**
     * Legt den Wert der beyondDataHorizon-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyondDataHorizonErrorStructure }
     *     
     */
    public void setBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        this.beyondDataHorizon = value;
    }

    /**
     * Ruft den Wert der noInfoForTopicError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public NoInfoForTopicErrorStructure getNoInfoForTopicError() {
        return noInfoForTopicError;
    }

    /**
     * Legt den Wert der noInfoForTopicError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NoInfoForTopicErrorStructure }
     *     
     */
    public void setNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        this.noInfoForTopicError = value;
    }

    /**
     * Ruft den Wert der parametersIgnoredError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public ParametersIgnoredErrorStructure getParametersIgnoredError() {
        return parametersIgnoredError;
    }

    /**
     * Legt den Wert der parametersIgnoredError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersIgnoredErrorStructure }
     *     
     */
    public void setParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        this.parametersIgnoredError = value;
    }

    /**
     * Error: Request contained extensions that were not supported by the producer. A response has been provided but some or all extensions have been ignored.  (since SIRI 2.0).
     * 
     * @return
     *     possible object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public UnknownExtensionsErrorStructure getUnknownExtensionsError() {
        return unknownExtensionsError;
    }

    /**
     * Legt den Wert der unknownExtensionsError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnknownExtensionsErrorStructure }
     *     
     */
    public void setUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        this.unknownExtensionsError = value;
    }

    /**
     * Ruft den Wert der allowedResourceUsageExceededError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public AllowedResourceUsageExceededErrorStructure getAllowedResourceUsageExceededError() {
        return allowedResourceUsageExceededError;
    }

    /**
     * Legt den Wert der allowedResourceUsageExceededError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowedResourceUsageExceededErrorStructure }
     *     
     */
    public void setAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        this.allowedResourceUsageExceededError = value;
    }

    /**
     * Ruft den Wert der otherError-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     *     
     */
    public JAXBElement<? extends OtherErrorStructure> getOtherError() {
        return otherError;
    }

    /**
     * Legt den Wert der otherError-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OJPErrorStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link OtherErrorStructure }{@code >}
     *     
     */
    public void setOtherError(JAXBElement<? extends OtherErrorStructure> value) {
        this.otherError = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public ErrorDescriptionStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDescriptionStructure }
     *     
     */
    public void setDescription(ErrorDescriptionStructure value) {
        this.description = value;
    }

    public ServiceDeliveryErrorConditionStructure withUnapprovedKeyAccessError(UnapprovedKeyAccessStructure value) {
        setUnapprovedKeyAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownParticipantError(UnknownParticipantErrorStructure value) {
        setUnknownParticipantError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownEndpointError(UnknownEndpointErrorStructure value) {
        setUnknownEndpointError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withEndpointDeniedAccessError(EndpointDeniedAccessStructure value) {
        setEndpointDeniedAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withEndpointNotAvailableAccessError(EndpointNotAvailableAccessStructure value) {
        setEndpointNotAvailableAccessError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
        setServiceNotAvailableError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
        setCapabilityNotSupportedError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withAccessNotAllowedError(AccessNotAllowedErrorStructure value) {
        setAccessNotAllowedError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withInvalidDataReferencesError(InvalidDataReferencesErrorStructure value) {
        setInvalidDataReferencesError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withBeyondDataHorizon(BeyondDataHorizonErrorStructure value) {
        setBeyondDataHorizon(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withNoInfoForTopicError(NoInfoForTopicErrorStructure value) {
        setNoInfoForTopicError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withParametersIgnoredError(ParametersIgnoredErrorStructure value) {
        setParametersIgnoredError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withUnknownExtensionsError(UnknownExtensionsErrorStructure value) {
        setUnknownExtensionsError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withAllowedResourceUsageExceededError(AllowedResourceUsageExceededErrorStructure value) {
        setAllowedResourceUsageExceededError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withOtherError(JAXBElement<? extends OtherErrorStructure> value) {
        setOtherError(value);
        return this;
    }

    public ServiceDeliveryErrorConditionStructure withDescription(ErrorDescriptionStructure value) {
        setDescription(value);
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