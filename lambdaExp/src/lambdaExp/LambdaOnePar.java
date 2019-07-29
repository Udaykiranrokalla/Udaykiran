package lambdaExp;
interface B{
	 int add(int b);
}
public class LambdaOnePar {
public static void main(String args[]) {
	B a = (n) ->  n+10;
   System.out.println(a.add(4));
}
}
