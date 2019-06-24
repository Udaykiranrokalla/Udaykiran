import java.util.*;
public class A4 
{

	   public static void main (String args[])
	   {
		   Set<String> al = new TreeSet<String>(); 
		             al.add("nikki");
		             al.add("2");
		             al.add("C");
		             al.add("nikki");
		          	 System.out.println("Set is "+al);
		          	 Set<String> al1 = new TreeSet<String>(); 
		             al1.add("my name is");
		             al1.add("pokemon");
		             al.addAll(al1);
		             System.out.println("Set is "+al);
	   }
	
}
