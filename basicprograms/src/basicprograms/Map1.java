package basicprograms;
import java.util.*;
import java.util.Map.Entry;
public class Map1 {
	public static void main(String args[]){
	HashMap<Integer,String> m=new HashMap();
	m.put(1,"sai");
	m.put(1,"sai");
	m.put(3,"sai");
	m.put(2,"ram");
   // Set s=m.entrySet();
    //Iterator i=s.iterator();
    //while(i.hasNext()) {
    	//Entry a=(Map.Entry)i.next();
    	//System.out.println(a.getValue());
    	
	for(Map.Entry<Integer,String> m1:m.entrySet())
    {
    	System.out.println(m1.getValue());
    }
	}

}
