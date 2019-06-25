package basicprograms;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Settolist {
	public static void main(String args[]) {
		Set z=new LinkedHashSet();
		z.add(1);
		z.add("s");
		z.add("sai");
		z.add("raam");
		z.add(null);
		z.add("sqqq");
		z.add("sqqq");

		 List<String> ss=new LinkedList(z);
	     for(String a:ss)
	     System.out.println(ss);

	
	
	}
	
	}
