package src.Collections;
import java.util.*;
public class K {
public static void main(String[] args) {
HashSet<String> s1=new HashSet<String>();
s1.add("uday");
s1.add("kiran");
s1.add("rokalla");
s1.add("uk");
s1.add("uday");
ArrayList<String> s2=new ArrayList<String>();
  for(String s:s1)
   	s2.add(s);
   Iterator i=s2.iterator();
   while(i.hasNext())
  {
       System.out.println(i.next());
  }
}
}