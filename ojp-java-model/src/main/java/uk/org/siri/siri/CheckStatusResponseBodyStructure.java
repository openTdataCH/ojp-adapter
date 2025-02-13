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
 * Same as CheckStatusResponseStructure, but without extension to be consistent with the other operation definition.
 *
 * <p>Java-Klasse für CheckStatusResponseBodyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CheckStatusResponseBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CheckStatusPayloadGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckStatusResponseBodyStructure", propOrder = {
    "status",
    "dataReady",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle",
    "serviceStartedTime"
})
public class CheckStatusResponseBodyStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "DataReady")
    protected Boolean dataReady;
    @XmlElement(name = "ErrorCondition")
    protected CheckStatusResponseBodyStructure.ErrorCondition errorCondition;
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
     * @return possible object is {@link CheckStatusResponseBodyStructure.ErrorCondition }
     */
    public CheckStatusResponseBodyStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link CheckStatusResponseBodyStructure.ErrorCondition }
     */
    public void setErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
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

    public CheckStatusResponseBodyStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withDataReady(Boolean value) {
        setDataReady(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withErrorCondition(CheckStatusResponseBodyStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    public CheckStatusResponseBodyStructure withServiceStartedTime(ZonedDateTime value) {
        setServiceStartedTime(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}ServiceNotAvailableError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}ErrorDescriptionStructure" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceNotAvailableError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "ServiceNotAvailableError")
        protected ServiceNotAvailableErrorStructure serviceNotAvailableError;
        @XmlElementRef(name = "OtherError", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends OtherErrorStructure> otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

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
         * @return possible object is {@link ErrorDescriptionStructure }
         */
        public ErrorDescriptionStructure getDescription() {
            return description;
        }

        /**
         * Legt den Wert der description-Eigenschaft fest.
         *
         * @param value allowed object is {@link ErrorDescriptionStructure }
         */
        public void setDescription(ErrorDescriptionStructure value) {
            this.description = value;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withServiceNotAvailableError(ServiceNotAvailableErrorStructure value) {
            setServiceNotAvailableError(value);
            return this;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withOtherError(JAXBElement<? extends OtherErrorStructure> value) {
            setOtherError(value);
            return this;
        }

        public CheckStatusResponseBodyStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
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

}
