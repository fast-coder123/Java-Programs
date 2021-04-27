import java.util.Scanner;

public class VowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String firstString = sc.next();
		int numberOfVowels= 0;
		for(int i=0; i<firstString.length();i++)
		{
			switch(firstString.charAt(i)) {
	         case 'a':numberOfVowels=numberOfVowels+1;break;
	         case 'e':numberOfVowels=numberOfVowels+1;break;
	         case 'i':numberOfVowels=numberOfVowels+1;break;
	         case 'o':numberOfVowels=numberOfVowels+1;break;
	         case 'u':numberOfVowels=numberOfVowels+1;break;
	         case 'A':numberOfVowels=numberOfVowels+1;break;
	         case 'E':numberOfVowels=numberOfVowels+1;break;
	         case 'I':numberOfVowels=numberOfVowels+1;break;
	         case 'O':numberOfVowels=numberOfVowels+1;break;
	         case 'U':numberOfVowels=numberOfVowels+1;break;
	            
			}
		}
		
		System.out.println("NUMBER OF VOWELS " +numberOfVowels);

	}

}
