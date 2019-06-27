package Input;

	import java.io.*;
	import java.util.*;
	public class Reverse 
		{
		    public static void main(String[] args) throws IOException,FileNotFoundException
		    {
		   
		        String s1;
		 
		        List<String> tmp = new ArrayList<String>();
		   
		        Scanner s = new Scanner(new File("D:\\output\\ne.txt"));
		        while(s.hasNext()) {
		        tmp.add(s.next()); 
		        }

		 
		        for(int i=tmp.size()-1;i>=0;i--) {
		        System.out.println(tmp.get(i));
		        }
		    }
		}


