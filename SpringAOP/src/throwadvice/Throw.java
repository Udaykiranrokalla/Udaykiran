package throwadvice;

import org.springframework.aop.ThrowsAdvice;

public class Throw implements ThrowsAdvice
{
	 public void afterThrowing(Exception e)
	 {  
	        System.out.println("exception");  
	    }  

}
