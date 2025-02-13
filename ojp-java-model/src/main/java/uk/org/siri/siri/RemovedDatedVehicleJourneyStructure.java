//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for previously planned VEHICLE JOURNEY that is removed from the data producer when using incremental updates. (since SIRI 2.1)
 *
 * <p>Java-Klasse für RemovedDatedVehicleJourneyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RemovedDatedVehicleJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure"/&gt;
 *         &lt;element name="DatedVehicleJourneyIndirectRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyIndirectRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrainNumbers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReasonForRemoval"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovedDatedVehicleJourneyStructure", propOrder = {
    "framedVehicleJourneyRef",
    "datedVehicleJourneyIndirectRef",
    "trainNumbers",
    "reasonForRemoval"
})
public class RemovedDatedVehicleJourneyStructure {

    @XmlElement(name = "FramedVehicleJourneyRef", required = true)
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "DatedVehicleJourneyIndirectRef")
    protected DatedVehicleJourneyIndirectRefStructure datedVehicleJourneyIndirectRef;
    @XmlElement(name = "TrainNumbers")
    protected RemovedDatedVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "ReasonForRemoval", required = true)
    protected NaturalLanguageStringStructure reasonForRemoval;

    /**
     * Ruft den Wert der framedVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link FramedVehicleJourneyRefStructure }
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der framedVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FramedVehicleJourneyRefStructure }
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der datedVehicleJourneyIndirectRef-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyIndirectRefStructure }
     */
    public DatedVehicleJourneyIndirectRefStructure getDatedVehicleJourneyIndirectRef() {
        return datedVehicleJourneyIndirectRef;
    }

    /**
     * Legt den Wert der datedVehicleJourneyIndirectRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyIndirectRefStructure }
     */
    public void setDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        this.datedVehicleJourneyIndirectRef = value;
    }

    /**
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     *
     * @return possible object is {@link RemovedDatedVehicleJourneyStructure.TrainNumbers }
     */
    public RemovedDatedVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     *
     * @param value allowed object is {@link RemovedDatedVehicleJourneyStructure.TrainNumbers }
     */
    public void setTrainNumbers(RemovedDatedVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der reasonForRemoval-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getReasonForRemoval() {
        return reasonForRemoval;
    }

    /**
     * Legt den Wert der reasonForRemoval-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setReasonForRemoval(NaturalLanguageStringStructure value) {
        this.reasonForRemoval = value;
    }

    public RemovedDatedVehicleJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public RemovedDatedVehicleJourneyStructure withDatedVehicleJourneyIndirectRef(DatedVehicleJourneyIndirectRefStructure value) {
        setDatedVehicleJourneyIndirectRef(value);
        return this;
    }

    public RemovedDatedVehicleJourneyStructure withTrainNumbers(RemovedDatedVehicleJourneyStructure.TrainNumbers value) {
        setTrainNumbers(value);
        return this;
    }

    public RemovedDatedVehicleJourneyStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainNumberRef"
    })
    public static class TrainNumbers {

        @XmlElement(name = "TrainNumberRef", required = true)
        protected List<TrainNumberRefStructure> trainNumberRef;

        /**
         * Gets the value of the trainNumberRef property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainNumberRef property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainNumberRef().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link TrainNumberRefStructure }
         */
        public List<TrainNumberRefStructure> getTrainNumberRef() {
            if (trainNumberRef == null) {
                trainNumberRef = new ArrayList<TrainNumberRefStructure>();
            }
            return this.trainNumberRef;
        }

        public RemovedDatedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(TrainNumberRefStructure... values) {
            if (values != null) {
                for (TrainNumberRefStructure value : values) {
                    getTrainNumberRef().add(value);
                }
            }
            return this;
        }

        public RemovedDatedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(Collection<TrainNumberRefStructure> values) {
            if (values != null) {
                getTrainNumberRef().addAll(values);
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

}
