package com.java.seventhMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("ApplicationContext.xml");
 
	    Company compobj = (Company) context.getBean("companyBean");
        System.out.println(compobj.getPrprice());
        System.out.println(compobj.getPrname());
	  
	  
	}
}
