package lambdaExp;
interface A{
	public String msg();
}
public class LambdaNoP {
public static void main(String args[]) {
 A a = () -> { return "hello" ; };
	System.out.println(a.msg());
	
}
}
