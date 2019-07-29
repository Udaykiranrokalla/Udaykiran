package multipara;

interface Fun
{
   int sub(int a, int b);
}
public class MultiParam
{

   public static void main(String args[])
   {
	   Fun f = (num1,num2) -> num1 - num2;
       System.out.println(f.sub(5,3));
    }
}