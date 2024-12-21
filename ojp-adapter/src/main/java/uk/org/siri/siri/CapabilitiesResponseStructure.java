//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import de.vdv.ojp.release2.model.OJPStatusResponseStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for the capabilities of an implementation.
 * 
 * <p>Java-Klasse für CapabilitiesResponseStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CapabilitiesResponseStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ProducerResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AbstractFunctionalServiceCapabilitiesResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapabilitiesResponseStructure", propOrder = {
    "abstractFunctionalServiceCapabilitiesResponse"
})
public class CapabilitiesResponseStructure
    extends ProducerResponseStructure
{

    @XmlElementRef(name = "AbstractFunctionalServiceCapabilitiesResponse", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> abstractFunctionalServiceCapabilitiesResponse;

    /**
     * Ruft den Wert der abstractFunctionalServiceCapabilitiesResponse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OJPStatusResponseStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     *     
     */
    public JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> getAbstractFunctionalServiceCapabilitiesResponse() {
        return abstractFunctionalServiceCapabilitiesResponse;
    }

    /**
     * Legt den Wert der abstractFunctionalServiceCapabilitiesResponse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OJPStatusResponseStructure }{@code >}
     *     {@link JAXBElement }{@code <}{@link AbstractServiceCapabilitiesResponseStructure }{@code >}
     *     
     */
    public void setAbstractFunctionalServiceCapabilitiesResponse(JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> value) {
        this.abstractFunctionalServiceCapabilitiesResponse = value;
    }

    public CapabilitiesResponseStructure withAbstractFunctionalServiceCapabilitiesResponse(JAXBElement<? extends AbstractServiceCapabilitiesResponseStructure> value) {
        setAbstractFunctionalServiceCapabilitiesResponse(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withProducerRef(ParticipantRefStructure value) {
        setProducerRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseMessageIdentifier(MessageQualifierStructure value) {
        setResponseMessageIdentifier(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withRequestMessageRef(MessageRefStructure value) {
        setRequestMessageRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public CapabilitiesResponseStructure withResponseTimestamp(ZonedDateTime value) {
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
