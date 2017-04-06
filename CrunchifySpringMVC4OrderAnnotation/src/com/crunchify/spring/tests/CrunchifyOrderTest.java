package com.crunchify.spring.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.crunchify.spring.tutorials.CrunchifyPrintResult;
 
/**
 * @author Crunchify.com
 * 
 */
 
public class CrunchifyOrderTest {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		// Load Spring ApplicationContext file crunchify-beans.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("crunchify-beans.xml");
		
		// get the bean which we specified in file crunchify-beans.xml file
		CrunchifyPrintResult results = (CrunchifyPrintResult) context.getBean("orders");
		
		// After loading each class - just print result
		System.out.println(results);
	}
}