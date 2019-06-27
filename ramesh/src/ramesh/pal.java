package ramesh;

public class pal {

	public static void main(String[] args) {
String s="";
String pali="nanna";
int len=pali.length();
for(int i=len-1;i>=0;i--)
{
	s=s+pali.charAt(i);
}
if(s.equals(pali))
{
	System.out.println("palindorme");
}
else
{
	System.out.println("not apalindrome");
}
	}

}
