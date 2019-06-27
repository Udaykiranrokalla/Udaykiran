package ramesh;

import java.io.*;
public class FOSDEMO {
    public static void main(String[]args)
    {
        try{
            FileOutputStream FOS=new FileOutputStream("e:/kumar.txt");
            FOS.write(85);
            FOS.close();
            System.out.println("success");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}