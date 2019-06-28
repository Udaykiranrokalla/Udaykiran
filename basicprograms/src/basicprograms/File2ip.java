package basicprograms;

import java.io.*;

public class File2ip {
	public static void main(String args[])throws IOException {
		try {
			FileInputStream f=new FileInputStream("E://GEt/sai.txt");
			int i=0;
			while((i=f.read())!=-1) {
			char ch1=(char)i;
			for(int j=i;j<=i;j++) {
				if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
				 {
					 System.out.println("vowel"  +ch1);
					 System.out.println();
				 
				 }
				 else  {
					 System.out.println("consonents "+ch1);
				 }
			}
			}
			f.close();
		}
		catch(Exception e) {System.out.println("error");}
	}

}
