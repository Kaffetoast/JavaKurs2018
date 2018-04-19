package collections;

import java.util.Arrays;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 2, 2, 3, 3, 4, 4 };

		ArrayTypes arrayTypes = new ArrayTypes();
		Scanner scan = new Scanner(System.in);

		System.out.println(Arrays.toString(arr));

		while (true) {

			
			System.out.println("1. Remove Array dupes");
			System.out.println("2. Remove Set dupes");
			System.out.println("3. Add to Array");
			System.out.println("4. Remove first in Array");
			System.out.println("5. Map with int + string Array");

			String choice = scan.nextLine();

			if (choice.equals("1")) {
				scan.next();
				arrayTypes.arrayInt(arr);


			}

			else if (choice.equals("2")) {

			}

			else if (choice.equals("3")) {

			} else if (choice.equals("4")) {

			} else if (choice.equals("5")) {

			}
		}
	}

}
