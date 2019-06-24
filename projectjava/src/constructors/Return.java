package constructors;

public class Return {
	
	int a ,b;
    Return(int c,int d)
    {
     int a = c;
     int b = d;
    }
    Return(Return r)
    {
     int a=r.a;
     int b=r.b;
//     System.out.println(a+" "+b);
    }
    void display(){System.out.println(a+" "+b);}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return on = new Return(1,2);
		Return on2 = new Return(on);
        on.display();
        on2.display();

	}

}
