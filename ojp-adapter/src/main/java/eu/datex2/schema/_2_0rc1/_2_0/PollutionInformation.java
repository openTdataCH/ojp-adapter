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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für PollutionInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PollutionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollutionMeasurement" type="{http://datex2.eu/schema/2_0RC1/2_0}PollutionMeasurement" maxOccurs="unbounded"/&gt;
 *         &lt;element name="pollutionInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionInformation", propOrder = {
    "pollutionMeasurement",
    "pollutionInformationExtension"
})
public class PollutionInformation
    extends WeatherValue
{

    @XmlElement(required = true)
    protected List<PollutionMeasurement> pollutionMeasurement;
    protected ExtensionType pollutionInformationExtension;

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
     * Ruft den Wert der pollutionInformationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionInformationExtension() {
        return pollutionInformationExtension;
    }

    /**
     * Legt den Wert der pollutionInformationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionInformationExtension(ExtensionType value) {
        this.pollutionInformationExtension = value;
    }

    public PollutionInformation withPollutionMeasurement(PollutionMeasurement... values) {
        if (values!= null) {
            for (PollutionMeasurement value: values) {
                getPollutionMeasurement().add(value);
            }
        }
        return this;
    }

    public PollutionInformation withPollutionMeasurement(Collection<PollutionMeasurement> values) {
        if (values!= null) {
            getPollutionMeasurement().addAll(values);
        }
        return this;
    }

    public PollutionInformation withPollutionInformationExtension(ExtensionType value) {
        setPollutionInformationExtension(value);
        return this;
    }

    @Override
    public PollutionInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public PollutionInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public PollutionInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public PollutionInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public PollutionInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public PollutionInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public PollutionInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public PollutionInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public PollutionInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public PollutionInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public PollutionInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public PollutionInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public PollutionInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public PollutionInformation withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
