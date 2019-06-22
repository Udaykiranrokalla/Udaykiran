import java.util.Scanner;
public class Fibonaaciuserinput {
public static void main(String[] args) {
        int i=1,n1=0,n2=1;
 Scanner scan=new Scanner(System.in);     
System.out.println("enter  how many numbers you want in sequence");
int count=scan.nextInt();
System.out.println("fibonacci series for given" +count+"number is " );
while(i<count) {
	System.out.println(n1+ "");
  int res=n1+n2;
   n1=n2;
   n2=res;
   i++;

}
}
}