import java.util.Scanner;
public class Upperlower {
	public static void main(String[] args) {
		char ch;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a character");
	    ch = scan.next().charAt(0);
	    if(ch>='A' && ch<='Z') {
	    	System.out.println("upper case");
	    			
	    }
	    else if(ch>='a' && ch<='z') {
	    	System.out.println("lower case");
	    }
	    else if(ch>='0' && ch<='9') {
	    	System.out.println("digit");
	    }
	    else {
	    	System.out.println("special character");
	    }
	    
		}
	
	}

