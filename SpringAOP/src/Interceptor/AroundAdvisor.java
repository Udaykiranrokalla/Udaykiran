package Interceptor;

import org.aopalliance.intercept.MethodInterceptor;  
import org.aopalliance.intercept.MethodInvocation;  
public class AroundAdvisor implements MethodInterceptor{  
  
    @Override  
    public Object invoke(MethodInvocation mi) throws Throwable {  
        Object obj;  
        System.out.println("additional concern before actual logic");
        System.out.println(10+20);
        obj=mi.proceed();  
        System.out.println("additional concern after actual logic");  
        System.out.println(30-10);
        return obj;  
    }  
  
}  
