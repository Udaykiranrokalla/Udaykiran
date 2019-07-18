package basicprograms;


class Abc{
	int g;
	static int a=100,b=109;
final int c=30,d=40;
	static void Abc(){
		Abc.a=10;
		b=20;
	
		
		System.out.println("in sidee"+a);
		System.out.println("in sidee"+b);
		System.out.println("in sidee"+b);
		System.out.println("in sidee"+a);
	}
	void Abcd() {
		a=a+c;
		b+=d;
		System.out.println("2nd changed"+a);
		System.out.println("2nd changed"+b);
		
	}
void Ab() {
	a=a+1;
	System.out.println("3rd time"+a);
	System.out.println("3rd time"+b);
}
void a() {
	System.out.println("4th time"+a);
	System.out.println("4th time"+b);
	
}
}
 class Cab extends Abc{
	
	void b() {
		System.out.println("in another class"+a);
	}
}

public class Staticchange {
        
	public static void main(String args[]) {
		
		Abc ab=new Abc();
		Cab x=new Cab();
		
		
		ab.Abc();
		
		ab.Abcd();
		ab.Ab();
		ab.a();
		x.b();
		
	}

}
