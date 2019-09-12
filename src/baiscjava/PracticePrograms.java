package baiscjava;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map.Entry;

public class PracticePrograms {
	int i;

	PracticePrograms(String n) {
		// System.out.println("paramterized contructor");
	}

	void m1(int m) {

	}

	int m1(float m) {
		return 0;
	}

	public static final void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		PracticePrograms p = new PracticePrograms("f");
		// p.printFibonacciSeries(10);
		// String s="blolb";
		// p.checkPalindromeString(s);
		// p.findLengthOfString(s);
		// int i=12341;
		// p.checkPalindromeInteger(i);
		// List<Integer> comparedList = new ArrayList<Integer>();
		// comparedList.add(0, 0);
		// comparedList.add(1, 0);

		// int[][] arr = new int[2][3];

		System.out.println('d');
		// Character c=new Character('u000d');

		// System.out.println(arr[0].length);
		// p.factorialSimple(4);
		// System.out.println(p.factorialRecursion(4));
		// int[] r={1,22,33,4,2,120};
		// System.out.println(findDuplicatesFromArray(r));
		//
		// System.out.println(secondLargestFromArray(r));

		// System.out.println("String anagram:
		// "+p.checkStringAnagram("arAmy","Marya"));

		// String s = "ABC DEF GHI";
		// System.out.println(p.removeWhiteSpace(s));

		// System.out.println(p.checkStringRotation("deabfec", "abfecde"));
		// String dates[] = { "01 03 2007", "11 04 1996", "22 06 2007", "22 12
		// 1999", "11 03 2018" };
		// System.out.println(p.sortDates(dates));
		// p.arrayCopyOf();
		// p.passByValueOrPassByReference();
		// System.out.println(p.i);
		// try {
		// Class c = Class.forName("baiscjava.Simple");
		// Simple s = (Simple) c.newInstance();
		// s.message();
		// } catch (Exception e) {
		// System.out.println(e);
		// }

		// p.tryLocale();

		// p.longestPalindrome();
		// p.arrayPairsSum();
		// p.allCombination();
		// p.continuousSubArra();
		// p.separateZeros();
		// p.arrayLeaders();
		// p.longestNonRepeatingSubString("javaconceptoftheday");
		// p.havingDuplicates("stringoftheday");

	}

	private void longestNonRepeatingSubString(String string) {
		for (int i = string.length() - 1; i >= 2; i--)
			for (int j = 0; j <= string.length() - i; j++) {
				if (havingDuplicates(string.substring(j, j + i)) == false) {
					System.out.println("Found longest non repeating sub string: " + string.substring(j, j + i));
					return;
				}
			}
	}

	private boolean havingDuplicates(String s) {
		boolean isHavingDuplicate = false;
		HashMap<String, Integer> r = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.lastIndexOf(s.charAt(i)) != i) {
				return true;
			}
		}
		return isHavingDuplicate;
	}

	private void arrayLeaders() {
		int[] a = { 14, 9, 11, 7, 8, 5, 3 };
		int arrayLength = a.length;
		for (int j = a.length - 1; j >= 0; j--) {
			for (int i = j + 1; i < arrayLength; i++) {
				if (a[j] < a[i]) {
					for (int k = j; k < arrayLength - 1; k++) {
						a[k] = a[k + 1];
					}
					arrayLength--;
				}
			}
		}

		System.out.println("Array after removal");
		for (int i : a) {
			System.out.print(i + ",");
		}
	}

	private void separateZeros() {
		int[] a = { 14, 0, 5, 2, 0, 3, 0 };
		System.out.println("before zero separtion");
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
		int temp;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = a.length - 1; j > i; j--) {
					if (a[j] != 0) {
						temp = a[j];
						a[j] = a[i];
						a[i] = temp;
					}
				}
			}
		}

		System.out.println("After zero separtion");
		for (int i : a) {
			System.out.print(i);
		}
	}

	private void continuousSubArra() {
		int[] a = { 12, 5, 31, 9, 21, 8 };

		// for (int i = 0; i < a.length - 1; i++) {
		// for (int j = i + 1; j < a.length; j++) {
		// System.out.print(a[i] + " " + a[j] + ",");
		// }
		// System.out.println();
		// }
		// for (int m = 0; m < a.length; m++)
		// for (int k = 0; k < a.length; k++) {
		// for (int j = k + 1 + m; j < a.length; j++) {
		// for (int i = m; i <= k + m; i++) {
		// System.out.print(a[i] + " ");
		// }
		// System.out.print(a[j] + ",");
		// }
		// System.out.println();
		// }

		// Pick starting point
		for (int i = 0; i < a.length; i++) {
			// Pick ending point
			for (int j = i + 1; j < a.length; j++) {
				for (int k = i; k <= j; k++)
					System.out.print(a[k] + " ");
				System.out.println();
			}

		}

	}

	private void allCombination() {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// for (int i = 0; i < a.length; i++) {
		// for (int j = i + 1; j < a.length; j++) {
		// System.out.print(a[i] + " " + a[j] + " ,");
		// }
		// System.out.println();
		// }
		// for (int k = 1; k < a.length; k++) {
		//
		// for (int j = k + 1; j < a.length; j++) {
		// for (int i = 0; i <= k; i++) {
		// System.out.print(a[i]);
		// }
		// System.out.print(" " + a[j] + ", ");
		// }
		// System.out.println();
		// }
		int expectedSum = 10;
		int foundSum = 0;
		String foundSumPair = "";
		for (int m = 0; m <= a.length; m++)
			for (int k = 0; k < a.length - m; k++) {
				for (int j = k + 1 + m; j < a.length; j++) {
					foundSum = 0;
					foundSumPair = "";
					for (int i = m; i <= k + m; i++) {
						// System.out.print(a[i]);
						foundSum = foundSum + a[i];
						foundSumPair = foundSumPair + a[i] + ",";
					}
					// System.out.print(" " + a[j] + ", ");
					foundSum = foundSum + a[j];
					foundSumPair = foundSumPair + a[j];
					if (foundSum == expectedSum) {
						System.out.println("Found Combination: " + foundSumPair);

					}
				}

			}
	}

	private void arrayPairsSum() {
		int[] a = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int j = 20;
		HashMap<Integer, Integer> er = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a.length; k++) {
				if (i == k)
					continue;
				if (a[i] + a[k] == 20 && !er.containsKey(a[k])) {
					System.out.println(a[i] + " " + a[k]);
					er.put(a[i], a[k]);
				}
			}
		}

	}

	private void longestPalindrome() {
		String s = "HYTBCFEABCDEFGHIJKJIHGFEDCBAWAIOJWEABADEFGHABCDEDCBAGHTFYW1234567887654321ZWETYGDE";
		int j = 0, k = 0;

		StringBuffer s2 = new StringBuffer(s).reverse();
		for (int l = s.length() - 1; l >= 2; l--) {
			j = 0;
			for (int i = l; i <= s.length(); i++) {
				if (s2.indexOf(s.substring(j, i)) != -1) {
					System.out.println("Found Longest palindrome: " + s.substring(j, i) + " ");
					return;
				}
				j++;
			}
		}

	}

	private void tryLocale() {
		Locale locale = Locale.getDefault();
		// Locale locale=new Locale("fr","fr");//for the specific locale

		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getISO3Language());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());

	}

	int[] a1 = { 1, 2, 3 };

	int[] a2 = { 4, 5, 36 };

	private void passByValueOrPassByReference() {
		// TODO Auto-generated method stub

		System.out.println("Before Swap: a1");
		for (int i : a1) {
			System.out.println(i);
		}
		System.out.println("Before Swap: a2");
		for (int i : a2) {
			System.out.println(i);
		}

		swap(a1, a2);
		System.out.println("After Swap: a1");
		for (int i : a1) {
			System.out.println(i);
		}
		System.out.println("After Swap: a2");
		for (int i : a2) {
			System.out.println(i);
		}

	}

	private void swap(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
		int[] temp = a1;
		a1 = a2;
		a2 = temp;

		System.out.println("Inside Method: a1");
		for (int i : a1) {
			System.out.println(i);
		}
		System.out.println("Inside Method: a2");
		for (int i : a2) {
			System.out.println(i);
		}
	}

	private void arrayCopyOf() {
		// TODO Auto-generated method stub
		// initializing an array original
		int[] org = new int[] { 1, 2, 3 };

		System.out.println("Original Array");
		for (int i = 0; i < org.length; i++)
			System.out.print(org[i] + " ");

		// copying array org to copy
		int[] copy = Arrays.copyOf(org, 5);

		// Changing some elements of copy
		copy[3] = 11;
		copy[4] = 55;

		System.out.println("\nNew array copy after modifications:");
		for (int i = 0; i < copy.length; i++)
			System.out.print(copy[i] + " ");
	}

	private String[] sortDates(String[] dates) {
		// TODO Auto-generated method stub
		String year;
		String month;
		String date;
		String year2;
		String month2;
		String date2;
		String temp;

		for (int j = 0; j < dates.length - 1; j++)
			for (int i = 0; i < dates.length - 1; i++) {

				String[] separatedArray = dates[i].split(" ");
				year = separatedArray[2];
				month = separatedArray[1];
				date = separatedArray[0];
				separatedArray = dates[i + 1].split(" ");
				year2 = separatedArray[2];
				month2 = separatedArray[1];
				date2 = separatedArray[0];
				if (Integer.valueOf(year2) < Integer.valueOf(year)) {
					temp = dates[i];
					dates[i] = dates[i + 1];
					dates[i + 1] = temp;
				} else if (Integer.valueOf(year2) == Integer.valueOf(year)) {
					if (Integer.valueOf(month2) < Integer.valueOf(month)) {
						temp = dates[i];
						dates[i] = dates[i + 1];
						dates[i + 1] = temp;
					} else if (Integer.valueOf(month2) == Integer.valueOf(month)) {
						if (Integer.valueOf(date2) < Integer.valueOf(date)) {
							temp = dates[i];
							dates[i] = dates[i + 1];
							dates[i + 1] = temp;
						}
					}
				}

			}

		for (String string : dates) {
			System.out.println(string);
		}

		return dates;
	}

	private boolean checkStringRotation(String string, String string2) {
		int i = 0;
		int j;
		for (j = 0; j < string2.length(); j++) {
			if (string.charAt(i) == string2.charAt(j)) {
				break;
			}
		}

		boolean checkRotationFlag = true;
		for (int ik = 0; ik < string.length(); ik++) {

			System.out.println(string.charAt(ik) + " " + string2.charAt(j));
			if (string.charAt(ik) != string2.charAt(j)) {
				System.out.println("Not equal");
				checkRotationFlag = false;
			}
			j++;
			if (j >= string2.length()) {
				j = 0;
			}
		}
		return checkRotationFlag;
	}

	private char[] removeWhiteSpace(String s) {
		char[] news = new char[s.length()];
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.println("Space Found");
				continue;
			}

			news[j] = s.charAt(i);
			j++;
		}

		return news;
	}

	private boolean checkStringAnagram(String stringF, String stringL) {
		String string = stringF.toLowerCase();
		String string2 = stringL.toLowerCase();
		boolean stringAnagram = false;
		if (string.length() == string2.length()) {
			for (int i = 0; i < string.length(); i++) {
				stringAnagram = false;
				for (int j = 0; j < string.length(); j++) {
					if (string.charAt(i) == string2.charAt(j)) {
						stringAnagram = true;
					}
				}
				if (stringAnagram == false) {
					break;
				}
			}
		}
		return stringAnagram;
	}

	private static int secondLargestFromArray(int[] r) {
		// TODO Auto-generated method stub
		int largest = 0;
		int secondLargest = 0;
		largest = r[0];
		for (int i = 0; i < r.length; i++) {
			if (largest < r[i]) {
				secondLargest = largest;
				largest = r[i];
			}
		}

		return secondLargest;
	}

	private static ArrayList findDuplicatesFromArray(int[] r) {
		ArrayList duplicates = new ArrayList<Integer>();
		HashMap<Integer, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < r.length; i++) {
			if (freqMap.containsKey(r[i])) {
				freqMap.put(r[i], freqMap.get(r[i]) + 1);
			} else
				freqMap.put(r[i], 1);
		}

		boolean duplicate = false;
		for (Entry<Integer, Integer> i : freqMap.entrySet()) {
			if (i.getValue() > 1) {
				duplicates.add(i.getValue());
				duplicate = true;
			}
		}

		if (duplicate == false) {
			duplicates.add(-1);
		}
		return duplicates;

	}

	private void factorialSimple(int i) {
		int fact = 1;
		while (i != 0) {
			fact = fact * (i--);
		}
		System.out.println(fact);
	}

	private int factorialRecursion(int i) {
		if (i == 1) {
			return 1;
		}
		return i * factorialRecursion(--i);
	}

	private void checkPalindromeInteger(int i) {
		int checkNum = i;
		int temp = 0;
		while (i != 0) {
			System.out.println(i % 10);
			temp = temp * 10 + (i % 10);

			i = i / 10;
		}
		if (temp == checkNum) {
			System.out.println("Number is a palindrom");
		} else {
			System.out.println("Number is not a plaindrome");
		}

	}

	private void findLengthOfString(String s) {
		// TODO Auto-generated method stub
		int length = 0;
		for (int i = 0; i < 10; i++) {
			try {
				s.charAt(i);
				length++;
			} catch (StringIndexOutOfBoundsException e) {

			}
		}

		System.out.println("length of string" + length);
	}

	private void checkPalindromeString(String s) {
		// System.out.println(s.length());
		int j = 0;
		char[] temp = new char[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(i);
			temp[j] = s.charAt(i);
			j++;
		}

		if (String.valueOf(temp).equals(s)) {
			System.out.println("String is palindrome");
		}
		try {
			System.out.println();
		} finally {
			System.out.println();
			System.out.println();
		}
	}

	private void printFibonacciSeries(int count) {
		int a = 0, b = 1, c = 0;
		for (int i = 0; i < count; i++) {
			if (i == 0 || i == 1) {
				System.out.print(i + " ");
				continue;
			}
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}
}

class Simple {
	public Simple() {
		System.out.println("Constructor of Simple class is invoked");
	}

	void message() {
		System.out.println("Hello Java");
	}
}
