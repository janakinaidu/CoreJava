package com.naidu.journeldevexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaObjectSorting {
	public static void main(String[] args) {
		// how to sort primitive arrays
		int[] intarr = { 1, 3, 4, 2, 6 };
		Arrays.sort(intarr);
		// System.out.println(Arrays.toString(intarr));

		// sorting String array
		String[] str = { "A", "Z", "C", "D" };
		Arrays.sort(str);
		// System.out.println(Arrays.toString(str));

		// sorting list of objects of Wrapper classes
		List<String> list = new ArrayList<String>();
		list.add("srinivas");
		list.add("janu");
		list.add("raja");
		list.add("nagaraju");
		Collections.sort(list);
		// System.out.println(list);

		// sorting object array:
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(10, "janakinaidu", 25, 500000);
		emp[1] = new Employee(20, "raja", 26, 500000);
		emp[2] = new Employee(5, "raju", 25, 35000);
		emp[3] = new Employee(1, "airforce", 28, 40000);

		Arrays.sort(emp);//you will get exception if you are not implement Comparable interface;
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		System.out.println("Default sorting of employees:\n" + emp);

		/*
		 * Exception in thread "main" java.lang.ClassCastException:
		 * com.journaldev.sort.Employee cannot be cast to java.lang.Comparable
		 * at
		 * java.util.ComparableTimSort.countRunAndMakeAscending(ComparableTimSort
		 * .java:290) at
		 * java.util.ComparableTimSort.sort(ComparableTimSort.java:157) at
		 * java.util.ComparableTimSort.sort(ComparableTimSort.java:146) at
		 * java.util.Arrays.sort(Arrays.java:472) at
		 * com.journaldev.sort.JavaSorting.main(JavaSorting.java:41)
		 */
		
		//Note:Above message will come if the E,ployee class directly sort with Arrays.sort() without 
		//implementing the Comparable interface;
		
	}
}
