package src;
class A {
	
 static synchronized void display(int j)
{
	int i=1;
	for (i=1;i<j;i++) 
	System.out.println(i);
	//return 0;
	
        
}
	
}
class B extends Thread {
	A a;
	B(A a)
	{
		this.a=a;
		
	}
	public void run() {
		a.display(5);
	}
}
class C extends Thread {
	A a;
    C(A a)
    {
    	this.a=a;
    }
public void run() {
	a.display(10);
}
}
class E extends Thread {
	A a;
    E(A a)
    {
    	this.a=a;
    }
public void run() {
	a.display(10);
}
}
public class D {
	public static void main(String args[])
{
A a=new A();
B b=new B(a);
C c=new C(a);
E e= new E(a);
b.start();
c.start();
e.start();
}
}







