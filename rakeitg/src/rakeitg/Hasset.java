package rakeitg;
import java.util.*;
public class Hasset {
	 public static void main(String[]args) 
	    { 
	        HashSet<String> animal = new HashSet<String>(); 
	  
	        
	        animal.add("Lion"); 
	        animal.add("Tiger"); 
	        animal.add("Cow"); 
	        animal.add("Dog"); 
	        animal.add("Tiger"); 
	        animal.add("Elephant");
	  
	        //Displaying the HashSet 
	        System.out.println(animal); 
	        System.out.println("List contains Dog or not:" + 
	        		animal.contains("Dog")); 
	  
	        //Removing items from HashSet using remove() 
	        animal.remove("Elephant"); 
	        System.out.println("List after removing Elephant:"+animal); 
	  
	        //Iterating over hash set items 
	        System.out.println("Iterating over list:"); 
	        Iterator<String> i = animal.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next()); 
	    } 
}
