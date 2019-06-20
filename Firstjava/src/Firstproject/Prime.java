package Firstproject;

import java.util.Scanner;

public class Prime {
	public static void main(String arg[])
	{
	Scanner scan = new Scanner(System.in);
	int i,j,count=0;
	for(i=2;i<=10;i++)
	{
	count=0;
	for(j=1; j<=i;j++){
	if(i%j == 0){
	count = count+1;
	}
	}
	if(count == 2)
	System.out.println(i+" is a prime");
	else
	System.out.println(i+" is not a prime");
	}
	}
}


