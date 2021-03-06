//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.imsglobal.xsd.apip.apipv1p0.imsapip_qtiv1p0.APIPAccessibilityType;
import org.w3._1998.math.mathml.MathType;
import org.w3._2001.xinclude.IncludeType;


/**
 * 
 *                 The ModalFeedback complexType is the container for the item feedback to be presented to the candidate. Modal feedback is shown to the candidate directly following response processing. The value of an outcome variable is used in conjunction with the showHide and identifier attributes to determine whether or not the feedback is shown.
 *             
 * 
 * <p>Java class for ModalFeedback.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModalFeedback.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}printedVariable"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}hottext"/>
 *           &lt;element name="templateInline" type="{http://www.imsglobal.org/xsd/imsqti_v2p1}TemplateInline.Type"/>
 *           &lt;element name="templateBlock" type="{http://www.imsglobal.org/xsd/imsqti_v2p1}TemplateBlock.Type"/>
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
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ul"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}br"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}hr"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}img"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}object"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}blockquote"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}em"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}a"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}code"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}span"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sub"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}acronym"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}big"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}tt"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}kbd"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}q"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}i"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}dfn"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}abbr"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}strong"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sup"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}var"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}small"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}samp"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}b"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}cite"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}table"/>
 *             &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}div"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}stylesheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}apipAccessibility" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}title.ModalFeedback.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeIdentifier.ModalFeedback.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.ModalFeedback.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}showHide.ModalFeedback.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModalFeedback.Type", propOrder = {
    "content"
})
public class ModalFeedbackType {

    @XmlElementRefs({
        @XmlElementRef(name = "kbd", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "b", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hottext", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sub", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "i", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "small", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "object", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "code", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sup", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dfn", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "big", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateInline", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stylesheet", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "em", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "br", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "samp", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "var", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "printedVariable", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "apipAccessibility", namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strong", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "span", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abbr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "cite", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "tt", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "q", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "title")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlAttribute(name = "outcomeIdentifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String outcomeIdentifier;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "showHide", required = true)
    protected String showHide;

    /**
     * 
     *                 The ModalFeedback complexType is the container for the item feedback to be presented to the candidate. Modal feedback is shown to the candidate directly following response processing. The value of an outcome variable is used in conjunction with the showHide and identifier attributes to determine whether or not the feedback is shown.
     *             Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HotTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ObjectType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateInlineType }{@code >}
     * {@link JAXBElement }{@code <}{@link StyleSheetType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link HRType }{@code >}
     * {@link JAXBElement }{@code <}{@link DivType }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link JAXBElement }{@code <}{@link BRType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrintedVariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link APIPAccessibilityType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockQuoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ImgType }{@code >}
     * {@link JAXBElement }{@code <}{@link QType }{@code >}
     * {@link JAXBElement }{@code <}{@link DLType }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the outcomeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeIdentifier() {
        return outcomeIdentifier;
    }

    /**
     * Sets the value of the outcomeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeIdentifier(String value) {
        this.outcomeIdentifier = value;
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

    /**
     * Gets the value of the showHide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowHide() {
        return showHide;
    }

    /**
     * Sets the value of the showHide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowHide(String value) {
        this.showHide = value;
    }

}
