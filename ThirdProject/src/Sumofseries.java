import java.util.Scanner;
public class Sumofseries {
public static void main(String[] args) {
	int n,j;
	int i=1;
	float sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter ranger upto yoy want to print");
	n=scan.nextInt();
	for(j=1;j<=n;j++) {
		sum=sum+(i%j);
	}
	System.out.println("sum of series" +sum);
}
}
