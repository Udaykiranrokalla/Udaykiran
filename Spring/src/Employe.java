
public class Employe {

private int emp;
private String empname;
	public Employe() {
		System.out.println("sucessssss");
	}
	public Employe(int emp,String empname) {
		this.emp=emp;
		this.empname=empname;
	}
	
	void show() {
		System.out.println(emp+"  "+empname);
	}
	
	
	
}
