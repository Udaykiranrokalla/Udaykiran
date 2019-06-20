package ramesh;

class Student {
int id,age,m1,m2,m3;
String name;
static String company;
public Student(int a,int b,int c,int d,int e,String n)
{
	this.id=a;
	this.age=b;
	this.m1=c;
	this.m2=d;
	this.m3=e;
	this.name=n;
}
void average()
{
	double z=0.0;
	z=(this.m1+this.m2+this.m3)/3.0;
	System.out.println("Average of the student"+this.name+"is"+z);
}
	public static void main(String[] args) {
		Student s1=new Student(11,21,70,80,90,"abc");
		s1.average();
		System.out.println(s1.id);
		
	}

}
//
//mlngjfdklgbiohdgfdigbhdgp
