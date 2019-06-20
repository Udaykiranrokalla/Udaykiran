package projectjava;
import java.util.*;
public class Chkchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("enter a character");
      Scanner s=new Scanner(System.in);
      char c=s.next().charAt(0);
      if(c>='A' && c <= 'Z')
      {
    	  System.out.println("enter character is upper Alphabet");
      }
      else if(c>='a' && c <= 'z')
      {
    	  System.out.println("enter character is upper Alphabet"); 
      }
      else if(c>='0' && c <= '9')
      {
    	  System.out.println("enter character is digit"); 
      }
      else
      {
    	  System.out.println("enter character is a special case");
      }

	}

}
