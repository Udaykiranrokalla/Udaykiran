package strings;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="Gayatri";
      String s3="gayatri";
      String s5="Gayatri";
      String s1=new String("Gayatri");
      String s2=new String("Prasanna");
      String s6=new String("Gayatri");
      System.out.println("Given string is  "+s);
      System.out.println("Length of the string is "+s.length());
      System.out.println( s.equals(s1));
      System.out.println(s==s1);
      System.out.println(s1==s2);
      System.out.println(s.compareTo(s3));
      System.out.println(s.compareTo(s5));
      System.out.println("String in uppercase "+s.toUpperCase());
      System.out.println("String in lowercase "+s.toLowerCase());
      String s4=s1.concat(s2);
      System.out.println(s4);
      System.out.println(s2.substring(3));
      System.out.println(s2.substring(0,4));

	}

}
