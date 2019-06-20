package Firstproject;

import java.util.Scanner;

public class Rank {
	public static void main(String arg[])
	{
	Scanner r = new Scanner(System.in);
	int m1,m2,m3;
	int tot;
	float avg;
	System.out.println("enter the three subject marks of a student");
	m1 = r.nextInt();
	m2 = r.nextInt();
	m3 = r.nextInt();
	if((m1>=35)&&(m2>=35)&&(m3>=35))
	{
	System.out.printf("passed with");
	}
	avg=(m1+m2+m3)/3;
	if(avg >= 60 )
	{
	System.out.println("first rank");
	}
	else if(avg>50&&avg<60)
	{
	System.out.println("second rank");}
	else if(avg<=50)
	{
	System.out.println("third rank");
	}
	else
	{
	System.out.println("fail");
	}
	}
	}

