package exercises;
import java.util.Scanner;
public class Month
{
	
public static void main(String[]args)
   {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the month number");
	int month=scan.nextInt();
	int year;
   int numDays =0;
   switch (month)
   {
	   case 1:
	   case 3:
	   case 5:
	   case 7:
	   case 8:
	   case 10:
	   case 12:
		   numDays =31;
		   break;
	   case 4:
	   case 6:
	   case 9:
	   case 11:
		   numDays=30;
		   break;
	   case 2:
		   Date dat=new Date();
		   year=dat.getYear();
				   
   }
   }
}
