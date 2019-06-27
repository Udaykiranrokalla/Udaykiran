package iostream;

import java.io.*;
public class serial implements Serializable {
   transient int i=10;
   int j=20;
    public static void main(String[]args)throws Exception
    {
        serial s=new serial();
        FileOutputStream fos=new FileOutputStream("e:\\ramesh.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        
        FileInputStream fis=new FileInputStream("e:\\ramesh.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        serial s1=(serial)ois.readObject();
        
        
        System.out.println(s1.i+" "+s1.j);
    }
}
