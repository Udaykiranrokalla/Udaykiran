package constructors;
class student2{
	int id;
	String name;
	int age;
	student2(int i,String n)
	{
		 id=i;
		name=n;
	}
		student2(int i,String n,int a)
		{
			 id=i;
			 name=n;
			 age=a;
		}
	void display()
	{
		
		System.out.println(id+" "+name+" "+age);
		
	}
 public static void main(String args[])
 {
	 student2 s1=new student2(111,"roja" );
	 student2 s2=new student2(211,"soni",20 );
	 s1.display();
	 s2.display();
 }

 }

