package basicjava;

public class PracticeExample {
	int data = 50;

	public static void main(String[] args) {
		PracticeExample p1 = new PracticeExample();
		p1.Display(p1);
		PracticeExample p2 = new PracticeExample();
		System.out.println("Before Swap p1 " + p1.m + " p2 " + p2.m);
		p1.swap(p1, p2);
		System.out.println("After Swap p1 " + p1.m + " p2 " + p2.m);
	}

	void swap(PracticeExample a, PracticeExample b) {
		PracticeExample temp = a;
		a = b;
		b = temp;
		System.out.println("inside method swapping ");
		System.out.println("P1 " + a.m + " P2 " + b.m);
	}

	void Display(PracticeExample p) {
		p.m++;

	}
}
