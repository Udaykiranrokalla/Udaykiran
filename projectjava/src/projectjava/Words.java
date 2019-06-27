package projectjava;
import java.util.*;
public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("enter a sentence1");
        Scanner sc=new Scanner(System.in);
		String[] s1= new String[10];

//		String[] s2= new String[10];
		String st1=sc.nextLine();
//		String st2=sc.nextLine();
//		char[] ch1=str1.toCharArray();
//		char[] ch2=str1.toCharArray();
//		s1=st1.split(" ");
	    int l1=s1.length;
//		int l2=s2.length;
				
		for(int i=0;i<l1;i++)
	    {
		for(int j=i+1;j<l1;j++)	
		{
			if(s1[i].equals(s1[j])) {
				System.out.println(s1[i]);
			}
		}
	}
		
}

}
