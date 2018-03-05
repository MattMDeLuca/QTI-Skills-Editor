package org.imsglobal.xsd.imsqti_v2p1;


import java.io.Serializable;
import java.util.List;

public abstract class QuestionContent {
	
	public String className;
	
	public List<String> contentList;
		
	
	public abstract void findQuestionContent(); //abstract method to set list of content for each object
	public abstract List<String> getQuestionContent();
	//public List<?> content;

	//public abstract String getStuff();
}
