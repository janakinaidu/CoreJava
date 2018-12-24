package com.naidu.journeldevexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaObjectSortingUsingComapratorForObject {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("janakinaidu");
		list1.add("abcdef");
		list1.add("xyz");
		list1.add("zero");
		list1.add("Robo2");
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("===================");

		List<CgiEmployee> newList = new ArrayList<CgiEmployee>();
		CgiEmployee cg1 = new CgiEmployee(101, "janakinaidu", 25, 50000);
		CgiEmployee cg2 = new CgiEmployee(105, "saiteja", 27, 49000);
		CgiEmployee cg3 = new CgiEmployee(104, "nagaraju", 26,27000);
		CgiEmployee cg4 = new CgiEmployee(103, "raja", 28, 30000);
		newList.add(cg1);
		newList.add(cg2);
		newList.add(cg3);
		newList.add(cg4);
		Collections.sort(newList, CgiEmployee.ageComparator);
		System.out.println("Employees list sorted by age:\n" + newList);
		System.out.println("=====================");
		Collections.sort(newList, CgiEmployee.salaryComparator);
		System.out.println("Employees list sorted by salary:\n" + newList);
		System.out.println("=====================");
		Collections.sort(newList, CgiEmployee.nameComparator);
		System.out.println("Employees list sorted by Name:\n" + newList);
	}
}
