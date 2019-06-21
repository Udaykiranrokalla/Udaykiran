package in;

 class multileve {
   
    void fun(){System.out.println("loop...");}  
    }  
    class bat extends multileve{  
    void but(){System.out.println("gapp...");}  
    }  
    class BabyDog extends bat{  
    void foot(){System.out.println("beer...");}  
    }  
    class multilevel{  
    public static void main(String args[]){  
    BabyDog d=new BabyDog();  
    d.foot();  
    d.but();  
    d.fun();  
    }}  

