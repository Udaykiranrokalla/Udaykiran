package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList l1=new ArrayList();
         l1.add("harish");
         l1.add(507);
         l1.add('c');
         l1.add("employee");
   Iterator it = l1.iterator();
   while(it.hasNext())
		   {
	        System.out.println(it.next());
		   }
       	}

}
