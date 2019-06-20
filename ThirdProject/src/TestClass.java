interface Ktm200{
    int speed=100;
	void distance();
	}
interface Pulsar200 {
	int distance=70;
	void speed();
	
}
public class TestClass implements Ktm200,Pulsar200 {
	public void distance() {
		int distance=speed*100;
		System.out.println("Distance travelled is" +distance);
	}
	public void speed() {
		int speed=distance/100;
	}
		

	public static void main(String[] args) {
		TestClass obj =new TestClass();
		obj.distance();
		obj.speed();
		
	}

}
