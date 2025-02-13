//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Assignment of the arrival/departure of a VEHICLE within a formation, e.g. carriage in a TRAIN composition, to a physical QUAY or nested QUAY (i.e. platform or sector of a platform). (since SIRI
 * 2.1)
 *
 * <p>Java-Klasse für FormationAssignmentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FormationAssignmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainFormationReferenceGroup"/&gt;
 *         &lt;element name="VehicleInFormationStatus" type="{http://www.siri.org.uk/siri}VehicleInFormationStatusStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrainStopAssignment" type="{http://www.siri.org.uk/siri}StopAssignmentStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationAssignmentStructure", propOrder = {
    "compoundTrainRef",
    "trainRef",
    "trainInCompoundTrainRef",
    "trainElementRef",
    "trainComponentRef",
    "entranceToVehicleRef",
    "vehicleInFormationStatus",
    "trainStopAssignment"
})
public class FormationAssignmentStructure {

    @XmlElement(name = "CompoundTrainRef")
    protected CompoundTrainRefStructure compoundTrainRef;
    @XmlElement(name = "TrainRef")
    protected TrainRefStructure trainRef;
    @XmlElement(name = "TrainInCompoundTrainRef")
    protected TrainInCompoundTrainRefStructure trainInCompoundTrainRef;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementRefStructure trainElementRef;
    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElement(name = "EntranceToVehicleRef")
    protected EntranceToVehicleRefStructure entranceToVehicleRef;
    @XmlElement(name = "VehicleInFormationStatus")
    protected VehicleInFormationStatusStructure vehicleInFormationStatus;
    @XmlElement(name = "TrainStopAssignment", required = true)
    protected List<StopAssignmentStructure> trainStopAssignment;

    /**
     * Ruft den Wert der compoundTrainRef-Eigenschaft ab.
     *
     * @return possible object is {@link CompoundTrainRefStructure }
     */
    public CompoundTrainRefStructure getCompoundTrainRef() {
        return compoundTrainRef;
    }

    /**
     * Legt den Wert der compoundTrainRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link CompoundTrainRefStructure }
     */
    public void setCompoundTrainRef(CompoundTrainRefStructure value) {
        this.compoundTrainRef = value;
    }

    /**
     * Ruft den Wert der trainRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainRefStructure }
     */
    public TrainRefStructure getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainRefStructure }
     */
    public void setTrainRef(TrainRefStructure value) {
        this.trainRef = value;
    }

    /**
     * Ruft den Wert der trainInCompoundTrainRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainInCompoundTrainRefStructure }
     */
    public TrainInCompoundTrainRefStructure getTrainInCompoundTrainRef() {
        return trainInCompoundTrainRef;
    }

    /**
     * Legt den Wert der trainInCompoundTrainRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainInCompoundTrainRefStructure }
     */
    public void setTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        this.trainInCompoundTrainRef = value;
    }

    /**
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainElementRefStructure }
     */
    public TrainElementRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainElementRefStructure }
     */
    public void setTrainElementRef(TrainElementRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Ruft den Wert der trainComponentRef-Eigenschaft ab.
     *
     * @return possible object is {@link TrainComponentRefStructure }
     */
    public TrainComponentRefStructure getTrainComponentRef() {
        return trainComponentRef;
    }

    /**
     * Legt den Wert der trainComponentRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrainComponentRefStructure }
     */
    public void setTrainComponentRef(TrainComponentRefStructure value) {
        this.trainComponentRef = value;
    }

    /**
     * Ruft den Wert der entranceToVehicleRef-Eigenschaft ab.
     *
     * @return possible object is {@link EntranceToVehicleRefStructure }
     */
    public EntranceToVehicleRefStructure getEntranceToVehicleRef() {
        return entranceToVehicleRef;
    }

    /**
     * Legt den Wert der entranceToVehicleRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link EntranceToVehicleRefStructure }
     */
    public void setEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        this.entranceToVehicleRef = value;
    }

    /**
     * Ruft den Wert der vehicleInFormationStatus-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleInFormationStatusStructure }
     */
    public VehicleInFormationStatusStructure getVehicleInFormationStatus() {
        return vehicleInFormationStatus;
    }

    /**
     * Legt den Wert der vehicleInFormationStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleInFormationStatusStructure }
     */
    public void setVehicleInFormationStatus(VehicleInFormationStatusStructure value) {
        this.vehicleInFormationStatus = value;
    }

    /**
     * Gets the value of the trainStopAssignment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the trainStopAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainStopAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link StopAssignmentStructure }
     */
    public List<StopAssignmentStructure> getTrainStopAssignment() {
        if (trainStopAssignment == null) {
            trainStopAssignment = new ArrayList<StopAssignmentStructure>();
        }
        return this.trainStopAssignment;
    }

    public FormationAssignmentStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public FormationAssignmentStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public FormationAssignmentStructure withTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        setTrainInCompoundTrainRef(value);
        return this;
    }

    public FormationAssignmentStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public FormationAssignmentStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public FormationAssignmentStructure withEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        setEntranceToVehicleRef(value);
        return this;
    }

    public FormationAssignmentStructure withVehicleInFormationStatus(VehicleInFormationStatusStructure value) {
        setVehicleInFormationStatus(value);
        return this;
    }

    public FormationAssignmentStructure withTrainStopAssignment(StopAssignmentStructure... values) {
        if (values != null) {
            for (StopAssignmentStructure value : values) {
                getTrainStopAssignment().add(value);
            }
        }
        return this;
    }

    public FormationAssignmentStructure withTrainStopAssignment(Collection<StopAssignmentStructure> values) {
        if (values != null) {
            getTrainStopAssignment().addAll(values);
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
