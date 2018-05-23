package collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collections {

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
			
			addArrayEnd.add(addEnd);
			System.out.println(addArrayEnd.toString());
			
		
		
	}

	public void removeFirstInArray(int[] arr, int removeFirst) {
		


	}
	
	public void hashMap(int [] arr, String[] String) {
		
		
		HashMap<Integer, String> hashMap= new HashMap<Integer, String>();
		
		for (int i = 0; i < String.length; i++) { 
			hashMap.put(arr[i], String[i]);
		}
		
	     
		System.out.println("Input");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(String));
		System.out.println("Output");
		hashMap.forEach((key,value) -> System.out.println(key+":"+value));
		
	
	}
	
	
	
}