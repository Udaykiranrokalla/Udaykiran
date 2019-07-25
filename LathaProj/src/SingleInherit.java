 class A{
	void display() {
		System.out.println("parent");
	}
}
public class SingleInherit extends Exam {
  void display() {
	  System.out.println("child");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SingleInherit ob=new  SingleInherit();
       ob.display();
       ob.display();
	}

}
