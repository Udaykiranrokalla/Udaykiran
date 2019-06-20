import java.util.*;
public class MenuDriCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 2 numbers");
            int a,b,c;
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.println("enter operator");
      char op=sc.next().charAt(0);
      switch(op) {
      case '+':c=a+b;
                System.out.println("sum="+c);
    	        break;
      case '-':c=a+b;
      System.out.println("sub="+c);
      break;
      case '*':c=a*b;
      System.out.println("mul="+c);
      break;
      case '/':c=a/b;
      System.out.println("div="+c);
      break;
      case '%':c=a%b;
      System.out.println("mod="+c);
      break;
      default:System.out.println("invalid operator");
      }
	}

}
