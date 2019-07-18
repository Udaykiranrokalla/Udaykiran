package serviceprovider;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Addition {
@WebMethod
public int sum(int a,int b)
		{
			return(a+b);
		}
	}


