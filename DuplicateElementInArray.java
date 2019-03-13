package com.naidu.duplicateelements;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {

		int inputArray[] = { 1, 2, 3, 1, 2 };
		
		findDuplicatesUsingHashSet(inputArray);
		
		findDuplcatesusingHashMap(inputArray);
	}

	private static void findDuplicatesUsingHashSet(int[] inputArray) {

		HashSet<Integer> set = new HashSet<Integer>();

		/*
		 * for (int i = 0; i < inputArray.length; i++) { if
		 * (!set.add(inputArray[i])) {
		 * System.out.println("duplicate element is: " + inputArray[i]); } }
		 */
		// (or)

		for (Integer element : inputArray) {
			if (!set.add(element)) {
				System.out.println("duplicate element= " + element);
			}
		}
	}

	private static void findDuplcatesusingHashMap(int[] inputArray) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int element : inputArray) {

			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}
			// map.values();map.keySet();map.entrySet();
		}

		Set<Entry<Integer, Integer>> entryset = map.entrySet();
		for (Entry<Integer, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element: " + entry.getKey()
						+ " - found in " + entry.getValue() + " times");
			}
		}

	}

}
