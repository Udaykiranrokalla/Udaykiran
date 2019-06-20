package projectjava;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10,b=5,c=4;
        int res=c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println(res);
	}

}
