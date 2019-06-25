package rakeitg;
import java.util.*;
public class Setlist {
	public static void main(String args[]) 
	{
		HashSet<String> hl=new HashSet<String>();
		hl.add("DBAdministrator");
		hl.add("Development");
		hl.add("Development");
		hl.add("Testing");
		hl.add("Integration Developer");
		hl.add("Data analyst");
		hl.add("Data scientist");
		System.out.println("set element are:"+hl);
		 List<String> ss=new LinkedList<String>(hl);
		 System.out.println("List element are:");
		     for(String a:ss)
		     System.out.println(a);
	}
}
