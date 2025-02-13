//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.OtherErrorStructure;

/**
 * Type for Error: OJP Error.
 *
 * <p>Java-Klasse für OJPErrorStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}OtherErrorStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}ErrorType"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ProblemDetailGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPErrorStructure", propOrder = {
    "errorType",
    "details",
    "logData"
})
public class OJPErrorStructure
    extends OtherErrorStructure {

    @XmlElementRef(name = "ErrorType", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class)
    protected JAXBElement<?> errorType;
    @XmlElement(name = "Details")
    protected InternationalTextStructure details;
    @XmlElement(name = "LogData")
    protected String logData;

    /**
     * Ruft den Wert der errorType-Eigenschaft ab.
     *
     * @return possible object is {@link JAXBElement }{@code <}{@link AvailabilityProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link ExchangePointsProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link FareProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link LineInformationProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocationProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link OJPGenericProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link StatusProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link StopEventProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripChangeProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link TripInfoProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public JAXBElement<?> getErrorType() {
        return errorType;
    }

    /**
     * Legt den Wert der errorType-Eigenschaft fest.
     *
     * @param value allowed object is {@link JAXBElement }{@code <}{@link AvailabilityProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link ExchangePointsProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link FareProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link LineInformationProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link LocationProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link OJPGenericProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link StatusProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link StopEventProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link TripChangeProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link TripInfoProblemTypeEnumeration }{@code >} {@link JAXBElement }{@code <}{@link TripProblemTypeEnumeration }{@code >}
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    public void setErrorType(JAXBElement<?> value) {
        this.errorType = value;
    }

    /**
     * Ruft den Wert der details-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getDetails() {
        return details;
    }

    /**
     * Legt den Wert der details-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setDetails(InternationalTextStructure value) {
        this.details = value;
    }

    /**
     * Ruft den Wert der logData-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getLogData() {
        return logData;
    }

    /**
     * Legt den Wert der logData-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLogData(String value) {
        this.logData = value;
    }

    public OJPErrorStructure withErrorType(JAXBElement<?> value) {
        setErrorType(value);
        return this;
    }

    public OJPErrorStructure withDetails(InternationalTextStructure value) {
        setDetails(value);
        return this;
    }

    public OJPErrorStructure withLogData(String value) {
        setLogData(value);
        return this;
    }

    @Override
    public OJPErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public OJPErrorStructure withNumber(BigInteger value) {
        setNumber(value);
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
