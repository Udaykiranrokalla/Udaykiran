package basicprograms;

public class Stringassment {
public static void main(String args[]) {
	String s1="sairam";
	String s2= "waikkk";
	//char[] ch=s1.toCharArray();
	//char[] ch1=s1.toCharArray();
	int len=s1.length()-1;
	int len1=s2.length()-1;
	
	String s3 = " ";int j=0;
	
	for(int i=0;i<len;i++) 
	{

			for( j=0;j<len1;j++)
		{
			
			if(s1.charAt(i)==s2.charAt(j))
			{
				s3=s3+s2.charAt(j);}
		}
	}
	
	
	int len2=s3.length()-1;
				for(int k=0;k<len2;k++)
				{
					for(j=0;j<len1;j++) {
						if(s3.charAt(k)!=s2.charAt(j)) {
							//System.out.println(s3.charAt(k));
						}
					}
			}
			System.out.println(s3.charAt(j));
		}
	

}

