package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Capct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> l1=new ArrayList <Integer>();
         l1.add(582);
         l1.add(507);
         l1.add(508);
         l1.add(525);
		 System.out.println(l1);

		 System.out.println(l1.size());
         l1.removeAll(l1);
		 System.out.println(l1);

		 System.out.println(l1.size());
         boolean b = Collections.addAll(l1, 208,5007,518,212);
		 System.out.println(l1.size());
         l1.remove(2);
		 System.out.println(l1.size());
		 System.out.println(l1);
		 







	}

}
