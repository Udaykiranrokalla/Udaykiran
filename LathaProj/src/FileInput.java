import java.io.*;
public class FileInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
		FileInputStream fis=new FileInputStream("E:\\latha\\myfile.txt");
		//BufferedInputStream bis=new BufferedInputStream(fis);
		int i=0;
		while((i=fis.read())!=-1) {
	    	System.out.print((char)i);
	    }
		fis.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }

}
}