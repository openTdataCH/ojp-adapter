//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * The JOURNEY RELATION refers to this JOURNEY PART. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für RelatedJourneyPartStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RelatedJourneyPartStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}JourneyPartInfoStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedJourneyPartStructure")
public class RelatedJourneyPartStructure
    extends JourneyPartInfoStructure
{


    @Override
    public RelatedJourneyPartStructure withJourneyPartRef(String value) {
        setJourneyPartRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withTrainNumberRef(TrainNumberRefStructure value) {
        setTrainNumberRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withFromStopPointRef(StopPointRefStructure value) {
        setFromStopPointRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withToStopPointRef(StopPointRefStructure value) {
        setToStopPointRef(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withStartTime(ZonedDateTime value) {
        setStartTime(value);
        return this;
    }

    @Override
    public RelatedJourneyPartStructure withEndTime(ZonedDateTime value) {
        setEndTime(value);
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
