//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für HazardousMaterials complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="HazardousMaterials"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chemicalName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString"/&gt;
 *         &lt;element name="dangerousGoodsFlashPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}TemperatureCelsius" minOccurs="0"/&gt;
 *         &lt;element name="dangerousGoodsRegulations" type="{http://datex2.eu/schema/2_0RC1/2_0}DangerousGoodsRegulationsEnum" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="hazardCodeVersionNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="hazardSubstanceItemPageNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="tremCardNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="undgNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="volumeOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}CubicMetres" minOccurs="0"/&gt;
 *         &lt;element name="weightOfDangerousGoods" type="{http://datex2.eu/schema/2_0RC1/2_0}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="hazardousMaterialsExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardousMaterials", propOrder = {
    "chemicalName",
    "dangerousGoodsFlashPoint",
    "dangerousGoodsRegulations",
    "hazardCodeIdentification",
    "hazardCodeVersionNumber",
    "hazardSubstanceItemPageNumber",
    "tremCardNumber",
    "undgNumber",
    "volumeOfDangerousGoods",
    "weightOfDangerousGoods",
    "hazardousMaterialsExtension"
})
public class HazardousMaterials {

    @XmlElement(required = true)
    protected MultilingualString chemicalName;
    protected Float dangerousGoodsFlashPoint;
    @XmlSchemaType(name = "string")
    protected DangerousGoodsRegulationsEnum dangerousGoodsRegulations;
    protected String hazardCodeIdentification;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger hazardCodeVersionNumber;
    protected String hazardSubstanceItemPageNumber;
    protected String tremCardNumber;
    protected String undgNumber;
    protected Float volumeOfDangerousGoods;
    protected Float weightOfDangerousGoods;
    protected ExtensionType hazardousMaterialsExtension;

    /**
     * Ruft den Wert der chemicalName-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getChemicalName() {
        return chemicalName;
    }

    /**
     * Legt den Wert der chemicalName-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setChemicalName(MultilingualString value) {
        this.chemicalName = value;
    }

    /**
     * Ruft den Wert der dangerousGoodsFlashPoint-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDangerousGoodsFlashPoint() {
        return dangerousGoodsFlashPoint;
    }

    /**
     * Legt den Wert der dangerousGoodsFlashPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDangerousGoodsFlashPoint(Float value) {
        this.dangerousGoodsFlashPoint = value;
    }

    /**
     * Ruft den Wert der dangerousGoodsRegulations-Eigenschaft ab.
     *
     * @return possible object is {@link DangerousGoodsRegulationsEnum }
     */
    public DangerousGoodsRegulationsEnum getDangerousGoodsRegulations() {
        return dangerousGoodsRegulations;
    }

    /**
     * Legt den Wert der dangerousGoodsRegulations-Eigenschaft fest.
     *
     * @param value allowed object is {@link DangerousGoodsRegulationsEnum }
     */
    public void setDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        this.dangerousGoodsRegulations = value;
    }

    /**
     * Ruft den Wert der hazardCodeIdentification-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getHazardCodeIdentification() {
        return hazardCodeIdentification;
    }

    /**
     * Legt den Wert der hazardCodeIdentification-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHazardCodeIdentification(String value) {
        this.hazardCodeIdentification = value;
    }

    /**
     * Ruft den Wert der hazardCodeVersionNumber-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getHazardCodeVersionNumber() {
        return hazardCodeVersionNumber;
    }

    /**
     * Legt den Wert der hazardCodeVersionNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setHazardCodeVersionNumber(BigInteger value) {
        this.hazardCodeVersionNumber = value;
    }

    /**
     * Ruft den Wert der hazardSubstanceItemPageNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getHazardSubstanceItemPageNumber() {
        return hazardSubstanceItemPageNumber;
    }

    /**
     * Legt den Wert der hazardSubstanceItemPageNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHazardSubstanceItemPageNumber(String value) {
        this.hazardSubstanceItemPageNumber = value;
    }

    /**
     * Ruft den Wert der tremCardNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getTremCardNumber() {
        return tremCardNumber;
    }

    /**
     * Legt den Wert der tremCardNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTremCardNumber(String value) {
        this.tremCardNumber = value;
    }

    /**
     * Ruft den Wert der undgNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getUndgNumber() {
        return undgNumber;
    }

    /**
     * Legt den Wert der undgNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setUndgNumber(String value) {
        this.undgNumber = value;
    }

    /**
     * Ruft den Wert der volumeOfDangerousGoods-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getVolumeOfDangerousGoods() {
        return volumeOfDangerousGoods;
    }

    /**
     * Legt den Wert der volumeOfDangerousGoods-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setVolumeOfDangerousGoods(Float value) {
        this.volumeOfDangerousGoods = value;
    }

    /**
     * Ruft den Wert der weightOfDangerousGoods-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getWeightOfDangerousGoods() {
        return weightOfDangerousGoods;
    }

    /**
     * Legt den Wert der weightOfDangerousGoods-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setWeightOfDangerousGoods(Float value) {
        this.weightOfDangerousGoods = value;
    }

    /**
     * Ruft den Wert der hazardousMaterialsExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getHazardousMaterialsExtension() {
        return hazardousMaterialsExtension;
    }

    /**
     * Legt den Wert der hazardousMaterialsExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setHazardousMaterialsExtension(ExtensionType value) {
        this.hazardousMaterialsExtension = value;
    }

    public HazardousMaterials withChemicalName(MultilingualString value) {
        setChemicalName(value);
        return this;
    }

    public HazardousMaterials withDangerousGoodsFlashPoint(Float value) {
        setDangerousGoodsFlashPoint(value);
        return this;
    }

    public HazardousMaterials withDangerousGoodsRegulations(DangerousGoodsRegulationsEnum value) {
        setDangerousGoodsRegulations(value);
        return this;
    }

    public HazardousMaterials withHazardCodeIdentification(String value) {
        setHazardCodeIdentification(value);
        return this;
    }

    public HazardousMaterials withHazardCodeVersionNumber(BigInteger value) {
        setHazardCodeVersionNumber(value);
        return this;
    }

    public HazardousMaterials withHazardSubstanceItemPageNumber(String value) {
        setHazardSubstanceItemPageNumber(value);
        return this;
    }

    public HazardousMaterials withTremCardNumber(String value) {
        setTremCardNumber(value);
        return this;
    }

    public HazardousMaterials withUndgNumber(String value) {
        setUndgNumber(value);
        return this;
    }

    public HazardousMaterials withVolumeOfDangerousGoods(Float value) {
        setVolumeOfDangerousGoods(value);
        return this;
    }

    public HazardousMaterials withWeightOfDangerousGoods(Float value) {
        setWeightOfDangerousGoods(value);
        return this;
    }

    public HazardousMaterials withHazardousMaterialsExtension(ExtensionType value) {
        setHazardousMaterialsExtension(value);
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
