import java.util.*;
public class CopyConstructor {
  int id;
  String name;
	CopyConstructor(int no,String sname){
	 id=no;
	 name=sname;
 }
	CopyConstructor(CopyConstructor s){
		 id=s.id;
		 name=s.name;
	 }
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
	CopyConstructor s1=new CopyConstructor(1,"latha");
	CopyConstructor s2=new CopyConstructor(s1);
	s1.display();
	s2.display();
	}

}
