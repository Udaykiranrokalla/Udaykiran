import java.io.*;
public class SerializationDemo {
	private String name;private String address;private int SSN;private int number;

	public static void main(String [] args) {
		String name,address;int SSN;int number;
		SerializationDemo  e = new SerializationDemo();
	      e.name = "koti";
	      e.address = "miracle city";
	      e.SSN = 11122333;
	      e.number = 101;
	      
	      try {
	         FileOutputStream fileOut =new FileOutputStream("E\\:\\koti1");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in E:\\koti1");	
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }

}

