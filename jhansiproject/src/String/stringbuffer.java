package String;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("JHANSIRANI");
sb.append("jhanu");
System.out.println(sb);
sb.replace(1, 5, "san");
System.out.println(sb);
sb.delete(1, 5);
System.out.println(sb);
	}
}
