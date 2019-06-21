import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter number");
		  int n=sc.nextInt();
		  int pal=n,r=0,rem=0;
		  while(n>0)
		  {
			  rem=n%10;
			  r=r*10+rem;
			  n=n/10;
		  }
		  if(pal==r) {
			  System.out.println("the given number is pallindrome");
			    }
		  else
		  {
			  System.out.println("it is not pallindrome");
		  }
			}

		

	}


