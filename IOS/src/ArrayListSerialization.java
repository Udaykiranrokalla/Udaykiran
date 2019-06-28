
import java.util.ArrayList;
import java.io.*;

public class ArrayListSerialization implements Serializable {

public static void main(String []args)throws Exception
{
    ArrayList<String> al=new ArrayList<String>();

    al.add("ramesh");
    al.add("sunil");
    al.add("kumar");
    
        FileOutputStream fos = new FileOutputStream("D:\\sunil.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close();
        fos.close();
            
        FileInputStream fis = new FileInputStream("D:\\sunil.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        ois.readObject();
        ois.close();
        fis.close();
        
        
         System.out.println("success");
    
}
 
}