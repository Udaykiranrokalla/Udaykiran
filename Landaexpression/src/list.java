import java.util.ArrayList;

public class list {
public static void main(String args[]) {
	ArrayList<String> al =new ArrayList<String>();
	
	al.add("uday");
    al.add("kiran");
	al.add("nani");
	al.add("munna");
	
	al.forEach((n) ->System.out.println(n));
}
}
