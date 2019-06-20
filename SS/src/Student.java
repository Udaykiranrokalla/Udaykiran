import java.util.Scanner;
public class Student {
	
   
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id,marks;
	    String name;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter marks:");
	    marks=s.nextInt();
	    if(marks>35)
	    {
	    	System.out.println("Student Passed");
	    }
	    else
	    {
	    	System.out.println("stuent Failed");
	    }
	   
	    	
	       if(marks>=80)
	    	{
	    		System.out.println("A grade");
	    	}
	    	else if(marks>=75)
	    	{
	    		System.out.println("B grade");
	    	}
	    	else if(marks>=60)
	    	{
	    		System.out.println("C grade");
	    	}
	    	else
	    	{
	    		System.out.println("No grade");
	    	}
	    
	}

}
