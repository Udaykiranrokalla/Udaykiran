package sample;


	import java.util.Scanner;

	public class leap {
		public static void main(String args[])
		{
			
	int year=2020;  
	
    if(((year % 5 ==0) && (year % 200!=0)) || (year % 400==0)){  
    	
        System.out.println("LEAP YEAR");  
    }  
    else{  
        System.out.println("COMMON YEAR");  
    }  
}    
}    

