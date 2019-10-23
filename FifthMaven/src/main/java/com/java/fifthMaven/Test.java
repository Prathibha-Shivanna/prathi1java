package com.java.fifthMaven;
//package com.java.RequiredAnnotation;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.RequiredAnnotation.Student;

//import com.java.RequiredAnnotation.Student;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Application.xml");
		Employee employee = context.getBean(Employee.class);
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getCompany().getCompName());		
		context.close();
		
	}

}
