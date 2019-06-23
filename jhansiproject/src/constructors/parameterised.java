package constructors;
class student1
{
	int id;
	String name;
 student1 (int i,String n)
{
this.id=i;
this.name=n;
}
void display()
{
	System.out.println(id+ " "+name);
}
public static void main(String args[])
{
  student1 s1=new student1(111,"ram");
  student1 s2=new student1(112,"sita");
  s1.display();
  s2.display();
}
}