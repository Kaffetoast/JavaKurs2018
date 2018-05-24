package collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Collections {

	
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
		
			System.out.println(Arrays.toString(arr));
			System.out.println("Output:" +setRemove);
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
		
		List<String> list = new ArrayList<String>();
		list.remove(0);

		System.out.println(Arrays.toString(arr));
		System.out.println("Output:" +list.remove(removeFirst));
	}


	
	public void hashMap(int[] index, String[] apples) {
		

			Map <Integer, String> numApples = new LinkedHashMap<>();

			for (int i = 0; i < apples.length; i++) { 

				numApples.put(index[i], apples[i]);

			}
			System.out.println(Arrays.toString(index));
			System.out.println(Arrays.toString(apples));
			System.out.println("Output");

			numApples.forEach((key,value) -> System.out.println(key+":"+value));

		}
	
}