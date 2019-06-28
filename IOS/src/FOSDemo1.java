
import java.io.*;
public class FOSDemo1 {
    public static void main(String[]args)
    {
        try{
            FileOutputStream FOS=new FileOutputStream("D:/ramesh.txt");
            String s="Welcome";
            byte b[]=s.getBytes();
            FOS.write(b);
            FOS.close();
            System.out.println("success");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
