
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class list {
public static void main(String[] args) {
List<Integer> s1=new ArrayList<Integer>();
s1.add("harish");
s1.add("uday");
s1.add("koti");
s1.add(582);
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

