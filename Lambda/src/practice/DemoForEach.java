package practice;

import java.util.*;

public class DemoForEach {
public static void main(String[]args)
{
List<String> l=new ArrayList<String>();
l.add("sunil");
l.add("ramesh");
l.add("kumar");
l.add("rammy");
l.add("ram");
l.forEach((names)->System.out.println(names));
}
}
