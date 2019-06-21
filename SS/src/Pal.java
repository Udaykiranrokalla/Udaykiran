import java.util.Scanner;
public class Pal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,t,sum=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        n=sc.nextInt();
        t=n;    
        while(n>0)
        {    
        	   r=n%10; 
        	   sum=(sum*10)+r;    
        	   n=n/10;    
  	   }
       if(t==sum)
       {
    	   System.out.println("It is palindrome");
       }
       else
       {
    	   System.out.println("It is not palinrome");
       }
	}

}
