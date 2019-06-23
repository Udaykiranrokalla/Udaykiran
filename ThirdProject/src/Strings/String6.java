package Strings;

public class String6{  
	 public static void main(String args[]){  
	   String s="UdayKiran";  
	   System.out.println(s.substring(6)); 
	   System.out.println(s.substring(0,6));  
	   System.out.println(s.toUpperCase());
	   System.out.println(s.toLowerCase());
	   System.out.println(s.startsWith("Ud"));
	   System.out.println(s.endsWith("na"));
	   System.out.println(s.charAt(5));
	   System.out.println(s.length());
	   String replaceString=s.replace("kiran","uday");
	   System.out.println(replaceString);
	 }  
	}  