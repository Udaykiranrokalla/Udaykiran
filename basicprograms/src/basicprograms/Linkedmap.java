package basicprograms;
import java.util.*;
import java.util.Map.Entry;
public class Linkedmap {
	public static void main(String args[]) {
		LinkedHashMap<Integer,String> a=new LinkedHashMap();
		a.put(1,"s");
		a.put(1,"s");
		a.put(4,"sai");
		a.put(3,"sram");
		a.put(2,"ssss");
		a.put(5,"sqqq");
for(Map.Entry<Integer,String> m:a.entrySet()) {
	System.out.println(m.getKey() +" " + m.getValue());
	

}
	
	
	}

}
