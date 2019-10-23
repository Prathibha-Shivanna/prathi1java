package com.java.UsingAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String... args) throws InterruptedException {

    ConfigurableApplicationContext context2= new ClassPathXmlApplicationContext("Application.xml");
      context2.registerShutdownHook();
}
}
