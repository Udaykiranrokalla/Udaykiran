package Collections;
import java.util.*;
public class L {
public static void main(String[] args) {
ArrayList<String> s1=new ArrayList<String>();
s1.add("uday");
s1.add("kiran");
s1.add("udaykiranrokalla");
s1.add("uday");
s1.add("uk");
HashSet<String> s2=new HashSet<String>();
   for(String i:s1)
   	s2.add(i);
   Iterator i=s2.iterator();
   while(i.hasNext())
  {
       System.out.println(i.next());
  }
}
}