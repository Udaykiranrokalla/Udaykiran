package in;

public class Nochar {
public static void main(String args[]) {
	StringBuffer s=new StringBuffer("sam");
	StringBuffer s1=new StringBuffer("hello");
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<s1.length();j++) {
	if(s.charAt(i) == s1.charAt(j)) {
		System.out.println(s1.charAt(j));
	}
	
	}
}
}
}
