package com.java.TenthMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
    	Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
