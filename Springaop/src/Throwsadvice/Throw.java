package Throwsadvice;

import org.springframework.aop.ThrowsAdvice;  
public class Throw implements ThrowsAdvice{  
    public void afterThrowing(Exception ex){  
        System.out.println("additional concern if exception occurs");  
    }  
} 