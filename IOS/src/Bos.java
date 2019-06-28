
import java.io.*;
public class Bos {
    public static void main(String[]args)throws Exception
    {
        FileOutputStream F=new FileOutputStream("D://ramesh.txt");
        BufferedOutputStream bops=new BufferedOutputStream(F);
        String s="Welcome the java";
        byte b[]=s.getBytes();
        bops.write(b);
        bops.flush();
        bops.close();
        System.out.println("success");
    }
    
}
