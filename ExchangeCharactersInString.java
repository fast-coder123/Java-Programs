
/*Exchange the first and last character of string 
input1- helloworld
output=delloworlh*/

import java.util.Scanner;
public class ExchangeCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a string");
		String str=sc.next();
		
		StringBuffer sb=new StringBuffer(str);
		
		char f= sb.charAt(0);
		char l=sb.charAt(str.length()-1);
		
		System.out.println("first character is "+f);
		System.out.println("last character is "+l);
		
		//str.replace(0,0,l+"");
		sb.replace(0,1,l+"");
		
		System.out.println("string after first letter replacement "+sb);
		
		sb.replace(sb.length()-1, sb.length(), f+"");
		
		System.out.println("string after replacement "+sb);

	}

}
