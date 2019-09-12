package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.Vector;
import java.util.function.Predicate;

public class TestCollections {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		TestCollections t = new TestCollections();
		// t.collectionDisjoint();
		// t.collectionFrequency();
		// t.collectionRotate();
		// t.forEachIteratorListIterator();
		// Iterable<Integer> i = Arrays.asList(1, 2, 3, 4);
		// System.out.println("Iterable List : " + i);
		//
		// Collection<Integer> cn = t.getCollectionFromIteralbe(i);
		// System.out.println("Collection List : " + cn);
		// t.splitIterator();

		// t.doubleBrace();
		// t.arrayListRemoveIf();
		// t.convertHashMapToTreeMap();
		// t.printHashMap();
		// t.hashMapvsTable();
		// t.linkedListVsArrayList();
		// t.checkCompareToMethod();
		t.reverseOrder();
	}

	private void reverseOrder() {
		// TODO Auto-generated method stub
		List list = new ArrayList<>();

		list.add(10);
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(20);
		list.add(90);

		Iterator i = list.iterator();
		System.out.println("printing the list....");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Comparator cmp = Collections.reverseOrder();
		Collections.sort(list, cmp);
		System.out.println("printing list in descending order....");
		Iterator i2 = list.iterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

	}

	private void linkedListVsArrayList() {
		// TODO Auto-generated method stub
		ArrayList<String> arrlistobj = new ArrayList<String>();
		arrlistobj.add("0. Practice.GeeksforGeeks.org");
		arrlistobj.add("1. Quiz.GeeksforGeeks.org");
		arrlistobj.add("2. Code.GeeksforGeeks.org");

		long timeTaken = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrlistobj.add("awe;krjwe;iorj" + i);
		}
		System.out.println("Time taken for ArrayList insertion" + (System.currentTimeMillis() - timeTaken));

		timeTaken = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			arrlistobj.get(i);
		}
		System.out.println("Time taken for ArrayList traversal" + (System.currentTimeMillis() - timeTaken));

		timeTaken = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			arrlistobj.remove(i);
		}
		System.out.println("Time taken for ArrayList Deletion" + (System.currentTimeMillis() - timeTaken));

		timeTaken = System.currentTimeMillis();
		for (int i = 0; i < 98000; i++) {
			if (arrlistobj.get(i).equals("awe;krjwe;iorj97999")) {
				System.out.println("found at " + i);
			}
		}
		System.out.println("Time taken for ArrayList Search: " + (System.currentTimeMillis() - timeTaken));

		arrlistobj.remove(1); // Remove value at index 2
		// System.out.println("ArrayList object output :" + arrlistobj);

		// Checking if an element is present.

		LinkedList llobj = new LinkedList();
		llobj.add("0. Practice.GeeksforGeeks.org");
		llobj.add("1. Quiz.GeeksforGeeks.org");
		llobj.add("2. Code.GeeksforGeeks.org");
		long timeTakenByLinkedList = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			llobj.add("awe;krjwe;iorj" + i);
		}
		System.out
				.println("Time taken for LinkedList insertion" + (System.currentTimeMillis() - timeTakenByLinkedList));
		Iterator it = llobj.iterator();
		while (it.hasNext()) {
			it.next();
		}
		timeTakenByLinkedList = System.currentTimeMillis();
		System.out.println();
		// random access
		// for (int i = 0; i < 100000; i++) {
		// llobj.get(i);
		// }
		System.out.println(
				"Time taken for LinkedList Traversal: " + (System.currentTimeMillis() - timeTakenByLinkedList));

		timeTakenByLinkedList = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {
			llobj.remove(i);
		}
		System.out.println("Time taken for LinkedList Deletion" + (System.currentTimeMillis() - timeTakenByLinkedList));

		timeTakenByLinkedList = System.currentTimeMillis();
		it = llobj.iterator();
		while (it.hasNext()) {
			if (it.next().equals("awe;krjwe;iorj97999")) {
				System.out.println("found ");
			}
		}
		System.out.println("Time taken for LinkedList Search: " + (System.currentTimeMillis() - timeTaken));

		llobj.remove("1. Quiz.GeeksforGeeks.org");
		// System.out.println("LinkedList object output :" + llobj);

		// Checking if an element is present.
	}

	Integer counter = 0;

	private void hashMapvsTable() throws InterruptedException {
		// TODO Auto-generated method stub
		HashMap hashmap1 = new HashMap<>();
		hashmap1.put("1", "One");
		hashmap1.put("2", "Two");
		hashmap1.put("3", "Thre");
		hashmap1.put("4", "Four");
		hashmap1.entrySet();

		Hashtable<String, String> hashTable2 = new Hashtable<>();
		hashTable2.put("5", "Five");
		hashTable2.put("6", "Six");
		hashTable2.put("7", "Seven");
		hashTable2.put("8", "Eight");

		Map<Integer, Integer> myMap = new HashMap();
		List<Thread> listOfThreads = new ArrayList<>();

		Random rand = new Random();

		// Create 10 Threads
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(() -> {

				// Let Each thread insert 3000 Items
				for (int j = 0; j < 3000; j++) {
					myMap.put(counter++, j);
					try {
						Thread.sleep(40);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			});
			thread.start();
			listOfThreads.add(thread);
		}

		List<Thread> listOfThreads2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(() -> {

				// Let Each thread insert 3000 Items
				for (int j = 0; j < 3000; j++) {
					myMap.remove(--counter);
				}

			});
			thread.start();
			listOfThreads2.add(thread);
		}
		for (int i = 0; i < 10; i++) {
			listOfThreads.get(i).join();
			listOfThreads2.get(i).join();
		}

		System.out.println("Count should be 30000, actual is : " + myMap.size());
	}

	private void printHashMap() {
		// TODO Auto-generated method stub

		// Consider the hashmap containing
		// student name and their marks
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// Adding mappings to HashMap
		hm.put("GeeksforGeeks", 54);
		hm.put("A computer portal", 80);
		hm.put("For geeks", 82);

		// Printing the HashMap
		System.out.println("Created hashmap is" + hm);

		// Loop through the hashmap
		System.out.println("HashMap after adding bonus marks:");

		// Using for-each loop

		for (Map.Entry mapElement : hm.entrySet()) {
			String key = (String) mapElement.getKey();

			// Add some bonus marks
			// to all the students and print it
			int value = ((int) mapElement.getValue() + 10);

			System.out.println(key + " : " + value);
		}
	}

	private void convertHashMapToTreeMap() {
		Map<String, String> hashMap = new HashMap<>();

		// Add entries to the HashMap
		hashMap.put("1", "Geeks");
		hashMap.put("2", "forGeeks");
		hashMap.put("3", "A computer Portal");

		// Print the HashMap
		System.out.println("HashMap: " + hashMap);

		// construct a new TreeMap from HashMap
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.putAll(hashMap);
		// Print the TreeMap
		System.out.println("TreeMap: " + treeMap);

	}

	private void arrayListRemoveIf() {
		// TODO Auto-generated method stub
		// create an ArrayList which going to
		// contains a list of Numbers
		ArrayList<Integer> Numbers = new ArrayList<Integer>();

		// Add Number to list
		Numbers.add(23);
		Numbers.add(32);
		Numbers.add(45);
		Numbers.add(63);

		// apply removeIf() method
		// we are going toremove numbers divisible by 3
		Numbers.removeIf(i -> i % 3 == 0);

		Numbers.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer j) {
				// TODO Auto-generated method stub
				if (j % 3 == 0) {
					return true;
				}
				return false;
			}

		});

		// n->(n%3==0)
		// print list
		for (

		int i : Numbers) {
			System.out.println(i);
		}
	}

	private void doubleBrace() {
		// TODO Auto-generated method stub
		Set<String> sets = new HashSet<String>() {
			{
				add("one");
				add("two");
				add("three");
			}
		};

		// ...

		// Now pass above collection as parameter to method
		System.out.println(sets);
	}

	public void splitIterator() {

		ArrayList<String> list = new ArrayList<>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		Spliterator<String> spliterator1 = list.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();

		spliterator1.forEachRemaining(System.out::println);

		System.out.println("========");

		spliterator2.forEachRemaining(System.out::println);
	}

	// function to convert Iterable into Collection
	public <T> Collection<T> getCollectionFromIteralbe(Iterable<T> itr) {
		// Create an empty Collection to hold the result
		Collection<T> cltn = new ArrayList<T>();

		// Get the iterator at the iterable
		Iterator<T> iterator = itr.iterator();
		// Iterate through the iterable using
		// iterator to add each element into the collection
		while (iterator.hasNext()) {
			cltn.add(iterator.next());
		}

		// Return the converted collection
		return cltn;
	}

	private void forEachIteratorListIterator() {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();

		for (int i = 0; i < 12; i++)
			al.add("" + i);

		System.out.println("Before Operation" + al);

		System.out.println("Usage of ForEach, Only traversal is allowed :");

		for (String string : al) {
			System.out.print(string + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println("Usage of Iterator performed action remove element starting with 1:");
		// at beginning itr(cursor) will point to
		// index just before the first element in al
		Iterator<String> itr = al.iterator();
		// checking the next element availability
		while (itr.hasNext()) {
			// moving cursor to next element
			String i = itr.next();
			// Removing elements starting with 1
			if (i.startsWith("1"))
				itr.remove();
		}
		System.out.println("Removing elements starting with 1 from list " + al);

		List<String> al2 = new ArrayList<String>();

		for (int i = 0; i < 12; i++)
			al2.add("" + i);

		System.out.println();
		System.out.println("Before Operation " + al2);
		System.out.println("Usage of List Iterator performed action replace element starting with 1:");
		// at beginning itr(cursor) will point to
		// index just before the first element in al
		ListIterator<String> Listitr = al2.listIterator();
		// checking the next element availability
		while (Listitr.hasNext()) {
			// moving cursor to next element
			String i = Listitr.next();
			System.out.print("current" + i + " ");
			// getting even elements one by one
			// Removing odd elements
			if (i.startsWith("1")) {
				Listitr.set("111");
				Listitr.add("A");
				System.out.println("Previous" + Listitr.previous());
			}

		}
		System.out.println();
		System.out.println("Replcing 1 by 111 and adding A" + al2);

	}

	private void collectionRotate() {
		List<String> mylist = new ArrayList<String>();
		mylist.add("practice");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		System.out.println("Original List : " + mylist);

		// Here we are using rotate() method
		// to rotate the element by distance 2
		Collections.rotate(mylist, 2);

		System.out.println("Rotated List: " + mylist);
		changePractice(mylist);
		System.out.println("Rotated List: " + mylist);
	}

	private void changePractice(List<String> mylist) {
		mylist.set(0, "changed");

	}

	private void collectionSingleton() {

		String[] geekslist = { "1", "2", "4", "2", "1", "2", "3", "1", "3", "4", "3", "3" };

		// Creating a list and removing
		// elements without use of singleton()
		List geekslist1 = new ArrayList(Arrays.asList(geekslist));
		System.out.println("Original geeklist1: " + geekslist1);

		geekslist1.remove("1");
		System.out.println("geekslist1 after removal of 1 without" + " singleton " + geekslist1);
		geekslist1.remove("1");
		System.out.println("geekslist1 after removal of 1 without" + " singleton " + geekslist1);
		geekslist1.remove("2");
		System.out.println("geekslist1 after removal of 2 without" + " singleton " + geekslist1);

		/*
		 * Creating another list and removng its elements using singleton()
		 * method
		 */
		List geekslist2 = new ArrayList(Arrays.asList(geekslist));
		System.out.println("\nOriginal geeklist2: " + geekslist2);

		// Selectively delete "1" from
		// all it's occurences
		geekslist2.removeAll(Collections.singleton("1"));
		System.out.println("geekslist2 after removal of 1 with " + "singleton:" + geekslist2);

		// Selectively delete "4" from
		// all it's occurences
		geekslist2.removeAll(Collections.singleton("4"));
		System.out.println("geekslist2 after removal of 4 with " + "singleton:" + geekslist2);

		// Selectively delete "3" from
		// all it's occurences
		geekslist2.removeAll(Collections.singleton("3"));
		System.out.println("geekslist2 after removal of 3 with" + " singleton: " + geekslist2);
	}

	private void collectionFrequency() {
		List<String> mylist = new ArrayList<String>();
		mylist.add("practice");
		mylist.add("code");
		mylist.add("code");
		mylist.add("quiz");
		mylist.add("geeksforgeeks");

		// Here we are using frequency() method
		// to get frequency of element "code"
		int freq = Collections.frequency(mylist, "code");

		System.out.println(freq);

	}

	private void collectionDisjoint() {
		// TODO Auto-generated method stub
		// Let us create array list of strings
		List<String> mylist1 = new ArrayList<String>();
		mylist1.add("practice");
		mylist1.add("code");
		mylist1.add("quiz");
		mylist1.add("geeksforgeeks");

		// Let us create vector of strings
		List<String> mylist2 = new Vector<String>();
		mylist2.add("geeks");
		mylist2.add("geek");
		mylist2.add("for");
		mylist2.add("coder");

		// Let us create a vector
		List mylist3 = new Vector();

		mylist3.add(1);
		mylist3.add("practice");

		// Let us create a Set of strings
		Set<String> mylist4 = new HashSet<String>();
		mylist4.add("practice");
		mylist4.add("code");
		mylist4.add("quiz");
		mylist4.add("geeksforgeeks");

		// Here we are using disjoint() method to check
		// whether two collections are disjoint or not
		System.out.println("is mylist1 disjoint to mylist2 : " + Collections.disjoint(mylist1, mylist2));

		System.out.println("is mylist1 disjoint to mylist3 : " + Collections.disjoint(mylist1, mylist3));

		System.out.println("is mylist1 disjoint to mylist4 : " + Collections.disjoint(mylist1, mylist4));

	}

	class Movie implements Comparable<Movie> {
		private double rating;
		private String name;
		private int year;

		// Used to sort movies by year
		public int compareTo(Movie m) {
			return this.year - m.year;
		}

		// Constructor
		public Movie(String nm, double rt, int yr) {
			this.name = nm;
			this.rating = rt;
			this.year = yr;
		}

		// Getter methods for accessing private data
		public double getRating() {
			return rating;
		}

		public String getName() {
			return name;
		}

		public int getYear() {
			return year;
		}
	}

	void checkCompareToMethod() {
		// Driver class
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1966));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		// (2) Call Collections.sort
		// (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (Movie movie : list)
			System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movie movie : list)
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movie movie : list)
			System.out.println(movie.getYear() + " " + movie.getRating() + " " + movie.getName() + " ");
	}

	// Class to compare Movies by ratings
	class RatingCompare implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			if (m1.getRating() < m2.getRating())
				return -1;
			if (m1.getRating() > m2.getRating())
				return 1;
			else
				return 0;
		}
	}

	// Class to compare Movies by name
	class NameCompare implements Comparator<Movie> {
		public int compare(Movie m1, Movie m2) {
			return m1.getName().compareTo(m2.getName());
		}
	}
}
