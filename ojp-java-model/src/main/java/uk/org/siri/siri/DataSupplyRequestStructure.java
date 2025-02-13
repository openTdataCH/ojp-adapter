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
import jakarta.xml.bind.annotation.XmlType;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Data supply Request.
 *
 * <p>Java-Klasse für DataSupplyRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DataSupplyRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ConsumerRequestEndpointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DataSupplyTopicGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSupplyRequestStructure", propOrder = {
    "notificationRef",
    "allData"
})
public class DataSupplyRequestStructure
    extends ConsumerRequestEndpointStructure {

    @XmlElement(name = "NotificationRef")
    protected MessageRefStructure notificationRef;
    @XmlElement(name = "AllData", defaultValue = "false")
    protected Boolean allData;

    /**
     * Ruft den Wert der notificationRef-Eigenschaft ab.
     *
     * @return possible object is {@link MessageRefStructure }
     */
    public MessageRefStructure getNotificationRef() {
        return notificationRef;
    }

    /**
     * Legt den Wert der notificationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link MessageRefStructure }
     */
    public void setNotificationRef(MessageRefStructure value) {
        this.notificationRef = value;
    }

    /**
     * Ruft den Wert der allData-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAllData() {
        return allData;
    }

    /**
     * Legt den Wert der allData-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAllData(Boolean value) {
        this.allData = value;
    }

    public DataSupplyRequestStructure withNotificationRef(MessageRefStructure value) {
        setNotificationRef(value);
        return this;
    }

    public DataSupplyRequestStructure withAllData(Boolean value) {
        setAllData(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withAddress(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withConsumerRef(ParticipantRefStructure value) {
        setConsumerRef(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withDelegatorAddress(String value) {
        setDelegatorAddress(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withDelegatorRef(ParticipantRefStructure value) {
        setDelegatorRef(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public DataSupplyRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
