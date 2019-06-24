package Collections;
import java.util.*;
public class L {
public static void main(String[] args) {
ArrayList<Integer> s1=new ArrayList<Integer>();
s1.add(1);
s1.add(2);
s1.add(4);
s1.add(8);
HashSet<Integer> s2=new HashSet<Integer>();
   for(Integer i:s1)
   	s2.add(i);
   Iterator i=s2.iterator();
   while(i.hasNext())
  {
       System.out.println(i.next());
  }
}
}
