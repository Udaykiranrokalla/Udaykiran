package practice;
import java.util.*;
class Emp{
int id;
String name;
Float Salary;
public Emp(int id,String name,float sal) {
	super();
	this.id=id;
	this.name=name;
	this.Salary=sal;
}
}
public class Employee{
	public static void main(String[]args)
	{
		List<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(101,"RAMESH",16000));
		l.add(new Emp(102,"SUNIL",15000));
		l.add(new Emp(103,"KUMAR",14000));
		
		System.out.println("Sorting");
		Collections.sort(l,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Emp e:l) {
			System.out.println(e.id+" "+e.name+""+e.Salary);
		}
	}
}
