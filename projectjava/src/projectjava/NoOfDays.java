package projectjava;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter  month");
        a=s.nextInt();
        switch(a)
        {
        case 1 :
        case 3 :
        case 5 :
        case 7 :
        case 8 :
        case 10 :
        case 12:
        {
        	System.out.println("31 days");
        	break;
        }
        case 4 :
        case 6 :
        case 9 :
        case 11 :
        {
        	System.out.println("30 days");
        	break;
        }
        case 2 :
        {
        	System.out.println("28 days");
        	break;
        }
         default :
        {
        	System.out.println("enter 1 to 12 digits only");
        }
        
        }
        

	}

}
