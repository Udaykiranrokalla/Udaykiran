package constructors;

public class SingleObject {
    int a,b;
    public SingleObject(int a,int b)
    {
    	
    	this.a=a;
    	this.b=b;
    	System.out.println(a);
    	System.out.println(b);
    	
    	
    	
    }
    SingleObject(int a,char b)
    {
    	this.a=a;
    	this.b=b;
    	System.out.println(a);
    	System.out.println(b);
    	//SingleObject(1,2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleObject ob1=new SingleObject(1,'c');

	}

}
