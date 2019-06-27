package collections;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedLstG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l1=new LinkedList <String>();
         l1.add("harish");
         l1.add("koti");
         l1.add("chowdhary");
         l1.add("villan");
   Iterator it = l1.iterator();
   while(it.hasNext())
		   {
	        Student s= (Student)it.next();
	        System.out.println();
		   }
       	}

	}


