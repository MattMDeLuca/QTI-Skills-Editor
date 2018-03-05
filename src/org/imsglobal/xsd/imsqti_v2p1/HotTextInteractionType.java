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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._1998.math.mathml.MathType;
import org.w3._2001.xinclude.IncludeType;


/**
 * 
 *                 The HotTextInteraction complexType is the container for information about a hotText interaction. The hottext interaction presents a set of choices to the candidate represented as selectable runs of text embedded within a surrounding context, such as a simple passage of text. Like choiceInteraction, the candidate's task is to select one or more of the choices, up to a maximum of maxChoices. The interaction is initialized from the defaultValue of the associated response variable, a NULL value indicating that no choices are selected (the usual case). The hottextInteraction must be bound to a response variable with a baseType of identifier and single or multiple cardinality.
 *             
 * 
 * <p>Java class for HotTextInteraction.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotTextInteraction.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}prompt" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}feedbackBlock"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateBlock"/>
 *           &lt;element ref="{http://www.w3.org/1998/Math/MathML}math"/>
 *           &lt;element ref="{http://www.w3.org/2001/XInclude}include"/>
 *           &lt;choice>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}pre"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h1"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h2"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h3"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h4"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h5"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}h6"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}p"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}address"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}dl"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ol"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}hr"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ul"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}blockquote"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}table"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}div"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}xmllang.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}minChoices.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}label.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}responseIdentifier.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}maxChoices.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}class.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}id.HotTextInteraction.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}xmlbase.HotTextInteraction.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotTextInteraction.Type", propOrder = {
    "prompt",
    "feedbackBlockOrTemplateBlockOrMath"
})
public class HotTextInteractionType {

    protected PromptType prompt;
    @XmlElementRefs({
        @XmlElementRef(name = "ol", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feedbackBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> feedbackBlockOrTemplateBlockOrMath;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "minChoices")
    protected Integer minChoices;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "responseIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String responseIdentifier;
    @XmlAttribute(name = "maxChoices")
    protected Integer maxChoices;
    @XmlAttribute(name = "class")
    protected List<String> clazz;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link PromptType }
     *     
     */
    public PromptType getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromptType }
     *     
     */
    public void setPrompt(PromptType value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the feedbackBlockOrTemplateBlockOrMath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedbackBlockOrTemplateBlockOrMath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedbackBlockOrTemplateBlockOrMath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link HRType }{@code >}
     * {@link JAXBElement }{@code <}{@link DivType }{@code >}
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeedbackBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockQuoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link DLType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFeedbackBlockOrTemplateBlockOrMath() {
        if (feedbackBlockOrTemplateBlockOrMath == null) {
            feedbackBlockOrTemplateBlockOrMath = new ArrayList<JAXBElement<?>>();
        }
        return this.feedbackBlockOrTemplateBlockOrMath;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the minChoices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMinChoices() {
        if (minChoices == null) {
            return  0;
        } else {
            return minChoices;
        }
    }

    /**
     * Sets the value of the minChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinChoices(Integer value) {
        this.minChoices = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the responseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseIdentifier() {
        return responseIdentifier;
    }

    /**
     * Sets the value of the responseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseIdentifier(String value) {
        this.responseIdentifier = value;
    }

    /**
     * Gets the value of the maxChoices property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getMaxChoices() {
        if (maxChoices == null) {
            return  0;
        } else {
            return maxChoices;
        }
    }

    /**
     * Sets the value of the maxChoices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChoices(Integer value) {
        this.maxChoices = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<String>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

}
