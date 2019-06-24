package collect;
import java.util.*;
public class Ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("Hari");
		l.add("Gp");
		l.add("Hari");
		l.add("Nikki");
		System.out.println("Names "+l);
		Iterator i1=l.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next()+"");
		}
		
	

	}

}
