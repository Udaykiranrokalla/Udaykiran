package crud;

import java.util.*;

class Item
{
	int id;
	String name;
	public Item(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
}

public class Compare {
public static void main(String args[])
{
	List<Item> li=new ArrayList<Item>();
	li.add(new Item(1,"harry"));
	li.add(new Item(12,"ashu"));
	li.add(new Item(21,"nikki"));
	li.add(new Item(5,"chinnu"));
	
	 Collections.sort(li,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
	 for(Item p:li){  
         System.out.println(p.id+" "+p.name);  
     }  

}
}
