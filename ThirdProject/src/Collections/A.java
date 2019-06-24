package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class A {
public static void main(String args[]) {
	ArrayList al =new ArrayList();
al.add("uday");
al.add(2);
al.add('c');
al.add(1,"kiran");
al.add(0,"UK");

Iterator i=al.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
}
}
