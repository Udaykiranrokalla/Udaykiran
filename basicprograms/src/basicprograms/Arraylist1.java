package basicprograms;

import java.util.*;

public class Arraylist1 {
public static void main(String args[]) {
	
	ArrayList s=new ArrayList();
	for(int i=0;i<=10;i++)
	{
	s.add(i);
	}
	s.add("sai");	
	//Iterator a=s.iterator();
	//while(a.hasNext()) {
		//System.out.println(a.next());
	//}
//s.forEach((k) ->System.out.println(k));
//blic static void print(int k) {
	//System.out.println(k);
//for(int j=0;j<=s.size();j++) {
	//System.out.println(s.get(j)+" ");
	//System.out.println(" "+s.size());
//}

	ListIterator b=s.listIterator();
	while(b.hasPrevious()) {
		System.out.println(b.previous());
		
	}
}


}
