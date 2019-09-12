package basicjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test {
	private int data = 15;

	public static void main(String[] args) {
		List<String> r = new ArrayList<String>();

		for (int i = 1; i < 100000; i++) {
			r.add("faweiwefjwiejfHelfaefeawfwCrazy" + i * 200);
		}

		long timeTaken = System.currentTimeMillis();
		for (String string : r) {
			System.out.println(string);
			// System.out.print(string);
		}
		long timeTakenByforEach = System.currentTimeMillis() - timeTaken;

		timeTaken = System.currentTimeMillis();
		Iterator<String> it = r.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		long timeTakenByIterator = System.currentTimeMillis() - timeTaken;

		timeTaken = System.currentTimeMillis();
		int listSize = r.size();
		for (int i = 0; i < listSize; i++) {
			System.out.println(r.get(i));
		}
		long tikeTakenByForLoop = System.currentTimeMillis() - timeTaken;

		System.out.println("" + timeTakenByforEach + " " + timeTakenByIterator + " " + tikeTakenByForLoop);

	}
}