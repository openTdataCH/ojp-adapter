//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für Accident complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Accident"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accidentCause" type="{http://datex2.eu/schema/2_0RC1/2_0}AccidentCauseEnum" minOccurs="0"/&gt;
 *         &lt;element name="accidentType" type="{http://datex2.eu/schema/2_0RC1/2_0}AccidentTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="totalNumberOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="totalNumberOfVehiclesInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}Vehicle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfVehiclesInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfVehiclesInvolved" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="groupOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfPeopleInvolved" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accidentExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Accident", propOrder = {
    "accidentCause",
    "accidentType",
    "totalNumberOfPeopleInvolved",
    "totalNumberOfVehiclesInvolved",
    "vehicleInvolved",
    "groupOfVehiclesInvolved",
    "groupOfPeopleInvolved",
    "accidentExtension"
})
public class Accident
    extends TrafficElement
{

    @XmlSchemaType(name = "string")
    protected AccidentCauseEnum accidentCause;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<AccidentTypeEnum> accidentType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfPeopleInvolved;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfVehiclesInvolved;
    protected List<Vehicle> vehicleInvolved;
    protected List<GroupOfVehiclesInvolved> groupOfVehiclesInvolved;
    protected List<GroupOfPeopleInvolved> groupOfPeopleInvolved;
    protected ExtensionType accidentExtension;

    /**
     * Ruft den Wert der accidentCause-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public AccidentCauseEnum getAccidentCause() {
        return accidentCause;
    }

    /**
     * Legt den Wert der accidentCause-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccidentCauseEnum }
     *     
     */
    public void setAccidentCause(AccidentCauseEnum value) {
        this.accidentCause = value;
    }

    /**
     * Gets the value of the accidentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accidentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccidentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccidentTypeEnum }
     * 
     * 
     */
    public List<AccidentTypeEnum> getAccidentType() {
        if (accidentType == null) {
            accidentType = new ArrayList<AccidentTypeEnum>();
        }
        return this.accidentType;
    }

    /**
     * Ruft den Wert der totalNumberOfPeopleInvolved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfPeopleInvolved() {
        return totalNumberOfPeopleInvolved;
    }

    /**
     * Legt den Wert der totalNumberOfPeopleInvolved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfPeopleInvolved(BigInteger value) {
        this.totalNumberOfPeopleInvolved = value;
    }

    /**
     * Ruft den Wert der totalNumberOfVehiclesInvolved-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfVehiclesInvolved() {
        return totalNumberOfVehiclesInvolved;
    }

    /**
     * Legt den Wert der totalNumberOfVehiclesInvolved-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfVehiclesInvolved(BigInteger value) {
        this.totalNumberOfVehiclesInvolved = value;
    }

    /**
     * Gets the value of the vehicleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle }
     * 
     * 
     */
    public List<Vehicle> getVehicleInvolved() {
        if (vehicleInvolved == null) {
            vehicleInvolved = new ArrayList<Vehicle>();
        }
        return this.vehicleInvolved;
    }

    /**
     * Gets the value of the groupOfVehiclesInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfVehiclesInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfVehiclesInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfVehiclesInvolved }
     * 
     * 
     */
    public List<GroupOfVehiclesInvolved> getGroupOfVehiclesInvolved() {
        if (groupOfVehiclesInvolved == null) {
            groupOfVehiclesInvolved = new ArrayList<GroupOfVehiclesInvolved>();
        }
        return this.groupOfVehiclesInvolved;
    }

    /**
     * Gets the value of the groupOfPeopleInvolved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupOfPeopleInvolved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupOfPeopleInvolved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupOfPeopleInvolved }
     * 
     * 
     */
    public List<GroupOfPeopleInvolved> getGroupOfPeopleInvolved() {
        if (groupOfPeopleInvolved == null) {
            groupOfPeopleInvolved = new ArrayList<GroupOfPeopleInvolved>();
        }
        return this.groupOfPeopleInvolved;
    }

    /**
     * Ruft den Wert der accidentExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAccidentExtension() {
        return accidentExtension;
    }

    /**
     * Legt den Wert der accidentExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAccidentExtension(ExtensionType value) {
        this.accidentExtension = value;
    }

    public Accident withAccidentCause(AccidentCauseEnum value) {
        setAccidentCause(value);
        return this;
    }

    public Accident withAccidentType(AccidentTypeEnum... values) {
        if (values!= null) {
            for (AccidentTypeEnum value: values) {
                getAccidentType().add(value);
            }
        }
        return this;
    }

    public Accident withAccidentType(Collection<AccidentTypeEnum> values) {
        if (values!= null) {
            getAccidentType().addAll(values);
        }
        return this;
    }

    public Accident withTotalNumberOfPeopleInvolved(BigInteger value) {
        setTotalNumberOfPeopleInvolved(value);
        return this;
    }

    public Accident withTotalNumberOfVehiclesInvolved(BigInteger value) {
        setTotalNumberOfVehiclesInvolved(value);
        return this;
    }

    public Accident withVehicleInvolved(Vehicle... values) {
        if (values!= null) {
            for (Vehicle value: values) {
                getVehicleInvolved().add(value);
            }
        }
        return this;
    }

    public Accident withVehicleInvolved(Collection<Vehicle> values) {
        if (values!= null) {
            getVehicleInvolved().addAll(values);
        }
        return this;
    }

    public Accident withGroupOfVehiclesInvolved(GroupOfVehiclesInvolved... values) {
        if (values!= null) {
            for (GroupOfVehiclesInvolved value: values) {
                getGroupOfVehiclesInvolved().add(value);
            }
        }
        return this;
    }

    public Accident withGroupOfVehiclesInvolved(Collection<GroupOfVehiclesInvolved> values) {
        if (values!= null) {
            getGroupOfVehiclesInvolved().addAll(values);
        }
        return this;
    }

    public Accident withGroupOfPeopleInvolved(GroupOfPeopleInvolved... values) {
        if (values!= null) {
            for (GroupOfPeopleInvolved value: values) {
                getGroupOfPeopleInvolved().add(value);
            }
        }
        return this;
    }

    public Accident withGroupOfPeopleInvolved(Collection<GroupOfPeopleInvolved> values) {
        if (values!= null) {
            getGroupOfPeopleInvolved().addAll(values);
        }
        return this;
    }

    public Accident withAccidentExtension(ExtensionType value) {
        setAccidentExtension(value);
        return this;
    }

    @Override
    public Accident withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public Accident withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public Accident withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public Accident withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public Accident withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public Accident withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public Accident withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public Accident withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public Accident withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public Accident withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public Accident withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public Accident withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public Accident withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public Accident withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Accident withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Accident withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public Accident withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public Accident withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public Accident withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public Accident withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public Accident withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public Accident withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public Accident withId(String value) {
        setId(value);
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
