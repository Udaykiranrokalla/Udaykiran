package Inheritance;


class Add{
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum is "+c);
	}
}
class Multi extends Add{
	void multi(int a,int b)
	{  
		int m=a*b;
		System.out.println("multiplication is"+m);
	}
}
class Div extends Add{
	void div(int a,int b)
	{
		int d=a/b;
		System.out.println("div is "+d);
	}
}
public class Types extends Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Types n1=new Types();
         n1.div(4,3);
         Div d1=new Div();
         d1.add(4,2);
         Multi m1=new Multi();
         m1.add(8,8);
         
	}

}
