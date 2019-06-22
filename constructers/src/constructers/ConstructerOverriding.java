package constructers;

public class ConstructerOverriding {
	int id;
	String name;
	int age;
	ConstructerOverriding(int i,String n)
	{
		id=i;
		name=n;
	}
	ConstructerOverriding(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+ " " +name+" " +age);
	}
	public static void main(String args[])
	{
		ConstructerOverriding n1= new ConstructerOverriding(1,"apple",22);
		ConstructerOverriding n2= new ConstructerOverriding(2,"choco");
	n1.display();
	n2.display();
	
	}
}
