package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		//Set interface does not accept duplicate values
	HashSet<String> hs=new HashSet<String>();
	hs.add("USA");
	hs.add("UK");
	hs.add("India");
	hs.add("India");
	System.out.println(hs);
	hs.remove("India");
	System.out.println(hs);
	Iterator<String> i=hs.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}
	//Iterator
	
	}
	
}
