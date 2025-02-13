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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Action Publish SITUATION To Mobile Applications.
 *
 * <p>Java-Klasse für PublishToMobileActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PublishToMobileActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Incidents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HomePage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToMobileActionStructure", propOrder = {
    "incidents",
    "homePage"
})
public class PublishToMobileActionStructure
    extends ParameterisedActionStructure {

    @XmlElement(name = "Incidents", defaultValue = "true")
    protected Boolean incidents;
    @XmlElement(name = "HomePage", defaultValue = "false")
    protected Boolean homePage;

    /**
     * Ruft den Wert der incidents-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncidents() {
        return incidents;
    }

    /**
     * Legt den Wert der incidents-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncidents(Boolean value) {
        this.incidents = value;
    }

    /**
     * Ruft den Wert der homePage-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isHomePage() {
        return homePage;
    }

    /**
     * Legt den Wert der homePage-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setHomePage(Boolean value) {
        this.homePage = value;
    }

    public PublishToMobileActionStructure withIncidents(Boolean value) {
        setIncidents(value);
        return this;
    }

    public PublishToMobileActionStructure withHomePage(Boolean value) {
        setHomePage(value);
        return this;
    }

    @Override
    public PublishToMobileActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToMobileActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToMobileActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToMobileActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToMobileActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToMobileActionStructure withActionStatus(ActionStatusEnumeration value) {
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
