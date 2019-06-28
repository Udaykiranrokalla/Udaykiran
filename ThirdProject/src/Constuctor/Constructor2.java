package src.Constuctor;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Constructor2 {
	int Eid;
	String name;
	int no;
	int number;
	Constructor2() {
		this(1,3);
		
	}
	Constructor2(int Eid, int Number) {
		this(Eid,6,"dhoni");
		this.Eid=Eid;
		this.no=Number;
		
	}
	Constructor2(int Eid, int Number,String name) {
		this.Eid=Eid;
		this.no=Number;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(Eid + " " + name);
	}
	void display1() {
		System.out.println(no +" " +number);
   }
	public static void main(String[] args) {
		
        Constructor2 ob1=new Constructor2();
        //Constructor2 ob2=new Constructor2(111,456);
	    ob1.display();
	    ob1.display1();
	    
	}
}
