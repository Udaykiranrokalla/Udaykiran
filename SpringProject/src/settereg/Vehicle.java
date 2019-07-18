package settereg;

public class Vehicle 
{
   private int no;
   private String name;
   public int getNo()
   {
	return no;
   }
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void display()
{
	System.out.println(no+""+name);
}
   
}
