import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Uday {
@WebMethod
	  int add(int a,int b) {
	 return (a+b);	 
	}
}