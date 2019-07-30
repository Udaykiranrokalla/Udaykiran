package Lambda;

import java.util.ArrayList;

public class ArrSort {
	
	public static void main(String args[])
	{
		ArrayList<Integer> lst =new ArrayList<Integer>();
		
		lst.add(1);
		lst.add(7);
		lst.add(18);
		lst.add(20);
		
	   lst.sort(null);
       lst.forEach(n -> System.out.println(n));
       				
	}

}
