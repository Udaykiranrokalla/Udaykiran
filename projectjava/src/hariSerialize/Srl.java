package hariSerialize;
import java.io.*;
public class Srl extends Employee  {
       
	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.sal=1000;
		emp.s="harish";
		emp.id=4511;
		try {
		FileOutputStream fs=new FileOutputStream("D:\\Harish\\Employee.txt");
		ObjectOutputStream s=new ObjectOutputStream(fs);
		s.writeObject(emp);
		s.close();
		fs.close();
        System.out.println("Object has been serialized"); 

		

	}
		catch(Exception e) {
			System.out.println(e);
		}
		 
				try {
			
			FileInputStream fi=new FileInputStream("D:\\Harish\\Employee.txt");
			ObjectInputStream s=new ObjectInputStream(fi);
		Employee hari =(Employee)s.readObject();
		s.close();
		fi.close();
        System.out.println("Object has been De-serialized"); 
        System.out.println("salary:"+hari.sal);   
        System.out.println("name:"+hari.s); 
        System.out.println("id:"+hari.id); 

        }
	catch(Exception e)
				{
        System.out.println(e); 

				}
		       

}
}
