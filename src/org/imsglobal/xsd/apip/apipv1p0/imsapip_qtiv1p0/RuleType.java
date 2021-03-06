//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.apip.apipv1p0.imsapip_qtiv1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The Rule complexType is the container for the simple specification of the Rule to be used with the set of APIP Items.
 *             
 * 
 * <p>Java class for Rule.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rule.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;choice>
 *           &lt;element name="ruleSystemSI" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}SIRuleSystem.Type"/>
 *           &lt;element name="ruleSystemUS" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}USRuleSystem.Type"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rule.Type", propOrder = {
    "description",
    "ruleSystemSI",
    "ruleSystemUS"
})
public class RuleType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    protected SIRuleSystemType ruleSystemSI;
    protected USRuleSystemType ruleSystemUS;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the ruleSystemSI property.
     * 
     * @return
     *     possible object is
     *     {@link SIRuleSystemType }
     *     
     */
    public SIRuleSystemType getRuleSystemSI() {
        return ruleSystemSI;
    }

    /**
     * Sets the value of the ruleSystemSI property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIRuleSystemType }
     *     
     */
    public void setRuleSystemSI(SIRuleSystemType value) {
        this.ruleSystemSI = value;
    }

    /**
     * Gets the value of the ruleSystemUS property.
     * 
     * @return
     *     possible object is
     *     {@link USRuleSystemType }
     *     
     */
    public USRuleSystemType getRuleSystemUS() {
        return ruleSystemUS;
    }

    /**
     * Sets the value of the ruleSystemUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link USRuleSystemType }
     *     
     */
    public void setRuleSystemUS(USRuleSystemType value) {
        this.ruleSystemUS = value;
    }

}
