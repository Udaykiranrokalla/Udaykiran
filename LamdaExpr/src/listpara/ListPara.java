package listpara;
import java.util.*;
public class ListPara 
{
	 public static void main(String[] args) 
	 {       
	       List<String> l=new ArrayList<String>();  
	       l.add("harry");         
	       l.add("Nikki");       
	       l.add("roja");         
	       l.add("Geetha");         
	       l.add("kusu");                
	       l.forEach((names)->System.out.println(names)         
	       );     
	    }  

}
