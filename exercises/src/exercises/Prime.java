package exercises;

public class Prime 
{
 public static void main(String[]args)
 {
	 int i;
	 int j;
	 int count =0;
	 for(i=2;1<=10;i++)
	 {
		 count =0;
		 for(j=1;j<=1;j++)
		 {
			 if(i%j==0)
			 {
				 count=count+1;
			 }
		 }
		 if (count==2)
			 System.out.println(i+ "is prime");
		 else
			 System.out.println(i+ "is not prime");
	 }
 }
}
