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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for FORMATION CONDITION. (since SIRI 2.1)
 *
 * <p>Java-Klasse für FormationConditionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FormationConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainFormationReferenceGroup" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FormationStatus" type="{http://www.siri.org.uk/siri}FormationStatusStructure"/&gt;
 *           &lt;element name="VehicleInFormationStatus" type="{http://www.siri.org.uk/siri}VehicleInFormationStatusStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedAction" type="{http://www.siri.org.uk/siri}RecommendedActionStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationConditionStructure", propOrder = {
    "compoundTrainRef",
    "trainRef",
    "trainInCompoundTrainRef",
    "trainElementRef",
    "trainComponentRef",
    "entranceToVehicleRef",
    "formationStatus",
    "vehicleInFormationStatus",
    "situationRef",
    "recommendedAction",
    "extensions"
})
public class FormationConditionStructure {

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
    @XmlElement(name = "FormationStatus")
    protected FormationStatusStructure formationStatus;
    @XmlElement(name = "VehicleInFormationStatus")
    protected VehicleInFormationStatusStructure vehicleInFormationStatus;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "RecommendedAction")
    protected RecommendedActionStructure recommendedAction;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Ruft den Wert der formationStatus-Eigenschaft ab.
     *
     * @return possible object is {@link FormationStatusStructure }
     */
    public FormationStatusStructure getFormationStatus() {
        return formationStatus;
    }

    /**
     * Legt den Wert der formationStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link FormationStatusStructure }
     */
    public void setFormationStatus(FormationStatusStructure value) {
        this.formationStatus = value;
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
     * Ruft den Wert der situationRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefStructure }
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Legt den Wert der situationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefStructure }
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Ruft den Wert der recommendedAction-Eigenschaft ab.
     *
     * @return possible object is {@link RecommendedActionStructure }
     */
    public RecommendedActionStructure getRecommendedAction() {
        return recommendedAction;
    }

    /**
     * Legt den Wert der recommendedAction-Eigenschaft fest.
     *
     * @param value allowed object is {@link RecommendedActionStructure }
     */
    public void setRecommendedAction(RecommendedActionStructure value) {
        this.recommendedAction = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public FormationConditionStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public FormationConditionStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public FormationConditionStructure withTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        setTrainInCompoundTrainRef(value);
        return this;
    }

    public FormationConditionStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public FormationConditionStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public FormationConditionStructure withEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        setEntranceToVehicleRef(value);
        return this;
    }

    public FormationConditionStructure withFormationStatus(FormationStatusStructure value) {
        setFormationStatus(value);
        return this;
    }

    public FormationConditionStructure withVehicleInFormationStatus(VehicleInFormationStatusStructure value) {
        setVehicleInFormationStatus(value);
        return this;
    }

    public FormationConditionStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FormationConditionStructure withRecommendedAction(RecommendedActionStructure value) {
        setRecommendedAction(value);
        return this;
    }

    public FormationConditionStructure withExtensions(ExtensionsStructure value) {
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
