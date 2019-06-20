package ramesh;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char repeat;
		do
		{
			System.out.println("1-Addition");
			System.out.println("2-Subtraction");
			System.out.println("3-Multiplication");
			System.out.println("4-Division");
			System.out.println("what you want to perform..");
			int option=sc.nextInt();
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int result=0;
			switch(option)
			{
			case 1:result=a+b;
			System.out.println("The Addition is:"+result);
			break;

			case 2:result=a-b;
			System.out.println("The Subtraction is:"+result);
			break;

			case 3:result=a*b;
			System.out.println("The Multiplication is:"+result);
			break;

			case 4:result=a/b;
			System.out.println("The Division is:"+result);
			break;
			default : System.out.println("Invalid Option");
			}
			System.out.println("Do you want to continue(Y/N)");
			repeat=sc.next().charAt(0);
		} while(repeat!='n');
		
		}
	}


