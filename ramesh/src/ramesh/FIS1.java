package ramesh;

import java.io.*;
public class FIS1 {
    public static void main(String[]args)
    {
        try
        {
            FileInputStream fis=new FileInputStream("e://ramesh.txt");
            int i=0;
            while((i=fis.read())!=-1)
            {
                System.out.println((char)i);
            }
            fis.close();
            }catch(Exception e)
            {
                System.out.println(e);
            }
        
    }
}
