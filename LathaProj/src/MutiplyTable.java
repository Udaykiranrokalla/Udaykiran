import java.util.*;
public class MutiplyTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("enter number");
 int n=sc.nextInt();
 int mul;
 for(int i=1;i<=12;i++) {
	 mul=n*i;
	 System.out.println(n+ "*" +i+ "=" +mul);
 }
	}

}
