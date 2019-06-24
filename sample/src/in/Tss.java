package in;
import java.util.*;
public class Tss {
public static void main(String args[]) {
	TreeSet<String> st=new TreeSet<String>();
st.add("sam");
st.add("shetty");
st.add("likki");
st.add("rumana");
st.add("temo");
Iterator<String> itr=st.iterator();
while(itr.hasNext());
{
	System.out.println(itr.next());
}
}
}
