package Constuctor;

public class Constructor2 {
	int id;
	String name;
	int no;
	int number;
	Constructor2(int Id,String Name) {
		this.id=Id;
		this.name=Name;
	}
	Constructor2(int Eid, int Number) {
		this.no=Eid;
		this.number=Number;
       // Constructor2(1, "uday");
	}
	void display()
	{
		System.out.println(no + " " + number);
	
	}
	public static void main(String[] args) {
		
        Constructor2 ob1=new Constructor2(123,545);
	    ob1.display();
	    
	}
}
