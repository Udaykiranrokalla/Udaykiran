import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset 
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("zombies");
        lhs.add("xmas");
        lhs.add("xmas");
        lhs.add("nikki");
        Iterator i=lhs.iterator();
        System.out.println("linked hash set elements are "+i);
        System.out.println(lhs);
	}

}
