package Collections;
import java.util.*;
public class I {
public static void main(String args[]) {
try {
ArrayList al =new ArrayList();
al.add("uday");
al.add(2);
al.add('c');
al.remove("uday");
al.add(1,"kiran");
al.add(0,"UK");
System.out.println(al.size());
System.out.println("elements are" +al);
boolean b= Collections.addAll(al,1,2,3);
System.out.println("elements after are" +al);
	}
catch(NullPointerException e) {
}
}
}