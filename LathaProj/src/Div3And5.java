import java.util.*;
public class Div3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
        int n=sc.nextInt();
		if(n%3==0 && n%5==0) 
		{
			System.out.println("number is divisible by both 3 and 5");
		}
		else
		{
			System.out.println("number is not divisible by 3 and 5");
		}
	}

}
