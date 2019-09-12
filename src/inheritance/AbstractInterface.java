package inheritance;

public class AbstractInterface extends b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b b1 = new AbstractInterface();
		b1.getDisplay();
		b1.putDisplay();
		i.putDisplay2();
		b1.hiDisplay();
	}

}

interface i {
	void getDisplay();

	default void putDisplay() {
		System.out.println("fuck yeah");
	}

	static void putDisplay2() {
		System.out.println("fuck yeah2");
		display();
	}

	static void display() {

	}

}

abstract class b implements i {
	public void getDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Displaye");

	}

	static void hiDisplay() {
		System.out.println("Hi");
	}
}
