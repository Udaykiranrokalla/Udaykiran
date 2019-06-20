package basicprograms;


interface I1{
	void s();
	void s1();
}
interface I2{
	void s2();
	void s();
	
}
	class A1 implements I1,I2{

	
		public void s2() {
			System.out.println("sai");
			
		}

		@Override
		public void s() {
			System.out.println("ram");
			
		}

		@Override
		public void s1() {
			System.out.println("ram");
			
		}
        public void s3() {
        	System.out.println("ram");
        	
        }
	
	
}
public class Interface1 {
public static void main(String args[]) {
    A1 obj=new A1();
    obj.s2();
    obj.s1();
    obj.s();
    obj.s3();

}
	
	
}
