//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für GroupOfPeopleInvolved complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="GroupOfPeopleInvolved"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfPeople" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="injuryStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}InjuryStatusTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="involvementRole" type="{http://datex2.eu/schema/2_0RC1/2_0}InvolvementRolesEnum" minOccurs="0"/&gt;
 *         &lt;element name="categoryOfPeopleInvolved" type="{http://datex2.eu/schema/2_0RC1/2_0}PersonCategoryEnum" minOccurs="0"/&gt;
 *         &lt;element name="groupOfPeopleInvolvedExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupOfPeopleInvolved", propOrder = {
    "numberOfPeople",
    "injuryStatus",
    "involvementRole",
    "categoryOfPeopleInvolved",
    "groupOfPeopleInvolvedExtension"
})
public class GroupOfPeopleInvolved {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfPeople;
    @XmlSchemaType(name = "string")
    protected InjuryStatusTypeEnum injuryStatus;
    @XmlSchemaType(name = "string")
    protected InvolvementRolesEnum involvementRole;
    @XmlSchemaType(name = "string")
    protected PersonCategoryEnum categoryOfPeopleInvolved;
    protected ExtensionType groupOfPeopleInvolvedExtension;

    /**
     * Ruft den Wert der numberOfPeople-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * Legt den Wert der numberOfPeople-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfPeople(BigInteger value) {
        this.numberOfPeople = value;
    }

    /**
     * Ruft den Wert der injuryStatus-Eigenschaft ab.
     *
     * @return possible object is {@link InjuryStatusTypeEnum }
     */
    public InjuryStatusTypeEnum getInjuryStatus() {
        return injuryStatus;
    }

    /**
     * Legt den Wert der injuryStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link InjuryStatusTypeEnum }
     */
    public void setInjuryStatus(InjuryStatusTypeEnum value) {
        this.injuryStatus = value;
    }

    /**
     * Ruft den Wert der involvementRole-Eigenschaft ab.
     *
     * @return possible object is {@link InvolvementRolesEnum }
     */
    public InvolvementRolesEnum getInvolvementRole() {
        return involvementRole;
    }

    /**
     * Legt den Wert der involvementRole-Eigenschaft fest.
     *
     * @param value allowed object is {@link InvolvementRolesEnum }
     */
    public void setInvolvementRole(InvolvementRolesEnum value) {
        this.involvementRole = value;
    }

    /**
     * Ruft den Wert der categoryOfPeopleInvolved-Eigenschaft ab.
     *
     * @return possible object is {@link PersonCategoryEnum }
     */
    public PersonCategoryEnum getCategoryOfPeopleInvolved() {
        return categoryOfPeopleInvolved;
    }

    /**
     * Legt den Wert der categoryOfPeopleInvolved-Eigenschaft fest.
     *
     * @param value allowed object is {@link PersonCategoryEnum }
     */
    public void setCategoryOfPeopleInvolved(PersonCategoryEnum value) {
        this.categoryOfPeopleInvolved = value;
    }

    /**
     * Ruft den Wert der groupOfPeopleInvolvedExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getGroupOfPeopleInvolvedExtension() {
        return groupOfPeopleInvolvedExtension;
    }

    /**
     * Legt den Wert der groupOfPeopleInvolvedExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setGroupOfPeopleInvolvedExtension(ExtensionType value) {
        this.groupOfPeopleInvolvedExtension = value;
    }

    public GroupOfPeopleInvolved withNumberOfPeople(BigInteger value) {
        setNumberOfPeople(value);
        return this;
    }

    public GroupOfPeopleInvolved withInjuryStatus(InjuryStatusTypeEnum value) {
        setInjuryStatus(value);
        return this;
    }

    public GroupOfPeopleInvolved withInvolvementRole(InvolvementRolesEnum value) {
        setInvolvementRole(value);
        return this;
    }

    public GroupOfPeopleInvolved withCategoryOfPeopleInvolved(PersonCategoryEnum value) {
        setCategoryOfPeopleInvolved(value);
        return this;
    }

    public GroupOfPeopleInvolved withGroupOfPeopleInvolvedExtension(ExtensionType value) {
        setGroupOfPeopleInvolvedExtension(value);
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
