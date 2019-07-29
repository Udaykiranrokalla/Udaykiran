package LamdaEx;
 interface B
 {
	 	public int one(int a);
 }
 
public class Singleparam {
 public static void main(String args[])
 {
	 B b= (num) -> { return num+2; };
 System.out.println(b.one(4));
 }
}
