import java.util.ArrayList;
import java.util.HashSet;

public class A9 //SetToList
{

public static void main(String[] args)
{
HashSet<String> hs=new HashSet<String>();
hs.add("nikki");
hs.add("anil");
hs.add("uday");
hs.add("anil");
hs.add("harry");
System.out.println("set elements are :"+hs);
ArrayList<String> al=new ArrayList<String>(hs);
System.out.println("list elements are :");
for(String s:al)
System.out.println(s);	

}

}