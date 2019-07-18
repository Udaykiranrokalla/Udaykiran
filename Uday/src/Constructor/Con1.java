package Constructor;

public class Con1 {

	private int id;
	private String name;
	
	public Con1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
