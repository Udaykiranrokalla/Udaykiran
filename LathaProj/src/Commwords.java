import java.util.*;
public class Commwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter 2 string arrays");
   String st1[]=new String[10];
   String st2[]=new String[10];
   String s1=sc.nextLine();
   String s2=sc.nextLine();
   st1=s1.split(" ");
   st2=s2.split(" ");
   int l1=st1.length;
   int l2=st2.length;
   for(int i=0;i<l1;i++) {
	   for(int j=0;j<l2;j++) {
		   if(st1[i].equals(st2[j])) {
			   System.out.println(st1[i]);
		   }
	   }
   }
	}

}
