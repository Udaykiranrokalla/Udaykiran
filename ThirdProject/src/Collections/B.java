package src.Collections;

import java.util.*;

public class B {
	public static void main(String args[]) {
		LinkedList a =new LinkedList();
	a.add("uday");
	a.add(2);
	a.add('c');
	a.add("uday");
Collections.addAll(a,"teja","nikhil");
	Iterator i=a.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		System.out.println(a.size());
	}
	}
	}


