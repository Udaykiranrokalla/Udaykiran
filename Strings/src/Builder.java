
public class Builder
{

   public static void main (String args[])
   {
	   StringBuilder b=new StringBuilder("hai");
	   b.append("java");
	   System.out.println(b);
	   b.insert(1,"nikki");
       System.out.println(b);
	   b.replace(1,3,"jaana");
	   System.out.println(b);
	   b.delete(1,3);
	   System.out.println(b);
	   b.reverse();
	   System.out.println(b);
	   System.out.println(b.capacity());
   }
}
