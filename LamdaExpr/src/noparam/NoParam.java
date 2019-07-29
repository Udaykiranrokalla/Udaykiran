package noparam;

interface Fun
{
  public String display();
}
public class NoParam
{

   public static void main(String args[])
   {
      
    	Fun f = () -> { return " No Parameters " ;};
        System.out.println(f.display());
    }
}