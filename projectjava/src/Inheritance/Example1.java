package Inheritance;


class A{
	void display()
	{
		System.out.println("class A method ");
	}
}
class B extends A{
	void multi()
	{
		System.out.println("class B method");
	}
}
public class Example1 extends B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Example1 e1=new Example1();
         e1.display();
         e1.multi();
		
	}

}
