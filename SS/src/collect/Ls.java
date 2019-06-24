package collect;
import java.util.*;
public class Ls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("Hari");
		l.add("Gp");
		l.add("Hari");
		l.add("Nikki");
		System.out.println("list elements "+l);
	    HashSet<String> h1=new HashSet<String>(l);
	    System.out.println("Hash Set elements are : ");
	    for (String x : h1) 
	    	System.out.println(x);
	    
     

	}

}
