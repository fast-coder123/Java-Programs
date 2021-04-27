/*Array of string type which has name#mark1#mark2#mark3 format. 
 * retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak */


public class StrginArrayEx {
	public static void main(String args[])
	{
		String stumarks[] = {"arun#12#12#12","deepak#13#12#12","saritha#45#47#83","deepak#56#78#89"};
		
		String studentTotals[] = new String[stumarks.length*2];
		int counter=0;
		
		for (int i=0;i<stumarks.length;i++)
		{
			String student = stumarks[i];
			String studetails[] = student.split("#");
			int total = Integer.parseInt(studetails[1])+Integer.parseInt(studetails[2])+Integer.parseInt(studetails[3]);
		
			studentTotals[counter]=studetails[0];//+"#"+total;
			studentTotals[counter+1] = total+"";
			 counter=counter+2;
			
		}
		
		// studentTotals = {arun#36,deepak#38,saritha#175,deepak#223}
		
		String studentname="";
		int maxmarks=0;
		for (int i=1;i<studentTotals.length;i=i+2)
		{
			//String studetails[] = studentTotals[i].split("#");
			//System.out.println(studentTotals[i]);
			if(Integer.parseInt(studentTotals[i])>maxmarks)
			{
				studentname=studentTotals[i-1];
				maxmarks=Integer.parseInt(studentTotals[i]);
			}
			
			
		}
		System.out.println("student with highest marks is "+studentname +" with marks  " +maxmarks);
		
		
		
	}

}
