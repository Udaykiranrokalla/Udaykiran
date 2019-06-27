package Input;



	import java.io.FileInputStream;

	public class VOwels {


			public static void main(String args[]) throws 

	Exception 
			{



			try {
			FileInputStream m1=new FileInputStream("D:\\output\\ne.txt");
			int i=0;


			while((i=m1.read())!=-1) {
			char ch1=(char)i;
			for(int j=i;j<=i;j++) {
			if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||

	ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
			{
			System.out.println("vowels are  " +ch1);
			}

			else {
				System.out.println("consonante" +ch1);
			}
			}
			}

			}

			catch(Exception e) {System.out.println(e);}
			}
			




}
