//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type for a versioned reference to an ORGANISATION with administrative responsibility.
 *
 * <p>Java-Klasse für AdministratorVersionedRefStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AdministratorVersionedRefStructure"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.ifopt.org.uk/ifopt&gt;AdministratorCodeType"&gt;
 *       &lt;attGroup ref="{http://www.ifopt.org.uk/ifopt}ModificationDetailsGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdministratorVersionedRefStructure", propOrder = {
    "value"
})
public class AdministratorVersionedRefStructure {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "created")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime created;
    @XmlAttribute(name = "lastUpdated")
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime lastUpdated;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "version")
    protected BigInteger version;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;

    /**
     * Type for identifier of an ORGANISATION with administrative responsibility.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der created-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getCreated() {
        return created;
    }

    /**
     * Legt den Wert der created-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCreated(ZonedDateTime value) {
        this.created = value;
    }

    /**
     * Ruft den Wert der lastUpdated-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Legt den Wert der lastUpdated-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLastUpdated(ZonedDateTime value) {
        this.lastUpdated = value;
    }

    /**
     * Ruft den Wert der modification-Eigenschaft ab.
     *
     * @return possible object is {@link ModificationEnumeration }
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.NEW;
        } else {
            return modification;
        }
    }

    /**
     * Legt den Wert der modification-Eigenschaft fest.
     *
     * @param value allowed object is {@link ModificationEnumeration }
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return possible object is {@link StatusEnumeration }
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.ACTIVE;
        } else {
            return status;
        }
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value allowed object is {@link StatusEnumeration }
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

    public AdministratorVersionedRefStructure withValue(String value) {
        setValue(value);
        return this;
    }

    public AdministratorVersionedRefStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    public AdministratorVersionedRefStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    public AdministratorVersionedRefStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    public AdministratorVersionedRefStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    public AdministratorVersionedRefStructure withStatus(StatusEnumeration value) {
        setStatus(value);
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
