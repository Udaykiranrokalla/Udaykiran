import java.util.*;


public class GenricCollection {
	public static void main(String args[]) {
	
		List<String> al=new ArrayList<String>();
		al.add("mss");
		al.add("sai");
		al.add("kkkk");
		al.add("abc");
		al.add("cdf");
		
		al.forEach((n)->System.out.println(n));
		
	}
}
