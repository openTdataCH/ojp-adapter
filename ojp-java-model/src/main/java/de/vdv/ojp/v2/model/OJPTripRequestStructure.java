//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageQualifierStructure;
import uk.org.siri.siri.ParticipantRefStructure;

/**
 * <p>Java-Klasse für OJPTripRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPTripRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPTripRequestStructure", propOrder = {
    "origin",
    "destination",
    "via",
    "viaSystem",
    "notVia",
    "noChangeAt",
    "params",
    "extensions"
})
public class OJPTripRequestStructure
    extends AbstractOJPServiceRequestStructure {

    @XmlElement(name = "Origin", required = true)
    protected List<PlaceContextStructure> origin;
    @XmlElement(name = "Destination", required = true)
    protected List<PlaceContextStructure> destination;
    @XmlElement(name = "Via")
    protected List<TripViaStructure> via;
    @XmlElement(name = "ViaSystem")
    protected List<ParticipantRefStructure> viaSystem;
    @XmlElement(name = "NotVia")
    protected List<NotViaStructure> notVia;
    @XmlElement(name = "NoChangeAt")
    protected List<NoChangeAtStructure> noChangeAt;
    @XmlElement(name = "Params")
    protected TripParamStructure params;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the origin property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the origin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PlaceContextStructure }
     */
    public List<PlaceContextStructure> getOrigin() {
        if (origin == null) {
            origin = new ArrayList<PlaceContextStructure>();
        }
        return this.origin;
    }

    /**
     * Gets the value of the destination property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destination property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PlaceContextStructure }
     */
    public List<PlaceContextStructure> getDestination() {
        if (destination == null) {
            destination = new ArrayList<PlaceContextStructure>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the via property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the via property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TripViaStructure }
     */
    public List<TripViaStructure> getVia() {
        if (via == null) {
            via = new ArrayList<TripViaStructure>();
        }
        return this.via;
    }

    /**
     * Gets the value of the viaSystem property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the viaSystem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViaSystem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ParticipantRefStructure }
     */
    public List<ParticipantRefStructure> getViaSystem() {
        if (viaSystem == null) {
            viaSystem = new ArrayList<ParticipantRefStructure>();
        }
        return this.viaSystem;
    }

    /**
     * Gets the value of the notVia property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the notVia property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotVia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NotViaStructure }
     */
    public List<NotViaStructure> getNotVia() {
        if (notVia == null) {
            notVia = new ArrayList<NotViaStructure>();
        }
        return this.notVia;
    }

    /**
     * Gets the value of the noChangeAt property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the noChangeAt property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoChangeAt().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NoChangeAtStructure }
     */
    public List<NoChangeAtStructure> getNoChangeAt() {
        if (noChangeAt == null) {
            noChangeAt = new ArrayList<NoChangeAtStructure>();
        }
        return this.noChangeAt;
    }

    /**
     * Ruft den Wert der params-Eigenschaft ab.
     *
     * @return possible object is {@link TripParamStructure }
     */
    public TripParamStructure getParams() {
        return params;
    }

    /**
     * Legt den Wert der params-Eigenschaft fest.
     *
     * @param value allowed object is {@link TripParamStructure }
     */
    public void setParams(TripParamStructure value) {
        this.params = value;
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

    public OJPTripRequestStructure withOrigin(PlaceContextStructure... values) {
        if (values != null) {
            for (PlaceContextStructure value : values) {
                getOrigin().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withOrigin(Collection<PlaceContextStructure> values) {
        if (values != null) {
            getOrigin().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withDestination(PlaceContextStructure... values) {
        if (values != null) {
            for (PlaceContextStructure value : values) {
                getDestination().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withDestination(Collection<PlaceContextStructure> values) {
        if (values != null) {
            getDestination().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withVia(TripViaStructure... values) {
        if (values != null) {
            for (TripViaStructure value : values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withVia(Collection<TripViaStructure> values) {
        if (values != null) {
            getVia().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withViaSystem(ParticipantRefStructure... values) {
        if (values != null) {
            for (ParticipantRefStructure value : values) {
                getViaSystem().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withViaSystem(Collection<ParticipantRefStructure> values) {
        if (values != null) {
            getViaSystem().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withNotVia(NotViaStructure... values) {
        if (values != null) {
            for (NotViaStructure value : values) {
                getNotVia().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withNotVia(Collection<NotViaStructure> values) {
        if (values != null) {
            getNotVia().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withNoChangeAt(NoChangeAtStructure... values) {
        if (values != null) {
            for (NoChangeAtStructure value : values) {
                getNoChangeAt().add(value);
            }
        }
        return this;
    }

    public OJPTripRequestStructure withNoChangeAt(Collection<NoChangeAtStructure> values) {
        if (values != null) {
            getNoChangeAt().addAll(values);
        }
        return this;
    }

    public OJPTripRequestStructure withParams(TripParamStructure value) {
        setParams(value);
        return this;
    }

    public OJPTripRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPTripRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
