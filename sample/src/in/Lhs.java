package in;
import java.util.*;
public class Lhs {
public static void main(String args[]) {
	LinkedHashSet<String> st=new LinkedHashSet();
	st.add("sam");
	st.add("sailu");
		  st.add("lalii");
		  st.add("lise");
		  st.add("lucky");
		  Iterator<String> itr=st.iterator();
		  while(itr.hasNext());
		  {
			  System.out.println(itr.next());
		  }
		  
}
}
