package crud;

import java.util.*;

class List1
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class CompareId {
	public static void main(String args[])
	{
		List<List1> l=new ArrayList<List1>();
		l.add(new List1(12,"GP"));
		l.add(new List1(2,"chinnu"));
		l.add(new List1(1,"harry"));
		l.add(new List1(4,"nikki"));
		l.add(new List1(25,"naveen"));
		l.add(new List1(5,"sam"));
		
		 Collections.sort(l,(p1,p2)->{  
		        return  ( p1.getId() < p2.getId())?-1:(p1.getId() > p2.getId())?1:0;  
		        });  
		 for(List1 p:l){  
	         System.out.println(p.id+" "+p.name);  
	     }  
	}

}
