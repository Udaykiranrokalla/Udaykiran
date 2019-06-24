package basicprograms;
import java.util.*;
public class Stack1 {
	public static void main(String args[]) {
		Stack s=new Stack();
		s.push("sai");
		s.push("sai");
		s.push("sai");
		s.push("sai");
		s.push("sai");
		s.push("sai");
		Iterator k=s.iterator();
		
		while(k.hasNext()) {
			System.out.println(k.next());
		}
	}

}
