package Collections;

import java.util.*;
public class E {
	public static void main(String args[]) {
		SortedSet a =new SortedSet();
			
			a.add("Uday");
			a.add("Kiran");
			a.add("Rokalla");
			a.add("Btech");
			

			Iterator i=a.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
			}
	}
}





