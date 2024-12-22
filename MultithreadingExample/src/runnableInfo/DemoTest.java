package runnableInfo;

public class DemoTest {

	public static void main(String[] args) {
		A obj1 = new A();

		Thread t1 = new Thread(obj1);

		t1.start();
	}

}
