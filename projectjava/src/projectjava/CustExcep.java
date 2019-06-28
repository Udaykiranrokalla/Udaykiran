package projectjava;


class InvalidException extends Exception{
	InvalidException(String s)
	{
		super(s);
	}
}
public class CustExcep{
    
	static void validate(int age) throws InvalidException
	{
		if(age<18) {
			throw new InvalidException("not valid");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			validate(19);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        System.out.println("rest of code");
	}

}
