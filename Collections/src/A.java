import java.util.*;
public class A 
{
   public static void main (String args[])
   {
	   ArrayList al=new ArrayList();
	             al.add("nikki");
	             al.add("2");
	             al.add('C');
	             al.add("nikki");
	             Iterator i=al.iterator();
	             while(i.hasNext())
	             {
	            	 System.out.println(i.next());
	             }
   }
}
