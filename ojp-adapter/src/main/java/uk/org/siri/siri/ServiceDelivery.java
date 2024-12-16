//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;extension base="{http://www.siri.org.uk/siri}ServiceDeliveryStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ServiceDelivery")
public class ServiceDelivery
    extends ServiceDeliveryStructure
{


    @Override
    public ServiceDelivery withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    @Override
    public ServiceDelivery withErrorCondition(ServiceDeliveryStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    @Override
    public ServiceDelivery withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    @Override
    public ServiceDelivery withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure> ... values) {
        if (values!= null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value: values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    @Override
    public ServiceDelivery withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values!= null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    @Override
    public ServiceDelivery withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public ServiceDelivery withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ServiceDelivery withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public ServiceDelivery withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public ServiceDelivery withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public ServiceDelivery withResponseTimestamp(ZonedDateTime value) {
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

}
