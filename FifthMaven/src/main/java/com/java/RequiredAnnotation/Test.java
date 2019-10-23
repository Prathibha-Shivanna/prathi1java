package com.java.RequiredAnnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("Application.xml");
		Student s=context.getBean(Student.class);
		System.out.println("Name : " + s.getAge() );
	      System.out.println("Age : " + s.getName() );
		
	}

}
