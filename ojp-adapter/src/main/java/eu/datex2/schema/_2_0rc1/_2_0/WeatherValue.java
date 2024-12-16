//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für WeatherValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WeatherValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weatherValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherValue", propOrder = {
    "weatherValueExtension"
})
@XmlSeeAlso({
    HumidityInformation.class,
    PollutionInformation.class,
    PrecipitationInformation.class,
    RoadSurfaceConditionInformation.class,
    TemperatureInformation.class,
    VisibilityInformation.class,
    WindInformation.class
})
public abstract class WeatherValue
    extends BasicDataValue
{

    protected ExtensionType weatherValueExtension;

    /**
     * Ruft den Wert der weatherValueExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherValueExtension() {
        return weatherValueExtension;
    }

    /**
     * Legt den Wert der weatherValueExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherValueExtension(ExtensionType value) {
        this.weatherValueExtension = value;
    }

    public WeatherValue withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public WeatherValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public WeatherValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public WeatherValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public WeatherValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public WeatherValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public WeatherValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public WeatherValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public WeatherValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public WeatherValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public WeatherValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public WeatherValue withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public WeatherValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public WeatherValue withBasicDataValueExtension(ExtensionType value) {
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
