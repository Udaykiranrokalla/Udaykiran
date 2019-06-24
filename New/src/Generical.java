import java.util.ArrayList;
import java.util.Iterator;

public class Generical {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("harry");
		al.add("kusu");
		al.add("nikki");
		al.add("geetha");
        Iterator i=al.iterator();
        System.out.printf("given string eleements are",i);
        System.out.println(al);
	}

}
