
interface Oneargs{
	
String one(String s);
}
public class Onearg {

	public static void main(String args[]) {
		
	Oneargs s1=(s)->{System.out.println("name"   +s); return"hello"+s;};
	s1.one("sai");
	
	}	
}
