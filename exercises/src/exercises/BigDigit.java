package exercises;

public class BigDigit
{
	public static void main(String args[])
	{
		int x= 786;
		int big=0;
		int rem=0;
	do
		{
		rem=x%10;
		if(rem>big)
		{
			big=rem;
		}
		
	x = x/10;
	} 
while(x>0);
System.out.println("Big Digit =" +big);
}
}