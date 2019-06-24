package customexception;

import java.util.*;

import mypack1.String;

public class A
{

	public static void main(String args[])

	{
	
       ArrayList al = new ArrayList();
       al.add("MSS");
       al.add(2);
       al.add('C');
       al.add(6.3);
       Iterator i=al.iterator();
       System.out.println("given elements are"+i);
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
	}
	

}
