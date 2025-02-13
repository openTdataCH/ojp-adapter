//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for Prediction Quality quantifcation.
 *
 * <p>Java-Klasse für PredictionQualityStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PredictionQualityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PredictionLevel" type="{http://www.siri.org.uk/siri}QualityIndexEnumeration"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="Percentile" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="LowerTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *           &lt;element name="HigherTimeLimit" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredictionQualityStructure", propOrder = {
    "predictionLevel",
    "percentile",
    "lowerTimeLimit",
    "higherTimeLimit"
})
public class PredictionQualityStructure {

    @XmlElement(name = "PredictionLevel", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityIndexEnumeration predictionLevel;
    @XmlElement(name = "Percentile", defaultValue = "0.9")
    protected BigDecimal percentile;
    @XmlElement(name = "LowerTimeLimit", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime lowerTimeLimit;
    @XmlElement(name = "HigherTimeLimit", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime higherTimeLimit;

    /**
     * Ruft den Wert der predictionLevel-Eigenschaft ab.
     *
     * @return possible object is {@link QualityIndexEnumeration }
     */
    public QualityIndexEnumeration getPredictionLevel() {
        return predictionLevel;
    }

    /**
     * Legt den Wert der predictionLevel-Eigenschaft fest.
     *
     * @param value allowed object is {@link QualityIndexEnumeration }
     */
    public void setPredictionLevel(QualityIndexEnumeration value) {
        this.predictionLevel = value;
    }

    /**
     * Ruft den Wert der percentile-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getPercentile() {
        return percentile;
    }

    /**
     * Legt den Wert der percentile-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setPercentile(BigDecimal value) {
        this.percentile = value;
    }

    /**
     * Ruft den Wert der lowerTimeLimit-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getLowerTimeLimit() {
        return lowerTimeLimit;
    }

    /**
     * Legt den Wert der lowerTimeLimit-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLowerTimeLimit(ZonedDateTime value) {
        this.lowerTimeLimit = value;
    }

    /**
     * Ruft den Wert der higherTimeLimit-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getHigherTimeLimit() {
        return higherTimeLimit;
    }

    /**
     * Legt den Wert der higherTimeLimit-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHigherTimeLimit(ZonedDateTime value) {
        this.higherTimeLimit = value;
    }

    public PredictionQualityStructure withPredictionLevel(QualityIndexEnumeration value) {
        setPredictionLevel(value);
        return this;
    }

    public PredictionQualityStructure withPercentile(BigDecimal value) {
        setPercentile(value);
        return this;
    }

    public PredictionQualityStructure withLowerTimeLimit(ZonedDateTime value) {
        setLowerTimeLimit(value);
        return this;
    }

    public PredictionQualityStructure withHigherTimeLimit(ZonedDateTime value) {
        setHigherTimeLimit(value);
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
