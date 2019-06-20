package basicprograms;

class A{
	int a, b;
	int a(int a, int b) {
		int b1=10;
		System.out.println(a+b);
		return a+b;
	}
	
}
public class Withoutconst {
	public static void main(String args[]) {
		A b=new A();
		b.a(5,5);
	}

}
