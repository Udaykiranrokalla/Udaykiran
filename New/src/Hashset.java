import java.util.HashSet;
import java.util.Iterator;

public class Hashset 
{

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add("zombies");
		hs.add("harry");
		hs.add(" ");
		hs.add("kusuma");
	    Iterator itr=hs.iterator();
	    System.out.printf("given elements are ",itr);
	    System.out.println(hs);

	}

}
