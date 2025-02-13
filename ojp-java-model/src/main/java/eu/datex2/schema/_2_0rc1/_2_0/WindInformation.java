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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für WindInformation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="WindInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wind" type="{http://datex2.eu/schema/2_0RC1/2_0}Wind"/&gt;
 *         &lt;element name="windInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindInformation", propOrder = {
    "wind",
    "windInformationExtension"
})
public class WindInformation
    extends WeatherValue {

    @XmlElement(required = true)
    protected Wind wind;
    protected ExtensionType windInformationExtension;

    /**
     * Ruft den Wert der wind-Eigenschaft ab.
     *
     * @return possible object is {@link Wind }
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * Legt den Wert der wind-Eigenschaft fest.
     *
     * @param value allowed object is {@link Wind }
     */
    public void setWind(Wind value) {
        this.wind = value;
    }

    /**
     * Ruft den Wert der windInformationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getWindInformationExtension() {
        return windInformationExtension;
    }

    /**
     * Legt den Wert der windInformationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setWindInformationExtension(ExtensionType value) {
        this.windInformationExtension = value;
    }

    public WindInformation withWind(Wind value) {
        setWind(value);
        return this;
    }

    public WindInformation withWindInformationExtension(ExtensionType value) {
        setWindInformationExtension(value);
        return this;
    }

    @Override
    public WindInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public WindInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public WindInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public WindInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public WindInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public WindInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public WindInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public WindInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public WindInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public WindInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public WindInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public WindInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public WindInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public WindInformation withBasicDataValueExtension(ExtensionType value) {
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
