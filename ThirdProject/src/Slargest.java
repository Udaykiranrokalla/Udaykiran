public class Slargest {
public static void main(String args[]) {
int arr[] = {10,20,30,40,50,89,90,58};
int largest =arr[0];
int secondlargest=arr[0];
System.out.println("the given array is:");
for(int i=0;i<arr.length;i++) {
System.out.println(arr[i]);
if(arr[i]>largest) {
secondlargest=largest;
largest=arr[i];
}
else if(arr[i]>secondlargest) {
secondlargest=arr[i];
}
}
System.out.println("second largest number is" +secondlargest );
System.out.println(" largest number is" +largest );
}
}