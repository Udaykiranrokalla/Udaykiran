import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		n=sc.nextInt();
		for(int i=1; i<=n; i=i+2){
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
