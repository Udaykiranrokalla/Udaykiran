import java.util.Scanner;

public class CommonChar
{
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   String s1=new String("harika");
	   String s2=new String("niharika");
	   for(int i=0;i<s1.length();i++)
	   {
		   for(int j=0;j<s2.length();j++) 
		   {
			   if(s1.charAt(i) == s2.charAt(j))
			   {
				   System.out.println(s2.charAt(j));
              }
           }
	   }
   }
}