package rakeitg;

public class seclargestno {
 public static void main(String[]args)
 {
  int arr[]= {16,66,99,19,68,88,};
  int large=arr[0];
  int seclarge=arr[0];
  System.out.println("The given array is:");
  for(int i=0;i<arr.length;i++)
  {
	  System.out.println(arr[i]+"\t");
  }
   for(int i=0;i<arr.length;i++)
   {
	  if(arr[i]>large)
	  {
		  seclarge=large;
		  large=arr[i];
	  }
	  else if(arr[i]>seclarge)
	  {
		  seclarge=arr[i];
	  }
   }
   System.out.println("\n Second Largest number is:" +seclarge);
 }
}
