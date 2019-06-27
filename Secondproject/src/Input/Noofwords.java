package Input;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;
	public class Noofwords {


			 public static void main(String[] args) throws FileNotFoundException {
			   Scanner s = new Scanner(System.in);
			   String name;
			    int wordCount = 0;


			System.out.println("Please type the file you want to read in: ");
			name = s.nextLine();



			  // create a Scanner object to read the actual text file
			File input = new File("D:\\output\\ne.txt");
			s.close();
			Scanner word = new Scanner(input); 
			while(word.hasNext()){

			
			    ++wordCount;
			    word.next();
			}
			 word.close(); 



			System.out.print(" "+ "Words " +  wordCount);

			 }


			}


