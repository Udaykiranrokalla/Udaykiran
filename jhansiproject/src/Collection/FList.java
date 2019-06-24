package Collection;

import java.util.Iterator;
import java.util.HashSet;

public class FList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<String>();
				set.add("one");
			    set.add("two");
			    set.add("three");
			    Iterator<String> itr=set.iterator();  
			    while(itr.hasNext())
			    {  
			    System.out.println(itr.next());  

			    }
	}
}


