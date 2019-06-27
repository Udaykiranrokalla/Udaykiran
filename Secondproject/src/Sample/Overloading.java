package Sample;

 class Overloading1 {
	void sum(int a,long b) {System.out.println(a+b);}
	void sum(int a, int b,int c) {System.out.println(a+b+c);}
		public class Overloading{
	public void main(String args) {
		Overloading1 obj=new Overloading1();
		obj.sum(16,28);
		obj.sum(16,8,21);
	}
	
		}
}
