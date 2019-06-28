
import java.io.*;
public class FOSDEMO {
    public static void main(String[]args)
    {
        try{
            FileOutputStream FOS=new FileOutputStream("D:/sunil.txt");
            FOS.write(10);
            FOS.close();
            System.out.println("success");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
