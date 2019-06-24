package collections;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedLstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList l1=new LinkedList();
         l1.add("harish");
         l1.add(507);
         l1.add('c');
         l1.add("employee");
   Iterator it = l1.iterator();
   while(it.hasNext())
		   {
	        System.out.println(it.next());
		   }
       	}
	}


