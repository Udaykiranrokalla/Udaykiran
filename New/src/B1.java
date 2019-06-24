import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class B1 
{
	public static void main(String args[])

	{
	
       LinkedList ll = new LinkedList();
       ll.add("MSS");
       ll.add(2); 
       ll.add('C');
       ll.add(6.3);
       Iterator i=ll.iterator();
       System.out.println("given elements are"+i);
//       while(i.hasNext())
//       {
//    	   System.out.println(i.next());
//       }
	   System.out.println(ll);

}
}
