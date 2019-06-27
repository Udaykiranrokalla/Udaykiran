package Collections;
import java.util.*;
public class Strings {
public static void main(String[] args) {

     String s1 = "uday";
       String s2 = "udaykiran";

     Set<Character> set1 = new HashSet<Character>();
         Set<Character> set2 = new HashSet<Character>();

      for(char c : s1.toCharArray()) {
           set1.add(c);
       }
       for(char c : s2.toCharArray()) {
           set2.add(c);
       }

           set1.retainAll(set2);

     for(char c : set1) {
           System.out.print(" " + c);
       }

       System.out.println("\nTotal number of common characters: " + set1.size());
   }
}

