package Input;

	import java.io.File;
	import java.io.FileInputStream;
	import java.util.Scanner;

	public class Reversestring {

		public static void main(String[] args) 
	    {
			try {
	   
	String sb;
	char rev;
	FileInputStream fs=new FileInputStream("D:\\output\\new.txt");
	int i=0;
	Scanner sc=new Scanner(fs);
	            sb=sc.nextLine();	
	          //  char[] ch=sb.toCharArray();
	            int len=sb.length();
	            for(int j=len -1;j>=0;j--){
	           	rev=sb.charAt(j);
	           	System.out.println((char)rev);
		}
			} catch(Exception e) {System.out.println(e);}


		
	}
	}


