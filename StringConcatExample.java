
/*
 Two input strings are accepted. 
 If the two strings are of same length concat them and return,
  if they are not of same length, reduce the longer string to size of smaller one, and concat them
input1:"hello"
input2:"hii"
output:"llohi"
input1:"aaa"
input2:"bbb"
output:"aaabbb"

 */
import java.util.Scanner;
public class StringConcatExample {
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String firstString = sc.next();
		String secondString = sc.next();
		int firstStringLength = firstString.length();
		int secondStringLength = secondString.length();
		String concatenatedString="";
		if(firstStringLength==secondStringLength)
		{
			concatenatedString = firstString+secondString;
			
		}
		else
		{
			if(firstStringLength>secondStringLength)
			{
				
				StringBuffer sb= new StringBuffer(firstString);
			
			int difference = firstStringLength-secondStringLength;
			
			sb.delete(0, difference);
			
			concatenatedString=sb+secondString;
			}
			else
			{
				StringBuffer sb= new StringBuffer(secondString);
				
				int difference = secondStringLength-firstStringLength;
				
				sb.delete(0, difference);
				concatenatedString= sb+firstString;
			}
			
		}
		System.out.println("concatenated string  "+concatenatedString);
		
	}

}
