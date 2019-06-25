import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class A8 //ListToSet
{

public static void main(String[] args)
{
ArrayList<String> al=new ArrayList<String>();
al.add("anil");
al.add("nikki");
al.add("teja");
al.add("harry");
al.add("nikki");
System.out.println("list elements are :"+al);
HashSet<String> hs=new HashSet<String>(al);
System.out.println("set elements are :");
for(String s:hs)
System.out.println(s);	}

}