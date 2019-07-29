package practice;

import java.util.*;

public class UsingMap {
public static void main(String[]args)
{
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(101, "sunil");
	m.put(102, "ramesh");
	m.put(103, "kumar");
	m.put(104, "ram");
	m.put(105, "ramky");
	m.forEach((v,k)->System.out.println("id: "+v+",Names: "+k));
}

}
