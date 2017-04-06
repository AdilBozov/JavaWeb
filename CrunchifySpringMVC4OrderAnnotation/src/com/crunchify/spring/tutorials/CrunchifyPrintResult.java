package com.crunchify.spring.tutorials;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
/**
 * @author Crunchify.com
 * 
 */
 
@Component
public class CrunchifyPrintResult {
	@Autowired
	private List<CrunchifyCompany> order;
	private String result = "";
 
	public String toString() {
		order.stream().forEach((temp) -> {
			this.result = result + temp + "\n"; // print result and add new line
		});
		return this.result;
	}
}