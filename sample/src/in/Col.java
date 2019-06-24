package in;
import java.util.*;
public class Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(70); 
		t.add(30);
		t.add(20);
		System.out.println("Set elements are :"+t);
		t.remove(30);
		System.out.println("elements after remove :"+t);
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(410);
		t1.add(20);
		t1.add(70); 
		System.out.println(" tree second set :"+t1);
		t.retainAll(t1);
       System.out.println("Common :"+t);
       t1.removeAll(t1);
       System.out.println("removed :"+t1);
       
       
	}

}
