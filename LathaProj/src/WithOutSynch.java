import java.util.*;

 class Z{
void display() {
	synchronized(this){	
	for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
 }

class B extends Thread {
	Z a;

	B(Z a) {
		this.a = a;
	}

	 public void run() {
		a.display();
	}
}

class C extends Thread {
	Z a;

	C(Z a) {
		this.a = a;
	}

	 public void run() {
		a.display();
	}

}

public class WithOutSynch {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
         Z a=new Z();
         Z a1=new Z();
         B b=new B(a);
         C c=new C(a1);
         b.start();
         c.start();
	}
}




