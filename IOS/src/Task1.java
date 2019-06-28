
import java.util.ArrayList;
import java.io.*;

public class Task1 {

public static void main(String []args)throws Exception
{
    ArrayList<String> al=new ArrayList<String>();

    al.add("ramesh");
    al.add("sunil");
    al.add("kumar");
    
    Task1 t=new Task1();
    FileOutputStream fos=new FileOutputStream("e:\\task.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(t);
    
    FileInputStream fis=new FileInputStream("e:\\task.txt");
    ObjectInputStream ois=new ObjectInputStream(fis);
    ArrayList s1=(ArrayList)ois.readObject();
    
        System.out.println(s1);
}
}
