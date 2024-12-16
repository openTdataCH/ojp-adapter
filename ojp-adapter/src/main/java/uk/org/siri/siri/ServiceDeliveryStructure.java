//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import de.vdv.ojp.release2.model.OJPAvailabilityDeliveryStructure;
import de.vdv.ojp.release2.model.OJPErrorStructure;
import de.vdv.ojp.release2.model.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.release2.model.OJPFareDeliveryStructure;
import de.vdv.ojp.release2.model.OJPLineInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.release2.model.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStatusDeliveryStructure;
import de.vdv.ojp.release2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripChangeDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.release2.model.OJPTripRefineDeliveryStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for SIRI Service Delivery.
 * 
 * <p>Java-Klasse für ServiceDeliveryStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryStructure", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "abstractFunctionalServiceDelivery"
})
@XmlSeeAlso({
    ServiceDelivery.class
})
public class ServiceDeliveryStructure
    extends ProducerResponseStructure
{

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryStructure.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", defaultValue = "false")
    protected Boolean moreData;
    @XmlElementRef(name = "AbstractFunctionalServiceDelivery", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractServiceDeliveryStructure>> abstractFunctionalServiceDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryStructure.ErrorCondition }
     *     
     */
    public ServiceDeliveryStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryStructure.ErrorCondition }
     *     
     */
    public void setErrorCondition(ServiceDeliveryStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der moreData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Legt den Wert der moreData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceDelivery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceDelivery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPAvailabilityDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLineInformationDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStatusDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripChangeDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripRefineDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractServiceDeliveryStructure>> getAbstractFunctionalServiceDelivery() {
        if (abstractFunctionalServiceDelivery == null) {
            abstractFunctionalServiceDelivery = new ArrayList<JAXBElement<? extends AbstractServiceDeliveryStructure>>();
        }
        return this.abstractFunctionalServiceDelivery;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public ServiceDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public ServiceDeliveryStructure withErrorCondition(ServiceDeliveryStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public ServiceDeliveryStructure withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    public ServiceDeliveryStructure withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value: values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    public ServiceDeliveryStructure withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    public ServiceDeliveryStructure withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ServiceDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
     *           &lt;element ref="{http://www.siri.org.uk/siri}CapabilityNotSupportedError"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}OtherError"/&gt;
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
    @XmlType(name = "", propOrder = {
        "capabilityNotSupportedError",
        "otherError",
        "description"
    })
    public static class ErrorCondition {

        @XmlElement(name = "CapabilityNotSupportedError")
        protected CapabilityNotSupportedErrorStructure capabilityNotSupportedError;
        @XmlElementRef(name = "OtherError", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
        protected JAXBElement<? extends OtherErrorStructure> otherError;
        @XmlElement(name = "Description")
        protected ErrorDescriptionStructure description;

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

        public ServiceDeliveryStructure.ErrorCondition withCapabilityNotSupportedError(CapabilityNotSupportedErrorStructure value) {
            setCapabilityNotSupportedError(value);
            return this;
        }

        public ServiceDeliveryStructure.ErrorCondition withOtherError(JAXBElement<? extends OtherErrorStructure> value) {
            setOtherError(value);
            return this;
        }

        public ServiceDeliveryStructure.ErrorCondition withDescription(ErrorDescriptionStructure value) {
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

}
