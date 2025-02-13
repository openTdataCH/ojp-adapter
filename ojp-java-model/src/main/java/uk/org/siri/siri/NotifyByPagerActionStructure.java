//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Notify user by Pager.
 *
 * <p>Java-Klasse für NotifyByPagerActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="NotifyByPagerActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PagerGroupRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pager" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyByPagerActionStructure", propOrder = {
    "pagerGroupRef",
    "pager"
})
public class NotifyByPagerActionStructure
    extends PushedActionStructure {

    @XmlElement(name = "PagerGroupRef")
    protected String pagerGroupRef;
    @XmlElement(name = "Pager")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String pager;

    /**
     * Ruft den Wert der pagerGroupRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPagerGroupRef() {
        return pagerGroupRef;
    }

    /**
     * Legt den Wert der pagerGroupRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPagerGroupRef(String value) {
        this.pagerGroupRef = value;
    }

    /**
     * Ruft den Wert der pager-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPager() {
        return pager;
    }

    /**
     * Legt den Wert der pager-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPager(String value) {
        this.pager = value;
    }

    public NotifyByPagerActionStructure withPagerGroupRef(String value) {
        setPagerGroupRef(value);
        return this;
    }

    public NotifyByPagerActionStructure withPager(String value) {
        setPager(value);
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyByPagerActionStructure withActionStatus(ActionStatusEnumeration value) {
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
