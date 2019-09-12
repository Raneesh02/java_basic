package baiscjava;

public class StaticClass {
	final int i;

	public StaticClass() {
		i = 2;
	}

	// calculating sum using strictfp modifier
	public static strictfp double sum() {
		double num1 = 10e+10;

		double num2 = 6e+08;

		return (num1 + num2);

	}

	public static strictfp void main(String[] args) {
		System.out.println(sum());
	}

	static class Inner {

	}

}
