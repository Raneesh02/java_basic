package multiThrading;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " in control " + i);

		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(Thread.currentThread().getName() + "high in control " + i);
	}
}

// Driver Class
public class SleepDemo {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();

		Thread2 t2 = new Thread2();

		t2.start();

	}
}