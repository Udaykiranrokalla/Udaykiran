package basicprograms;

public class Stringassment {
public static void main(String args[]) {
	String s1="sairam";
	String s2= "waikkk";
	char[] ch=s1.toCharArray();
	char[] ch1=s1.toCharArray();
	int len=ch.length;
	int len1=ch.length;
	for(int i=0;i<len;i++) {
		
		for(int j=0;j<len1;j++) {
			
			if(ch[i]==ch1[j]) {
				char ch2=ch[j];
				System.out.println(ch2);
			}
			
		}
	}
	
	
	
	
	
	
}
}
