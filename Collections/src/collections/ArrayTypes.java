package collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayTypes {

	Scanner scan = new Scanner(System.in);
	
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

	public void removeArrayDupe(int[] arr) {

		
		List<Integer> removeDupe = new ArrayList<Integer>();
		Boolean exist = false;
		removeDupe.clear();
		
		System.out.println("Input: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output: ");
		removeDupe.add(arr[0]);
		
		for (int i = 0; i < arr.length; i++) { 
			
			for (int j = 0; j < removeDupe.size(); j++) { 
			   if (arr[i]==removeDupe.get(j)) {
				   exist = true;
			   } 
			
			}
            if (exist != true) {
            	removeDupe.add(arr[i]);
            } else {
            	exist = false;
            }
		}
		
		System.out.println(removeDupe);

			}

			

	public void removeSetDupe(int[] arr) {

		Set<Integer> setRemove = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) { 
			setRemove.add(arr[i]);
			   
			}
			System.out.println("Input:");
			System.out.println(Arrays.toString(arr));
			System.out.println("Output:");
			System.out.println(setRemove);
		}
		

	public void addArrayListEnd(int[] arr, int addEnd) {
		
		 ArrayList<Integer> addArrayEnd = new ArrayList<>();
		 
		 
			for (int i = 0; i < arr.length; i++) { 
				addArrayEnd.add(arr[i]);
			}
			
			System.out.println("Input:");
			System.out.println(addArrayEnd.toString());
			System.out.println("Output:");
			addArrayEnd.add(addEnd);
			System.out.println(addArrayEnd.toString());
			
		
		
	}

	public void removeFirstInArray(int[] arr, int removeFirst) {
		
		int n = arr.length-1;
		int[] newarr = new int[n]; 
		int counter = 0;
		Boolean first = false; 
		for (int i = 0; i < arr.length; i++) { 
			
			 if (arr[i] != removeFirst || first == true) {
				 newarr[counter] = arr[i]; 
				 counter++;
			 } else {
			   first = true;
			   counter=i;
			 }
			 
			
		}

	}
	
	public void hashMap(int [] arr, String[] cars) {
		
		
		Map <Integer, String> numCars = new LinkedHashMap<>();
		
		for (int i = 0; i < cars.length; i++) { 
			numCars.put(arr[i], cars[i]);
		}
		
	     
		System.out.println("Input");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(cars));
		System.out.println("Output");
		numCars.forEach((key,value) -> System.out.println(key+":"+value));
	
	}
	
	
	
}