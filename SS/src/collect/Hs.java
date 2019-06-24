package collect;
import java.util.*;
public class Hs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h=new HashSet<Integer>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(10);
        h.add(null);
        System.out.println("hashset elements are "+h);
        h.remove(20);
        System.out.println("After remove operation elements are :"+h);
        HashSet<Integer> h1=new HashSet<Integer>();
        h1.add(50);
        h1.add(10);
        h1.add(30);
        h1.add(900);
        System.out.println("Second set elements are :"+h1);
        h.retainAll(h1);
        System.out.println("Common elements are :"+h);
        
        
        
	}

}
