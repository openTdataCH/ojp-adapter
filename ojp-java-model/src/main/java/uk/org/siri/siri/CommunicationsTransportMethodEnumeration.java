//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für CommunicationsTransportMethodEnumeration.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="CommunicationsTransportMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="httpPost"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="wsdlSoap"/&gt;
 *     &lt;enumeration value="wsdlSoapDocumentLiteral"/&gt;
 *     &lt;enumeration value="httpUrlJSON"/&gt;
 *     &lt;enumeration value="httpUrlProtoBuffers"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "CommunicationsTransportMethodEnumeration")
@XmlEnum
public enum CommunicationsTransportMethodEnumeration {

    @XmlEnumValue("httpPost")
    HTTP_POST("httpPost"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("wsdlSoap")
    WSDL_SOAP("wsdlSoap"),
    @XmlEnumValue("wsdlSoapDocumentLiteral")
    WSDL_SOAP_DOCUMENT_LITERAL("wsdlSoapDocumentLiteral"),
    @XmlEnumValue("httpUrlJSON")
    HTTP_URL_JSON("httpUrlJSON"),
    @XmlEnumValue("httpUrlProtoBuffers")
    HTTP_URL_PROTO_BUFFERS("httpUrlProtoBuffers");
    private final String value;

    CommunicationsTransportMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommunicationsTransportMethodEnumeration fromValue(String v) {
        for (CommunicationsTransportMethodEnumeration c : CommunicationsTransportMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
