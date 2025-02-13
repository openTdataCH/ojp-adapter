//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

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
 * Stop event structure.
 *
 * <p>Java-Klasse für StopEventStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StopEventStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreviousCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ThisCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure"/&gt;
 *         &lt;element name="OnwardCall" type="{http://www.vdv.de/ojp}CallAtNearStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}DatedJourneyStructure"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventStructure", propOrder = {
    "previousCall",
    "thisCall",
    "onwardCall",
    "service",
    "operatingDays",
    "operatingDaysDescription",
    "situationFullRefs",
    "extension"
})
public class StopEventStructure {

    @XmlElement(name = "PreviousCall")
    protected List<CallAtNearStopStructure> previousCall;
    @XmlElement(name = "ThisCall", required = true)
    protected CallAtNearStopStructure thisCall;
    @XmlElement(name = "OnwardCall")
    protected List<CallAtNearStopStructure> onwardCall;
    @XmlElement(name = "Service", required = true)
    protected DatedJourneyStructure service;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the previousCall property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the previousCall property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCall().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CallAtNearStopStructure }
     */
    public List<CallAtNearStopStructure> getPreviousCall() {
        if (previousCall == null) {
            previousCall = new ArrayList<CallAtNearStopStructure>();
        }
        return this.previousCall;
    }

    /**
     * Ruft den Wert der thisCall-Eigenschaft ab.
     *
     * @return possible object is {@link CallAtNearStopStructure }
     */
    public CallAtNearStopStructure getThisCall() {
        return thisCall;
    }

    /**
     * Legt den Wert der thisCall-Eigenschaft fest.
     *
     * @param value allowed object is {@link CallAtNearStopStructure }
     */
    public void setThisCall(CallAtNearStopStructure value) {
        this.thisCall = value;
    }

    /**
     * Gets the value of the onwardCall property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the onwardCall property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnwardCall().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link CallAtNearStopStructure }
     */
    public List<CallAtNearStopStructure> getOnwardCall() {
        if (onwardCall == null) {
            onwardCall = new ArrayList<CallAtNearStopStructure>();
        }
        return this.onwardCall;
    }

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     *
     * @return possible object is {@link DatedJourneyStructure }
     */
    public DatedJourneyStructure getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedJourneyStructure }
     */
    public void setService(DatedJourneyStructure value) {
        this.service = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     *
     * @return possible object is {@link OperatingDaysStructure }
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatingDaysStructure }
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingDaysDescription-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Legt den Wert der operatingDaysDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
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

    public StopEventStructure withPreviousCall(CallAtNearStopStructure... values) {
        if (values != null) {
            for (CallAtNearStopStructure value : values) {
                getPreviousCall().add(value);
            }
        }
        return this;
    }

    public StopEventStructure withPreviousCall(Collection<CallAtNearStopStructure> values) {
        if (values != null) {
            getPreviousCall().addAll(values);
        }
        return this;
    }

    public StopEventStructure withThisCall(CallAtNearStopStructure value) {
        setThisCall(value);
        return this;
    }

    public StopEventStructure withOnwardCall(CallAtNearStopStructure... values) {
        if (values != null) {
            for (CallAtNearStopStructure value : values) {
                getOnwardCall().add(value);
            }
        }
        return this;
    }

    public StopEventStructure withOnwardCall(Collection<CallAtNearStopStructure> values) {
        if (values != null) {
            getOnwardCall().addAll(values);
        }
        return this;
    }

    public StopEventStructure withService(DatedJourneyStructure value) {
        setService(value);
        return this;
    }

    public StopEventStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public StopEventStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public StopEventStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public StopEventStructure withExtension(Object value) {
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
