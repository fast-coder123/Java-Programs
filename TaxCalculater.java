package com.java.TaxCalculater;

public class TaxCalculater 
{
	
	
	double taxAmount;
	/*If  empSal is greater than one lakh and isIndian true
	taxAmount =empSal *8/100 
	Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
	taxAmount =empSal *6/100 
	Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
	taxAmount =empSal *5/100 
	Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
	 taxAmount =empSal *4/100 
	Otherwise
	   The calculator should throw a TaxNotEligibleException.*/
	
	public double  taxCalculate(String empName,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		if(empName==null || empName.isEmpty())
		throw new EmployeeNameInvalidException("invalid employee name");
			
		 if(!isIndian)
		
			throw new CountryNotValidException("Employee is not an indian");
		if(empSal>=100000 && isIndian )
		{
			taxAmount=empSal *8/100 ;
		}
		else if(empSal>=50000 && empSal<100000 && isIndian) {
			taxAmount=empSal *6/100 ;
		}
		else if (empSal<50000 && empSal>=30000 && isIndian)
		{
			taxAmount=empSal *5/100 ;
		}
		else if (empSal<30000 && empSal>=10000 && isIndian)
		{
			taxAmount=empSal *4/100 ;
		}
		else 
			throw new TaxNotEligibleException("tax not eligible");
		return taxAmount;
	}

}
