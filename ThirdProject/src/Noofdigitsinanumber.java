import java.util.Scanner;
public class Noofdigitsinanumber {
public static void main(String[] args) {
	int n,count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter an number");
	n=scan.nextInt();
while(n>0) {
	n=n/10;
	count++;
}
System.out.println("no of digits " +count);
}
 }
