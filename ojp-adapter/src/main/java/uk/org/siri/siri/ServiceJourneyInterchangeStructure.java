//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * A planned SERVICE JOURNEY INTERCHANGE between two journeys. (since SIRI 2.0)
 * 
 * <p>Java-Klasse für ServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceJourneyInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.siri.org.uk/siri}AbstractServiceJourneyInterchangeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkRef" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}ExtraInterchange" minOccurs="0"/&gt;
 *           &lt;element name="Cancellation" type="{http://www.siri.org.uk/siri}InterchangeCancellation" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederArrivalStopRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederVisitNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederStopOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedArrivalTimeOfFeeder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorDepartureStopRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorVisitNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorStopOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedDepartureTimeOfDistributor" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceJourneyInterchangeStructure")
public class ServiceJourneyInterchangeStructure
    extends AbstractServiceJourneyInterchangeStructure
{


    @Override
    public ServiceJourneyInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withFeederRef(ConnectingJourneyRefStructure value) {
        setFeederRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withFeederArrivalStopRef(StopPointRefStructure value) {
        setFeederArrivalStopRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withFeederVisitNumber(BigInteger value) {
        setFeederVisitNumber(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withFeederStopOrder(BigInteger value) {
        setFeederStopOrder(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        setAimedArrivalTimeOfFeeder(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withDistributorRef(ConnectingJourneyRefStructure value) {
        setDistributorRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withDistributorDepartureStopRef(StopPointRefStructure value) {
        setDistributorDepartureStopRef(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withDistributorStopOrder(BigInteger value) {
        setDistributorStopOrder(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        setAimedDepartureTimeOfDistributor(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public ServiceJourneyInterchangeStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
