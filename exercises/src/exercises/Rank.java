package exercises;
import java.util.Scanner;
public class Rank  
  {
    public static void main(String args[])
    {
  int m1,m2,m3;
  int total;
  float avg;
  Scanner scan=new Scanner(System.in);
  System.out.println("enter 3 subjects marks");
  m1=scan.nextInt();
  m2=scan.nextInt();
  m3=scan.nextInt();
  if ((m1>=35) && (m2>=35) && (m3>=35))
  {
	System.out.println ("passed with");
	avg = (m1 +m2+m3)/3;
	    if(avg>=60) 
	    {
	    	System.out.printf("first rank");
	    }
	    else if (avg > 50 && avg <60)
	    {
	    	System.out.printf(" second  rank");
	    }
	    else
	    {
	    	System.out.printf("thirdrank");
	    }
  }
  else
  {
	  System.out.printf("failed");
  }
  }
	  
  }
