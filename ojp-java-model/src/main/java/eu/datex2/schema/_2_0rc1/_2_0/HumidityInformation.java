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
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für HumidityInformation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="HumidityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/2_0RC1/2_0}Humidity"/&gt;
 *         &lt;element name="humidityInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumidityInformation", propOrder = {
    "humidity",
    "humidityInformationExtension"
})
public class HumidityInformation
    extends WeatherValue {

    @XmlElement(required = true)
    protected Humidity humidity;
    protected ExtensionType humidityInformationExtension;

    /**
     * Ruft den Wert der humidity-Eigenschaft ab.
     *
     * @return possible object is {@link Humidity }
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Legt den Wert der humidity-Eigenschaft fest.
     *
     * @param value allowed object is {@link Humidity }
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Ruft den Wert der humidityInformationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getHumidityInformationExtension() {
        return humidityInformationExtension;
    }

    /**
     * Legt den Wert der humidityInformationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setHumidityInformationExtension(ExtensionType value) {
        this.humidityInformationExtension = value;
    }

    public HumidityInformation withHumidity(Humidity value) {
        setHumidity(value);
        return this;
    }

    public HumidityInformation withHumidityInformationExtension(ExtensionType value) {
        setHumidityInformationExtension(value);
        return this;
    }

    @Override
    public HumidityInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public HumidityInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public HumidityInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public HumidityInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public HumidityInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public HumidityInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public HumidityInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public HumidityInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public HumidityInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public HumidityInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public HumidityInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public HumidityInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public HumidityInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public HumidityInformation withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
