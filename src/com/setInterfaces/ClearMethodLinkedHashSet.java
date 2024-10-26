package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ClearMethodLinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
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
