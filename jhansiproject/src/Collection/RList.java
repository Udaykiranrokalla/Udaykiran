package Collection;

import java.util.ArrayList;

public class RList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();  
		System.out.println("list of name:"+al);
		al.add("raju");
	    al.add("rani");
	    al.add("ramu");		
		al.add("gaurav");
	    System.out.println("after invoking add(E e)method:"+al);
		 al.remove("Gaurav");  
	    System.out.println("After invoking add(int index, E element) method: "+al);  
	    al.remove(0);
	    ArrayList<String> al2=new ArrayList<String>();
	 al2.add("roja");
	 al2.add("raj");
	 al.addAll(al2);
	 System.out.println("updated list al:" +al);
	 al.removeAll(al2);
	   System.out.println("After invoking removeAll() method: "+al);   
	   al.removeIf(str -> str.contains("Ajay"));  
	System.out.println("After invoking removeIf() method: "+al);  
	 al.clear();  
     System.out.println("After invoking clear() method: "+al);   
	}
}
