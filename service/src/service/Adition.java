package service;



import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Adition {
@WebMethod
int add(int a,int b)
{
	return(a+b);
}
}

