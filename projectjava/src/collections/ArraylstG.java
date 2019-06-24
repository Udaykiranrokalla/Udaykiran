package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylstG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> l1=new ArrayList <Integer>();
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


       