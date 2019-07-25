import java.util.*;
public class ArrayAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<String> al=new ArrayList<String>();
	al.add("latha");
	al.add("pari");
	al.add("niki");
	al.add("jessi");
	System.out.println("elements in arraylist"+al);
	al.add(1,"rev");
	System.out.println("After insert element using index"+al);
	al.add("banu");
	System.out.println(al);
	ArrayList<String> a2=new ArrayList<String>();
	a2.add("ramu");
	a2.add("ramu1");
	al.addAll(a2);
	System.out.println(al);
	ArrayList<String> al3=new ArrayList<String>();
	al3.add("latha");
	al3.add("parv");
	a2.addAll(1,al3);
	System.out.println(a2);
	al.addAll(2,al3);
	System.out.println(al);
	al3.remove("latha");
	System.out.println(al3);
	al.remove(0);
	System.out.println(al);
	al.removeAll(al3);
	System.out.println(al);
	al.clear();
	System.out.println(al);
	System.out.println(a2);
	System.out.println(al3);
	a2.retainAll(al3);
	System.out.println(a2);
	
	}

}
