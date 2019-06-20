package projectjava;

public class CommandLine {

	public static void main(String args[]) {
	   System.out.println("enter a number to check negative or postive");
	   int n=Integer.parseInt(args[0]);
	   System.out.println(n);
	  if(n<0)
	   {
		System.out.println("negative");
		
	   }
	   else
		   System.out.println("positive");
	   }
	  

}

