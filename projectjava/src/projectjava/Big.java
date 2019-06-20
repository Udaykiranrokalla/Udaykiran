package projectjava;
import java.util.*;
public class Big {
	public static void main(String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
        System.out.println("enter 2 integer values");
         a=s.nextInt();
         b=s.nextInt();   
        if(a>b)
   			System.out.println("big is"+a);
        else
			System.out.println("big is"+b);

	}
	
}
