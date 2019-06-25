package basicprograms;

import java.util.*;

public class Linkedhashset {
	public static void main(String args[]) {
		Set z=new LinkedHashSet();
		z.add(1);
		z.add("s");
		z.add("sai");
		z.add("raam");
		z.add(null);
		z.add("sqqq");
		z.add("sqqq");
		Iterator s=z.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
	
	z.remove(1);
	z.add("qwert");
	System.out.println(z);
	
	}

}
