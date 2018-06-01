package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		
		int[] arr = { 1,2,3,4,4,4,4,5,5,5,6,6,7 };

		int[] arrayResult;

		Collections arrayTypes = new Collections();
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

		while (true) {

			System.out.println("");
			System.out.println(" [1]. Remove Array dupes");
			System.out.println(" [2]. Remove Set dupes");
			System.out.println(" [3]. Add to Array end");
			System.out.println(" [4]. Remove first in Array");
			System.out.println(" [5]. Map with int + string Array");

			
			int choice = Integer.parseInt(input.readLine());

			if (choice == 1) {
				arrayTypes.removeArrayDupe(arr);
				

			}

			else if (choice == 2) {
				arrayTypes.removeSetDupe(arr);
				
			}

			else if (choice == 3) {
				System.out.println(Arrays.toString(arr));
				System.out.println("Input:");
				int addEnd = Integer.parseInt(input.readLine());
				System.out.println("Output:");
				arrayTypes.addArrayListEnd(arr, addEnd);
				
			}
			
			else if (choice == 4) {

				System.out.println(Arrays.toString(arr));
				System.out.println("Input:");
				int value = Integer.parseInt(input.readLine());
				arrayTypes.removeFirstValue(arr, value);


			}

			else if (choice == 5){
				
				String[] values = { "One", "Two", "Three", "Four", "Five" };
				int[] keys = { 1, 2, 3, 4, 5};

				System.out.println(
						"input: " + Arrays.toString(keys) + " Nums: " + Arrays.toString(values) + "\n");
				Map<Integer, String> map = arrayTypes.arrayMap(keys, values);
				
				System.out.println("Output: \n" + map.toString());
			}
		}
	}
}

