package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrNgk {
	
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String name;
	    public int id;
		
		public ArrNgk(String name, int id) {
			
			this.name = name;
			this.id = id;
		}
		
		
      public static void main(String[] args) {
    	  
    	List<ArrNgk> studentlist = new ArrayList<ArrNgk>();
    	
    	 studentlist.add(new ArrNgk("Jon", 22)); 
         studentlist.add(new ArrNgk("Steve", 19)); 
         studentlist.add(new ArrNgk("Kevin", 23)); 
    	 System.out.println("Before Sorting the student data:"); 
    	     	 
    	 for (ArrNgk ag : studentlist) {
			 
			System.out.println("id  "+ag.id+" "+"name "+ag.name);
		}
		 
    	  System.out.println("After Sorting the student data by name:"); 

    	  studentlist.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    	  
//          studentlist.sort((ArrNgk s1, ArrNgk s2)->s1.getId()-s2.getId()); 

          for (ArrNgk ag : studentlist) {
 			 
  			System.out.println("id  "+ag.id+" "+"name "+ag.name);
  		}
		 
          System.out.println("After Sorting the student data by id:"); 
          
          studentlist.sort((ArrNgk s1, ArrNgk s2)->s1.getId()-s2.getId()); 
    
          for (ArrNgk ag : studentlist) {
  			 
    			System.out.println("id  "+ag.id+" "+"name "+ag.name);
    		}
		
        
//		ArrNgk emp1 = new ArrNgk("John Doe",7);
//		ArrNgk emp2 = new ArrNgk("Joy Lobo",8);
//		ArrNgk emp3 = new ArrNgk("Dave Mathias",3);
		
//        List<ArrNgk> empList = new ArrayList<ArrNgk>();
//        empList.add(emp1);
//        empList.add(emp2);
//        empList.add(emp3);
        
//        empList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        empList.forEach(n -> System.out.println(n));
//        System.out.println("Sorted List" + empList);
            
//        empList.sort(new Comparator<ArrNgk>() {
//    		@Override
//    		public int compare(ArrNgk o1, ArrNgk o2) {
//    			return o2.getId() - o1.getId();
//    		}
//    	});	
        
      
        
        
        
        
        
    }
}