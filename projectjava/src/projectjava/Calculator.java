package projectjava;

import java.util.Scanner;

public class Calculator {

	public static void main(String args[])
	{   
		char a;int b,c,res;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two digits");
		 b=s.nextInt();
		 c=s.nextInt();
		 System.out.println("enter your operator");
         a=s.next().charAt(0);
        switch(a)
        {
        case '+' :
        {   
        	res=b + c;
        	System.out.println(res);
        	break;
        }
        case '-' :
        {
        	res=b-c;
        	System.out.println(res);
        	break;
        }
        case '*' :
        {
        	res=b*c;
        	System.out.println(res);
        	break;
        }
        case '%' :
        {
        	res=b%c;
        	System.out.println(res);
        	break;
        }
        case '/' :
        {
        	res=b/c;
        	System.out.println(res);
        	break;
        }
       
         default :
        {
        	System.out.println("enter correct operation");
        }
        
        }
	}
}
	

