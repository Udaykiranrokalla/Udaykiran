package basicprograms;
import java.util.Scanner;
public class Noofdigits {
public static void main(String args[]) {
	int i,j,count=0;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	while(i!=0) {
		i=i/10;
		count++;
		
	}
	System.out.println(count);
}
}
