package practice;

interface Noparam
{
	public String display();
}
public class Lamda {
	public static void main(String[]args)
	{
		Noparam np = () -> {
			return "Hello Lamda";
		};
	System.out.println(np.display());
	}
}

