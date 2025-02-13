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
import uk.org.ifopt.ifopt.StopPlaceComponentRefStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;

/**
 * Location of the MONITORED FACILITY.
 *
 * <p>Java-Klasse für FacilityLocationStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FacilityLocationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityScheduleRefGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityStopPlaceRefGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityLocationStructure", propOrder = {
    "lineRef",
    "stopPointRef",
    "vehicleRef",
    "compoundTrainRef",
    "trainRef",
    "trainInCompoundTrainRef",
    "trainElementRef",
    "trainComponentRef",
    "entranceToVehicleRef",
    "datedVehicleJourneyRef",
    "connectionLinkRef",
    "interchangeRef",
    "stopPlaceRef",
    "stopPlaceComponentId",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef"
})
public class FacilityLocationStructure {

    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
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
    @XmlElement(name = "DatedVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure datedVehicleJourneyRef;
    @XmlElement(name = "ConnectionLinkRef")
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlaceComponentId")
    protected StopPlaceComponentRefStructure stopPlaceComponentId;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     *
     * @return possible object is {@link LineRefStructure }
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link LineRefStructure }
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der stopPointRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Legt den Wert der stopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleRefStructure }
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleRefStructure }
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

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
     * Ruft den Wert der datedVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyRefStructure }
     */
    public DatedVehicleJourneyRefStructure getDatedVehicleJourneyRef() {
        return datedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der datedVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyRefStructure }
     */
    public void setDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.datedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der connectionLinkRef-Eigenschaft ab.
     *
     * @return possible object is {@link ConnectionLinkRefStructure }
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Legt den Wert der connectionLinkRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ConnectionLinkRefStructure }
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    /**
     * Ruft den Wert der interchangeRef-Eigenschaft ab.
     *
     * @return possible object is {@link InterchangeRefStructure }
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Legt den Wert der interchangeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link InterchangeRefStructure }
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceRefStructure }
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceRefStructure }
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Ruft den Wert der stopPlaceComponentId-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceComponentRefStructure }
     */
    public StopPlaceComponentRefStructure getStopPlaceComponentId() {
        return stopPlaceComponentId;
    }

    /**
     * Legt den Wert der stopPlaceComponentId-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceComponentRefStructure }
     */
    public void setStopPlaceComponentId(StopPlaceComponentRefStructure value) {
        this.stopPlaceComponentId = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorRefStructure }
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorRefStructure }
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der productCategoryRef-Eigenschaft ab.
     *
     * @return possible object is {@link ProductCategoryRefStructure }
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Legt den Wert der productCategoryRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ProductCategoryRefStructure }
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities
     * package. Corresponds to NeTEX TYPE OF SERVICe.Gets the value of the serviceFeatureRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ServiceFeatureRefStructure }
     */
    public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleFeatureRefStructure }
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    public FacilityLocationStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public FacilityLocationStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public FacilityLocationStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public FacilityLocationStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public FacilityLocationStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public FacilityLocationStructure withTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        setTrainInCompoundTrainRef(value);
        return this;
    }

    public FacilityLocationStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public FacilityLocationStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public FacilityLocationStructure withEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        setEntranceToVehicleRef(value);
        return this;
    }

    public FacilityLocationStructure withDatedVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        setDatedVehicleJourneyRef(value);
        return this;
    }

    public FacilityLocationStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    public FacilityLocationStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    public FacilityLocationStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public FacilityLocationStructure withStopPlaceComponentId(StopPlaceComponentRefStructure value) {
        setStopPlaceComponentId(value);
        return this;
    }

    public FacilityLocationStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public FacilityLocationStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public FacilityLocationStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values != null) {
            for (ServiceFeatureRefStructure value : values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public FacilityLocationStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values != null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public FacilityLocationStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values != null) {
            for (VehicleFeatureRefStructure value : values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public FacilityLocationStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values != null) {
            getVehicleFeatureRef().addAll(values);
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
