
    import java.util.ArrayList;  
    import java.util.Collections;  
    import java.util.List;  
    class Student{  
        int id;  
        String name;  
        String place;  
        public Student(int id, String name, String place) {  
            super();  
            this.id = id;  
            this.name = name;  
            this.place = place;  
        }  
    }  
    public class Comparestring{  
        public static void main(String[] args) {  
            ArrayList<Student> list=new ArrayList<Student>();  
              
           
            list.add(new Student(1,"uday","vizag"));  
            list.add(new Student(3,"Kiran","goa"));  
            list.add(new Student(2,"nani","dubai"));  
           
            Collections.sort(list,(p1,p2)->{ return p1.name.compareTo(p2.name);});  
            for(Student p:list){  
                System.out.println(p.id+" "+p.name+" "+p.place);  
            }  
      
        }  
    }  