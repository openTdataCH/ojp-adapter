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
import de.vdv.ojp.release2.model.OJPAvailabilityRequestStructure;
import de.vdv.ojp.release2.model.OJPExchangePointsRequestStructure;
import de.vdv.ojp.release2.model.OJPFareRequestStructure;
import de.vdv.ojp.release2.model.OJPLineInformationRequestStructure;
import de.vdv.ojp.release2.model.OJPLocationInformationRequestStructure;
import de.vdv.ojp.release2.model.OJPMultiPointTripRequestStructure;
import de.vdv.ojp.release2.model.OJPStatusRequestStructure;
import de.vdv.ojp.release2.model.OJPStopEventRequestStructure;
import de.vdv.ojp.release2.model.OJPTripChangeRequestStructure;
import de.vdv.ojp.release2.model.OJPTripInfoRequestStructure;
import de.vdv.ojp.release2.model.OJPTripRefineRequestStructure;
import de.vdv.ojp.release2.model.OJPTripRequestStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequest" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "abstractFunctionalServiceRequest"
})
@XmlRootElement(name = "ServiceRequest")
public class ServiceRequest
    extends ServiceRequestStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceRequest", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> abstractFunctionalServiceRequest;

    /**
     * Gets the value of the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OJPAvailabilityRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPFareRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLineInformationRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLocationInformationRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStatusRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripChangeRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripInfoRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripRefineRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripRequestStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link AbstractFunctionalServiceRequestStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> getAbstractFunctionalServiceRequest() {
        if (abstractFunctionalServiceRequest == null) {
            abstractFunctionalServiceRequest = new ArrayList<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>>();
        }
        return this.abstractFunctionalServiceRequest;
    }

    public ServiceRequest withAbstractFunctionalServiceRequest(JAXBElement<? extends AbstractFunctionalServiceRequestStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractFunctionalServiceRequestStructure> value: values) {
                getAbstractFunctionalServiceRequest().add(value);
            }
        }
        return this;
    }

    public ServiceRequest withAbstractFunctionalServiceRequest(Collection<JAXBElement<? extends AbstractFunctionalServiceRequestStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceRequest().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceRequest withServiceRequestContext(ServiceRequestContextStructure value) {
        setServiceRequestContext(value);
        return this;
    }

    @Override
    public ServiceRequest withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
        return this;
    }

    @Override
    public ServiceRequest withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public ServiceRequest withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public ServiceRequest withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceRequest withRequestorRef(ParticipantRefStructure value) {
        setRequestorRef(value);
        return this;
    }

    @Override
    public ServiceRequest withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceRequest withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceRequest withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
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
