package methodinterceptor;

import java.awt.List;

public class ProxyFactoryBean3 
{
	private Object target;
	public Object getTarget() 
	{
		return target;
	}
	public void setTarget(Object target)
	{
		this.target = target;
	}
	public List getInterceptorNames() 
	{
		return interceptorNames;
	}
	public void setInterceptorNames(List interceptorNames)
	{
		this.interceptorNames = interceptorNames;
	}
	private List interceptorNames;
}
