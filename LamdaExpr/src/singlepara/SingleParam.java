package singlepara;

interface Fun
{
  public int sum(int a);
}
public class SingleParam
{
   public static void main(String args[]) 
   {
    	Fun f = (num) -> num+5;
        System.out.println(f.sum(22));
    }
}