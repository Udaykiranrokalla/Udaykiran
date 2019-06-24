package rakeitg;
import java.util.*;
public class linklist {
 public static void main(String[]args)
 {
	 LinkedList<String> mom= new LinkedList<String>();
	 mom.add("Rakesh"); 
	 mom.add("Platinum");
	 mom.add("sowji");
	 mom.addFirst("Reethu");
	 mom.addLast("saradh");
	 mom.add(3, "Deepthi");
	 mom.add("venkat");
	 mom.add("seshu");
	 mom.add("manu");
	 mom.add("siva");
	 System.out.println("Linked list : " + mom); 
	 mom.remove("seshu"); 
	 mom.remove(4); 
	 mom.removeFirst(); 
	 mom.removeLast(); 
     System.out.println("Linked list after removing: " +  mom); 
     int size = mom.size();
     System.out.println("Size of linked list after all methods = " + size); 
     Object element =mom.get(5);
     System.out.println("Element returned by get() : " + element); 
     mom.set(2, "darling"); 
     System.out.println("Linked list after change : " + mom); 
 }
}
