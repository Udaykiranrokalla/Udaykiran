package basicprograms;

public class Stringass1 {
	public static void main(String args[]) {
		StringBuffer s1=new StringBuffer("sairam");
		StringBuffer s2=new StringBuffer("qwifrmj");
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					System.out.println(s2.charAt(j));
				}
					
				}
			}
		}
		
		
}
