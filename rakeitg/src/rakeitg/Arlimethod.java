package rakeitg;
import java.util.*;
public class Arlimethod {
public static void main(String[]args)
 {
	ArrayList<String> name = new ArrayList<String>(); 
	  
    //adding values 
    name.add("Rakesh"); 
    name.add("Mom"); 
    name.add("Ted"); 
    name.add("deepu"); 
    name.add("saradh");
    name.add("Villain");
  

    // Creating another array list 
    ArrayList<String> allnames = new ArrayList<String>(); 

    // Adding values in to another list 
    allnames.add("deepu"); 
    allnames.add("Rakesh"); 
    allnames.add("Mom"); 
    allnames.add("Ted"); 
    allnames.add("seshagiri rao");


    // Before Applying method print both lists 
    System.out.println("name Contains :" + name); 
    name.remove("Villain");
    System.out.println("After remove :"+name);
    System.out.println("allnames Contains :" + allnames); 

    // Applying retainAll() method to allnames passing name as parameter 
    name.retainAll(allnames); 

    System.out.println("\nAfter Applying retainAll()"+ 
    " method to \n"); 
    System.out.println("name Contains :" + name); 
    System.out.println("allnames Contains :" + allnames); 
    
    allnames.removeAll(name); 
    System.out.println("\nAfter Applying removeAll()" +" method to \n");
    
    	    System.out.println("name Contains :" + name); 
    	    System.out.println("allnames Contains :" + allnames); 
    	     allnames.clear(); 
    	    System.out.println("allnames Contains :" + allnames); 
} 
} 
 

