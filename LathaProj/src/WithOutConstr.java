import java.util.*;
public class WithOutConstr {
 int sno,sage,m1,m2,m3;
 static String branch;
 void details(int no,int age,int a,int b,int c) {
	 this.sno=no;
	 this.sage=age;
	 this.m1=a;
	 this.m2=b;
	 this.m3=c;
 }
 void averg()
 {
	 double av=0.0;
	 av=(this.m1+this.m2+this.m3)/3.0;
	 System.out.println("average of 3 numbers="+av);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WithOutConstr ob1=new WithOutConstr();
   WithOutConstr.branch="cse";
   ob1.details(1, 19, 70, 85, 80);
   ob1.averg();
   WithOutConstr ob2=new WithOutConstr();
   ob2.details(2, 18, 75, 65, 90);
   ob2.averg();
	}

}
