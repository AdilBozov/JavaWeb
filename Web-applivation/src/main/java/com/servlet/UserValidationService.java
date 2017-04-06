package com.servlet;

public class UserValidationService {

	public boolean isUserValid(String user, String pass){
		if(user.equals("koki") && pass.equals("1111"))
			return true;
		
		return false;
	}
	
}
