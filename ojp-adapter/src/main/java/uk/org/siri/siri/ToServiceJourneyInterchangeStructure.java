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
 * A planned SERVICE JOURNEY INTERCHANGE to a journey. (since SIRI 2.0)
 * 
 * <p>Java-Klasse für ToServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ToServiceJourneyInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.siri.org.uk/siri}AbstractServiceJourneyInterchangeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederRef" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederArrivalStopRef" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederVisitNumber" maxOccurs="0" minOccurs="0"/&gt;
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
@XmlType(name = "ToServiceJourneyInterchangeStructure")
public class ToServiceJourneyInterchangeStructure
    extends AbstractServiceJourneyInterchangeStructure
{


    @Override
    public ToServiceJourneyInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withFeederRef(ConnectingJourneyRefStructure value) {
        setFeederRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withFeederArrivalStopRef(StopPointRefStructure value) {
        setFeederArrivalStopRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withFeederVisitNumber(BigInteger value) {
        setFeederVisitNumber(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withFeederStopOrder(BigInteger value) {
        setFeederStopOrder(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        setAimedArrivalTimeOfFeeder(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withDistributorRef(ConnectingJourneyRefStructure value) {
        setDistributorRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withDistributorDepartureStopRef(StopPointRefStructure value) {
        setDistributorDepartureStopRef(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withDistributorStopOrder(BigInteger value) {
        setDistributorStopOrder(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        setAimedDepartureTimeOfDistributor(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public ToServiceJourneyInterchangeStructure withExtensions(ExtensionsStructure value) {
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
