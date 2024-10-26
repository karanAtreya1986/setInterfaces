package com.setInterfaces;

import java.util.HashSet;
import java.util.TreeSet;

public class ClearMethodTreeSet {

	public static void main(String[] args) {

		TreeSet<String> hSet = new TreeSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add("goat");
		hSet.add("lion");

		// return type of clear is void
		hSet.clear();

		// after clear, we cant use the set anymore.
		System.out.println(hSet);
	}

}
