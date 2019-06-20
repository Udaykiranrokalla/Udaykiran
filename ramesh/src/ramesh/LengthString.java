package ramesh;
import java.util.*;
public class LengthString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int i=0;
		try {
			while(true)
			{
				s.charAt(i);
				i++;
				
			}
		}catch(Exception e)
		{
			System.out.println(i);
		}
	}

}
