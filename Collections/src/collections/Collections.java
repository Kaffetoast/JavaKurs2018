package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) throws IOException {

		int[] arr = new int[] {2,3,3,4,5,5};

		ArrayTypes arrayTypes = new ArrayTypes();
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		

		while (true) {

			System.out.println("");
			System.out.println(" [1]. Remove Array dupes");
			System.out.println(" [2]. Remove Set dupes");
			System.out.println(" [3]. Add to Array end");
			System.out.println(" [4]. Remove first in Array");
			System.out.println(" [5]. Map with int + string Array");

			
			String choice = input.readLine();

			if (choice.equals("1")) {
				arrayTypes.removeArrayDupe(arr);

			}

			else if (choice.equals("2")) {
				arrayTypes.removeSetDupe(arr);
			}

			else if (choice.equals("3")) {
				System.out.println("Input:");
				int addEnd = Integer.parseInt(input.readLine());
				System.out.println("Output:");
				arrayTypes.addArrayListEnd(arr, addEnd);
				
			}
			
			else if (choice.equals("4")) {
				int removeFirst = 0;
				arrayTypes.removeFirstInArray(arr, removeFirst);
				

			}

			else if (choice.equals("5")) {
				String[] cars = null;
				arrayTypes.hashMap(arr, cars);
			}
		}
	}

}
