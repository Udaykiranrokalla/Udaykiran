package basicprograms;
import java.util.Scanner;
public class Alldigitequalnot {
public static void main(String args[]) {
	int i,j,temp;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	s.close();
	temp=i;
	while(i>0) {
		j=i%10;
		i=i/10;
	
	}
	
if(temp==j) {System.out.println("both are equal");
	
}
else {
	System.out.println("not equal");	
}
}
}

