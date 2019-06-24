
public class ThreadClass
{
	
	void show()
	{
	for(int i=0;i<=10;i++)
	{
	System.out.println(i);
	}
	}
	}
	class T1 extends ThreadClass
	{
	public void run()
	{
	a.show();
	}
	}
	class T2 extends ThreadClass
	{

	public void run()
	{
	a.show();
	}
	}
	public class B
	{
	public static void main(String args[])
	{
	A a=new A();
	T t1=new T();
	T2 t2=new t2();
	t1.start(); 
	t2.start();
	}
	}
}
