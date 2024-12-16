//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageQualifierStructure;


/**
 * <p>Java-Klasse für OJPAvailabilityRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPAvailabilityRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}AvailabilityRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPAvailabilityRequestStructure", propOrder = {
    "rest"
})
public class OJPAvailabilityRequestStructure
    extends AbstractOJPServiceRequestStructure
{

    @XmlElementRefs({
        @XmlElementRef(name = "PublicTransport", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MobilityUser", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EarliestDepartureTime", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LatestArrivalTime", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Extension", namespace = "http://www.vdv.de/ojp", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Extensions", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Extension" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 36 von file:/C:/Users/u210875/IdeaProjects/ojp-java-model/src/main/resources/xsd/ojp2/OJP/OJP_Availability.xsd
     * Zeile 59 von file:/C:/Users/u210875/IdeaProjects/ojp-java-model/src/main/resources/xsd/ojp2/OJP/OJP_RequestSupport.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BookingPTLegStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link BookingUserStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ZonedDateTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtensionsStructure }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

    public OJPAvailabilityRequestStructure withRest(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getRest().add(value);
            }
        }
        return this;
    }

    public OJPAvailabilityRequestStructure withRest(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getRest().addAll(values);
        }
        return this;
    }

    @Override
    public OJPAvailabilityRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPAvailabilityRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPAvailabilityRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPAvailabilityRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
