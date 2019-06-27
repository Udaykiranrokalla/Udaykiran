package javaproject;

public class palindrome {

    public static void main(String[] args) {

        int num = 655, r = 0, remainder, n;

        n= num;
        while( num != 0 )
        {
            remainder = num % 10;
            r = r * 10 + remainder;
            num  /= 10;
        }

      
        if (n == r)
            System.out.println(n + " is a palindrome.");
        else
            System.out.println(n + " is not a palindrome.");
    }
}

