import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet h1=new HashSet();
   h1.add("four");
   h1.add("one");
   h1.add("two");
   h1.add("three");
   h1.add("four");
   h1.add(" ");
   h1.add("Null");
   HashSet h2=new HashSet();
   h2.add("one");
   h2.add("six");
   h1.addAll(h2);
   h1.removeAll(h2);
  System.out.println(h1);
  h1.clear();
  System.out.println(h1);
	}
}
