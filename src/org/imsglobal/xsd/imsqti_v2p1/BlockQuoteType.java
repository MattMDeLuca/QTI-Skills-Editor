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
 *                 The 'BlockQuote' complexType is the container for content that is equivalent to the HTML 'blockquote' markup.
 *             
 * 
 * <p>Java class for BlockQuote.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockQuote.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}positionObjectStage"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}customInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}drawingInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}gapMatchInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}matchInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}graphicGapMatchInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}hotspotInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}graphicOrderInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}selectPointInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}graphicAssociateInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sliderInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}choiceInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mediaInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}hottextInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}orderInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}extendedTextInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}uploadInteraction"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}associateInteraction"/>
 *           &lt;element name="feedbackBlock" type="{http://www.imsglobal.org/xsd/imsqti_v2p1}FeedbackBlock.Type"/>
 *           &lt;element name="templateBlock" type="{http://www.imsglobal.org/xsd/imsqti_v2p1}TemplateBlock.Type"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}infoControl"/>
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
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}cite.BlockQuote.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}xmllang.BlockQuote.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}label.BlockQuote.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}class.BlockQuote.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}id.BlockQuote.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}xmlbase.BlockQuote.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockQuote.Type", propOrder = {
    "positionObjectStageOrCustomInteractionOrDrawingInteraction"
})
public class BlockQuoteType {

    @XmlElementRefs({
        @XmlElementRef(name = "selectPointInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mediaInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "p", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "infoControl", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ul", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicAssociateInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "table", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h1", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hotspotInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h2", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "include", namespace = "http://www.w3.org/2001/XInclude", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicGapMatchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hottextInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pre", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h6", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h3", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ol", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hr", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "div", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "drawingInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "math", namespace = "http://www.w3.org/1998/Math/MathML", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "orderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gapMatchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "positionObjectStage", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sliderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "choiceInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matchInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h5", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "templateBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "extendedTextInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "graphicOrderInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uploadInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "h4", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "blockquote", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "associateInteraction", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feedbackBlock", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dl", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> positionObjectStageOrCustomInteractionOrDrawingInteraction;
    @XmlAttribute(name = "cite")
    @XmlSchemaType(name = "anyURI")
    protected String cite;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "label")
    protected String label;
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
     * Gets the value of the positionObjectStageOrCustomInteractionOrDrawingInteraction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the positionObjectStageOrCustomInteractionOrDrawingInteraction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPositionObjectStageOrCustomInteractionOrDrawingInteraction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SelectPointInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link InfoControlType }{@code >}
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicAssociateInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HotspotInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link IncludeType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicGapMatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HotTextInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link OULType }{@code >}
     * {@link JAXBElement }{@code <}{@link HRType }{@code >}
     * {@link JAXBElement }{@code <}{@link DivType }{@code >}
     * {@link JAXBElement }{@code <}{@link DrawingInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MathType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GapMatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link PositionObjectStageType }{@code >}
     * {@link JAXBElement }{@code <}{@link SliderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ChoiceInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MatchInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemplateBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtendedTextInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GraphicOrderInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link UploadInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link HTMLTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockQuoteType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssociateInteractionType }{@code >}
     * {@link JAXBElement }{@code <}{@link FeedbackBlockType }{@code >}
     * {@link JAXBElement }{@code <}{@link DLType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPositionObjectStageOrCustomInteractionOrDrawingInteraction() {
        if (positionObjectStageOrCustomInteractionOrDrawingInteraction == null) {
            positionObjectStageOrCustomInteractionOrDrawingInteraction = new ArrayList<JAXBElement<?>>();
        }
        return this.positionObjectStageOrCustomInteractionOrDrawingInteraction;
    }

    /**
     * Gets the value of the cite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCite() {
        return cite;
    }

    /**
     * Sets the value of the cite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCite(String value) {
        this.cite = value;
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
