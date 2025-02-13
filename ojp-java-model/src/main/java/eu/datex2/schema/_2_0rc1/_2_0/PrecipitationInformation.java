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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für PrecipitationInformation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PrecipitationInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}WeatherValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="noPrecipitation" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="precipitationDetail" type="{http://datex2.eu/schema/2_0RC1/2_0}PrecipitationDetail" minOccurs="0"/&gt;
 *         &lt;element name="precipitationInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecipitationInformation", propOrder = {
    "noPrecipitation",
    "precipitationDetail",
    "precipitationInformationExtension"
})
public class PrecipitationInformation
    extends WeatherValue {

    protected Boolean noPrecipitation;
    protected PrecipitationDetail precipitationDetail;
    protected ExtensionType precipitationInformationExtension;

    /**
     * Ruft den Wert der noPrecipitation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoPrecipitation() {
        return noPrecipitation;
    }

    /**
     * Legt den Wert der noPrecipitation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoPrecipitation(Boolean value) {
        this.noPrecipitation = value;
    }

    /**
     * Ruft den Wert der precipitationDetail-Eigenschaft ab.
     *
     * @return possible object is {@link PrecipitationDetail }
     */
    public PrecipitationDetail getPrecipitationDetail() {
        return precipitationDetail;
    }

    /**
     * Legt den Wert der precipitationDetail-Eigenschaft fest.
     *
     * @param value allowed object is {@link PrecipitationDetail }
     */
    public void setPrecipitationDetail(PrecipitationDetail value) {
        this.precipitationDetail = value;
    }

    /**
     * Ruft den Wert der precipitationInformationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getPrecipitationInformationExtension() {
        return precipitationInformationExtension;
    }

    /**
     * Legt den Wert der precipitationInformationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setPrecipitationInformationExtension(ExtensionType value) {
        this.precipitationInformationExtension = value;
    }

    public PrecipitationInformation withNoPrecipitation(Boolean value) {
        setNoPrecipitation(value);
        return this;
    }

    public PrecipitationInformation withPrecipitationDetail(PrecipitationDetail value) {
        setPrecipitationDetail(value);
        return this;
    }

    public PrecipitationInformation withPrecipitationInformationExtension(ExtensionType value) {
        setPrecipitationInformationExtension(value);
        return this;
    }

    @Override
    public PrecipitationInformation withWeatherValueExtension(ExtensionType value) {
        setWeatherValueExtension(value);
        return this;
    }

    @Override
    public PrecipitationInformation withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public PrecipitationInformation withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public PrecipitationInformation withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public PrecipitationInformation withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public PrecipitationInformation withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public PrecipitationInformation withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public PrecipitationInformation withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public PrecipitationInformation withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public PrecipitationInformation withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public PrecipitationInformation withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public PrecipitationInformation withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public PrecipitationInformation withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public PrecipitationInformation withBasicDataValueExtension(ExtensionType value) {
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
