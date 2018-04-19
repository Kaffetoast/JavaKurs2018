package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,5};

		ArrayTypes arrayTypes = new ArrayTypes();
		Scanner input = new Scanner(System.in);


		while (true) {

			System.out.println("");
			System.out.println(" [1]. Remove Array dupes");
			System.out.println(" [2]. Remove Set dupes");
			System.out.println(" [3]. Add to Array");
			System.out.println(" [4]. Remove first in Array");
			System.out.println(" [5]. Map with int + string Array");

			String choice = input.next();

			if (choice.equals("1")) {
				arrayTypes.removeArrayDupe(arr);

			}

			else if (choice.equals("2")) {

			}

			else if (choice.equals("3")) {

			}

			else if (choice.equals("4")) {

			}

			else if (choice.equals("5")) {

			}
		}
	}

}