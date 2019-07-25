import java.util.*;
public class UniqueCommChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 strings");
		String s1=sc.next();
		String s2=sc.next();
		char[] s3 = null;
		char[] s4=null;
		int l1=s1.length();
		int l2=s2.length();
		
		int flag=0,i=0;
		int l3=s3.length;

		for( i=0;i<l1;i++)
		{
			
			for(int j=i+1;j<l1;j++) {
				if(s1.charAt(i)!=s1.charAt(j)) 
				{
					s3[i]=s1.charAt(i);
				}
			}
			
			for( i=0;i<l3;i++)
			{
				for(int j=0;j<l2;j++) {
					if(s3[i]==s2.charAt(j)) 
					{System.out.println(s3[i]);
					}
				}
					
	}
		


}
}
	}