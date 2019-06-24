import java.util.*;
public class A3 {



   public static void main (String args[])
   {
	   LinkedList al=new LinkedList();
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
