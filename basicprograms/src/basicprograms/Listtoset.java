package basicprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Listtoset {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("4");
		al.add("4");
		al.add("5");
		Set<String> ss=new HashSet(al);
		for(String s:ss)
		
		System.out.println(s);
		

	
	
	}
}