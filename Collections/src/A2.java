import java.util.*;
public class A2 
{
	   public static void main (String args[])
	   {
		   ArrayList<String> al=new ArrayList<String>();
		             al.add("nikki");
		             al.add("2");
		             al.add("2");
		             al.add("harry");
		             al.add("nikki");
		             Iterator i=al.iterator();
		             while(i.hasNext())
		             {
		            	 System.out.println(i.next());
		             }
	   }
	}

