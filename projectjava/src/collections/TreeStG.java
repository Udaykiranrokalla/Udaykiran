package collections;

import java.util.SortedSet;
import java.util.TreeSet; 	 	

import java.util.Iterator;

public class TreeStG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<Integer> l1=new TreeSet<>();
         l1.add(582);
         l1.add(507);
         l1.add(508);
         l1.add(525);
   Iterator it = l1.iterator();
   while(it.hasNext())
		   {
	        System.out.println(it.next());
		   }

	}

}
