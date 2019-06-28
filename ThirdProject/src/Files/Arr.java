package src.Files;
import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class Arr implements Serializable {

	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
         l1.add("uday");
         l1.add("cse");
         l1.add(85);
   Iterator it = l1.iterator();
   while(it.hasNext())
		   {
	        System.out.println(it.next());
		   }
       	}

}
