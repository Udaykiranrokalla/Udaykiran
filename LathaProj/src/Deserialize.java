import java.io.*;
public class Deserialize  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
		FileInputStream f1=new FileInputStream("E:\\latha\\serialize.txt");
        ObjectInputStream os=new ObjectInputStream(f1);
        Employee emp=(Employee)os.readObject();
        System.out.println("Object is deserialized");
        System.out.println(emp.id+" "+emp.name);
      }
      catch(Exception e){
    	  System.out.println(e);
      }
      }

}
