interface Multi{
	
	int add(int a,int b);
}

public class Multiplearg {
	public static void main(String args[]) {
			Multi a1=(a,b)->(a+b);
			System.out.println(a1.add(5,10));
		
	}
}
