package in;
import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
public class Arr3 {
	public static void main(String args[]) {
		HashSet ll=new HashSet();
		ll.add("sam1");
		ll.add("sam2");
		ll.add("sam3");
		ll.add("sam3");
		ll.add("sam3");
		ll.add("sam4");
		ll.add("sam54");
		System.out.println(ll);
		 List<String> ss=new LinkedList(ll);
		     for(String a:ss)
		     System.out.println(a);





	}

}