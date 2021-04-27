package com.java.ValidatePassword;
import java.util.Scanner;
public class ExecutionLogic {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter  password");
	//String username=sc.next();
	String password=sc.next();
	ValidatePassword v= new ValidatePassword();
	//boolean validity;
	
	try {
		v.validatePassword(password);
		//System.out.println("in main method" + "valid username and password");
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	//System.out.println("in main method" + validity +"valid username and password");
	
}
}
