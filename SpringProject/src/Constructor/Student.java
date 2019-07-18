package Constructor;

public class Student {
   	  private int id;  
	  private String name;
	  
	  public Student() {System.out.println("def cons");
	  }  
      
	    public Student(int id)
	    {
	    	this.id = id;
	    }  
	  public Student(int i,String nm)
	  {
		this.id=i;
		this.name=nm;
	  }
	  
	  public void show() {
	   {
		   System.out.println(id+" "+name);}  
	   
	   }
}
