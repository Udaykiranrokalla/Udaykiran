import java.util.Scanner;
public class Perfectnumber {
	public static void main(String[] args ) {
		Scanner scan=new Scanner(System.in);
	int i,n,sum=0;
	System.out.println("enter a number");
	n=scan.nextInt();
	for(i=1;i<n;i++) {
		if(n%i==0) {
			sum=sum+i;
		}
	}
	if(sum==n) {
		System.out.println("it is a perfect number");
	}
	else {
		System.out.println("it is not a perfect number");
	}
	
	}

}
