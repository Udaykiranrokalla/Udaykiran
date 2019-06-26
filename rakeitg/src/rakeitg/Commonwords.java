package rakeitg;

import java.util.Arrays;

public class Commonwords {
		public static void main(String args[])
		{
		 String[] s1= {"Rakesh" ,"Mom" ,"Niritesh","Pawankalyan"};
		 String[] s2= {"Venki ","Rakesh" ,"Mom"};
		 for(String s3:s1)
		 {
		  for(String s4:s2)
		  {
		   if(s3.equals(s4)) 
		   {
		   System.out.println(s4);
		   }
	      }
         }
		}
}
