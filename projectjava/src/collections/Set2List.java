package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set2List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s1=new HashSet<String>();
		s1.add("harish");
		s1.add("koti");
		s1.add("uday");
		s1.add("nikhil");
		s1.add("nikhil");
		s1.add("nikhil");
		ArrayList<String> s2=new ArrayList<String>();
	    for(String s:s1)
	    	s2.add(s);
	    Iterator i=s2.iterator();
	    while(i.hasNext())
		   {
	        System.out.println(i.next());
		   }


	}

}
