package Collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class NList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList al=new ArrayList();
 al.add("mss");
 al.add(2);
 al.add(',');
 al.add(' ');
 Iterator it=al.iterator();
 while(it.hasNext())
 {
	 System.out.println(it.next());
	 
 }
	}
}
