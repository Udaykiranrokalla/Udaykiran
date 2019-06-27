package projectjava;
import java.util.*;
public class STask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println("enter String 1");
          Scanner sc=new Scanner(System.in);
          String s1=sc.next();
          System.out.println("enter String 2");
          String s2=sc.next();
          int l1=s1.length();
          int l2=s2.length();
          int flag=0;
          for(int i=0;i<l1;i++)
          {
        	  
        	  for(int j=0;j<l2;j++)
        	  {   
        		  if(s1.charAt(i)==s2.charAt(j))
        		  {
        			flag=1;
        		    if(flag==1)
        		    {
            		    System.out.println(s1.charAt(i));

        		    }
        			 
        	      }
          }

	}

	}
}
