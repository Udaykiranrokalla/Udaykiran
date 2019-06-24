
class G
{
	static synchronized void display()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println(i);
	}
	}
}
class E extends Thread
{
	
	public void run()
	{
		G.display();
	}
}
class F extends Thread
{

public void run()
	{
		G.display();
	}
}
public class Asc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E b=new E();
		F c=new F();
		b.start();
		c.start();
	

	}

}
