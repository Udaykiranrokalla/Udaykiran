package basicprograms;

class A{
	void display() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
class B extends Thread{
	A a;
	B(A a)
	{
		this.a=a;
	}
public void run() {
a.display();	
}
}
class C extends Thread{
	A a;
	C(A a)
	{
		this.a=a;
	}
public void run(){
		a.display();
	}
}


public class Synchronized1 {
	public static void main(String args[]) {
		A a=new A();
		B b=new B(a);
		C c=new C(a);
		b.start();
		c.start();
	}
	

}
