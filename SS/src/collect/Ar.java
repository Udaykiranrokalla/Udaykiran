package collect;
import java.util.*;
public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println("The list is "+l);
        Iterator i=l.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next()+"");
        }
	}

}
