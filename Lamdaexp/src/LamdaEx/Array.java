package LamdaEx;

import java.util.ArrayList;

public class Array {
public static void main(String args[])
{
	ArrayList al=new ArrayList();
	al.add(1);
	al.add("sri");
	al.add("jhanu");
	al.forEach( (data) -> System.out.println(data));
}
}
