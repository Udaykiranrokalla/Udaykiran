package basicprograms;

import java.util.*;

public class Hashset1 {
public static void main(String args[]) {
	HashSet ll=new HashSet();
	ll.add("ram1");
	ll.add("ram2");
	ll.add("ram3");
	ll.add("ram3");
	ll.add("ram3");
	ll.add("ram4");
	ll.add("ram54");
	ll.add(null);
	ll.add("ram4");
	//System.out.println(ll);
	//ll.remove("ram4");
	//ll.retainAll(ll);
	//System.out.println(ll);
	//ll.clear();
	//System.out.println(ll);
	//Iterator c=ll.iterator();
	//while(c.hasNext());
	//System.out.println(c.next());
     List<String> ss=new LinkedList(ll);
     for(String a:ss)
     System.out.println(ss);

}
}
