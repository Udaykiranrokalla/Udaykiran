package Input;

 
	import java.io.FileInputStream;
	public class Input {


			     public static void main(String args[]){    
			          try{    
			            FileInputStream fin=new FileInputStream("D:\\output\\new.text");    
			            int i=0;    
			            while((i=fin.read())!=-1){    
			             System.out.print((char)i);    
			            }    
			            fin.close();    
			          }catch(Exception e){System.out.println(e);}    
			         }    
			       
		}





