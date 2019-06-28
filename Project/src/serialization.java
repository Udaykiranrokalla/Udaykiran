import java.io.*; 
  
class serialization  implements java.io.Serializable 
{ 
    public int a; 
    public String b; 
    public serialization(int a, String b) 
    { 
        this.a = a; 
        this.b = b; 
    } 
  
} 

class Test 
{ 
    public static void main(String[] args) 
    {    
    	serialization object = new serialization(1, "koti"); 
        String filename = "koti1.ser";
        try
        {    
            
            FileOutputStream file = new FileOutputStream("E:\\koti1"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object serialized"); 
  
        }
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        }