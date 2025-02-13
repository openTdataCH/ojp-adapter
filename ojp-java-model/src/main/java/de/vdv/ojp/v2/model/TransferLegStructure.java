//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;
import uk.org.siri.siri.InterchangeRefStructure;

/**
 * TRANSFER LEG or CONNECTION LEG according to TM 6.2. Description of a LEG which links other LEGs where a TRANSFER or CONNECTION between different LOCATIONs is required.
 *
 * <p>Java-Klasse für TransferLegStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TransferLegStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransferType" type="{http://www.vdv.de/ojp}TransferTypeEnumeration" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LegStart" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="LegEnd" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TimeWindowGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TransferDurationGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}InterchangeGroup"/&gt;
 *         &lt;element name="LegDescription" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.vdv.de/ojp}LengthType" minOccurs="0"/&gt;
 *         &lt;element name="Attribute" type="{http://www.vdv.de/ojp}GeneralAttributeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PathGuidance" type="{http://www.vdv.de/ojp}PathGuidanceStructure" minOccurs="0"/&gt;
 *         &lt;element name="Feasibility" type="{http://www.vdv.de/ojp}FeasibilityEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferLegStructure", propOrder = {
    "transferType",
    "legStart",
    "legEnd",
    "timeWindowStart",
    "timeWindowEnd",
    "duration",
    "walkDuration",
    "bufferTime",
    "interchangeRef",
    "extraInterchange",
    "interchangeCancellation",
    "staySeated",
    "guaranteed",
    "advertised",
    "legDescription",
    "length",
    "attribute",
    "pathGuidance",
    "feasibility",
    "situationFullRefs",
    "extension"
})
public class TransferLegStructure {

    @XmlElement(name = "TransferType", required = true)
    @XmlSchemaType(name = "string")
    protected List<TransferTypeEnumeration> transferType;
    @XmlElement(name = "LegStart", required = true)
    protected PlaceRefStructure legStart;
    @XmlElement(name = "LegEnd", required = true)
    protected PlaceRefStructure legEnd;
    @XmlElement(name = "TimeWindowStart", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeWindowStart;
    @XmlElement(name = "TimeWindowEnd", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeWindowEnd;
    @XmlElement(name = "Duration", required = true, type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "WalkDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration walkDuration;
    @XmlElement(name = "BufferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration bufferTime;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "ExtraInterchange")
    protected Boolean extraInterchange;
    @XmlElement(name = "InterchangeCancellation")
    protected Boolean interchangeCancellation;
    @XmlElement(name = "StaySeated", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "Guaranteed", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", namespace = "http://www.siri.org.uk/siri", defaultValue = "false")
    protected Boolean advertised;
    @XmlElement(name = "LegDescription")
    protected InternationalTextStructure legDescription;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "PathGuidance")
    protected PathGuidanceStructure pathGuidance;
    @XmlElement(name = "Feasibility")
    @XmlSchemaType(name = "string")
    protected List<FeasibilityEnumeration> feasibility;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the transferType property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the transferType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TransferTypeEnumeration }
     */
    public List<TransferTypeEnumeration> getTransferType() {
        if (transferType == null) {
            transferType = new ArrayList<TransferTypeEnumeration>();
        }
        return this.transferType;
    }

    /**
     * Ruft den Wert der legStart-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceRefStructure }
     */
    public PlaceRefStructure getLegStart() {
        return legStart;
    }

    /**
     * Legt den Wert der legStart-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceRefStructure }
     */
    public void setLegStart(PlaceRefStructure value) {
        this.legStart = value;
    }

    /**
     * Ruft den Wert der legEnd-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceRefStructure }
     */
    public PlaceRefStructure getLegEnd() {
        return legEnd;
    }

    /**
     * Legt den Wert der legEnd-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceRefStructure }
     */
    public void setLegEnd(PlaceRefStructure value) {
        this.legEnd = value;
    }

    /**
     * Ruft den Wert der timeWindowStart-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getTimeWindowStart() {
        return timeWindowStart;
    }

    /**
     * Legt den Wert der timeWindowStart-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeWindowStart(ZonedDateTime value) {
        this.timeWindowStart = value;
    }

    /**
     * Ruft den Wert der timeWindowEnd-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getTimeWindowEnd() {
        return timeWindowEnd;
    }

    /**
     * Legt den Wert der timeWindowEnd-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeWindowEnd(ZonedDateTime value) {
        this.timeWindowEnd = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der walkDuration-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getWalkDuration() {
        return walkDuration;
    }

    /**
     * Legt den Wert der walkDuration-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setWalkDuration(Duration value) {
        this.walkDuration = value;
    }

    /**
     * Ruft den Wert der bufferTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getBufferTime() {
        return bufferTime;
    }

    /**
     * Legt den Wert der bufferTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setBufferTime(Duration value) {
        this.bufferTime = value;
    }

    /**
     * Ruft den Wert der interchangeRef-Eigenschaft ab.
     *
     * @return possible object is {@link InterchangeRefStructure }
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Legt den Wert der interchangeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link InterchangeRefStructure }
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Ruft den Wert der extraInterchange-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isExtraInterchange() {
        return extraInterchange;
    }

    /**
     * Legt den Wert der extraInterchange-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setExtraInterchange(Boolean value) {
        this.extraInterchange = value;
    }

    /**
     * Ruft den Wert der interchangeCancellation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isInterchangeCancellation() {
        return interchangeCancellation;
    }

    /**
     * Legt den Wert der interchangeCancellation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setInterchangeCancellation(Boolean value) {
        this.interchangeCancellation = value;
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
     * Ruft den Wert der legDescription-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getLegDescription() {
        return legDescription;
    }

    /**
     * Legt den Wert der legDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setLegDescription(InternationalTextStructure value) {
        this.legDescription = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the attribute property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the attribute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GeneralAttributeStructure }
     */
    public List<GeneralAttributeStructure> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<GeneralAttributeStructure>();
        }
        return this.attribute;
    }

    /**
     * Ruft den Wert der pathGuidance-Eigenschaft ab.
     *
     * @return possible object is {@link PathGuidanceStructure }
     */
    public PathGuidanceStructure getPathGuidance() {
        return pathGuidance;
    }

    /**
     * Legt den Wert der pathGuidance-Eigenschaft fest.
     *
     * @param value allowed object is {@link PathGuidanceStructure }
     */
    public void setPathGuidance(PathGuidanceStructure value) {
        this.pathGuidance = value;
    }

    /**
     * Gets the value of the feasibility property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the feasibility property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeasibility().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FeasibilityEnumeration }
     */
    public List<FeasibilityEnumeration> getFeasibility() {
        if (feasibility == null) {
            feasibility = new ArrayList<FeasibilityEnumeration>();
        }
        return this.feasibility;
    }

    /**
     * Ruft den Wert der situationFullRefs-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefList }
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefList }
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TransferLegStructure withTransferType(TransferTypeEnumeration... values) {
        if (values != null) {
            for (TransferTypeEnumeration value : values) {
                getTransferType().add(value);
            }
        }
        return this;
    }

    public TransferLegStructure withTransferType(Collection<TransferTypeEnumeration> values) {
        if (values != null) {
            getTransferType().addAll(values);
        }
        return this;
    }

    public TransferLegStructure withLegStart(PlaceRefStructure value) {
        setLegStart(value);
        return this;
    }

    public TransferLegStructure withLegEnd(PlaceRefStructure value) {
        setLegEnd(value);
        return this;
    }

    public TransferLegStructure withTimeWindowStart(ZonedDateTime value) {
        setTimeWindowStart(value);
        return this;
    }

    public TransferLegStructure withTimeWindowEnd(ZonedDateTime value) {
        setTimeWindowEnd(value);
        return this;
    }

    public TransferLegStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TransferLegStructure withWalkDuration(Duration value) {
        setWalkDuration(value);
        return this;
    }

    public TransferLegStructure withBufferTime(Duration value) {
        setBufferTime(value);
        return this;
    }

    public TransferLegStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    public TransferLegStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    public TransferLegStructure withInterchangeCancellation(Boolean value) {
        setInterchangeCancellation(value);
        return this;
    }

    public TransferLegStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    public TransferLegStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    public TransferLegStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    public TransferLegStructure withLegDescription(InternationalTextStructure value) {
        setLegDescription(value);
        return this;
    }

    public TransferLegStructure withLength(BigInteger value) {
        setLength(value);
        return this;
    }

    public TransferLegStructure withAttribute(GeneralAttributeStructure... values) {
        if (values != null) {
            for (GeneralAttributeStructure value : values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public TransferLegStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values != null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public TransferLegStructure withPathGuidance(PathGuidanceStructure value) {
        setPathGuidance(value);
        return this;
    }

    public TransferLegStructure withFeasibility(FeasibilityEnumeration... values) {
        if (values != null) {
            for (FeasibilityEnumeration value : values) {
                getFeasibility().add(value);
            }
        }
        return this;
    }

    public TransferLegStructure withFeasibility(Collection<FeasibilityEnumeration> values) {
        if (values != null) {
            getFeasibility().addAll(values);
        }
        return this;
    }

    public TransferLegStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public TransferLegStructure withExtension(Object value) {
        setExtension(value);
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
