//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The ResponseDeclaration complexType is used to contain the definition of the Response Variable that are to be bound to the interactions in the Item.
 *             
 * 
 * <p>Java class for ResponseDeclaration.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseDeclaration.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}defaultValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}correctResponse" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mapping" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}areaMapping" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}baseType.ResponseDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}cardinality.ResponseDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.ResponseDeclaration.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDeclaration.Type", propOrder = {
    "defaultValue",
    "correctResponse",
    "mapping",
    "areaMapping"
})
public class ResponseDeclarationType {

    protected DefaultValueType defaultValue;
    protected CorrectResponseType correctResponse;
    protected MappingType mapping;
    protected AreaMappingType areaMapping;
    @XmlAttribute(name = "baseType")
    protected String baseType;
    @XmlAttribute(name = "cardinality", required = true)
    protected String cardinality;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String identifier;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueType }
     *     
     */
    public DefaultValueType getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueType }
     *     
     */
    public void setDefaultValue(DefaultValueType value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the correctResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectResponseType }
     *     
     */
    public CorrectResponseType getCorrectResponse() {
        return correctResponse;
    }

    /**
     * Sets the value of the correctResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectResponseType }
     *     
     */
    public void setCorrectResponse(CorrectResponseType value) {
        this.correctResponse = value;
    }

    /**
     * Gets the value of the mapping property.
     * 
     * @return
     *     possible object is
     *     {@link MappingType }
     *     
     */
    public MappingType getMapping() {
        return mapping;
    }

    /**
     * Sets the value of the mapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link MappingType }
     *     
     */
    public void setMapping(MappingType value) {
        this.mapping = value;
    }

    /**
     * Gets the value of the areaMapping property.
     * 
     * @return
     *     possible object is
     *     {@link AreaMappingType }
     *     
     */
    public AreaMappingType getAreaMapping() {
        return areaMapping;
    }

    /**
     * Sets the value of the areaMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaMappingType }
     *     
     */
    public void setAreaMapping(AreaMappingType value) {
        this.areaMapping = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
