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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Element that connects FareProducts to trips. A TripFareProduct is a FAREPRODUCT covering a part or the whole of a TRIP from boarding the first public transport vehicle to alighting from the last
 * public transport vehicle (corresponds to a package of PREASSIGNED FARE PRODUCTs)
 *
 * <p>Java-Klasse für TripFareProductReferenceStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TripFareProductReferenceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareProductRef"/&gt;
 *         &lt;element name="FromTripIdRef" type="{http://www.vdv.de/ojp}TripObjectIdType"/&gt;
 *         &lt;element name="FromLegIdRef" type="{http://www.vdv.de/ojp}LegObjectIdType" minOccurs="0"/&gt;
 *         &lt;element name="ToTripIdRef" type="{http://www.vdv.de/ojp}TripObjectIdType"/&gt;
 *         &lt;element name="ToLegIdRef" type="{http://www.vdv.de/ojp}LegObjectIdType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripFareProductReferenceStructure", propOrder = {
    "fareProductRef",
    "fromTripIdRef",
    "fromLegIdRef",
    "toTripIdRef",
    "toLegIdRef"
})
public class TripFareProductReferenceStructure {

    @XmlElement(name = "FareProductRef", required = true)
    protected FareProductRefStructure fareProductRef;
    @XmlElement(name = "FromTripIdRef", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fromTripIdRef;
    @XmlElement(name = "FromLegIdRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String fromLegIdRef;
    @XmlElement(name = "ToTripIdRef", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String toTripIdRef;
    @XmlElement(name = "ToLegIdRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String toLegIdRef;

    /**
     * Ruft den Wert der fareProductRef-Eigenschaft ab.
     *
     * @return possible object is {@link FareProductRefStructure }
     */
    public FareProductRefStructure getFareProductRef() {
        return fareProductRef;
    }

    /**
     * Legt den Wert der fareProductRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FareProductRefStructure }
     */
    public void setFareProductRef(FareProductRefStructure value) {
        this.fareProductRef = value;
    }

    /**
     * Ruft den Wert der fromTripIdRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFromTripIdRef() {
        return fromTripIdRef;
    }

    /**
     * Legt den Wert der fromTripIdRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFromTripIdRef(String value) {
        this.fromTripIdRef = value;
    }

    /**
     * Ruft den Wert der fromLegIdRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFromLegIdRef() {
        return fromLegIdRef;
    }

    /**
     * Legt den Wert der fromLegIdRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFromLegIdRef(String value) {
        this.fromLegIdRef = value;
    }

    /**
     * Ruft den Wert der toTripIdRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getToTripIdRef() {
        return toTripIdRef;
    }

    /**
     * Legt den Wert der toTripIdRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setToTripIdRef(String value) {
        this.toTripIdRef = value;
    }

    /**
     * Ruft den Wert der toLegIdRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getToLegIdRef() {
        return toLegIdRef;
    }

    /**
     * Legt den Wert der toLegIdRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setToLegIdRef(String value) {
        this.toLegIdRef = value;
    }

    public TripFareProductReferenceStructure withFareProductRef(FareProductRefStructure value) {
        setFareProductRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withFromTripIdRef(String value) {
        setFromTripIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withFromLegIdRef(String value) {
        setFromLegIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withToTripIdRef(String value) {
        setToTripIdRef(value);
        return this;
    }

    public TripFareProductReferenceStructure withToLegIdRef(String value) {
        setToLegIdRef(value);
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
