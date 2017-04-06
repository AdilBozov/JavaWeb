package com.crunchify.spring.tutorials;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CrunchifyFacebook2 implements CrunchifyCompany {
 
	private String order = "Crunchify Facebook with Order-2";
 
	public String toString() {
		return "Class Name: " + this.getClass().getSimpleName() + " - Result: " + this.order;
	}
}
