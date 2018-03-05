//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.xinclude.IncludeType;


/**
 * 
 *                 The ResponseProcessing complexType is the container for response processing instructions. Response processing involves the application of a set of responseRules, including the testing of responseConditions and the evaluation of expressions involving the item variables. For delivery engines that are only designed to support very simple use cases the implementation of a system for carrying out this evaluation, conditional testing and processing may pose a barrier to the adoption of the specification.
 *             
 * 
 * <p>Java class for ResponseProcessing.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseProcessing.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.w3.org/2001/XInclude}include"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}responseCondition"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}responseProcessingFragment"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}setOutcomeValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}exitResponse"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}lookupOutcomeValue"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateLocation.ResponseProcessing.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}template.ResponseProcessing.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseProcessing.Type", propOrder = {
    "includeOrResponseConditionOrResponseProcessingFragment"
})
public class ResponseProcessingType {

    @XmlElements({
        @XmlElement(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = IncludeType.class),
        @XmlElement(name = "responseCondition", type = ResponseConditionType.class),
        @XmlElement(name = "responseProcessingFragment", type = ResponseProcessingFragmentType.class),
        @XmlElement(name = "setOutcomeValue", type = SetValueType.class),
        @XmlElement(name = "exitResponse", type = EmptyPrimitiveTypeType.class),
        @XmlElement(name = "lookupOutcomeValue", type = LookupOutcomeValueType.class)
    })
    protected List<Object> includeOrResponseConditionOrResponseProcessingFragment;
    @XmlAttribute(name = "templateLocation")
    @XmlSchemaType(name = "anyURI")
    protected String templateLocation;
    @XmlAttribute(name = "template")
    @XmlSchemaType(name = "anyURI")
    protected String template;

    /**
     * Gets the value of the includeOrResponseConditionOrResponseProcessingFragment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeOrResponseConditionOrResponseProcessingFragment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeOrResponseConditionOrResponseProcessingFragment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncludeType }
     * {@link ResponseConditionType }
     * {@link ResponseProcessingFragmentType }
     * {@link SetValueType }
     * {@link EmptyPrimitiveTypeType }
     * {@link LookupOutcomeValueType }
     * 
     * 
     */
    public List<Object> getIncludeOrResponseConditionOrResponseProcessingFragment() {
        if (includeOrResponseConditionOrResponseProcessingFragment == null) {
            includeOrResponseConditionOrResponseProcessingFragment = new ArrayList<Object>();
        }
        return this.includeOrResponseConditionOrResponseProcessingFragment;
    }

    /**
     * Gets the value of the templateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateLocation() {
        return templateLocation;
    }

    /**
     * Sets the value of the templateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateLocation(String value) {
        this.templateLocation = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
    }

}