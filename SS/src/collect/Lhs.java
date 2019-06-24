package collect;
import java.util.*;
public class Lhs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
   lh.add(10);
   lh.add(20);
   lh.add(10);
   lh.add(30);
   lh.add(20);
   lh.add(70);
   lh.add(50);
   System.out.println("Linked hashset elaments are :"+lh);
   lh.remove(50);
   System.out.println("After remove operation elements are :"+lh);
   LinkedHashSet<Integer> l3=new LinkedHashSet<Integer>();
   l3.add(10);
   l3.add(20);
   l3.add(70);
   l3.add(50);
   lh.retainAll(l3);
   System.out.println("common elements are :"+lh);
   
	}

}
