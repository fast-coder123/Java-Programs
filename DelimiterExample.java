/*
String1="Tom:I am from Australia"; 
String2="Rick:I am from Canada"; 
retrive the name and country from strings*/


public class DelimiterExample {
	public static void main(String args[])
	{
		String str1 ="Tom:I am from Australia"; 
		String str2= "Rick:I am from Canada"; 
		
		String str1arr[]=str1.split(":");
		
		System.out.println("Name: "+str1arr[0]+" Country: "+str1arr[1]);
		
		String str2arr[]=str2.split(":");
		
		System.out.println("Name: "+str2arr[0]+" Country: "+str2arr[1]);
	}

}
