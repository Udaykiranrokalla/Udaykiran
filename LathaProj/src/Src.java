import java.io.*;
import java.io.Serializable;
public class Src extends Employee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Employee emp=new Employee();
    emp.id=101;
    emp.name="latha";
    emp.age=23;
    try {
    	FileOutputStream fos=new FileOutputStream("E:\\latha\\serialize.txt"); 
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(emp);
         oos.close();
         fos.close();
         
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }

     
	}

}
