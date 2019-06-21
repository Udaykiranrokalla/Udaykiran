import java.util.Scanner;
public class Neven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0,i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n:");
		n=sc.nextInt();
		for(i=1; i<n; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }   

        System.out.println();
	}
		
		

	}


