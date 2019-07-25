import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList ls=new LinkedList();
	   ls.add("latha");
	   ls.add("makana");
	   ls.add("nikija");
	   ls.add("jessi");
	  System.out.println(ls);
	   ls.add(1,"sri");
	  System.out.println(ls);
	   LinkedList ls2=new LinkedList();
	   ls2.add("hii");
	   ls2.add("this");
	   ls.addAll(ls2);
	  System.out.println(ls);
	  ls.removeAll(ls2);
	  System.out.println(ls);
	  ls.clear();
	  System.out.println(ls);
	}

}
