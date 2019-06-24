package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> l1=new ArrayList <Integer>();
		 ArrayList<Integer> l2=new ArrayList <Integer>();

         l1.add(582);
         l1.add(507);
         l1.add(508);
         l1.add(525);
         
         l2.add(518);
         l2.add(507);
         l2.add(508);
         l2.add(506);
        
	        System.out.println("before reatainAll l1: "+l1);
	        System.out.println("before reatainAll l2: "+l2);
	        System.out.println("\n");
         l2.retainAll(l1);
         
         System.out.println("after reatainAll l1: "+l1);
	        System.out.println("after reatainAll l2: "+l2);
         
         
              

	}

}
