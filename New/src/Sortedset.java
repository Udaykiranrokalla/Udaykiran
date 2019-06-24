import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset 
{

	public static void main(String[] args) 
	{
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("hi");
		ss.add("apple");
		ss.add("cat");
		ss.add("hello");
		Iterator i=ss.iterator();
        System.out.println("elements are"+i);
        System.out.println(ss);
	}

}
