package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class arrayListexample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 LinkedHashSet<String> hs = new LinkedHashSet<String>();
		 TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  System.out.println(al.ceiling("#"));
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}
}