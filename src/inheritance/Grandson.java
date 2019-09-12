package inheritance;

public class Grandson extends Son {

	public Grandson() {

	}

	public static void main(String[] args) {

		System.out.println(new Grandson());
		Grandson g = new Grandson();
		g.state();
		g.city();
		g.direction();

	}

}
