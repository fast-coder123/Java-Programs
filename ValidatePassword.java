package com.java.ValidatePassword;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ValidatePassword {
	
	public void validatePassword(String password) throws PasswordException
	{
		
		int specialCharacters=0;
		int numerics=0;
		String specialNumerics="0123456789";
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i=0; i < password.length() ; i++)
        {
            char ch = password.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                System.out.println(password+ " contains special character");
                specialCharacters=specialCharacters+1;
                
            } 
            if(specialNumerics.contains(Character.toString(ch))) {
               // System.out.println(password+ " contains numerals");
                specialNumerics=specialNumerics+1;
                
            } 
            //else if(i == password.length()-1)     
             //   System.out.println(password+ " does NOT contain special character");
            /*Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(password);
            boolean isStringContainsSpecialCharacter = matcher.find();
            if(isStringContainsSpecialCharacter)
                System.out.println(inputString+ " contains special character");
            else    
                System.out.println(inputString+ " does NOT contain special character");*/
        }
        
        if (password.length()>6 && password.length()<=10  && numerics>0 && specialCharacters>0)
        	System.out.println("perfect password");
        else
        	throw new PasswordException("invalid password. Password should has atleast 1 numeral and atleast 1 special char and length should be >6 and <10");
	}

}