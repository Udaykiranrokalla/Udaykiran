import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,square=0;
		Scanner sc=new Scanner(System.in);
        for(num=1;num<=20;num++)
		{
			square=num*num;
			  System.out.println(num +"\t"+square);
		}
        
	}

}
