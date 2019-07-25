
abstract class Shape{
	 abstract void display(); 
		}
 class Rectangle extends Shape{
	
		void display() {
			System.out.println("draw rectangle");
		}
		 
 }   
class Circle1 extends Shape{
	void display() {
		System.out.println("draw circle");
	}
}
 class Test{
	 public static void main(String args[]) {
		// TODO Auto-generated method stub
     Shape s=new Circle1();
     s.display();
	}

}
