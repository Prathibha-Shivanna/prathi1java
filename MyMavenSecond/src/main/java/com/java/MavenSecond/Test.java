package com.java.MavenSecond;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;
public class Test {

	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("Application.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Question q=(Question)factory.getBean("q");  
	    q.display(); 
	    System.out.println("****************************************");
	    System.out.println("Using Set");
	    QuestionSet qs=(QuestionSet)factory.getBean("qSet");  
	    q.display(); 
	    System.out.println("****************************************");
	    System.out.println("Using Map");
	    QuestionMap qMap=(QuestionMap)factory.getBean("mapSet");  
	    qMap.display(); 
	        

	}
}
