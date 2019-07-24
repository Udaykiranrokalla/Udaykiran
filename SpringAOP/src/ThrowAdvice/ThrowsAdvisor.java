package ThrowAdvice;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {
	public void afterThrowing(Exception e)
	{
		System.out.println("addition concern if exception occurs");
	}

}
