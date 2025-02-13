//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * A planned SERVICE JOURNEY INTERCHANGE from a journey. (since SIRI 2.0)
 *
 * <p>Java-Klasse für FromServiceJourneyInterchangeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FromServiceJourneyInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.siri.org.uk/siri}AbstractServiceJourneyInterchangeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederArrivalStopRef"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederVisitNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederStopOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedArrivalTimeOfFeeder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorRef" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorDepartureStopRef" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorVisitNumber" maxOccurs="0" minOccurs="0"/&gt;
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromServiceJourneyInterchangeStructure")
public class FromServiceJourneyInterchangeStructure
    extends AbstractServiceJourneyInterchangeStructure {

    @Override
    public FromServiceJourneyInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withFeederRef(ConnectingJourneyRefStructure value) {
        setFeederRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withFeederArrivalStopRef(StopPointRefStructure value) {
        setFeederArrivalStopRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withFeederVisitNumber(BigInteger value) {
        setFeederVisitNumber(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withFeederStopOrder(BigInteger value) {
        setFeederStopOrder(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        setAimedArrivalTimeOfFeeder(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withDistributorRef(ConnectingJourneyRefStructure value) {
        setDistributorRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withDistributorDepartureStopRef(StopPointRefStructure value) {
        setDistributorDepartureStopRef(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withDistributorStopOrder(BigInteger value) {
        setDistributorStopOrder(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        setAimedDepartureTimeOfDistributor(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    @Override
    public FromServiceJourneyInterchangeStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
