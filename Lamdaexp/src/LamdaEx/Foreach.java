package LamdaEx;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
public static void main(String args[])
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("latha");
	list.add("jhansi");
	list.add("sandy");
	list.add("mohan");
	list.forEach( (names) -> System.out.println(names)
	);
}
}
