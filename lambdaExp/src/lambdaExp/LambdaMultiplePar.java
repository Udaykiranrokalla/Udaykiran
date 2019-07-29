package lambdaExp;
interface mul{
	public int lmp(int a,int b,int c);
}
public class LambdaMultiplePar {

	public static void main(String[] args) {
		mul l=(a,b,c) -> {return a+b-c+5;};
  System.out.println(l.lmp(5, 6, 3));
	}

}
