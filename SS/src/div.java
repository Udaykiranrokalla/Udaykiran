import java.util.Scanner;
public class div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=s.nextInt();
        if(n%3==0 && n%5==0)
        {
        	System.out.println(n+"is divisible by both 3 and 5");
        }
        else
        {
        	System.out.println(n+"is not divisible by both 3 and 5");
        	
        }
	} 
		
	

}
