package in;
import java.util.ArrayList;
import java.util.HashSet;
public class Settolist {
	public static void main(String[] args)
	{
	HashSet<String> hs=new HashSet<String>();
	hs.add("hero");
	hs.add("syamu");
	hs.add("shetty");
	hs.add("hero");
	System.out.println("set elements are :"+hs);
	ArrayList<String> al=new ArrayList<String>(hs);
	System.out.println("list elements are :");
	for(String s:al)
	System.out.println(s);

	}

	}

