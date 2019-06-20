package exercises;

import java.util.Scanner;

public class Character 
{
	public static void main (String args[]) throws Exception
	
	{
		char ch;
		System.out.printf("enter a character:");
		Scanner scan = new Scanner(System.in);
		ch=scan.next().charAt(0);
		if (ch>= 'A' && ch<='Z')
			System.out.printf("%c is upper case \n" , +ch);
			else if(ch>='a' && ch <='z')
					System.out.printf("%c is lower case \n", +ch);
				else if(ch>='0' && ch<='9')
                     System.out.printf("%c is digit \n", +ch);
					else
						System.out.printf("%c is special character \n", +ch);
	}


}