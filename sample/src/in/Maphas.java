package in;
import java.util.*;
public class Maphas {
public static void main(String args[]) {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	hm.put("sam",1);
	hm.put("shetty",2);
	hm.put("lucky",3);
	hm.put("rakii", 4);
	System.out.println("print number: "+hm);
	Set set=hm.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()){
	Map.Entry m=(Map.Entry)itr.next();
	System.out.println(m.getKey()+" "+m.getValue());
}
}
}