package inheritance;

 class MultiLevel
{
    public void display()
    {
       System.out.println("Multilevel"); 	
    }
}
class B extends MultiLevel
{
	public void run()
	{
		System.out.println("child B");
	}
}
class C extends B
{
	public static void main(String args[])
	{
		C c=new C();
		c.display();
		c.run();

		
	}
	
	
}