
/*Find the sum of the numbers in the given input string array
  Input{?2AA?,?12?,?ABC?,?c1a?)
  Output:6 (2+1+2+1)
  Note in the above array 12 must not considered as such
  i.e,it must be considered as 1,2*/

public class SplitString {
	public static void main(String args[])
	{
		String s = "?2AA?,?12?,?ABC?,?c1a?,";
		String sa[] = s.split(",",0);
		int sum=0;
		//first loop :to iterate sting array
		//second loop: to iterate characters in each string element 
		// third loop: to compare each char against 0-9
		for(int i=0;i<sa.length;i++)
		{
				System.out.println("string array "+i+sa[i]);
			
				for(int j=0;j<sa[i].length()-1;j++)
				{
					for (int k=1;k<=9;k++)
					{
						if(  ( Character.toString(  sa[i].charAt(j) )).equals(k+"")     )
							sum=sum+k;
					}
				}
		}
		System.out.println("sum"+sum);
	}

}
