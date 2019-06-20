package javaproject;

import java.util.*;

public class duplicates {
	public static void main(String args[]) {
		System.out.println("enter numbers to find repeated numbers in array");
		int [] arr= { 4,5,2,6,2,4,7,8,7};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;i++) {
				if(arr[i]==arr[j]) {
					System.out.println(" repeated numbers in array:"+arr[i]);
				}
			}
		}

}
}