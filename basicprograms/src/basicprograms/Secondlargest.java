package basicprograms;

public class Secondlargest {
public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7,8};
	int max=arr[0],min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			min=max;
			max=arr[i];
		
			
		}
		else if(arr[i]>min) {
			min=arr[i];
		}
	}
	System.out.println("second largest"+min);
	
}
}
