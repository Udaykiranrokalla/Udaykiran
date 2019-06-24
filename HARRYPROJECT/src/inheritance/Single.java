package inheritance;

class Single
{
  public void display()
  {
	  System.out.println("Single");
  }
}
class Child extends Single
{
	public void display()
	{
		System.out.println("child");
	}
	public static void main(String args[])
	{
		Child c=new Child();
		c.display();
		
	}
}