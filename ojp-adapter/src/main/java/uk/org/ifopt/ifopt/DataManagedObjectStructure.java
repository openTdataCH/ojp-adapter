//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Abstract Type for DATA MANAGED OBJECT, that is an object that may be assigned a RESPONSIBILITY SET dictating a responsible ORGANISATION and/or ADMINISTRATIVE ZONE.
 * 
 * <p>Java-Klasse für DataManagedObjectStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DataManagedObjectStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}VersionedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DataManagedObjectGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataManagedObjectStructure", propOrder = {
    "managedByAreaRef",
    "infoLinks"
})
@XmlSeeAlso({
    AbstractEquipmentStructure.class
})
public abstract class DataManagedObjectStructure
    extends VersionedObjectStructure
{

    @XmlElement(name = "ManagedByAreaRef")
    protected AdministrativeAreaRefStructure managedByAreaRef;
    @XmlElement(name = "InfoLinks")
    protected InfoLinksStructure infoLinks;

    /**
     * Ruft den Wert der managedByAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public AdministrativeAreaRefStructure getManagedByAreaRef() {
        return managedByAreaRef;
    }

    /**
     * Legt den Wert der managedByAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeAreaRefStructure }
     *     
     */
    public void setManagedByAreaRef(AdministrativeAreaRefStructure value) {
        this.managedByAreaRef = value;
    }

    /**
     * Ruft den Wert der infoLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InfoLinksStructure }
     *     
     */
    public InfoLinksStructure getInfoLinks() {
        return infoLinks;
    }

    /**
     * Legt den Wert der infoLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoLinksStructure }
     *     
     */
    public void setInfoLinks(InfoLinksStructure value) {
        this.infoLinks = value;
    }

    public DataManagedObjectStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    public DataManagedObjectStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public DataManagedObjectStructure withStatus(StatusEnumeration value) {
        setStatus(value);
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
