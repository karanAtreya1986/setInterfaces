package com.setInterfaces;

import java.util.HashSet;

public class ClearMethodHashSet {

	public static void main(String[] args) {

		HashSet<String> hSet = new HashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// return type of clear is void
		hSet.clear();

		// after clear, we cant use the set anymore.
		System.out.println(hSet);
	}

}
