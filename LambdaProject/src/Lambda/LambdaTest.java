package Lambda;
import java.util.ArrayList; 

interface Operation1
{
    void nop();
}

interface Operation2
{
    void sop(int i); 
}

interface Operation3
{
  void mop(int i,int j);	
}

public class LambdaTest{
	
	public static void main(String args[])
	{
				
	  Operation1 op1 = () -> System.out.println("from no arg parameter method");	
		
	  op1.nop();
		
      Operation2 op2 = (int d) -> System.out.println("from one parameter"+"  "+d);
       
      op2.sop(7);
      
      Operation3 op3 = (b,c) -> System.out.println("from two parameter"+"  "+b*c);
      
      op3.mop(7,2);
		
		
        }
	
	
	}
 

