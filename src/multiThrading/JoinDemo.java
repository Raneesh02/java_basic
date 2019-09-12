package multiThrading;

class JoinDemo1 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t.getName());

		// checks if current thread is alive
		for (int i = 0; i < 100; i++)
			System.out.println("Current Join : " + t.getName() + "Is Alive? " + t.isAlive());
	}

}

class HighPriority implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t.getName());

		// checks if current thread is alive
		for (int i = 0; i < 100; i++)
			System.out.println("Current High priority Thread : " + t.getName() + "Is Alive? " + t.isAlive());
	}

}

public class JoinDemo {
	public static void main(String args[]) throws Exception {
		Thread joinDemo = new Thread(new JoinDemo2());
		joinDemo.setPriority(5);
		joinDemo.start();
		Thread highPriority = new Thread(new HighPriority());
		highPriority.setPriority(10);
		highPriority.start();

	}

}

class JoinDemo2 implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();

		Thread joinDemo = new Thread(new JoinDemo1());
		joinDemo.setPriority(5);
		joinDemo.start();
		try {
			joinDemo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("Current thread: " + t.getName() + "Is Alive? " + t.isAlive());

		}

	}
}