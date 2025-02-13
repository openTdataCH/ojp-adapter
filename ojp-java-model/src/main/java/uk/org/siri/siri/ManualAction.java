//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für anonymous complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ManualActionStructure"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ManualAction")
public class ManualAction
    extends ManualActionStructure {

    @Override
    public ManualAction withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public ManualAction withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public ManualAction withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public ManualAction withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public ManualAction withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public ManualAction withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
