//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für CarParks complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CarParks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carParkConfiguration" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkConfigurationEnum" minOccurs="0"/&gt;
 *         &lt;element name="carParkIdentity" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="carParkOccupancy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="carParkStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}CarParkStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="exitRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="fillRate" type="{http://datex2.eu/schema/2_0RC1/2_0}VehiclesPerHour" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVacantParkingSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="occupiedSpaces" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queuingTime" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="totalCapacity" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="carParksExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarParks", propOrder = {
    "carParkConfiguration",
    "carParkIdentity",
    "carParkOccupancy",
    "carParkStatus",
    "exitRate",
    "fillRate",
    "numberOfVacantParkingSpaces",
    "occupiedSpaces",
    "queuingTime",
    "totalCapacity",
    "carParksExtension"
})
public class CarParks
    extends NonRoadEventInformation {

    @XmlSchemaType(name = "string")
    protected CarParkConfigurationEnum carParkConfiguration;
    @XmlElement(required = true)
    protected String carParkIdentity;
    protected Float carParkOccupancy;
    @XmlSchemaType(name = "string")
    protected CarParkStatusEnum carParkStatus;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger exitRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fillRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVacantParkingSpaces;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger occupiedSpaces;
    protected Float queuingTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    protected ExtensionType carParksExtension;

    /**
     * Ruft den Wert der carParkConfiguration-Eigenschaft ab.
     *
     * @return possible object is {@link CarParkConfigurationEnum }
     */
    public CarParkConfigurationEnum getCarParkConfiguration() {
        return carParkConfiguration;
    }

    /**
     * Legt den Wert der carParkConfiguration-Eigenschaft fest.
     *
     * @param value allowed object is {@link CarParkConfigurationEnum }
     */
    public void setCarParkConfiguration(CarParkConfigurationEnum value) {
        this.carParkConfiguration = value;
    }

    /**
     * Ruft den Wert der carParkIdentity-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getCarParkIdentity() {
        return carParkIdentity;
    }

    /**
     * Legt den Wert der carParkIdentity-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCarParkIdentity(String value) {
        this.carParkIdentity = value;
    }

    /**
     * Ruft den Wert der carParkOccupancy-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getCarParkOccupancy() {
        return carParkOccupancy;
    }

    /**
     * Legt den Wert der carParkOccupancy-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setCarParkOccupancy(Float value) {
        this.carParkOccupancy = value;
    }

    /**
     * Ruft den Wert der carParkStatus-Eigenschaft ab.
     *
     * @return possible object is {@link CarParkStatusEnum }
     */
    public CarParkStatusEnum getCarParkStatus() {
        return carParkStatus;
    }

    /**
     * Legt den Wert der carParkStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link CarParkStatusEnum }
     */
    public void setCarParkStatus(CarParkStatusEnum value) {
        this.carParkStatus = value;
    }

    /**
     * Ruft den Wert der exitRate-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getExitRate() {
        return exitRate;
    }

    /**
     * Legt den Wert der exitRate-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setExitRate(BigInteger value) {
        this.exitRate = value;
    }

    /**
     * Ruft den Wert der fillRate-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getFillRate() {
        return fillRate;
    }

    /**
     * Legt den Wert der fillRate-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setFillRate(BigInteger value) {
        this.fillRate = value;
    }

    /**
     * Ruft den Wert der numberOfVacantParkingSpaces-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfVacantParkingSpaces() {
        return numberOfVacantParkingSpaces;
    }

    /**
     * Legt den Wert der numberOfVacantParkingSpaces-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfVacantParkingSpaces(BigInteger value) {
        this.numberOfVacantParkingSpaces = value;
    }

    /**
     * Ruft den Wert der occupiedSpaces-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getOccupiedSpaces() {
        return occupiedSpaces;
    }

    /**
     * Legt den Wert der occupiedSpaces-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setOccupiedSpaces(BigInteger value) {
        this.occupiedSpaces = value;
    }

    /**
     * Ruft den Wert der queuingTime-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getQueuingTime() {
        return queuingTime;
    }

    /**
     * Legt den Wert der queuingTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setQueuingTime(Float value) {
        this.queuingTime = value;
    }

    /**
     * Ruft den Wert der totalCapacity-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Legt den Wert der totalCapacity-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Ruft den Wert der carParksExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getCarParksExtension() {
        return carParksExtension;
    }

    /**
     * Legt den Wert der carParksExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setCarParksExtension(ExtensionType value) {
        this.carParksExtension = value;
    }

    public CarParks withCarParkConfiguration(CarParkConfigurationEnum value) {
        setCarParkConfiguration(value);
        return this;
    }

    public CarParks withCarParkIdentity(String value) {
        setCarParkIdentity(value);
        return this;
    }

    public CarParks withCarParkOccupancy(Float value) {
        setCarParkOccupancy(value);
        return this;
    }

    public CarParks withCarParkStatus(CarParkStatusEnum value) {
        setCarParkStatus(value);
        return this;
    }

    public CarParks withExitRate(BigInteger value) {
        setExitRate(value);
        return this;
    }

    public CarParks withFillRate(BigInteger value) {
        setFillRate(value);
        return this;
    }

    public CarParks withNumberOfVacantParkingSpaces(BigInteger value) {
        setNumberOfVacantParkingSpaces(value);
        return this;
    }

    public CarParks withOccupiedSpaces(BigInteger value) {
        setOccupiedSpaces(value);
        return this;
    }

    public CarParks withQueuingTime(Float value) {
        setQueuingTime(value);
        return this;
    }

    public CarParks withTotalCapacity(BigInteger value) {
        setTotalCapacity(value);
        return this;
    }

    public CarParks withCarParksExtension(ExtensionType value) {
        setCarParksExtension(value);
        return this;
    }

    @Override
    public CarParks withNonRoadEventInformationExtension(ExtensionType value) {
        setNonRoadEventInformationExtension(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public CarParks withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public CarParks withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public CarParks withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public CarParks withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public CarParks withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public CarParks withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public CarParks withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public CarParks withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public CarParks withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public CarParks withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public CarParks withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public CarParks withId(String value) {
        setId(value);
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
