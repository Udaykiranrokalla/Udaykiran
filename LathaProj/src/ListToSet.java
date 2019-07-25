import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListToSet {
	public static void main(String args[]) {
	ArrayList<String> list =new ArrayList<String>();
     
     list.add("mark");
     list.add("String");
     list.add("mark");
     HashSet<String> h1=new HashSet<String>();
     h1.add("four");
     //h1.add("one");
     //h1.add("two");
     //h1.add("three");
     //h1.add("four");
     
    // h1.addAll(list);
     for(String s:list)
     
     	h1.add(s);
     
         Iterator<String> i=h1.iterator();
    while(i.hasNext()) {
 	   System.out.println(i.next());
    }
}
}