//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.PtSituationElementStructure;
import uk.org.siri.siri.RoadSituationElementStructure;

/**
 * Wrapper type for SIRI PtSituationsElementStructure
 *
 * <p>Java-Klasse für SituationsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="SituationsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtSituation" type="{http://www.siri.org.uk/siri}PtSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RoadSituation" type="{http://www.siri.org.uk/siri}RoadSituationElementStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationsStructure", propOrder = {
    "ptSituation",
    "roadSituation"
})
public class SituationsStructure {

    @XmlElement(name = "PtSituation")
    protected List<PtSituationElementStructure> ptSituation;
    @XmlElement(name = "RoadSituation")
    protected List<RoadSituationElementStructure> roadSituation;

    /**
     * Gets the value of the ptSituation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the ptSituation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtSituation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PtSituationElementStructure }
     */
    public List<PtSituationElementStructure> getPtSituation() {
        if (ptSituation == null) {
            ptSituation = new ArrayList<PtSituationElementStructure>();
        }
        return this.ptSituation;
    }

    /**
     * Gets the value of the roadSituation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the roadSituation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadSituation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link RoadSituationElementStructure }
     */
    public List<RoadSituationElementStructure> getRoadSituation() {
        if (roadSituation == null) {
            roadSituation = new ArrayList<RoadSituationElementStructure>();
        }
        return this.roadSituation;
    }

    public SituationsStructure withPtSituation(PtSituationElementStructure... values) {
        if (values != null) {
            for (PtSituationElementStructure value : values) {
                getPtSituation().add(value);
            }
        }
        return this;
    }

    public SituationsStructure withPtSituation(Collection<PtSituationElementStructure> values) {
        if (values != null) {
            getPtSituation().addAll(values);
        }
        return this;
    }

    public SituationsStructure withRoadSituation(RoadSituationElementStructure... values) {
        if (values != null) {
            for (RoadSituationElementStructure value : values) {
                getRoadSituation().add(value);
            }
        }
        return this;
    }

    public SituationsStructure withRoadSituation(Collection<RoadSituationElementStructure> values) {
        if (values != null) {
            getRoadSituation().addAll(values);
        }
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
