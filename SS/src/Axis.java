import java.util.Scanner;
public class Axis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x,y;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter x and y values:");
       x=sc.nextInt();
       y=sc.nextInt();
       if(x==0 && y==0)
       {
    	   System.out.println("Axis lies on origin");
       }
       else if(x==0 && y!=0)
       {
    	   System.out.println("Axis lies on x-axis");
       }
       else if(x!=0 && y==0)
       {
    	   System.out.println("Axis lies on y-axis");
       }
       else
       {
    	   System.out.println("Invalid values");
       }
	}

}
