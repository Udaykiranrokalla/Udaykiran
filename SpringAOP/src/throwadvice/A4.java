package throwadvice;

public class A4 
{
     public void m(int a)
     {
        if(a<18)
        {
        	throw new ArithmeticException("less than 18");
        }
        else 
           System.out.println("can vote"); 
    }
}
