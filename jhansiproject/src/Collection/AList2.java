package Collection;
import java.util.*;
public class AList2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> al=new ArrayList<String>();  
	System.out.println("list of name:"+al);
	al.add("raju");
    al.add("rani");
    al.add("ramu");		
	System.out.println("after invoking add(E e)method:"+al);
	 al.add(1, "Gaurav");  
    System.out.println("After invoking add(int index, E element) method: "+al);  
 ArrayList<String> al2=new ArrayList<String>();
 al2.add("roja");
 al2.add("raj");
 al.addAll(al2);
 System.out.println("after invoking add collection<? Extends E> C) method:"+al);
ArrayList<String> al3=new ArrayList<String>();
al3.add("san");
al3.add("sri");
al.addAll(1,al3);
System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
}
}