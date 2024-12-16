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
 * Type for a previously planned SERVICE JOURNEY INTERCHANGE that a data producer wants to silently remove from the plan (because it is erroneous data). Careful: Removal is different from Cancellation. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für RemovedServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemovedServiceJourneyInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.siri.org.uk/siri}AbstractServiceJourneyInterchangeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReasonForRemoval"/&gt;
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
@XmlType(name = "RemovedServiceJourneyInterchangeStructure")
public class RemovedServiceJourneyInterchangeStructure
    extends AbstractServiceJourneyInterchangeStructure
{


    @Override
    public RemovedServiceJourneyInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withFeederRef(ConnectingJourneyRefStructure value) {
        setFeederRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withFeederArrivalStopRef(StopPointRefStructure value) {
        setFeederArrivalStopRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withFeederVisitNumber(BigInteger value) {
        setFeederVisitNumber(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withFeederStopOrder(BigInteger value) {
        setFeederStopOrder(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        setAimedArrivalTimeOfFeeder(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withDistributorRef(ConnectingJourneyRefStructure value) {
        setDistributorRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withDistributorDepartureStopRef(StopPointRefStructure value) {
        setDistributorDepartureStopRef(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withDistributorStopOrder(BigInteger value) {
        setDistributorStopOrder(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        setAimedDepartureTimeOfDistributor(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public RemovedServiceJourneyInterchangeStructure withExtensions(ExtensionsStructure value) {
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
