
public class StringMethods
{
   public static void main (String args[])
   {
	   String s= "NikhilKumar";
	   System.out.println(s.substring(6));
	   System.out.println(s.substring(0,6));
	   System.out.println(s.toUpperCase());
	   System.out.println(s.toLowerCase());
	   System.out.println(s.startsWith("Ni"));
	   System.out.println(s.endsWith("rr"));
	   System.out.println(s.charAt(4));
	   System.out.println(s.length());
	   String replaceString=s.replace("kumar","nikhil");
	   System.out.println(replaceString);
	   
	   
   }
}
