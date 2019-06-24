package Collections;

import java.util.*;

public class D {
	public static void main(String args[]) {
LinkedHashSet al =new LinkedHashSet();
	al.add("uday");
	al.add(2);
	al.add('c');
	al.add("kiran");
	al.add(5);
	al.add("UK");
	al.add(7);
	al.add("uday");
	al.add(7);
	

	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
	}


