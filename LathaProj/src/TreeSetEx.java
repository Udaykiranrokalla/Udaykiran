import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<String> ts=new TreeSet<String>();
      ts.add("one");
      //ts.add("two");
      //ts.add("three");
      ts.add("seven");
      ts.add("one");
      ts.add("six");
     // ts.add("five");
      //ts.add("null");
      //ts.add(" ");
      Iterator<String> i=ts.iterator();
      while(i.hasNext()) {
    	  System.out.println(i.next());
      }
	}

}
