package multiThrading;

//Java program to illustrate Deadlock 
//in multithreading. 
class Util {
	// Util class to sleep a thread
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// This class is shared by both threads
class DeadlockShared {
	// first synchronized method
	synchronized void test1(DeadlockShared s2) {
		System.out.println("test1-begin");
		Util.sleep(1000);

		// taking object lock of s2 enters
		// into test2 method
		s2.test2(this);
		System.out.println("test1-end");
	}

	// second synchronized method
	synchronized void test2(DeadlockShared s1) {
		System.out.println("test2-begin");
		Util.sleep(1000);

		// taking object lock of s1 enters
		// into test1 method
		s1.test1(this);
		System.out.println("test2-end");
	}
}

class ThreadDeadlock1 extends Thread {
	private DeadlockShared s1;
	private DeadlockShared s2;

	// constructor to initialize fields
	public ThreadDeadlock1(DeadlockShared s1, DeadlockShared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	// run method to start a thread
	@Override
	public void run() {
		// taking object lock of s1 enters
		// into test1 method
		s1.test1(s2);
	}
}

class ThreadDeadLock2 extends Thread {
	private DeadlockShared s1;
	private DeadlockShared s2;

	// constructor to initialize fields
	public ThreadDeadLock2(DeadlockShared s1, DeadlockShared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	// run method to start a thread
	@Override
	public void run() {
		// taking object lock of s2
		// enters into test2 method
		s2.test2(s1);
	}
}

public class DeadlockExample {
	public static void main(String[] args) {
		// creating one object
		DeadlockShared s1 = new DeadlockShared();

		// creating second object
		DeadlockShared s2 = new DeadlockShared();

		// creating first thread and starting it
		ThreadDeadlock1 t1 = new ThreadDeadlock1(s1, s2);
		t1.start();

		// creating second thread and starting it
		ThreadDeadLock2 t2 = new ThreadDeadLock2(s1, s2);
		t2.start();

		// sleeping main thread
		Util.sleep(2000);
	}
}
