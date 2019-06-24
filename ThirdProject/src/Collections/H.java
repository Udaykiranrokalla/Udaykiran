package Collections;

import java.util.*;

public class H {
public static void main(String args[]) {
	ArrayList al =new ArrayList();
al.add("uday");
al.add(2);
al.add('c');
al.add(1,"kiran");
al.add(0,"UK");
System.out.println("elements are" +al);
ArrayList bl =new ArrayList();
bl.add("uday");
bl.add(8);
bl.add('e');
System.out.println("elements are" +bl);
al.retainAll(bl);
System.out.println("retainall elements" +al);
}
}