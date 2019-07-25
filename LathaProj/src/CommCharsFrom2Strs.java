import java.util.*;
public class CommCharsFrom2Strs {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 strings");
	String s1=sc.next();
	String s2=sc.next();
	int l1=s1.length();
	int l2=s2.length();
	int flag=0,i=0;
	for( i=0;i<l1;i++)
	{
		flag=0;
		for(int j=0;j<l2;j++) {
			if(s1.charAt(i)==s2.charAt(j)) 
			{
				//flag=1;
				//if(flag==1)
				System.out.println(s1.charAt(i));

			}
	
		}
		
	
	
}
}
}
