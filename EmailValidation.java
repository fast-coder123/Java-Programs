
/*String input1="test@gmail.com"

                1)@ & . should be present;
                2)@  should not be repeated;
                3)there should be four charcters between @ and .;
                4)there shouls be atleast 3 characters before @ ;
                5)the end of mail id shoulsd be .com;*/
import java.util.Scanner;

import com.string.exceptions.MoreCharException;
import com.string.exceptions.MoreSpecialCharException;
import com.string.exceptions.SpecialCharException;
import com.string.exceptions.MinimumcharsAtBegin;
import com.string.exceptions.EndsWithComException;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an email id");
		Scanner sc= new Scanner(System.in);
		
		String emailid=sc.next();
		
		int moreSpecials=0;
		
		boolean hasSpecialChar1= emailid.contains("@");
		boolean hasSpecialChar2 = emailid.contains(".");
		
		System.out.println("has cpecial chars @ and . "+hasSpecialChar1 +" "+hasSpecialChar2);
		try {
		
			if(!(hasSpecialChar1 && hasSpecialChar2))
			{
				throw new SpecialCharException("email id must have @ and . ");
				
			}
			for (int i=0;i<emailid.length()-1;i++)
			{
				if(Character.toString(emailid.charAt(i)).equals("@"))
				{
					moreSpecials = moreSpecials+1;
				}
			}
			if(moreSpecials>1)
				throw new MoreSpecialCharException("More @ are not allowed in emailid");
			
			int indexOfSpecialChar1 = emailid.indexOf("@");
			int indexOfSpecialChar2 = emailid.lastIndexOf(".");						
			int charsbetweenspecials= indexOfSpecialChar2-indexOfSpecialChar1-1;
			
			if(charsbetweenspecials!=5)
				throw new MoreCharException("chars between@ and . should be 5");
			
			if(indexOfSpecialChar1>3)
			{
				throw new MinimumcharsAtBegin("Minimum 3 chars should be before @ in your email id");
			}
			
			String subString = emailid.substring(indexOfSpecialChar2,emailid.length());
			int subStringLength= subString.length();
			if(subStringLength!=4)
				throw new EndsWithComException("emaild id shoould end with .com");
			
			
		}
		catch(SpecialCharException |MinimumcharsAtBegin | MoreSpecialCharException |EndsWithComException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
