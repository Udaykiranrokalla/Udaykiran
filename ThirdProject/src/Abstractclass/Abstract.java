package Abstractclass;

abstract class Abstract 
    {  
	  abstract void run();  
	}  
	class Abstract1 extends Abstract
	{  
	void run()
	{
		System.out.println("running safely");
    }  
	public static void main(String args[]) {  
	 Abstract obj = new Abstract1();  
	 obj.run();  
	}  
	}  