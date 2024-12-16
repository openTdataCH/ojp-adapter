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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.NaturalLanguageStringStructure;


/**
 * Type for abstract EQUIPMENT.
 * 
 * <p>Java-Klasse für AbstractEquipmentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractEquipmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}DataManagedObjectStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractEquipmentStructure", propOrder = {
    "equipmentId",
    "equipmentName",
    "typeOfEquipment"
})
@XmlSeeAlso({
    InstalledEquipmentStructure.class
})
public abstract class AbstractEquipmentStructure
    extends DataManagedObjectStructure
{

    @XmlElement(name = "EquipmentId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String equipmentId;
    @XmlElement(name = "EquipmentName")
    protected NaturalLanguageStringStructure equipmentName;
    @XmlElement(name = "TypeOfEquipment")
    protected EquipmentTypeRefStructure typeOfEquipment;

    /**
     * Ruft den Wert der equipmentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Legt den Wert der equipmentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentId(String value) {
        this.equipmentId = value;
    }

    /**
     * Ruft den Wert der equipmentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getEquipmentName() {
        return equipmentName;
    }

    /**
     * Legt den Wert der equipmentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setEquipmentName(NaturalLanguageStringStructure value) {
        this.equipmentName = value;
    }

    /**
     * Ruft den Wert der typeOfEquipment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public EquipmentTypeRefStructure getTypeOfEquipment() {
        return typeOfEquipment;
    }

    /**
     * Legt den Wert der typeOfEquipment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentTypeRefStructure }
     *     
     */
    public void setTypeOfEquipment(EquipmentTypeRefStructure value) {
        this.typeOfEquipment = value;
    }

    public AbstractEquipmentStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    public AbstractEquipmentStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    public AbstractEquipmentStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public AbstractEquipmentStructure withStatus(StatusEnumeration value) {
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
