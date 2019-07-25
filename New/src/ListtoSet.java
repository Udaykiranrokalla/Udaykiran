import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListtoSet 
{

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("harry");
		al.add("niha");
		al.add("kusu");
		al.add("harry");
		HashSet<String> hs=new HashSet<String>(al);
		System.out.println("set elements are :");
		for(String s:hs)
		System.out.println(s);
	}

}
