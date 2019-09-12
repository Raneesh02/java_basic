package baiscjava;

import java.util.Scanner;

public class CodeChefQuestionsBeginner {

	public static void main(String[] args) {

		CodeChefQuestionsBeginner chefQ = new CodeChefQuestionsBeginner();
		Scanner scan = new Scanner(System.in);
		int noOfCases = Integer.parseInt(scan.nextLine());
		if (!(noOfCases >= 1 && noOfCases <= 100)) {
			return;
		}
		int[] arr = null;

		for (int i = 1; i <= noOfCases; i++) {
			int noOfInt = Integer.parseInt(scan.nextLine());
			arr = new int[noOfInt];
			String[] arNums = scan.nextLine().split(" ");
			int j = 0;
			for (String string : arNums) {
				arr[j] = Integer.parseInt(string);
				j++;
			}
			chefQ.evenOddPairs(arr);
		}

	}

	private void evenOddPairs(int[] r) {
		byte pairs = 0;
		for (int i = 0; i < r.length; i++) {
			if (r[i] % 2 == 0) {
				for (int j = r.length - 1; j > i; j--) {
					if (r[j] % 2 != 0) {
						pairs++;
					}
				}
			}
		}

		System.out.println(pairs);
	}

}
