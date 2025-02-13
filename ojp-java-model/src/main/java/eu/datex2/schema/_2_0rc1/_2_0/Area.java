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
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für Area complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Area"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCArea" minOccurs="0"/&gt;
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegAreaLocation" minOccurs="0"/&gt;
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "alertCArea",
    "tpegAreaLocation",
    "areaExtension"
})
public class Area
    extends Location {

    protected AlertCArea alertCArea;
    protected TpegAreaLocation tpegAreaLocation;
    protected ExtensionType areaExtension;

    /**
     * Ruft den Wert der alertCArea-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCArea }
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Legt den Wert der alertCArea-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCArea }
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    /**
     * Ruft den Wert der tpegAreaLocation-Eigenschaft ab.
     *
     * @return possible object is {@link TpegAreaLocation }
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Legt den Wert der tpegAreaLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegAreaLocation }
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    /**
     * Ruft den Wert der areaExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Legt den Wert der areaExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAreaExtension(ExtensionType value) {
        this.areaExtension = value;
    }

    public Area withAlertCArea(AlertCArea value) {
        setAlertCArea(value);
        return this;
    }

    public Area withTpegAreaLocation(TpegAreaLocation value) {
        setTpegAreaLocation(value);
        return this;
    }

    public Area withAreaExtension(ExtensionType value) {
        setAreaExtension(value);
        return this;
    }

    @Override
    public Area withExternalReferencing(ExternalReferencing... values) {
        if (values != null) {
            for (ExternalReferencing value : values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Area withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values != null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Area withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Area withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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
