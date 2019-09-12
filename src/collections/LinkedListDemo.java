package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> l1=new LinkedList<String>();
	l1.add("F");
	l1.add("c");
	l1.add("a");
	Iterator<String> itr=l1.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
	
	}

}
