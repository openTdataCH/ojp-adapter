//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;

/**
 * Planned Connection between two VEHICLE JOURNEYs.
 *
 * <p>Java-Klasse für TargetedInterchangeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TargetedInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}InterchangeCode" minOccurs="0"/&gt;
 *           &lt;element name="DistributorVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure"/&gt;
 *           &lt;choice&gt;
 *             &lt;element name="DistributorConnectionLinkRef" type="{http://www.siri.org.uk/siri}ConnectionLinkRefStructure"/&gt;
 *             &lt;element name="DistributorConnectionLink" type="{http://www.siri.org.uk/siri}ContextualisedConnectionLinkStructure"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorVisitNumber" minOccurs="0"/&gt;
 *         &lt;element name="DistributorOrder" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetedInterchangeStructure", propOrder = {
    "interchangeCode",
    "distributorVehicleJourneyRef",
    "distributorConnectionLinkRef",
    "distributorConnectionLink",
    "distributorVisitNumber",
    "distributorOrder",
    "staySeated",
    "guaranteed",
    "advertised",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime"
})
public class TargetedInterchangeStructure {

    @XmlElement(name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String interchangeCode;
    @XmlElement(name = "DistributorVehicleJourneyRef", required = true)
    protected DatedVehicleJourneyRefStructure distributorVehicleJourneyRef;
    @XmlElement(name = "DistributorConnectionLinkRef")
    protected ConnectionLinkRefStructure distributorConnectionLinkRef;
    @XmlElement(name = "DistributorConnectionLink")
    protected ContextualisedConnectionLinkStructure distributorConnectionLink;
    @XmlElement(name = "DistributorVisitNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "DistributorOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorOrder;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "false")
    protected Boolean advertised;
    @XmlElement(name = "StandardWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumTransferTime;

    /**
     * Ruft den Wert der interchangeCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getInterchangeCode() {
        return interchangeCode;
    }

    /**
     * Legt den Wert der interchangeCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setInterchangeCode(String value) {
        this.interchangeCode = value;
    }

    /**
     * Ruft den Wert der distributorVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyRefStructure }
     */
    public DatedVehicleJourneyRefStructure getDistributorVehicleJourneyRef() {
        return distributorVehicleJourneyRef;
    }

    /**
     * Legt den Wert der distributorVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyRefStructure }
     */
    public void setDistributorVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.distributorVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der distributorConnectionLinkRef-Eigenschaft ab.
     *
     * @return possible object is {@link ConnectionLinkRefStructure }
     */
    public ConnectionLinkRefStructure getDistributorConnectionLinkRef() {
        return distributorConnectionLinkRef;
    }

    /**
     * Legt den Wert der distributorConnectionLinkRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ConnectionLinkRefStructure }
     */
    public void setDistributorConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.distributorConnectionLinkRef = value;
    }

    /**
     * Ruft den Wert der distributorConnectionLink-Eigenschaft ab.
     *
     * @return possible object is {@link ContextualisedConnectionLinkStructure }
     */
    public ContextualisedConnectionLinkStructure getDistributorConnectionLink() {
        return distributorConnectionLink;
    }

    /**
     * Legt den Wert der distributorConnectionLink-Eigenschaft fest.
     *
     * @param value allowed object is {@link ContextualisedConnectionLinkStructure }
     */
    public void setDistributorConnectionLink(ContextualisedConnectionLinkStructure value) {
        this.distributorConnectionLink = value;
    }

    /**
     * Ruft den Wert der distributorVisitNumber-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getDistributorVisitNumber() {
        return distributorVisitNumber;
    }

    /**
     * Legt den Wert der distributorVisitNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setDistributorVisitNumber(BigInteger value) {
        this.distributorVisitNumber = value;
    }

    /**
     * Ruft den Wert der distributorOrder-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getDistributorOrder() {
        return distributorOrder;
    }

    /**
     * Legt den Wert der distributorOrder-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setDistributorOrder(BigInteger value) {
        this.distributorOrder = value;
    }

    /**
     * Ruft den Wert der staySeated-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Legt den Wert der staySeated-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Ruft den Wert der guaranteed-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Legt den Wert der guaranteed-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Ruft den Wert der standardWaitTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Legt den Wert der standardWaitTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumWaitTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Legt den Wert der maximumWaitTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumAutomaticWaitTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Legt den Wert der maximumAutomaticWaitTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    /**
     * Ruft den Wert der standardTransferTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Legt den Wert der standardTransferTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    /**
     * Ruft den Wert der minimumTransferTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Legt den Wert der minimumTransferTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    /**
     * Ruft den Wert der maximumTransferTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Legt den Wert der maximumTransferTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

    public TargetedInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    public TargetedInterchangeStructure withDistributorVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        setDistributorVehicleJourneyRef(value);
        return this;
    }

    public TargetedInterchangeStructure withDistributorConnectionLinkRef(ConnectionLinkRefStructure value) {
        setDistributorConnectionLinkRef(value);
        return this;
    }

    public TargetedInterchangeStructure withDistributorConnectionLink(ContextualisedConnectionLinkStructure value) {
        setDistributorConnectionLink(value);
        return this;
    }

    public TargetedInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    public TargetedInterchangeStructure withDistributorOrder(BigInteger value) {
        setDistributorOrder(value);
        return this;
    }

    public TargetedInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    public TargetedInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    public TargetedInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    public TargetedInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    public TargetedInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    public TargetedInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    public TargetedInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    public TargetedInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    public TargetedInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
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
