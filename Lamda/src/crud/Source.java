package crud;


interface A
{
	public String show();
}
interface Single
{
	public String display(String s1);
}
interface multiple
{
	public int ser(int a,int b);
}
public class Source {

	public static void main(String args[])
	{
	A s=()->{
			return "Welcome..";
		};
		System.out.println(s.show());
		Single si=(s1)->{
			return  "hello" +s1;
		};
		System.out.println(si.display("Naveen"));
    multiple m=(a,b)->{
     return a+b;
    };
    System.out.println(m.ser(5,10));
  multiple m1=(a,b)->{
        return a-b;
       };
       System.out.println(m1.ser(75,10));
  multiple ml=(a,b)->{
    	     return a*b;
    	    };
    	    System.out.println(ml.ser(3,10));
 multiple mul=(a,b)->{
    	        return a/b;
    	       };
    	       System.out.println(mul.ser(670,10));
    	       
	}	
}
