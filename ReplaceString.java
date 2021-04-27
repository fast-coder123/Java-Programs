
public class ReplaceString {
	
	/*replace hi with bye in  a given String 
    and insert "OK" in middle of the string*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hi my name saritha hi.";
		
		 s=s.replaceAll("hi ", "bye ");

		System.out.println(s);
		
		int  length = s.length();
		
		int halfString = length/2;
		
		StringBuffer sb= new StringBuffer(s);
		sb.insert(halfString, " ok ");
		System.out.println(sb);
		
		
		
	}

}
