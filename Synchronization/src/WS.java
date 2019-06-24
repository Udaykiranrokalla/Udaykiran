 class A
{
 static synchronized void display ()
   {
	
	   for (int i=0 ;i<10; i++)
	   {
		   System.out.println(i);
	   }
   }
}
class B extends Thread
    {
	// A a;
	 //B (A a)
	// {
	//	 this.a=a;
	// }
	 public void run()
	 {
		 A.display();
	 }
	}
class C extends Thread
{
// A a;
// C (A a)
// {
//	 this.a=a;
 //}
 public void run()
 {
	 A.display();
 }
}
  class WS
{
	public static void main(String args[])
	{
		A a= new A();
		A a1=new A();
		B b=new B();
		C c=new C();	
		b.start();
		c.start();
	
	}
	
	}