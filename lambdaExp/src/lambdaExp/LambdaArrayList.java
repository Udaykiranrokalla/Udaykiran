package lambdaExp;

import java.util.ArrayList;
import java.util.List;

public class LambdaArrayList {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("jessi");
		al.add("latha");
		al.add("Nikija");
		al.forEach((data)->System.out.println(data));
   }
}
