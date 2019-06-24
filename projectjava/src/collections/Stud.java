package collections;
import java.util.*;
public class Stud {
    int id;String name;
    Stud(int a,String nm)
	{
		id=a;
		name=nm;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Stud> alist=new ArrayList<Stud>();
		Stud s=new Stud(508,"villan");
		alist.add(s);
        System.out.println(s.id+" "+s.name);
	}

}
