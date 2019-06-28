package projectjava;

public class OddEv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}
			else
			{
				odd=odd+i;
			}
		}
		System.out.println("even:"+even);
		System.out.println("odd:"+odd);


	}

}
