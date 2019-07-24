package ThrowAdvice;

public class Validator {

	public void validate(int age)throws Exception{
		if(age<18){
			throw new ArithmeticException("NotValidAge");
		}
		else
		{
			System.out.println("vote confirmed");
		}
			
	}
}
