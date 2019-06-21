import java.util.*;
public class SpellDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter number");
   int rem=0,rev=0,r;
   int n=sc.nextInt();
     while(n>0) {
    	 rem=n%10;
    	 rev=rev*10+rem;
         n=n/10;
              }
        while(rev>0) {
        	r=rev%10;
        	switch(r) {
        	case 0:System.out.println("zero");
        	       break;
        	case 1:System.out.println("one");
 	        break;
        	
        	case 2:System.out.println("two");
 	       break;
        	case 3:System.out.println("three");
 	       break;
        	case 4:System.out.println("four");
 	       break;
        	case 5:System.out.println("five");
 	       break;
        	case 6:System.out.println("six");
 	       break;
        	case 7:System.out.println("seven");
 	       break;
        	case 8:System.out.println("eight");
 	       break;
        	case 9:System.out.println("nine");
 	       
        	}
        	rev=rev/10;
        }
	}
	}

