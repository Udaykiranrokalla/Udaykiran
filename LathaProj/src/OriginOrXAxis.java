import java.util.*;
public class OriginOrXAxis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two numbers");
  int x=sc.nextInt();
  int y=sc.nextInt();
  if(x>0 && y==0) {
	  System.out.println("coordinates lies on x axis");
  }
  else if(x==0 && y>0) {
	  System.out.println("coordinates lies on y axis");
  }
  else
  {
	  System.out.println("coordinate lies on origin");  
  }
	}

}
