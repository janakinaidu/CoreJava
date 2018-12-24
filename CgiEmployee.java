package com.naidu.journeldevexample;

import java.util.Comparator;

public class CgiEmployee{
	private int id;
	private String name;
	private int age;
	private long salary;
	public CgiEmployee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	//This is required to print the user-friendly information about the Employee
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}
	/* Comparator */
	public static Comparator<CgiEmployee> salaryComparator = new Comparator<CgiEmployee>() {
		@Override
		public int compare(CgiEmployee e1, CgiEmployee e2) {
			if (e1.getSalary() > e2.getSalary()) {
				return 1;
			} else if (e1.getSalary() < e2.getSalary()) {
				return -1;
			} else
				return 0;
		}
	};
	public static Comparator<CgiEmployee> ageComparator = new Comparator<CgiEmployee>() {

		@Override
		public int compare(CgiEmployee e1, CgiEmployee e2) {
			if (e1.getAge() > e2.getAge()) {
				return 1;
			} else if (e1.getAge() < e2.getAge()) {
				return -1;
			}
			return 0;
		}
	};
	/**
	 * Comparator to sort employees list or array in order of Name
	 */
	public static Comparator<CgiEmployee> nameComparator = new Comparator<CgiEmployee>() {
		@Override
		public int compare(CgiEmployee e1, CgiEmployee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
	// All the above implementations of Comparator interface are anonymous
	// classes.
	
}
