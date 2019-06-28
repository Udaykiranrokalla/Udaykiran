package basicprograms;
import java.io.*;
public class File1 {
public static void main(String args[]) throws IOException {
try {
	FileOutputStream f=new FileOutputStream("E://GEt/sai.txt");
	String s="miracle software systems in bhogapuram";
	byte b[]=s.getBytes();
	f.write(b);
	f.close();
	System.out.println("sucess");
}
catch(Exception e) {System.out.println(e);}
}
}
