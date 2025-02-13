//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.CountryRefStructure;
import uk.org.siri.siri.EntryQualifierStructure;
import uk.org.siri.siri.ParticipantRefStructure;
import uk.org.siri.siri.SituationVersion;

/**
 * Reference structure for situation message. Situation details might be found in response context or through other communication channels.
 *
 * <p>Java-Klasse für SituationFullRefStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SituationFullRefStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}SituationFullRefStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationFullRefStructure")
public class SituationFullRefStructure
    extends uk.org.siri.siri.SituationFullRefStructure {

    @Override
    public SituationFullRefStructure withVersionCountryRef(CountryRefStructure value) {
        setVersionCountryRef(value);
        return this;
    }

    @Override
    public SituationFullRefStructure withParticipantRef(ParticipantRefStructure value) {
        setParticipantRef(value);
        return this;
    }

    @Override
    public SituationFullRefStructure withSituationNumber(EntryQualifierStructure value) {
        setSituationNumber(value);
        return this;
    }

    @Override
    public SituationFullRefStructure withUpdateCountryRef(CountryRefStructure value) {
        setUpdateCountryRef(value);
        return this;
    }

    @Override
    public SituationFullRefStructure withUpdateParticipantRef(ParticipantRefStructure value) {
        setUpdateParticipantRef(value);
        return this;
    }

    @Override
    public SituationFullRefStructure withVersion(SituationVersion value) {
        setVersion(value);
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
