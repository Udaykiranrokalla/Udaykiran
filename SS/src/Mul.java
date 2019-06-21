import java.util.Scanner;
public class Mul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number:");
       n=sc.nextInt();
        i=1;
       do
       {
    	   System.out.println(n+"*"+i+"="+n*i);
    	   i++;
       }while(i<=10);
    	   
  	}

}
