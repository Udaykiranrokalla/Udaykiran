interface nopm {
	public String welcome();
}
public class Noparameter {
public static void main(String args[]) {
	nopm a1=() ->  { return "hello"; };
	System.out.println(a1.welcome());
	
	nopm a2=() -> "hii";
	System.out.println(a2.welcome());
}
}
