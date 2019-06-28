package src.Collections;
import java.util.*;
public class J {
public static <T> Set<T> convertListToSet(List<T> list) {
	return new HashSet<>(list);
}
public static void main(String args[]) {
	List<String> list=Arrays.asList("Uday","Kiran","UdayKiran","nikhilkumar","Uday","UdayKiran","UdaykiranR");
System.out.println("list:" +list );
Set<String> set =convertListToSet(list);
System.out.println("Set:" +set);


}







}
