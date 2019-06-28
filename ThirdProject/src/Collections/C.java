package src.Collections;

import java.util.*;

public class C {
	public static void main(String args[]) {
		HashSet al =new HashSet();
	al.add("uday");
	al.add(2);
	al.add('c');
	al.add("kiran");
	al.add(5);
	al.add(" ");
	al.add("UK");
	al.add(7);

	Iterator i=al.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	}
	}

