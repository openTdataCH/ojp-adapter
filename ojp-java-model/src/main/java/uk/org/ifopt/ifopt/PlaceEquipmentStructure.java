//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.NaturalLanguageStringStructure;

/**
 * Type for SITE EQUIPMENT.
 *
 * <p>Java-Klasse für PlaceEquipmentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceEquipmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}InstalledEquipmentStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceEquipmentStructure", propOrder = {
    "extensions"
})
public class PlaceEquipmentStructure
    extends InstalledEquipmentStructure {

    @XmlElement(name = "Extensions")
    protected Extensions extensions;

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link Extensions }
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link Extensions }
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public PlaceEquipmentStructure withExtensions(Extensions value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public PlaceEquipmentStructure withStatus(StatusEnumeration value) {
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
