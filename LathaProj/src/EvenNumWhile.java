import java.util.*;
public class EvenNumWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=0;
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Even numbers");
	        int n=sc.nextInt();
	      
	        int no=1;
	        
	        System.out.println("even number:");
	         
	        while(no!=n)
	         
	        {
	         
	        if(no%2==0)
	         
	        {
	         
	        System.out.println(no);
	         
	        }
	         
	        no++;
	         
	        }
	}

}
