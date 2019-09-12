package baiscjava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Parent {

	public static void main(String[] args) throws Exception {

		Map map = new HashMap<>();

		map.put(3, 0);
		map.put(1, 1);
		map.put(2, 2);

		for (int i = 0; i < map.size(); i++) {
			// System.out.println(map.size());
			map.put(4, 4);
			map.put(0, 9);
			// System.out.println(map.size());
		}

		Iterator itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			map.put(5, 6);
			// System.out.println(itr.next());
		}
	}
}
