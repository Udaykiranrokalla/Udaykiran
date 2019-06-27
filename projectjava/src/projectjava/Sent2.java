package projectjava;

import java.util.Scanner;

public class Sent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		String[] s1= new String[10];
    	String[] s2= new String[10];


		 System.out.println("enter a sentence1");
			String st1=sc.nextLine();

		 System.out.println("enter a sentence2");


			String st2=sc.nextLine();
//			char[] ch1=str1.toCharArray();
//			char[] ch2=str1.toCharArray();
			s1=st1.split(" ");
			s2=st2.split(" ");
		    int l1=s1.length;
		    int l2=s2.length;
//			int l2=s2.length;
					
			for(int i=0;i<l1;i++)
		    {
			for(int j=i+1;j<l2;j++)	
			{
				if(s1[i].equals(s2[j])) {
					System.out.println(s1[i]);
				}
			}
		}

	}

}
