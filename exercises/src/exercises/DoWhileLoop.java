package exercises;

public class DoWhileLoop {
	public static void main(String args[])
	{
		int n=5;
		int i=1;
		System.out.println("the table of" +n);
		do {
			int t=n*i;
			System.out.println(i + "*" + n + "=" +t);
			i++;
         	}
		while(i<=12);
	}
	

}
