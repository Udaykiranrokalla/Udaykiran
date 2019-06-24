package collect;
import java.util.*;
public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("The list is "+l);
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(98);
		l2.add(20);
		l2.add(50);
		l2.add(430);
		System.out.println("Second List is :"+l2);
		l.retainAll(l2);
		System.out.println("Common :"+l);
		l2.clear();
		System.out.println("After clear elements :"+l2);
	}

}
