package Collection;
import java.util.TreeSet;
import java.util.Iterator;
public class TList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> set=new TreeSet<String>();  
		set.add("jhasi");  
		set.add("Vijay");  
		set.add("ram");  
		set.add("Ajay");  
		//traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  


