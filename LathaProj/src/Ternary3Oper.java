import java.util.*;
public class Ternary3Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter 3 numbrs");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int res=(a>b && a>c)?a:(b>c)?b:c;
      System.out.println(res+"is big");
	}

}
