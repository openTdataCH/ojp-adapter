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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;


/**
 * Type for information about a VEHICLE  affected by an SITUATION.
 * 
 * <p>Java-Klasse für AffectedVehicleStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedVehicleStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VehicleRef" type="{http://www.siri.org.uk/siri}VehicleRefStructure"/&gt;
 *         &lt;element name="VehicleRegistrationNumberPlate" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.siri.org.uk/siri}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="IPAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="RadioAddress" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="FramedVehicleJourneyRef" type="{http://www.siri.org.uk/siri}FramedVehicleJourneyRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="CurrentLocation" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup" minOccurs="0"/&gt;
 *         &lt;element name="TrainBlockPart" type="{http://www.siri.org.uk/siri}TrainBlockPartStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}OperationalBlockGroup"/&gt;
 *         &lt;element name="InCongestion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="InPanic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HeadwayService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "AffectedVehicleStructure", propOrder = {
    "vehicleRef",
    "vehicleRegistrationNumberPlate",
    "phoneNumber",
    "ipAddress",
    "radioAddress",
    "framedVehicleJourneyRef",
    "location",
    "currentLocation",
    "accessibilityAssessment",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "inCongestion",
    "inPanic",
    "headwayService",
    "extensions"
})
public class AffectedVehicleStructure {

    @XmlElement(name = "VehicleRef", required = true)
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "VehicleRegistrationNumberPlate")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> vehicleRegistrationNumberPlate;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "IPAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String ipAddress;
    @XmlElement(name = "RadioAddress")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String radioAddress;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "CurrentLocation")
    protected LocationStructure currentLocation;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "InCongestion")
    protected Boolean inCongestion;
    @XmlElement(name = "InPanic", defaultValue = "false")
    protected Boolean inPanic;
    @XmlElement(name = "HeadwayService", defaultValue = "false")
    protected Boolean headwayService;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the vehicleRegistrationNumberPlate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRegistrationNumberPlate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRegistrationNumberPlate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleRegistrationNumberPlate() {
        if (vehicleRegistrationNumberPlate == null) {
            vehicleRegistrationNumberPlate = new ArrayList<String>();
        }
        return this.vehicleRegistrationNumberPlate;
    }

    /**
     * Ruft den Wert der phoneNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Legt den Wert der phoneNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Ruft den Wert der ipAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Legt den Wert der ipAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Ruft den Wert der radioAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioAddress() {
        return radioAddress;
    }

    /**
     * Legt den Wert der radioAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioAddress(String value) {
        this.radioAddress = value;
    }

    /**
     * Ruft den Wert der framedVehicleJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der framedVehicleJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FramedVehicleJourneyRefStructure }
     *     
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der currentLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getCurrentLocation() {
        return currentLocation;
    }

    /**
     * Legt den Wert der currentLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setCurrentLocation(LocationStructure value) {
        this.currentLocation = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der productCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Legt den Wert der productCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package. 
     * Corresponds to NeTEX TYPE OF SERVICe.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRefStructure }
     * 
     * 
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRefStructure }
     * 
     * 
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Gets the value of the trainBlockPart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trainBlockPart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainBlockPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainBlockPartStructure }
     * 
     * 
     */
    public List<TrainBlockPartStructure> getTrainBlockPart() {
        if (trainBlockPart == null) {
            trainBlockPart = new ArrayList<TrainBlockPartStructure>();
        }
        return this.trainBlockPart;
    }

    /**
     * Ruft den Wert der blockRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlockRefStructure }
     *     
     */
    public BlockRefStructure getBlockRef() {
        return blockRef;
    }

    /**
     * Legt den Wert der blockRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockRefStructure }
     *     
     */
    public void setBlockRef(BlockRefStructure value) {
        this.blockRef = value;
    }

    /**
     * Ruft den Wert der courseOfJourneyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public CourseOfJourneyRefStructure getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Legt den Wert der courseOfJourneyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseOfJourneyRefStructure }
     *     
     */
    public void setCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        this.courseOfJourneyRef = value;
    }

    /**
     * Ruft den Wert der inCongestion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInCongestion() {
        return inCongestion;
    }

    /**
     * Legt den Wert der inCongestion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInCongestion(Boolean value) {
        this.inCongestion = value;
    }

    /**
     * Ruft den Wert der inPanic-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInPanic() {
        return inPanic;
    }

    /**
     * Legt den Wert der inPanic-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInPanic(Boolean value) {
        this.inPanic = value;
    }

    /**
     * Ruft den Wert der headwayService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Legt den Wert der headwayService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedVehicleStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public AffectedVehicleStructure withVehicleRegistrationNumberPlate(String... values) {
        if (values!= null) {
            for (String value: values) {
                getVehicleRegistrationNumberPlate().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleStructure withVehicleRegistrationNumberPlate(Collection<String> values) {
        if (values!= null) {
            getVehicleRegistrationNumberPlate().addAll(values);
        }
        return this;
    }

    public AffectedVehicleStructure withPhoneNumber(String value) {
        setPhoneNumber(value);
        return this;
    }

    public AffectedVehicleStructure withIPAddress(String value) {
        setIPAddress(value);
        return this;
    }

    public AffectedVehicleStructure withRadioAddress(String value) {
        setRadioAddress(value);
        return this;
    }

    public AffectedVehicleStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public AffectedVehicleStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    public AffectedVehicleStructure withCurrentLocation(LocationStructure value) {
        setCurrentLocation(value);
        return this;
    }

    public AffectedVehicleStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public AffectedVehicleStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public AffectedVehicleStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public AffectedVehicleStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values!= null) {
            for (ServiceFeatureRefStructure value: values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values!= null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public AffectedVehicleStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values!= null) {
            for (VehicleFeatureRefStructure value: values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values!= null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public AffectedVehicleStructure withTrainBlockPart(TrainBlockPartStructure... values) {
        if (values!= null) {
            for (TrainBlockPartStructure value: values) {
                getTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public AffectedVehicleStructure withTrainBlockPart(Collection<TrainBlockPartStructure> values) {
        if (values!= null) {
            getTrainBlockPart().addAll(values);
        }
        return this;
    }

    public AffectedVehicleStructure withBlockRef(BlockRefStructure value) {
        setBlockRef(value);
        return this;
    }

    public AffectedVehicleStructure withCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        setCourseOfJourneyRef(value);
        return this;
    }

    public AffectedVehicleStructure withInCongestion(Boolean value) {
        setInCongestion(value);
        return this;
    }

    public AffectedVehicleStructure withInPanic(Boolean value) {
        setInPanic(value);
        return this;
    }

    public AffectedVehicleStructure withHeadwayService(Boolean value) {
        setHeadwayService(value);
        return this;
    }

    public AffectedVehicleStructure withExtensions(ExtensionsStructure value) {
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
