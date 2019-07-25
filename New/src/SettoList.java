import java.util.ArrayList;
import java.util.HashSet;

public class SettoList 
{

	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("harry");
		hs.add("niha");
		hs.add("kusu");
		hs.add("harry");
		ArrayList<String> al=new ArrayList<String>(hs);
		System.out.println("list elements are :");
		for(String s:al)
		System.out.println(s);	

	}

}
