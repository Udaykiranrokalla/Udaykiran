package basicprograms;

import java.util.ArrayList;
import java.util.*;

public class Arraylist3 {
	public static void main(String args[]) {
		ArrayList<String>al=new ArrayList();
		al.add("rakesh");
		al.add("saiiii");
		al.add("rammmm");
		al.add("Auto");
		al.add("sai");
		al.add("sai");
		al.add("rakeeeeesh");
		ArrayList bl=new ArrayList();
		bl.add("miracle");
		bl.add("software");
		bl.add("systems");
		bl.add("Auto");
		bl.add("software");
		bl.add("mss");
		
		//al.retainAll(bl);
		//bl.removeAll(al);
		//System.out.println(al);
		//al.retainAll(bl);
		//al.clear();
		Set ss=new HashSet(al);
		for(String s:al)
		
		System.out.println(s);
		
		
}
}