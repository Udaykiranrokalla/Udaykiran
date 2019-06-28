
import java.io.*;
public class Filereader {
    public static void main(String[]args)throws Exception{
        FileReader fr=new FileReader("D://sunil.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.println((char)i);
    }
}
