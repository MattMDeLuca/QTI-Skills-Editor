//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.30 at 01:37:27 PM EST 
//


package org.imsglobal.xsd.imscp_v1p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0.CurriculumStandardsMetadataSetType;
import org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0.CurriculumStandardsMetadataType;
import org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0.LabelledGUIDType;
import org.imsglobal.xsd.imsccv1p2.imscsmd_v1p0.SetOfGUIDsType;
import org.w3c.dom.Element;


/**
 * <p>Java class for manifestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manifestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imscp_v1p1}metadata" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imscp_v1p1}organizations"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imscp_v1p1}resources"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imscp_v1p1}manifest" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/imscp_v1p1}grp.any"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imscp_v1p1}attr.identifier.req"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imscp_v1p1}attr.version"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}base"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="manifest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manifestType", propOrder = {
    "metadata",
    "organizations",
    "resources",
    "manifest",
    "any"
})
public class ManifestType {

    protected MetadataType metadata;
    @XmlElement(required = true)
    protected OrganizationsType organizations;
    @XmlElement(required = true)
    protected ResourcesType resources;
    protected List<ManifestType> manifest;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anyURI")
    protected String base;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String identifier;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();
    
    
    /**
     * This field contains a map with the key as the href of the question file and a value of skill associated with that question.
     * It is not part of the XML schema, so it's marked as XML transient.
     */
    @XmlTransient //tag this attribute as transient since it's only use is providing data to the main prog and not to XML object.
    private ArrayList<Map<String, String>> manifestSkillsArray;
    
    /**
     * This field contains a map with the key as the href of the test file and a value of the test file name.
     * It is not part of the XML schema, so it's marked as XML transient.
     */
    
    @XmlTransient 
    private Map<String, String> manifestTestInformation;
    
    /**
     * This method creates an array of maps with the key being the href of each question file and a value of the 
     * skill code associated with it.
     * @return
     */
    public void createManifestSkillsArray() {
    		if (manifestSkillsArray == null) {this.manifestSkillsArray = new ArrayList<Map<String, String>>();}
    		
    		if (manifestTestInformation == null) {this.manifestTestInformation = new HashMap<String, String>();}
    		
    	
		for (ResourceType o: resources.resource) { 
			String href = o.href;
			System.out.println(href);
			if (o.type.contains("imsqti_test_xmlv2p1")) { //The manifest lists all resources in the QTI package, which includes this type that refers to the test file.
				this.manifestTestInformation.put(href, "TestFile");
			}
			
			else if (o.type.contains("imsqti_item_xmlv2p1")) { //This type refers to each question, or item, file.
				List<Object> listOfMetadata = o.metadata.any; //Create a list of metadata XML elements for each question to iterate through.
				for (Object i: listOfMetadata) {
					CurriculumStandardsMetadataSetType standardardsMetadataSet = ((JAXBElement<CurriculumStandardsMetadataSetType>) i).getValue(); //unwrap each JAXBElement into a new variable---makes it easier to call its methods.
					List<CurriculumStandardsMetadataType> standardsMetadata = standardardsMetadataSet.getCurriculumStandardsMetadata();
					for (CurriculumStandardsMetadataType h: standardsMetadata) { //these final few loops dig down through each XML element associated with the question in the manifest. 
						for(SetOfGUIDsType s: h.getSetOfGUIDs()) {
							for(LabelledGUIDType l: s.getLabelledGUID()) {
								String skill = l.getGUID(); //And finally grab the skill code from each question and assign it to a new variable.
								Map<String, String> skillMap = new HashMap<String, String>();
								skillMap.put(href, skill); //Then, add the skill code to a map with the href as a key.
								this.manifestSkillsArray.add(skillMap);
							}
							
						}
					}
				}
			}
		}
    }
    
    /** 
     * This method updates the skills for each question in the manifest. It takes as an argument an array list with maps that have the href as a key and the
     * new skill code as a value.
     * @param hrefsToNewSkills
     */
    
    public void updateManifestSkills (ArrayList<Map<String, String>> hrefsToNewSkills) {
		for (ResourceType o: resources.resource) { //The initial structure of this method is similar to the createManifestSkillsArray. 
			String href = o.href;
			if (o.type.contains("imsqti_test_xmlv2p1")) { 
				continue;
			}
			
			if (o.type.contains("imsqti_item_xmlv2p1")) {
				for (Map<String, String> m: hrefsToNewSkills) {
					if (m.keySet().contains(href)) { //loop through list of hrefs and new skills here. If they match, dig further into their XML elements.
						List<Object> listOfMetadata = o.metadata.any;
						for (Object i: listOfMetadata) {
							CurriculumStandardsMetadataSetType standardardsMetadataSet = ((JAXBElement<CurriculumStandardsMetadataSetType>) i).getValue();
							List<CurriculumStandardsMetadataType> standardsMetadata = standardardsMetadataSet.getCurriculumStandardsMetadata();
							for (CurriculumStandardsMetadataType h: standardsMetadata) {
								for(SetOfGUIDsType s: h.getSetOfGUIDs()) {
									for(LabelledGUIDType l: s.getLabelledGUID()) {
										l.setGUID(m.values().toString().replace("[", "").replace("]", ""));//Set the skill code of the question and trim the brackets from it.

									}	
								}
							}
						}
					}
				}	
			}
		}
		
		this.createManifestSkillsArray();

    }

    /**
     * This method returns an array list with maps that have the href as a key and the
     * skill code as a value.
     * @return
     */    
    public ArrayList<Map<String, String>> getManifestSkillsArray() {return this.manifestSkillsArray;}
 

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link MetadataType }
     *     
     */
    public MetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetadataType }
     *     
     */
    public void setMetadata(MetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the organizations property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationsType }
     *     
     */
    public OrganizationsType getOrganizations() {
        return organizations;
    }

    /**
     * Sets the value of the organizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationsType }
     *     
     */
    public void setOrganizations(OrganizationsType value) {
        this.organizations = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ResourcesType }
     *     
     */
    public ResourcesType getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourcesType }
     *     
     */
    public void setResources(ResourcesType value) {
        this.resources = value;
    }

    /**
     * Gets the value of the manifest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manifest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManifest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManifestType }
     * 
     * 
     */
    public List<ManifestType> getManifest() {
        if (manifest == null) {
            manifest = new ArrayList<ManifestType>();
        }
        return this.manifest;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
