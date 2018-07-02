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
import java.util.stream.IntStream;

public class Collections {

	
	BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

	public void removeArrayDupe(int[] arr) {

		
		List<Integer> removeDupe = new ArrayList<Integer>();
		Boolean exist = false;
		removeDupe.clear();
		
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
		
		System.out.println("Input:" +Arrays.toString(arr));
		System.out.println("Output: " +removeDupe);

			}
	

	public void removeSetDupe(int[] arr) {

		Set<Integer> setRemove = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) { 
			setRemove.add(arr[i]);
			   
			}
		
			System.out.println("Input: " +Arrays.toString(arr));
			System.out.println("Output: " +setRemove);
		}
		

	public void addArrayListEnd(int[] arr, int addEnd) {
		
		 ArrayList<Integer> addArrayEnd = new ArrayList<>();

			for (int i = 0; i < arr.length; i++) { 
				addArrayEnd.add(arr[i]);
			}
			
			addArrayEnd.add(addEnd);
			System.out.println(addArrayEnd.toString());
		
	}


	public void removeFirstValue(int[] arr, int value) {
		
		ArrayList<Integer> fml = new ArrayList<>();
		
		boolean removeFirst = false;
		
		for (int i = 0; i < arr.length; i++) { 
			if(removeFirst ||arr[i] != value) {
				
				fml.add(arr[i]);
				
			}

			else {
				removeFirst = true;

			}
		}
		
		System.out.println("Output: " +fml);

	}

	public Map<Integer, String> arrayMap (int[] keys, String[] values) {

		Map<Integer, String> map = new HashMap<Integer, String>();
	
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], values[i]);
		}

		return map;
	}
	
}