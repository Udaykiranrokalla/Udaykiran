
import java.io.*;  
public class A{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("E:\\kiran\\uk.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="hello uday";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  