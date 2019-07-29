import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
	 int id;
	 String name;

	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
}
public class StudentCollection{
	public static void main(String args[]){
		List<Student>l=new ArrayList<Student>();
		l.add(new Student(1,"sai"));
		l.add(new Student(2,"ram"));
		l.add(new Student(3,"sadanala"));
		l.add(new Student(3,"2"));
		Collections.sort(l,(c,d)->{
			return c.name.compareTo(d.name);
		});
		for(Student s:l) {
			
			System.out.println(s.id+" "+s.name);
		}		
	}
}
