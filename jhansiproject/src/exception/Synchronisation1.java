package exception;

 class A
{
  static synchronized void display()	
{
for(int i=0;i<=10;i++)
{
	System.out.println(i);
}

}
}
class B extends Thread
{
	A a;
	B(A a)
	{
		this.a=a;
	}
	 public void run()
	{
		a.display();
	}
}
class C extends Thread
{
     A a;
     C(A a)
   {
	   this.a=a;
   }
    public void run()
   {
	   a.display();
   }
     }
	
public class Synchronisation1{
	public static void main(String args[]) {
       A a=new A();
      A a1=new A();
       B b=new B(a);
       C c=new C(a1);
       b.start();
       c.start();
      
	}
}

       
	




