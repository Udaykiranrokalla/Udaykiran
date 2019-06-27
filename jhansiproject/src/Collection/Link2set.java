package Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Link2set {
public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Integer> s1=new ArrayList<Integer>();
s1.add(450);
s1.add(100);
s1.add(100);
s1.add(544);
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


