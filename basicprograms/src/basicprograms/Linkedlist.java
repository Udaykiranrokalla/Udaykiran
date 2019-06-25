package basicprograms;

import java.util.*;

public class Linkedlist {
	public static void main(String args[]) {
		LinkedList a=new LinkedList<String>();
		a.add("s");
		a.add("s");
		a.add("sai");
		a.add("sai");
		a.add("ssss");
		a.add("sqqq");
		Iterator l=a.iterator();
        while(l.hasNext()) {
        	System.out.println(l.next());
       
        }
        	
        }
		
		
		
}
