package practice;
interface Param
{
	public int increament(int a);
}
public class Lamda1 {
public static void main(String[]args)
{
	Param p=(num)->num+5;
	System.out.println(p.increament(23));
}
}
