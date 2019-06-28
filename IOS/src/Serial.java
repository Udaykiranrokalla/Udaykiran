
import java.io.*;
public class Serial implements Serializable {
   transient int i=10;
   int j=20;
    public static void main(String[]args)throws Exception
    {
        Serial s=new Serial();
        FileOutputStream fos=new FileOutputStream("D:\\ramesh.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        
        FileInputStream fis=new FileInputStream("D:\\ramesh.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Serial s1=(Serial)ois.readObject();
        
        
        System.out.println(s1.i+" "+s1.j);
    }
}
