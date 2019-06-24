package Collection;
import java.util.LinkedList;
import java.util.Iterator;

public class BList {
	
	public static void main(String args[])
	{
		LinkedList al=new LinkedList();
		al.add("mss");
		al.add("miracle");
		al.add("system");
	Iterator it= al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
}




