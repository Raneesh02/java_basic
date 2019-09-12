package multiThrading;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control " + i);

		}
	}
}

class MyThreadLow extends Thread {
	public void run() {
		for (int i = 0; i < 500; i++)
			System.out.println(Thread.currentThread().getName() + "high in control " + i);
	}
}

// Driver Class
public class YieldDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();

		MyThreadLow t2 = new MyThreadLow();

		t2.start();

	}
}