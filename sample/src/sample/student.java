package sample;

public class student {
int id,age;
String name;//local variable//

static  String course;//static variable//
student(int i,int a,String n){
	this.id=i;
	this.age=a;
	this.name=n;
}
student(student s){
	id=s.id;
	age=s.age;
	name=s.name;
}
void display(){
	System.out.println(id+" "+age+" "+name);} 
public static void main(String args[]) {
	student obj=new student(115,22,"syamu");
	
	
	obj.display();
	

	
	
}


}
