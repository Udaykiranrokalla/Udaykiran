package Strings;
public class Stringbufferexamples {
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello ");  
sb.append("Java");  
System.out.println(sb);  
sb.insert(1,"uday");
System.out.println(sb);  
sb.replace(1,3,"kiran"); 
System.out.println(sb);  
sb.delete(1,3);
System.out.println(sb);  
sb.reverse(); 
System.out.println(sb); 
System.out.println(sb.capacity());
}  
}  