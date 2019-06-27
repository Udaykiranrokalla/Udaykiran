package projectjava;

class Bal extends Exception
{  
	Bal(String s)
	{
		super(s);
	}
}
	
public class CustomExcep {

	public static void main(String[] args) throws Bal{
		// TODO Auto-generated method stub
		int amt=6000;int wd=7000;
	try {
			
        if(amt<wd)
        {
        	throw new Bal("available bal is low");
        	
        }
        
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("frienduuu....");
	
//	finally {
//		System.out.println("executed Succesfully");
//
//	}
	}

}
