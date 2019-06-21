package in;

class G1 {
	void msg()
	{System.out.println("hello....");}
	}
	class a extends G1{
		void fun()
		{System.out.println("hai...");}
		
	}

	public class G{
		public static void main(String args[]) {
			a b=new a();
			b.fun();
			b.msg();
		}
	}