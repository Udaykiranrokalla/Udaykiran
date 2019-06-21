import java.util.Scanner;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,fact=1,n;
      
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact);

	}

}
