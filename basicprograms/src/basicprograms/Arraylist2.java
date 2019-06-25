package basicprograms;
import java.util.*;
public class Arraylist2 {
public static void main(String args[]) {
	ArrayList<String> al=new ArrayList();
	al.add("1");
	al.add("2");
	al.add("3");
	al.add("4");
	al.add("4");
	al.add("4");
	al.add("5");
	ArrayList<String> bl=new ArrayList();
	bl.add("miracle");
	bl.add("software");
	bl.add("systems");
	bl.add("systems");
	bl.add("software");
	bl.add("mss");
	
	//al.addAll(bl);
	//System.out.println(al);
    Set<String> ss=new HashSet(al);
	for(String k:ss) 
		System.out.println(ss);
		
	
	
}
}
