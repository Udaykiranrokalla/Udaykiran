package constructoreg;

public class Emp
{
    int empid;
    String ename;
	float sal;
    Emp()
	{
		System.out.println("no arg constructor");
	}
	Emp(int empid)
	{
		this.empid=empid;
	}
	Emp(int empid,String ename,float sal)
	{
       this.empid=empid;
       this.ename=ename;
       this.sal=sal;
	}
	public void display()
	{
		System.out.println(empid+""+ename+""+sal);
	}
	
}
