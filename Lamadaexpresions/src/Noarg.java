
interface NOargs{
	
	String zero();
	
	
}
public class Noarg  {
	public static void main(String args[]) {
	
		
	NOargs a=()-> { System.out.println("zero args");return "nooo data";};
          System.out.println(a.zero());
	}
	
}
