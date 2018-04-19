package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTypes {

	Scanner input = new Scanner(System.in);

	public void removeArrayDupe(int[] arr) {

		int arr2 = arr.length;
		
		System.out.println("Input Numbers ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {			
					
					System.out.println(arr[i]);
					
				}

			}

			
		}

	}

	public void removeSetDupe() {

	}

	public void addArraListEnd() {

	}

	public void removeFirstInArray(int[] arr) {

	}
}