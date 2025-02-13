//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für ManagedCause complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" minOccurs="0"/&gt;
 *         &lt;element name="managedCauseExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCause", propOrder = {
    "managedCause",
    "managedCauseExtension"
})
public class ManagedCause
    extends Cause {

    protected String managedCause;
    protected ExtensionType managedCauseExtension;

    /**
     * Ruft den Wert der managedCause-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getManagedCause() {
        return managedCause;
    }

    /**
     * Legt den Wert der managedCause-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setManagedCause(String value) {
        this.managedCause = value;
    }

    /**
     * Ruft den Wert der managedCauseExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getManagedCauseExtension() {
        return managedCauseExtension;
    }

    /**
     * Legt den Wert der managedCauseExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setManagedCauseExtension(ExtensionType value) {
        this.managedCauseExtension = value;
    }

    public ManagedCause withManagedCause(String value) {
        setManagedCause(value);
        return this;
    }

    public ManagedCause withManagedCauseExtension(ExtensionType value) {
        setManagedCauseExtension(value);
        return this;
    }

    @Override
    public ManagedCause withCauseExtension(ExtensionType value) {
        setCauseExtension(value);
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
