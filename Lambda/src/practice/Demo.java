package practice;
interface Task
{
	void show();
}

public class Demo {
	public static void main(String[]args)
	{
	Task t;
	t = ()->{System.out.println("Hello");
	};
	t.show();
	}
}

