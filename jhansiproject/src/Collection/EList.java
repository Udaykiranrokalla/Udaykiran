package Collection;
import java.util.LinkedHashSet;
import java.util.Iterator;
public class EList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> se=new LinkedHashSet<String>();
				se.add("one");
			    se.add("two");
			    se.add("three");
			    Iterator<String> itr=se.iterator();  
			    while(itr.hasNext())
			    {  
			    System.out.println(itr.next());  

			    }
	}
}
