interface onepm {
	public  String insert(String name);
}
public class Oneparameter {
public static void main(String args[]) {
	onepm b1=(name) ->  { return "welcome " +name; };
	System.out.println(b1.insert("uday"));
	
	onepm b2=(name) -> "hii " +name;
	System.out.println(b2.insert("kiran"));
	
}
}
