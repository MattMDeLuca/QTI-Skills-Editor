//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The TemplateProcessing complexType is the container for the template processing rules. Template processing consists of one or more templateRules that are followed by the cloning engine or delivery system in order to assign values to the template variables. Template processing is identical in form to responseProcessing except that the purpose is to assign values to template variables, not outcome variables.
 *             
 * 
 * <p>Java class for TemplateProcessing.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateProcessing.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}setTemplateValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}exitTemplate"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateCondition"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}setDefaultValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}setCorrectResponse"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateConstraint"/>
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
@XmlType(name = "TemplateProcessing.Type", propOrder = {
    "setTemplateValueOrExitTemplateOrTemplateCondition"
})
public class TemplateProcessingType {

    @XmlElementRefs({
        @XmlElementRef(name = "templateConstraint", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setTemplateValue", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exitTemplate", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setDefaultValue", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateCondition", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "setCorrectResponse", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> setTemplateValueOrExitTemplateOrTemplateCondition;

    /**
     * Gets the value of the setTemplateValueOrExitTemplateOrTemplateCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setTemplateValueOrExitTemplateOrTemplateCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetTemplateValueOrExitTemplateOrTemplateCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link EmptyPrimitiveTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateConstraintType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateConditionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetValueType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSetTemplateValueOrExitTemplateOrTemplateCondition() {
        if (setTemplateValueOrExitTemplateOrTemplateCondition == null) {
            setTemplateValueOrExitTemplateOrTemplateCondition = new ArrayList<JAXBElement<?>>();
        }
        return this.setTemplateValueOrExitTemplateOrTemplateCondition;
    }

}
