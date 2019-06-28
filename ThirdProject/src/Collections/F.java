package src.Collections;

import java.util.*;

public class F {
public static void main(String args[]) {
	ArrayList al =new ArrayList();
al.add("uday");
al.add(2);
al.clear();
al.add('c');
al.remove("uday");
al.add(1,"kiran");
al.add(0,"UK");

Iterator i=al.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
}
}