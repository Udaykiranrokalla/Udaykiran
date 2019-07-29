
import java.util.ArrayList;  
import java.util.Collections;
import java.util.Comparator;
import java.util.List;  
    class Student1{  
        int id;  
        String name;  
        String place;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPlace() {
			return place;
		}
		public void setPlace(String place) {
			this.place = place;
		}
     public Student1(int id, String name, String place) {
	 super();
	 this.id = id;
	 this.name = name;
	 this.place = place;
}  
        
    }
    public class Compareint {
    	public static void main(String args[]) {
    		ArrayList<Student1> al=new ArrayList<Student1>();
    		
    		al.add(new Student1(2,"dhoni","ranchi"));
    		al.add(new Student1(1,"sachin","mumbai"));
    		al.add(new Student1(3,"rayadu","andhra pradesh"));
    		
    		Collections.sort(al,(p1,p2)->{ 
    			return (p1.getId() < p2.getId())?-1 : (p1.getId() < p2.getId())?1:0;
    					});  
            for(Student1 p:al){  
                System.out.println(p.id+" "+p.name+" "+p.place);  
            }  
    		
    	}
    
    }
    
    
    