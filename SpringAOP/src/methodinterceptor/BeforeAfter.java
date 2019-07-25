package methodinterceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BeforeAfter implements MethodInterceptor
{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable 
	{
            Object o;		
		    System.out.println(" before actual ");  
	        o=invocation.proceed();  
	        System.out.println(" after actual ");  
	        return o;  
	}
	
    
}
