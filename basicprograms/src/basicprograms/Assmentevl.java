package basicprograms;

public class Assmentevl {
public static void main(String args[]) {
	String s1="my name is 1234";int count1=0;
	String[] s=s1.split(" ");
	for(int k=0;k<s1.length()-1;k++){
		
		
	}
	System.out.println("no of words"+count1);
	int count=0;
	char[] ch= s1.toCharArray();
	int len=ch.length-1;
	for(int i=0;i<=len;i++) {
		if(ch[i]>='0' && ch[i]<='9') {
			count++;
		}
		
	}System.out.println("no of digits"+count++);
	
		
	
}
}
