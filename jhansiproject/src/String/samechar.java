package String;
import java.util.*;
public class samechar {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter two strings");
String st1=sc.next();
String st2=sc.next();
int len1=st1.length();
int len2=st2.length();
for(int i=0;i<len1;i++)
{
	for(int j=0;j<len2;j++)
	{
		if(st1.charAt(i)==st2.charAt(j))
		{
			System.out.println(st1.charAt(i));
			
		}
	}
}
}
}


	

	


