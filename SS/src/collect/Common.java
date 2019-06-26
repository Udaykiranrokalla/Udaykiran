package collect;

import java.util.*;

public class Common
{
public static void main(String[] args) 
{

String[] a1 = {"Gp", "Harry", "Kusuma", "nikki", "naveen", "ganesh"};

String[] a2 = {"harish", "Gp", "naveen", "Harry", "nikki", "valli", "vijaya"};

System.out.println("Array1 : "+Arrays.toString(a1));
System.out.println("Array2 : "+Arrays.toString(a2));

HashSet<String> set = new HashSet<String>();

for (int i = 0; i <a1.length; i++)
{
for (int j = 0; j < a2.length; j++)
{
if(a1[i].equals(a2[j]))
{
set.add(a1[i]);
}
}
}
System.out.println("Common element : "+(set));   
}
}

