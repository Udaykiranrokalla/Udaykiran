import java.util.Scanner;

public class A10  //CommonCharacters
{
   public static void main(String args[])
   {
  Scanner sc=new Scanner(System.in);
  StringBuffer s1=new StringBuffer("Nikhil");
  StringBuffer s2=new StringBuffer("nikki");
  for(int i=0;i<s1.length();i++)
  {
  for(int j=0;j<s2.length();j++) 
  {
  if(s1.charAt(i) == s2.charAt(j))
  {
  System.out.print(s2.charAt(j));
              }
           }
  }
   }
}