import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number");
		 n=sc.nextInt();
		 for(int i=1; i <= 10; i++)
	        {
	            System.out.println(n+" * "+i+" = "+n*i);
	        }

	}

}
