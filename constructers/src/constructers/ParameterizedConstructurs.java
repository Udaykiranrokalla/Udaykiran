package constructers;

public class ParameterizedConstructurs
{
	int id ;
	String name;
	ParameterizedConstructurs (int i, String n)
	{
		id=i;
		name=n;
	}
       void display()
       {
    	   System.out.println(id + " " +name);
       }
       public static void main(String args[])
       {
    	   ParameterizedConstructurs n1=new ParameterizedConstructurs (9,"nikki");
    	   ParameterizedConstructurs n2=new ParameterizedConstructurs (3,"harry");
    	   n1.display();
    	   n2.display();
       }
}
