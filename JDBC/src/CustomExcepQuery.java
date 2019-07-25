
class Isb extends Exception{
	Isb(String s){
		super(s);
	}
}
public class CustomExcepQuery  {

	
		// TODO Auto-generated method stub
        int i=1234,wa,amount=0,v=40000;
         static int a=5000;
        static void method(int wa) throws Isb
      {
    	  
        if(a<wa) {
    	  throw new Isb("isb");
      }
      } public static void main(String args[]) {
        	try {
        		method(6000);
        	}
        	catch(Exception m) {
        		System.out.println("exception occured"+m);
        	}
        	System.out.println("rest of body");
        }
	}