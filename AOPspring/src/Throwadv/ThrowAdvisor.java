package Throwadv;

import org.springframework.aop.ThrowsAdvice;

public class ThrowAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception e)
	{
		System.out.println("addition concern if exception occurs");
	}

}
