package ramesh;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		String rev="";
		System.out.println("enter string to reverse");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
