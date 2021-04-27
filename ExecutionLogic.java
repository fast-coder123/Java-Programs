import java.util.Scanner;
public class ExecutionLogic {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter username and passwords");
	String username=sc.next();
	String password=sc.next();
	ValidateUser v= new ValidateUser();
	boolean validity;
	
	try {
		validity=v.validateUser(null, null);
		System.out.println("in main method" + validity +"valid username and password");
		
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	//System.out.println("in main method" + validity +"valid username and password");
	
}
}
