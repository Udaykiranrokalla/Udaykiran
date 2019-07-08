package basicprograms;


class Abc{
	static int a,b;
int c,d;
	void Abc(){
		a=10;
		b=20;
		c=30;
		d=40;
		System.out.println("in sidee"+a);
		System.out.println("in sidee"+b);
		System.out.println("in sidee"+c);
		System.out.println("in sidee"+d);
	}
	void Abcd() {
		a=a+c;
		b+=d;
		System.out.println("changed"+a);
		System.out.println("changed"+b);
		
	}
void Ab() {
	
	System.out.println("3rd time"+a);
	System.out.println("3rdd time"+b);
}




}

public class Staticchange {
        
	public static void main(String args[]) {
		
		Abc ab=new Abc();
		ab.Abc();
		ab.Abcd();
		ab.Ab();
		
	}

}
