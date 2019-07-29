interface Fun
{
	void abstractFun(int x);
}
public class Demo 
{
    public static void main(String args[])
    {
    	 Fun f = (int x)-> System.out.println(2*x);
    	 f.abstractFun(8);
    }
    
}
