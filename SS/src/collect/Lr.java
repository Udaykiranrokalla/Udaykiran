package collect;
import java.util.*;
public class Lr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList();
		l1.add("Nikki");
		l1.add("Hari");
		l1.add("Gp");
		l1.add("Naveen");
		l1.add("Nikki");
		System.out.println("List is "+l1);
		l1.remove(2);
		System.out.println("List after remove operation "+l1);
		LinkedList<String> l2=new LinkedList();
		l2.add("Nikki");	
		l2.add("Gp");
		l2.add("Naveen");
		l2.add("Nikki");
		l1.retainAll(l2);
		System.out.println("common :"+l1);
	    l2.removeAll(l2);
	    System.out.println("Removed"+l2);
	    
	}
}