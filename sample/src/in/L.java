package in;
import java.util.*;

public class L {
public static void main(String args[]) {
	LinkedList<String> sa=new LinkedList<String>();
	sa.add("sam");
	  sa.add("sailu");
	  sa.add("lalii");
	  sa.add("lise");
	  sa.add("lucky");
	  Iterator itr=sa.iterator();
	  while(itr.hasNext());
	  {
		  System.out.println(itr.next());
		  }
	  }
}
