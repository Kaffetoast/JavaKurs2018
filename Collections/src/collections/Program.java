package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {

		
		int[] arr = { 0, 8, 1, 2, 2, 1, 4, 7, 4, 7, 6, 3, 1, 9 };

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
				System.out.println("Input:");
				int addEnd = Integer.parseInt(input.readLine());
				System.out.println("Output:");
				arrayTypes.addArrayListEnd(arr, addEnd);
				
			}
			
			else if (choice == 4) {
				System.out.println("Input:");
				int removeFirst = Integer.parseInt(input.readLine());
				System.out.println("Output:");
				arrayTypes.removeFirstInArray(arr, removeFirst);
			


			}

			else if (choice == 5){
				String[] String = null;
				arrayTypes.hashMap(arr, String);
			}
		}
	}

}
