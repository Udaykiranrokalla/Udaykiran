interface mulpm {
	int casio(int a,int b);
}
public class Multipleparameters {
public static void main(String args[]) {
	mulpm c1=(a,b) ->(a+b);
	System.out.println(c1.casio(2, 5));
	
	mulpm c2=(a,b) ->(a-b);
	System.out.println(c2.casio(6, 4));
	
	mulpm c3=(int a,int b) ->(a*b);
	System.out.println(c3.casio(6, 5));
	
	mulpm c4 =(a,b) ->(a/b);
	System.out.println(c4.casio(10,5));
}
}
