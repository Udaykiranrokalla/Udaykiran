package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class List2set {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> s1=new ArrayList<Integer>();
		s1.add(507);
		s1.add(508);
		s1.add(518);
		s1.add(582);
		s1.add(582);
		s1.add(582);
		HashSet<Integer> s2=new HashSet<Integer>();
	    for(Integer i:s1)
	    	s2.add(i);
	    Iterator i=s2.iterator();
	    while(i.hasNext())
		   {
	        System.out.println(i.next());
		   }

		

	}

}
