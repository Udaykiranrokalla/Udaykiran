import java.util.Scanner;
public class Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,add,sub,div,mul;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a and b values");
         a=sc.nextInt();
         b=sc.nextInt();
         System.out.println("1.Addition\t2.Subtract\n3.Multiplication\t4.Division");
         System.out.println("Enter your choice:");
         int c=sc.nextInt();
         switch(c)
         {
         case 1:
        	    add=a+b;
        	    System.out.println("Addition of given numbers is"+add);
        	    break;
         case 2:
        	   sub=a-b;
        	   System.out.println("Subtraction of given numbers is"+sub );
        	   break;       	 
         case 3:
        	  mul=a*b;
        	  System.out.println("Multiplication of given numbers is"+mul);
        	  break;        	 
         case 4:
        	  div=a/b;
        	  System.out.println("Division of given numbers is"+div);
        	  break;        	 
         default:
        	 System.out.println("Invalid option");
         }
	}

}
