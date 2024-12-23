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
 * <p>Java-Klasse für PoorEnvironmentConditions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PoorEnvironmentConditions"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Conditions"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="poorEnvironmentType" type="{http://datex2.eu/schema/2_0RC1/2_0}PoorEnvironmentTypeEnum" maxOccurs="unbounded"/&gt;
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationDetail" minOccurs="0"/&gt;
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/2_0RC1/2_0}Visibility" minOccurs="0"/&gt;
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutionMeasurement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="temperature" type="{http://datex2.eu/schema/2_0RC1/2_0}Temperature" minOccurs="0"/&gt;
 *         &lt;element name="wind" type="{http://datex2.eu/schema/2_0RC1/2_0}Wind" minOccurs="0"/&gt;
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/2_0RC1/2_0}Humidity" minOccurs="0"/&gt;
 *         &lt;element name="poorEnvironmentConditionsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PoorEnvironmentConditions", propOrder = {
    "poorEnvironmentType",
    "precipitationDetail",
    "visibility",
    "pollutionMeasurement",
    "temperature",
    "wind",
    "humidity",
    "poorEnvironmentConditionsExtension"
})
public class PoorEnvironmentConditions
    extends Conditions
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected List<PoorEnvironmentTypeEnum> poorEnvironmentType;
    protected PrecipitationDetail precipitationDetail;
    protected Visibility visibility;
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected Temperature temperature;
    protected Wind wind;
    protected Humidity humidity;
    protected ExtensionType poorEnvironmentConditionsExtension;

    /**
     * Gets the value of the poorEnvironmentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poorEnvironmentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoorEnvironmentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PoorEnvironmentTypeEnum }
     * 
     * 
     */
    public List<PoorEnvironmentTypeEnum> getPoorEnvironmentType() {
        if (poorEnvironmentType == null) {
            poorEnvironmentType = new ArrayList<PoorEnvironmentTypeEnum>();
        }
        return this.poorEnvironmentType;
    }

    /**
     * Ruft den Wert der precipitationDetail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrecipitationDetail }
     *     
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Legt den Wert der precipitationDetail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecipitationDetail }
     *     
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Ruft den Wert der visibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Legt den Wert der visibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the pollutionMeasurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pollutionMeasurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollutionMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PollutionMeasurement }
     * 
     * 
     */
    public List<PollutionMeasurement> getPollutionMeasurement() {
        if (pollutionMeasurement == null) {
            pollutionMeasurement = new ArrayList<PollutionMeasurement>();
        }
        return this.pollutionMeasurement;
    }

    /**
     * Ruft den Wert der temperature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Temperature }
     *     
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Legt den Wert der temperature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Temperature }
     *     
     */
    public void setTemperature(Temperature value) {
        this.temperature = value;
    }

    /**
     * Ruft den Wert der wind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Wind }
     *     
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Legt den Wert der wind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Wind }
     *     
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Ruft den Wert der humidity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Legt den Wert der humidity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Ruft den Wert der poorEnvironmentConditionsExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPoorEnvironmentConditionsExtension() {
        return poorEnvironmentConditionsExtension;
    }

    /**
     * Legt den Wert der poorEnvironmentConditionsExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPoorEnvironmentConditionsExtension(ExtensionType value) {
        this.poorEnvironmentConditionsExtension = value;
    }

    public PoorEnvironmentConditions withPoorEnvironmentType(PoorEnvironmentTypeEnum... values) {
        if (values!= null) {
            for (PoorEnvironmentTypeEnum value: values) {
                getPoorEnvironmentType().add(value);
            }
        }
        return this;
    }

    public PoorEnvironmentConditions withPoorEnvironmentType(Collection<PoorEnvironmentTypeEnum> values) {
        if (values!= null) {
            getPoorEnvironmentType().addAll(values);
        }
        return this;
    }

    public PoorEnvironmentConditions withPrecipitationDetail(PrecipitationDetail value) {
        setPrecipitationDetail(value);
        return this;
    }

    public PoorEnvironmentConditions withVisibility(Visibility value) {
        setVisibility(value);
        return this;
    }

    public PoorEnvironmentConditions withPollutionMeasurement(PollutionMeasurement... values) {
        if (values!= null) {
            for (PollutionMeasurement value: values) {
                getPollutionMeasurement().add(value);
            }
        }
        return this;
    }

    public PoorEnvironmentConditions withPollutionMeasurement(Collection<PollutionMeasurement> values) {
        if (values!= null) {
            getPollutionMeasurement().addAll(values);
        }
        return this;
    }

    public PoorEnvironmentConditions withTemperature(Temperature value) {
        setTemperature(value);
        return this;
    }

    public PoorEnvironmentConditions withWind(Wind value) {
        setWind(value);
        return this;
    }

    public PoorEnvironmentConditions withHumidity(Humidity value) {
        setHumidity(value);
        return this;
    }

    public PoorEnvironmentConditions withPoorEnvironmentConditionsExtension(ExtensionType value) {
        setPoorEnvironmentConditionsExtension(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withDrivingConditionType(DrivingConditionTypeEnum value) {
        setDrivingConditionType(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withConditionsExtension(ExtensionType value) {
        setConditionsExtension(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public PoorEnvironmentConditions withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public PoorEnvironmentConditions withId(String value) {
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
