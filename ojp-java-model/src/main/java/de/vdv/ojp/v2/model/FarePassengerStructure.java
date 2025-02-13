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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * [a specialised form of USER PROFILE in TM and NeTEx] attributes of a passenger that influence the price to be paid by that passenger for a FARE PRODUCT.
 *
 * <p>Java-Klasse für FarePassengerStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FarePassengerStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *           &lt;element name="PassengerCategory" type="{http://www.vdv.de/ojp}PassengerCategoryEnumeration"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EntitlementProducts" type="{http://www.vdv.de/ojp}EntitlementProductListStructure" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ZonesAlreadyPaid" type="{http://www.vdv.de/ojp}TariffZoneRefListStructure"/&gt;
 *           &lt;element name="SalesPackageElementRef" type="{http://www.vdv.de/ojp}FareProductRefStructure" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePassengerStructure", propOrder = {
    "age",
    "passengerCategory",
    "entitlementProducts",
    "zonesAlreadyPaid",
    "salesPackageElementRef"
})
public class FarePassengerStructure {

    @XmlElement(name = "Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger age;
    @XmlElement(name = "PassengerCategory")
    @XmlSchemaType(name = "string")
    protected PassengerCategoryEnumeration passengerCategory;
    @XmlElement(name = "EntitlementProducts")
    protected EntitlementProductListStructure entitlementProducts;
    @XmlElement(name = "ZonesAlreadyPaid")
    protected TariffZoneRefListStructure zonesAlreadyPaid;
    @XmlElement(name = "SalesPackageElementRef")
    protected List<FareProductRefStructure> salesPackageElementRef;

    /**
     * Ruft den Wert der age-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Legt den Wert der age-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Ruft den Wert der passengerCategory-Eigenschaft ab.
     *
     * @return possible object is {@link PassengerCategoryEnumeration }
     */
    public PassengerCategoryEnumeration getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Legt den Wert der passengerCategory-Eigenschaft fest.
     *
     * @param value allowed object is {@link PassengerCategoryEnumeration }
     */
    public void setPassengerCategory(PassengerCategoryEnumeration value) {
        this.passengerCategory = value;
    }

    /**
     * Ruft den Wert der entitlementProducts-Eigenschaft ab.
     *
     * @return possible object is {@link EntitlementProductListStructure }
     */
    public EntitlementProductListStructure getEntitlementProducts() {
        return entitlementProducts;
    }

    /**
     * Legt den Wert der entitlementProducts-Eigenschaft fest.
     *
     * @param value allowed object is {@link EntitlementProductListStructure }
     */
    public void setEntitlementProducts(EntitlementProductListStructure value) {
        this.entitlementProducts = value;
    }

    /**
     * Ruft den Wert der zonesAlreadyPaid-Eigenschaft ab.
     *
     * @return possible object is {@link TariffZoneRefListStructure }
     */
    public TariffZoneRefListStructure getZonesAlreadyPaid() {
        return zonesAlreadyPaid;
    }

    /**
     * Legt den Wert der zonesAlreadyPaid-Eigenschaft fest.
     *
     * @param value allowed object is {@link TariffZoneRefListStructure }
     */
    public void setZonesAlreadyPaid(TariffZoneRefListStructure value) {
        this.zonesAlreadyPaid = value;
    }

    /**
     * Gets the value of the salesPackageElementRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the salesPackageElementRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesPackageElementRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FareProductRefStructure }
     */
    public List<FareProductRefStructure> getSalesPackageElementRef() {
        if (salesPackageElementRef == null) {
            salesPackageElementRef = new ArrayList<FareProductRefStructure>();
        }
        return this.salesPackageElementRef;
    }

    public FarePassengerStructure withAge(BigInteger value) {
        setAge(value);
        return this;
    }

    public FarePassengerStructure withPassengerCategory(PassengerCategoryEnumeration value) {
        setPassengerCategory(value);
        return this;
    }

    public FarePassengerStructure withEntitlementProducts(EntitlementProductListStructure value) {
        setEntitlementProducts(value);
        return this;
    }

    public FarePassengerStructure withZonesAlreadyPaid(TariffZoneRefListStructure value) {
        setZonesAlreadyPaid(value);
        return this;
    }

    public FarePassengerStructure withSalesPackageElementRef(FareProductRefStructure... values) {
        if (values != null) {
            for (FareProductRefStructure value : values) {
                getSalesPackageElementRef().add(value);
            }
        }
        return this;
    }

    public FarePassengerStructure withSalesPackageElementRef(Collection<FareProductRefStructure> values) {
        if (values != null) {
            getSalesPackageElementRef().addAll(values);
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
