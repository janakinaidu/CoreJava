package com.naidu.journeldevexample;

import java.util.Arrays;

public class JavaObjectSortingUsingComapratorForArrayOfObjects {
	public static void main(String[] args) {
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(10, "janakinaidu", 25, 500000);
		emp[1] = new Employee(20, "raja", 26, 500000);
		emp[2] = new Employee(5, "raju", 25, 35000);
		emp[3] = new Employee(1, "airforce", 28, 40000);
		
		// sort employees array using Comparator by Salary
		Arrays.sort(emp, EmployeeNew.salaryComparator);
		System.out.println("Employees list sorted by salary:\n"+Arrays.toString(emp));
		System.out.println("=====================");
		Arrays.sort(emp, EmployeeNew.ageComparator);
		System.out.println("Employees list sorted by salary:\n"+ Arrays.toString(emp));
		System.out.println("=====================");
		Arrays.sort(emp, EmployeeNew.nameComparator);
		System.out.println("Employees list sorted by Name:\n"+ Arrays.toString(emp));
		/*
		 * you can use the same for list as well and use Collections instead of
		 * Arrays;
		 */
	}
}
