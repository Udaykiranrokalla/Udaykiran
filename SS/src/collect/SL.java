package collect;
import java.util.*;
public class SL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(10);
        System.out.println("Set elements are :"+h);
       
        ArrayList<Integer> l1=new ArrayList<Integer>(h);
        System.out.println("List elements are:");
       
        for (Integer s: l1) 
        System.out.println(s);
        
	}

}
