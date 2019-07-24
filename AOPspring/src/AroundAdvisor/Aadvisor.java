package AroundAdvisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Aadvisor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation mi)throws Throwable{
		Object obj;
		System.out.println("additional concern before actual");
		obj=mi.proceed();
		System.out.println("additional concern after actual");
		return obj;
	}

}
