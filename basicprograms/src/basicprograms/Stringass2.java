package basicprograms;

public class Stringass2 {
	public static void main(String args[]) {
		String[] s1= {"miracle" ,"software" ,"systems"};
		String[] s2= {"miracle ","sw" ,"systems"};
		for(String s3:s1)
		{
			for(String s4:s2)
			{
				if(s3.equals(s4)) {
					System.out.println(s4);
				}
			}
		}
		
		
		
	}

}
