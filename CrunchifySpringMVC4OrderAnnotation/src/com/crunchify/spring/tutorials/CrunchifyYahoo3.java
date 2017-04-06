package com.crunchify.spring.tutorials;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
 
@Component
@Order(3)
public class CrunchifyYahoo3 implements CrunchifyCompany {
 
	private String order = "Crunchify Yahoo with Order-3";
 
	public String toString() {
		return "Class Name: " + this.getClass().getSimpleName() + " - Result: " + this.order;
	}
}
