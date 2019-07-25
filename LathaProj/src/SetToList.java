import java.util.*;
public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> list =new ArrayList<String>();
	       
	        list.add("mark");
	        list.add("String");
	        list.add("mark");
	        HashSet<String> h1=new HashSet<String>();
	        h1.add("four");
	        //h1.add("one");
	        //h1.add("two");
	        //h1.add("three");
	        //h1.add("four");
	        
	       // h1.addAll(list);
	        for(String s:h1)
	        
	        	list.add(s);
	        
	            Iterator<String> i=list.iterator();
	       while(i.hasNext()) {
	    	   System.out.println(i.next());
	       }
	        
	}

}
