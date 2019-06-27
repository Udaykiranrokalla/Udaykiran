package ramesh;

import java.io.*;
public class FIS {
public static void main(String[]args)
{
    try{
        FileInputStream FI=new FileInputStream("e:\\ramesh.txt");
        int i=FI.read();
        System.out.println((char)i);
        FI.close();
    }catch(Exception e)
    {
        System.out.println(e);
    }
}
}
