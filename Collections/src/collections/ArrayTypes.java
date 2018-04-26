package collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayTypes {

	Scanner scan = new Scanner(System.in);
	
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

	public void removeArrayDupe(int[] arr) {

		
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

	public void removeSetDupe(int[] arr) {

		Set<Integer> setRemove = new HashSet<Integer>();

		
		
		}
	}

	public void addArrayListEnd(int[] arr) {
		
		 ArrayList<Integer> addArray = new ArrayList<>();
		 
		
		
		
	}

	public void removeFirstInArray(int[] arr) {
		

	}
	
	public void hashMap(int [] arr) {
		
		
	}
}