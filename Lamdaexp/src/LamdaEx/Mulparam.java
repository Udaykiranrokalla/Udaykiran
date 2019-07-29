package LamdaEx;
interface C
{
	public String add(String a,String b);
}
public class Mulparam
{
	public static void main(String args[])
{
	C c=(str1,str2) -> str1 + str2;
  System.out.println("result:"+c.add("hello","world"));
}
}