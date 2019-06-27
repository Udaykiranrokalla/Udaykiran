package Collections;
import java.util.*;
public class M {
public static void main(String args[] ){
	ArrayList<String> a1=new ArrayList<String>() ;
	a1.add("miracle");
	a1.add("mss");
	a1.add("udaykiran");
	a1.add("uday");
	HashSet<String> h1=new  HashSet<String>();
	for(String i:a1) 
		h1.add(i);
   Iterator i=h1.iterator();
   while(i.hasNext())
{
  System.out.println(i.next());
}
}
}

