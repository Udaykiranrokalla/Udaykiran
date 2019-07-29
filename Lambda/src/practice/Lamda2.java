package practice;
interface concat
{
	public String sconcat(String a,String b);
}
public class Lamda2 {
	public static void main(String[]args)
	{
		concat c=(str1,str2) -> str1 + str2;
		System.out.println("Result: "+c.sconcat("Hello", "world"));
				}
}
