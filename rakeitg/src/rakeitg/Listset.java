package rakeitg;
import java.util.*;
public class Listset {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("Rock");
		al.add("Manu");
		al.add("Mom");
		al.add("Mom");
		al.add("Mom");
		al.add("Venki");
		al.add("Deepu");
		System.out.println("List element are:"+al);
		Set<String> ss=new HashSet<String>(al);
		System.out.println("Set element are:");
		for(String k:ss) 
		System.out.println(k);

	}
}
