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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.imsglobal.xsd.apip.apipv1p0.imsapip_qtiv1p0.APIPAccessibilityType;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


/**
 * 
 *                 An Assessment consists of one or more Items. An 'assessmentItem' is the binding form of an Item. An Item is the smallest exchangeable assessment object. An Item is more than a 'Question' in that it contains the question and instructions to be presented, the response processing to be applied to the candidates response(s) and then feedback that may be presented (including hints and solutions).
 *             
 * 
 * <p>Java class for AssessmentItem.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItem.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}responseDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}templateProcessing" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}stylesheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}itemBody" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}responseProcessing" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}modalFeedback" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}apipAccessibility" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}toolName.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}toolVersion.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}title.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}timeDependent.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}label.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}xmllang.AssessmentItem.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}adaptive.AssessmentItem.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItem.Type", propOrder = {
    "responseDeclaration",
    "outcomeDeclaration",
    "templateDeclaration",
    "templateProcessing",
    "stylesheet",
    "itemBody",
    "responseProcessing",
    "modalFeedback",
    "apipAccessibility"
})
public class AssessmentItemType {

    protected List<ResponseDeclarationType> responseDeclaration;
    protected List<OutcomeDeclarationType> outcomeDeclaration;
    protected List<TemplateDeclarationType> templateDeclaration;
    protected TemplateProcessingType templateProcessing;
    protected List<StyleSheetType> stylesheet;
    protected ItemBodyType itemBody;
    protected ResponseProcessingType responseProcessing;
    protected List<ModalFeedbackType> modalFeedback;
    @XmlElement(namespace = "http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0")
    protected APIPAccessibilityType apipAccessibility;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifier;
    @XmlAttribute(name = "toolName")
    protected String toolName;
    @XmlAttribute(name = "toolVersion")
    protected String toolVersion;
    @XmlAttribute(name = "title", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlAttribute(name = "timeDependent", required = true)
    protected boolean timeDependent;
    @XmlAttribute(name = "label")
    protected String label;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(name = "adaptive")
    protected Boolean adaptive;
    
    
    /**
     * This field contains the text of each question. It's labeled as XML transient as it is only for use in the QTI program and not a part of the QTI
     * XML schema.
     */
    @XmlTransient
    private String questionText;
    
    /**
     * This field contains the skill code for each question. It's labeled as XML transient as it is for for use in the QTI program and not
     * a part of the XML schema.
     */
    
    @XmlTransient
    private String questionSkill;
    
    /**
     * This method loops through all of the JAXBElements and various XML elements to retrieve the question
     * text for each question.
     */
    public void retrieveQuestionText() {
    		for (JAXBElement jax: itemBody.rubricBlockOrPositionObjectStageOrCustomInteraction) { //loop through list of JAXBElements
    			if (jax instanceof JAXBElement) {				
    				if (jax.getValue() instanceof QuestionContent) { //find elements that are an instance of my abstract class
    					
    					QuestionContent questionContent = (QuestionContent) jax.getValue(); //assign them to a new variable to easily call their methods
    					questionContent.findQuestionContent(); //this method retrieves the question text from the sub-XML elements
    					List<String> stringFromQuestion = questionContent.getQuestionContent(); 
    					if (stringFromQuestion.contains("String missing or blank")) {continue;} 
    					else {
    						if (stringFromQuestion.size() > 1) { //some questions will have multiple strings, if so, concatenate them.
    							this.questionText = stringFromQuestion.get(0).trim() + " " + stringFromQuestion.get(1).trim(); 
    						}
    						
    						else {this.questionText = stringFromQuestion.get(0).trim();}				
    				}	
    			  }
    			}	
    		}
    }
    
    /**
     * Gets the text of each question.
     * @return
     */
    
    public String getQuestionText() {
    		return this.questionText;
    }
  
    /**
     * Taking a string as an argument, sets the skill code of the question.
     * @param QuestionSkill
     */
    
   public void setQuestionSkill(String QuestionSkill) {
	   this.questionSkill = QuestionSkill;
   }
   
   /**
    * 
    * Gets the skill code of this question.
    * 
    */
   
   public String getQuestionSkill() {
	   return this.questionSkill;
   }


    /**
     * Gets the value of the responseDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDeclarationType }
     * 
     * 
     */
    public List<ResponseDeclarationType> getResponseDeclaration() {
        if (responseDeclaration == null) {
            responseDeclaration = new ArrayList<ResponseDeclarationType>();
        }
        return this.responseDeclaration;
    }

    /**
     * Gets the value of the outcomeDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outcomeDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutcomeDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutcomeDeclarationType }
     * 
     * 
     */
    public List<OutcomeDeclarationType> getOutcomeDeclaration() {
        if (outcomeDeclaration == null) {
            outcomeDeclaration = new ArrayList<OutcomeDeclarationType>();
        }
        return this.outcomeDeclaration;
    }

    /**
     * Gets the value of the templateDeclaration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateDeclaration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateDeclaration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TemplateDeclarationType }
     * 
     * 
     */
    public List<TemplateDeclarationType> getTemplateDeclaration() {
        if (templateDeclaration == null) {
            templateDeclaration = new ArrayList<TemplateDeclarationType>();
        }
        return this.templateDeclaration;
    }

    /**
     * Gets the value of the templateProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link TemplateProcessingType }
     *     
     */
    public TemplateProcessingType getTemplateProcessing() {
        return templateProcessing;
    }

    /**
     * Sets the value of the templateProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateProcessingType }
     *     
     */
    public void setTemplateProcessing(TemplateProcessingType value) {
        this.templateProcessing = value;
    }

    /**
     * Gets the value of the stylesheet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stylesheet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStylesheet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StyleSheetType }
     * 
     * 
     */
    public List<StyleSheetType> getStylesheet() {
        if (stylesheet == null) {
            stylesheet = new ArrayList<StyleSheetType>();
        }
        return this.stylesheet;
    }

    /**
     * Gets the value of the itemBody property.
     * 
     * @return
     *     possible object is
     *     {@link ItemBodyType }
     *     
     */
    public ItemBodyType getItemBody() {
        return itemBody;
    }

    /**
     * Sets the value of the itemBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemBodyType }
     *     
     */
    public void setItemBody(ItemBodyType value) {
        this.itemBody = value;
    }

    /**
     * Gets the value of the responseProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseProcessingType }
     *     
     */
    public ResponseProcessingType getResponseProcessing() {
        return responseProcessing;
    }

    /**
     * Sets the value of the responseProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseProcessingType }
     *     
     */
    public void setResponseProcessing(ResponseProcessingType value) {
        this.responseProcessing = value;
    }

    /**
     * Gets the value of the modalFeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modalFeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModalFeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModalFeedbackType }
     * 
     * 
     */
    public List<ModalFeedbackType> getModalFeedback() {
        if (modalFeedback == null) {
            modalFeedback = new ArrayList<ModalFeedbackType>();
        }
        return this.modalFeedback;
    }

    /**
     * Gets the value of the apipAccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link APIPAccessibilityType }
     *     
     */
    public APIPAccessibilityType getApipAccessibility() {
        return apipAccessibility;
    }

    /**
     * Sets the value of the apipAccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIPAccessibilityType }
     *     
     */
    public void setApipAccessibility(APIPAccessibilityType value) {
        this.apipAccessibility = value;
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
     * Gets the value of the toolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolName() {
        return toolName;
    }

    /**
     * Sets the value of the toolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolName(String value) {
        this.toolName = value;
    }

    /**
     * Gets the value of the toolVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * Sets the value of the toolVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
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
     * Gets the value of the timeDependent property.
     * 
     */
    public boolean isTimeDependent() {
        return timeDependent;
    }

    /**
     * Sets the value of the timeDependent property.
     * 
     */
    public void setTimeDependent(boolean value) {
        this.timeDependent = value;
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
     * Gets the value of the adaptive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAdaptive() {
        if (adaptive == null) {
            return false;
        } else {
            return adaptive;
        }
    }

    /**
     * Sets the value of the adaptive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdaptive(Boolean value) {
        this.adaptive = value;
    }

}