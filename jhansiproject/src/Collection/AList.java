package Collection;
import java.util.*;

public class AList {
	
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
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
