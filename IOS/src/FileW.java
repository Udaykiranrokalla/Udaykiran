
import java.io.*;
public class FileW {
    public static void main(String[]args)
    {
        try{
            FileWriter fw=new FileWriter("D://sunil.txt");
            fw.write("welcome");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("SUCCESS");
    }
    
}
