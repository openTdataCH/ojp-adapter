//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Information about a SERVICE JOURNEY INTERCHANGE at CONNECTION link from a given SCHEDULED STOP POINT.
 *
 * <p>Java-Klasse für AffectedInterchangeStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InterchangeRef" type="{http://www.siri.org.uk/siri}InterchangeRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="InterchangeStopPointRef" type="{http://www.siri.org.uk/siri}StopPointRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="InterchangeStopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectingVehicleJourneyRef" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyRefStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}InterchangeStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedInterchangeStructure", propOrder = {
    "interchangeRef",
    "interchangeStopPointRef",
    "interchangeStopPointName",
    "connectingVehicleJourneyRef",
    "interchangeStatusType",
    "connectionLink",
    "extensions"
})
public class AffectedInterchangeStructure {

    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "InterchangeStopPointRef")
    protected StopPointRefStructure interchangeStopPointRef;
    @XmlElement(name = "InterchangeStopPointName")
    protected List<NaturalLanguageStringStructure> interchangeStopPointName;
    @XmlElement(name = "ConnectingVehicleJourneyRef")
    protected DatedVehicleJourneyRefStructure connectingVehicleJourneyRef;
    @XmlElement(name = "InterchangeStatusType", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected InterchangeStatusEnumeration interchangeStatusType;
    @XmlElement(name = "ConnectionLink")
    protected List<AffectedConnectionLinkStructure> connectionLink;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

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
     * Ruft den Wert der interchangeStopPointRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getInterchangeStopPointRef() {
        return interchangeStopPointRef;
    }

    /**
     * Legt den Wert der interchangeStopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setInterchangeStopPointRef(StopPointRefStructure value) {
        this.interchangeStopPointRef = value;
    }

    /**
     * Gets the value of the interchangeStopPointName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the interchangeStopPointName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterchangeStopPointName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getInterchangeStopPointName() {
        if (interchangeStopPointName == null) {
            interchangeStopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.interchangeStopPointName;
    }

    /**
     * Ruft den Wert der connectingVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyRefStructure }
     */
    public DatedVehicleJourneyRefStructure getConnectingVehicleJourneyRef() {
        return connectingVehicleJourneyRef;
    }

    /**
     * Legt den Wert der connectingVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyRefStructure }
     */
    public void setConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        this.connectingVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der interchangeStatusType-Eigenschaft ab.
     *
     * @return possible object is {@link InterchangeStatusEnumeration }
     */
    public InterchangeStatusEnumeration getInterchangeStatusType() {
        return interchangeStatusType;
    }

    /**
     * Legt den Wert der interchangeStatusType-Eigenschaft fest.
     *
     * @param value allowed object is {@link InterchangeStatusEnumeration }
     */
    public void setInterchangeStatusType(InterchangeStatusEnumeration value) {
        this.interchangeStatusType = value;
    }

    /**
     * Gets the value of the connectionLink property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the connectionLink property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionLink().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link AffectedConnectionLinkStructure }
     */
    public List<AffectedConnectionLinkStructure> getConnectionLink() {
        if (connectionLink == null) {
            connectionLink = new ArrayList<AffectedConnectionLinkStructure>();
        }
        return this.connectionLink;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointRef(StopPointRefStructure value) {
        setInterchangeStopPointRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getInterchangeStopPointName().add(value);
            }
        }
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getInterchangeStopPointName().addAll(values);
        }
        return this;
    }

    public AffectedInterchangeStructure withConnectingVehicleJourneyRef(DatedVehicleJourneyRefStructure value) {
        setConnectingVehicleJourneyRef(value);
        return this;
    }

    public AffectedInterchangeStructure withInterchangeStatusType(InterchangeStatusEnumeration value) {
        setInterchangeStatusType(value);
        return this;
    }

    public AffectedInterchangeStructure withConnectionLink(AffectedConnectionLinkStructure... values) {
        if (values != null) {
            for (AffectedConnectionLinkStructure value : values) {
                getConnectionLink().add(value);
            }
        }
        return this;
    }

    public AffectedInterchangeStructure withConnectionLink(Collection<AffectedConnectionLinkStructure> values) {
        if (values != null) {
            getConnectionLink().addAll(values);
        }
        return this;
    }

    public AffectedInterchangeStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
