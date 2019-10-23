package com.java.firstMaven;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource; 

public class Test {

	public static void main(String[] args) {
     Resource r=new ClassPathResource("applicationContext.xml");
	 BeanFactory factory=new XmlBeanFactory(r);
	 
	 Customer c=(Customer)factory.getBean("cust");
	 c.display();
	 
	 
  System.out.println("*************using constructor injection***************");
  
  Resource r2=new ClassPathResource("applicationContext2.xml");
	 BeanFactory factory2=new XmlBeanFactory(r2);
	 Customer c2=(Customer)factory.getBean("cust");
	 c2.display();
	}

}
