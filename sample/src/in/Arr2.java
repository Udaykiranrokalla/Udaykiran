package in;
import java.util.*;
public class Arr2 {
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("4");
		al.add("4");
		al.add("5");
		System.out.println(al);
		//al.addAll(bl);
		//System.out.println(al);
		    Set<String> ss=new HashSet(al);
		for(String k:ss)
		System.out.println(k);



		}
		}




