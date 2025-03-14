//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import java.time.LocalDateTime;
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
import org.rutebanken.util.LocalDateXmlAdapter;

/**
 * General Fare information. May depend on date.
 *
 * <p>Java-Klasse für StaticFareRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StaticFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareProductRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticFareRequestStructure", propOrder = {
    "date",
    "fareProductRef"
})
public class StaticFareRequestStructure {

    @XmlElement(name = "Date", type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime date;
    @XmlElement(name = "FareProductRef")
    protected List<FareProductRefStructure> fareProductRef;

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDate(LocalDateTime value) {
        this.date = value;
    }

    /**
     * Reference to a FareProduct. If no FareProductRef is specified, the responding system should reply with information about all available fare products.Gets the value of the fareProductRef
     * property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the fareProductRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareProductRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FareProductRefStructure }
     */
    public List<FareProductRefStructure> getFareProductRef() {
        if (fareProductRef == null) {
            fareProductRef = new ArrayList<FareProductRefStructure>();
        }
        return this.fareProductRef;
    }

    public StaticFareRequestStructure withDate(LocalDateTime value) {
        setDate(value);
        return this;
    }

    public StaticFareRequestStructure withFareProductRef(FareProductRefStructure... values) {
        if (values != null) {
            for (FareProductRefStructure value : values) {
                getFareProductRef().add(value);
            }
        }
        return this;
    }

    public StaticFareRequestStructure withFareProductRef(Collection<FareProductRefStructure> values) {
        if (values != null) {
            getFareProductRef().addAll(values);
        }
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
