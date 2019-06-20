package Firstproject;

import java.util.Scanner;

public class Upperlower {
     public static void main(String args[]) {
    	 char ch;
    	 System.out.println("Enter a character");
    	 Scanner sc=new Scanner(System.in);
    	 ch=sc.next().charAt(0);
    	 if(ch>=65&&ch<=90)
    	 {
    		 System.out.println("the upper case letter");
    		 
    	 }
    	 else if(ch>=97&&ch<=122) {
    		 System.out.println("lower case letter");
    	 }
    	 else
    	 if(ch >=48 && ch <=57){
    	 System.out.println("digit");
    	 }
    	 else{
    	 System.out.println("special character");
    	 }
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
     }

