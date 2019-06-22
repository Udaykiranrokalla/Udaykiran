import java.util.Scanner;
import java.math.*;
public class Sumofseries2 {
public static void main(String[] args) {
	int n,j;
	int i=1;
	double sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter range upto you want to print");
	n=scan.nextInt();
	for(j=1;j<=n;j++) {
		sum=sum+(1/Math.pow(2,j));
	}
	System.out.println("sum of series" +sum);
}
}
