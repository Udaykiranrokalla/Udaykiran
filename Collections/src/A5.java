import java.util.*;
public class A5 {
	   public static void main (String args[])
		   {
			   Set<String> al = new HashSet<String>(); 
			             al.add("nikki");
			             al.add("2");
			             al.add("C");
			             al.add("nikki");
			          	 System.out.println("Set is "+al);
			          	 Set<String> al1 = new TreeSet<String>(); 
			             al1.add("nikki");
			             al1.add("pokemon");
			             al.retainAll(al1);
			             System.out.println("Set is "+al);
		   }
		
	}

