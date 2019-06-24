package collect;
import java.util.*;
public class Tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>();
		   t.add(10);
		   t.add(20);
		   t.add(10);
		   t.add(30);
		   t.add(20);
		   t.add(70);
		   t.add(50);
		   System.out.println("Tree set is :"+t);
		   t.remove(30);
		   System.out.println("After removing :"+t);
		   TreeSet<Integer> t1=new TreeSet<Integer>();
		   t1.add(90);
		   t1.add(70);
		   t1.add(60);
		   t1.add(80);
		   System.out.println("Elements are :"+t1);
		   t.retainAll(t1);
		   System.out.println("Common :"+t);

	}

}
