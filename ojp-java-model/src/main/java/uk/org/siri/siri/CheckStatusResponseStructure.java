//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Duration;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for Service Status Check Response.
 *
 * <p>Java-Klasse für CheckStatusResponseStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CheckStatusResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProducerResponseEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DelegatorEndpointGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResponseStructure", propOrder = {
    "producerRef",
    "address",
    "responseMessageIdentifier",
    "requestMessageRef",
    "delegatorAddress",
    "delegatorRef",
    "status",
    "dataReady",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime",
    "extensions"
})
public class CheckStatusResponseStructure
    extends ResponseStructure {

    @XmlElement(name = "ProducerRef")
    protected ParticipantRefStructure producerRef;
    @XmlElement(name = "Address")
    @XmlSchemaType(name = "anyURI")
    protected String address;
    @XmlElement(name = "ResponseMessageIdentifier")
    protected MessageQualifierStructure responseMessageIdentifier;
    @XmlElement(name = "RequestMessageRef")
    protected MessageRefStructure requestMessageRef;
    @XmlElement(name = "DelegatorAddress")
    @XmlSchemaType(name = "anyURI")
    protected String delegatorAddress;
    @XmlElement(name = "DelegatorRef")
    protected ParticipantRefStructure delegatorRef;
    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "DataReady")
    protected Boolean dataReady;
    @XmlElement(name = "ErrorCondition")
    protected uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
    @XmlElement(name = "ValidUntil", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration shortestPossibleCycle;
    @XmlElement(name = "ServiceStartedTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime serviceStartedTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der producerRef-Eigenschaft ab.
     *
     * @return possible object is {@link ParticipantRefStructure }
     */
    public ParticipantRefStructure getProducerRef() {
        return producerRef;
    }

    /**
     * Legt den Wert der producerRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ParticipantRefStructure }
     */
    public void setProducerRef(ParticipantRefStructure value) {
        this.producerRef = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der responseMessageIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link MessageQualifierStructure }
     */
    public MessageQualifierStructure getResponseMessageIdentifier() {
        return responseMessageIdentifier;
    }

    /**
     * Legt den Wert der responseMessageIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link MessageQualifierStructure }
     */
    public void setResponseMessageIdentifier(MessageQualifierStructure value) {
        this.responseMessageIdentifier = value;
    }

    /**
     * Ruft den Wert der requestMessageRef-Eigenschaft ab.
     *
     * @return possible object is {@link MessageRefStructure }
     */
    public MessageRefStructure getRequestMessageRef() {
        return requestMessageRef;
    }

    /**
     * Legt den Wert der requestMessageRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link MessageRefStructure }
     */
    public void setRequestMessageRef(MessageRefStructure value) {
        this.requestMessageRef = value;
    }

    /**
     * Ruft den Wert der delegatorAddress-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDelegatorAddress() {
        return delegatorAddress;
    }

    /**
     * Legt den Wert der delegatorAddress-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDelegatorAddress(String value) {
        this.delegatorAddress = value;
    }

    /**
     * Ruft den Wert der delegatorRef-Eigenschaft ab.
     *
     * @return possible object is {@link ParticipantRefStructure }
     */
    public ParticipantRefStructure getDelegatorRef() {
        return delegatorRef;
    }

    /**
     * Legt den Wert der delegatorRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ParticipantRefStructure }
     */
    public void setDelegatorRef(ParticipantRefStructure value) {
        this.delegatorRef = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der dataReady-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDataReady() {
        return dataReady;
    }

    /**
     * Legt den Wert der dataReady-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDataReady(Boolean value) {
        this.dataReady = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is {@link uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition }
     */
    public uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition }
     */
    public void setErrorCondition(uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der validUntil-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Legt den Wert der validUntil-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValidUntil(ZonedDateTime value) {
        this.validUntil = value;
    }

    /**
     * Ruft den Wert der shortestPossibleCycle-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Legt den Wert der shortestPossibleCycle-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    /**
     * Ruft den Wert der serviceStartedTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getServiceStartedTime() {
        return serviceStartedTime;
    }

    /**
     * Legt den Wert der serviceStartedTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setServiceStartedTime(ZonedDateTime value) {
        this.serviceStartedTime = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public CheckStatusResponseStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    public CheckStatusResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    public CheckStatusResponseStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    public CheckStatusResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    public CheckStatusResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    public CheckStatusResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    public CheckStatusResponseStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public CheckStatusResponseStructure withDataReady(Boolean value) {
        setDataReady(value);
        return this;
    }

    public CheckStatusResponseStructure withErrorCondition(uk.org.siri.siri.CheckStatusResponseBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public CheckStatusResponseStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    public CheckStatusResponseStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    public CheckStatusResponseStructure withServiceStartedTime(ZonedDateTime value) {
        setServiceStartedTime(value);
        return this;
    }

    public CheckStatusResponseStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public CheckStatusResponseStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
