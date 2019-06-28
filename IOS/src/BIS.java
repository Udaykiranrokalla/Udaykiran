
import java.io.*;
public class BIS {
    public static void main(String[]args)
    {
        try{
            FileInputStream F=new FileInputStream("D://ramesh.txt");
            BufferedInputStream bips=new BufferedInputStream(F);
            int i;
            while((i=bips.read())!=-1)
                System.out.println((char)i);
            F.close();
        }
        catch(Exception e)
                {
                    System.out.println(e);
                                          
        }
    }
    
}
