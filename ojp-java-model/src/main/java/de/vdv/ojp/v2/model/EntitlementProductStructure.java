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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.HalfOpenTimestampOutputRangeStructure;

/**
 * [a specific form of TRAVEL DOCUMENT in TM and NeTEx] Precondition to access a service or to purchase a FARE PRODUCT issued by an organisation that may not be a PT operator (e.g., military card,
 * concessionary card). In most cases, ENTITLEMENT PRODUCTs offer discounts, e.g., the "BahnCard50" of "Deutsche Bahn".
 *
 * <p>Java-Klasse für EntitlementProductStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EntitlementProductStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}FareAuthorityRef"/&gt;
 *         &lt;element name="EntitlementProductRef" type="{http://www.vdv.de/ojp}EntitlementProductCodeType"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element name="EntitlementProductName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProductStructure", propOrder = {
    "fareAuthorityRef",
    "entitlementProductRef",
    "validityPeriod",
    "entitlementProductName"
})
public class EntitlementProductStructure {

    @XmlElement(name = "FareAuthorityRef", required = true)
    protected FareAuthorityRefStructure fareAuthorityRef;
    @XmlElement(name = "EntitlementProductRef", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String entitlementProductRef;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "EntitlementProductName", required = true)
    protected String entitlementProductName;

    /**
     * Reference to the fare authority that issued the ENTITLEMENT PRODUCT
     *
     * @return possible object is {@link FareAuthorityRefStructure }
     */
    public FareAuthorityRefStructure getFareAuthorityRef() {
        return fareAuthorityRef;
    }

    /**
     * Legt den Wert der fareAuthorityRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FareAuthorityRefStructure }
     */
    public void setFareAuthorityRef(FareAuthorityRefStructure value) {
        this.fareAuthorityRef = value;
    }

    /**
     * Ruft den Wert der entitlementProductRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getEntitlementProductRef() {
        return entitlementProductRef;
    }

    /**
     * Legt den Wert der entitlementProductRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntitlementProductRef(String value) {
        this.entitlementProductRef = value;
    }

    /**
     * Ruft den Wert der validityPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link HalfOpenTimestampOutputRangeStructure }
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Legt den Wert der validityPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link HalfOpenTimestampOutputRangeStructure }
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
    }

    /**
     * Ruft den Wert der entitlementProductName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getEntitlementProductName() {
        return entitlementProductName;
    }

    /**
     * Legt den Wert der entitlementProductName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEntitlementProductName(String value) {
        this.entitlementProductName = value;
    }

    public EntitlementProductStructure withFareAuthorityRef(FareAuthorityRefStructure value) {
        setFareAuthorityRef(value);
        return this;
    }

    public EntitlementProductStructure withEntitlementProductRef(String value) {
        setEntitlementProductRef(value);
        return this;
    }

    public EntitlementProductStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public EntitlementProductStructure withEntitlementProductName(String value) {
        setEntitlementProductName(value);
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
