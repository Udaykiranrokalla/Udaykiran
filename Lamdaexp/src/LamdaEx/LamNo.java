package LamdaEx;
interface A
{
	public String add();
}
public class LamNo
{
	public static void main(String args[])
	{
		A a = () -> { return "hello"; };
		System.out.println(a.add());
	}
}
