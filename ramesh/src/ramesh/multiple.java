package ramesh;
import java.util.*;
public class multiple {

	public static void main(String[] args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter anumber");
		int n=sc.nextInt();
		do {
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}
		while(i<=n);
	}
}

