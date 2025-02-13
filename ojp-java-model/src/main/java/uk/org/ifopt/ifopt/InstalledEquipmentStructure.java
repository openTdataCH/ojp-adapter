//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.NaturalLanguageStringStructure;

/**
 * Type for INSTALLED EQUIPMENT.
 *
 * <p>Java-Klasse für InstalledEquipmentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InstalledEquipmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ifopt.org.uk/ifopt}AbstractEquipmentStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalledEquipmentStructure")
@XmlSeeAlso({
    PlaceEquipmentStructure.class,
    LocalServiceStructure.class
})
public abstract class InstalledEquipmentStructure
    extends AbstractEquipmentStructure {

    @Override
    public InstalledEquipmentStructure withEquipmentId(String value) {
        setEquipmentId(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withEquipmentName(NaturalLanguageStringStructure value) {
        setEquipmentName(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withTypeOfEquipment(EquipmentTypeRefStructure value) {
        setTypeOfEquipment(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withManagedByAreaRef(AdministrativeAreaRefStructure value) {
        setManagedByAreaRef(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withInfoLinks(InfoLinksStructure value) {
        setInfoLinks(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withCreated(ZonedDateTime value) {
        setCreated(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withLastUpdated(ZonedDateTime value) {
        setLastUpdated(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withModification(ModificationEnumeration value) {
        setModification(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withVersion(BigInteger value) {
        setVersion(value);
        return this;
    }

    @Override
    public InstalledEquipmentStructure withStatus(StatusEnumeration value) {
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
