package ramesh;
import java.util.*;
public class upper {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter acharacter");
		ch=sc.next().charAt(0);
		if(ch>=65&&ch<=90)
		{
			System.out.println("the uppercase");
		}
		else if(ch>=97&&ch<=122)
		{
			System.out.println("the lowercase");
		}
		else
			if(ch>=48 && ch<=57)
		{
			System.out.println("digit");
		}
			else
			{
				System.out.println("special character");
			}
	}

}
