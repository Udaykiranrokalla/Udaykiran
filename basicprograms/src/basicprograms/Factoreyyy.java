package basicprograms;

import java.util.Scanner;

interface product{
	void iteams();
}
 class Soap implements product{

	@Override
	public void iteams() {
		 System.out.println("soaps are there");
		
	}
	
	
}
class Fw implements product{
	public void iteams() {
		System.out.println("the fash wash are");
	}
}

class Withfm{
	product getObject(String s) {
		
		Scanner s1=new Scanner(System.in);
		s1=s.nextLine();
		if(s1.equals("soap")) {
			return new Soap();
		}

		else
			return new Fw();	
	}	
}


public class Factoreyyy {
	public static void main(String args[]) {
		
		
		
	}

}
