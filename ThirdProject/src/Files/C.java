package Files;

import java.io.*;

class C {
public static void main(String[] args) throws Exception

{    
    
	FileInputStream fin=new FileInputStream("E:\\kiran\\kiran1.txt");    
    BufferedInputStream bin=new BufferedInputStream(fin);   
    int i=0;
    while((i=bin.read())!=-1) {
    System.out.println((char)i);
    }
    bin.close();
    fin.close();
    
	//System.out.println("success");
}
}

