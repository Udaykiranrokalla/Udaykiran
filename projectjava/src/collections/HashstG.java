package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashstG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		HashSet<String> l1=new HashSet <String>();
        l1.add("harish");
        l1.add("koti");
        l1.add("chowdhary");
        l1.add("villan");
  Iterator it = l1.iterator();
  while(it.hasNext())
		   {
	        System.out.println(it.next());
		   }
        System.out.println(l1);

      	}
	}


