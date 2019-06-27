package files;

import java.io.*;  
class De{  
 public static void main(String args[]){  
    try {
   FileInputStream f= new FileInputStream("D:\\n.txt");
   ObjectInputStream in=new ObjectInputStream(f);  
     E e1=(E)in.readObject();  
     System.out.println(e1.id+" "+e1.num+" "+e1.name);  
    in.close();  
    }
    catch(Exception e)
    {
    	System.out.println(e);
    }
 }  
}  
