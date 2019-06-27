package collections;

import java.util.*;
class Map1
{
 public static void main(String args[])
 {
  HashMap< String,Integer> hm = new HashMap< String,Integer>();
  hm.put("a",new Integer(100));
  hm.put("b",new Integer(200));
  hm.put("c",new Integer(300));
  hm.put("d",new Integer(400));

  Set< Map.Entry< String,Integer> > st = hm.entrySet();    //returns Set view
  for(Map.Entry< String,Integer> me:st)
  {  
//	  System.out.print(me);

  System.out.print(me.getKey()+":");
 System.out.println(me.getValue());
  }
 }
}