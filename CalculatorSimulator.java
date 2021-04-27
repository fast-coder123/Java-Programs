package com.java.TaxCalculater;
import java.util.Scanner;

public class CalculatorSimulator {
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter empname, nationaliyIndian,salary");
		String empname=sc.next();
		boolean  nationality = sc.nextBoolean();		
		double salary=sc.nextDouble();
		double taxamt=0.0;
		
		TaxCalculater tc = new TaxCalculater();
		try {
			
		
		 taxamt =tc.taxCalculate(empname, nationality, salary);
		}
		catch(CountryNotValidException| EmployeeNameInvalidException | TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("tax amount"+taxamt);
		
	}

}
