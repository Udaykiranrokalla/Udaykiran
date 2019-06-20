import java.util.*;
public class CharUppLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter character");
    char ch=sc.next().charAt(0);
    if(ch>='a' && ch<='z') {
    	System.out.println(ch+"is lower case");
    }
    else if(ch>='A' && ch<='Z') {
    	System.out.println(ch+"is upper case");
    }
    else
    {
    	System.out.println(ch+"is special character");
    }
	}

}
