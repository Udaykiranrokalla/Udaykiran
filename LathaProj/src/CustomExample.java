import java.util.*;
	 class Isb extends Exception{
			Isb(String s){
				super(s);
			}
	 }
	 class Inp extends Exception{
		 Inp(String p){
			 super(p);
		 }
	 }
	class InvDeposit extends Exception{
		InvDeposit(String b)
		{
		  super(b);	
		}
		}
public class CustomExample {
	public static void main(String[] args) throws Isb,Inp,InvDeposit {
		
		int i=12345,a=5000,amount=0,v=40000;
		char c=0;
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("login");
    System.out.println("enter password");
    int p=sc.nextInt();
    if(i==p) {
 	   System.out.println("valid");
    }
    else
    {
 	   throw new Inp("invalid password"+p); 
    }
    
    while(true)
    {    System.out.println("enter your choice 1.withdraw 2.deposit 3.balanceInq 4.exit");
         int n=sc.nextInt();
    
      switch(n) {
//      case 1:System.out.println("login");
//           System.out.println("enter password");
//           int p=sc.nextInt();
//           if(i==p) {
//        	   System.out.println("valid");
//           }
//           else
//           {
//        	   throw new Inp("invalid password"+p); 
//           }
//           break;
    case 1:System.out.println("withdraw");
           System.out.println("enter amount");
           int wa=sc.nextInt();
           if(a<wa) {
        	   throw new Isb("isb");
           }
           else
           {
        	amount=a-wa;
        	System.out.println("remaining amount="+amount);
           }
           break;
    case 2:System.out.println("deposit");
             int d=sc.nextInt();
             if(d<v) {
            	 amount=amount+d;
            	 System.out.println("total amount="+amount);
             }
             else {
            	 throw new InvDeposit("Invalid deposit:");
             }
             break;
    case 3:System.out.println("amount="+a);
    	   break;
    case 4:System.out.println("exit");
           break;
    default:
    	   System.out.println("invalid choice");
    }
  
    
    }
	}
}

