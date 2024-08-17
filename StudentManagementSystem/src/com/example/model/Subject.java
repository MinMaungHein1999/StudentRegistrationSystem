package com.example.model;

public class Subject {
	
	private static int maxSubjectCount;
	private String name;
	private int id;
	private int credit;
	private static int count = 0;
	
	public static int getMaxSubjectCount() {
		return maxSubjectCount;
	}

	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "\nSubject [name=" + name + ", id=" + id + ", credit=" + credit + "]\n";
	}
	
	
}
