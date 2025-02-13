//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Indication of the direction of travel of the vehicle (e.g. TRAIN formation) with respect to the platform, or more precisely the QUAY. (since SIRI 2.1) Examples:
 * - "towards A" or "towards sector A" if the QUAY is separated into sub-QUAYs or so called sectors. This would be equivalent to the vehicle arriving or departing in the direction of sector A on a
 * QUAY with sectors A-B-C-D. If the arriving vehicle is represented as an arrow, "towards A" would be abstracted as "=> A-B-C-D". If the departing vehicle is represented as an arrow, "towards A"
 * would be abstracted as "<= A-B-C-D".
 * - "towards 0" or "towards reference point 0" if sectors are not available or the QUAY has a reference point, e.g. for measuring the length of the QUAY, identified by "0". This would be equivalent
 * to the vehicle arriving or departing in the direction of this reference point. If the arriving vehicle is represented as an arrow, "towards 0" would be abstracted as "=> 0...100". "100" (as in
 * percent) could denote the opposite side of the QUAY (measured at the full length of the QUAY with respect to the reference point). If the departing vehicle is represented as an arrow, "towards 0"
 * would be abstracted as "<= 0...100". It is advised to specify a reference point that is meaningful for passengers on location.
 *
 * <p>Java-Klasse für VehicleOrientationRelativeToQuay complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VehicleOrientationRelativeToQuay"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;http://www.siri.org.uk/siri&gt;NaturalLanguageStringStructure"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleOrientationRelativeToQuay")
public class VehicleOrientationRelativeToQuay
    extends NaturalLanguageStringStructure {

    @Override
    public VehicleOrientationRelativeToQuay withValue(String value) {
        setValue(value);
        return this;
    }

    @Override
    public VehicleOrientationRelativeToQuay withLang(String value) {
        setLang(value);
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
