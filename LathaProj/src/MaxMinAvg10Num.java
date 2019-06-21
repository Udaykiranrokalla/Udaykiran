import java.util.*;
public class MaxMinAvg10Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a,max=0,min=9,sum=0,avg;
     System.out.println("enter 10 numbers");
		Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++) {
        	a=sc.nextInt();
        	if(a>max)
        	{
        		max=a;
        	}
        	if(a<min) {
        		min=a;
        	}
        	sum=sum+a;
        	}
        avg=sum/10;
        System.out.println("max number="+max);
        System.out.println("min number="+min);
	   System.out.println("average number="+avg);
	}

}
