package src.Constuctor;

public class Constructor {

 int sno,sage,m1,m2,m3;
 static String branch;
 void details(int no,int age,int a,int b,int c) {
	 this.sno=no;
	 this.sage=age;
	 this.m1=a;
	 this.m2=b;
	 this.m3=c;
 }
 void average()
 {
	 double avg=0.0;
	 avg=(this.m1+this.m2+this.m3)/3.0;
	 System.out.println("average of 3 numbers="+avg);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor  ob1=new Constructor();
   Constructor.branch="cse";
   ob1.details(85, 21, 75, 69, 70);
   ob1.average();
   Constructor ob2=new Constructor();
   ob2.details(88, 22, 85, 74, 70);
   ob2.average();
	}

}
