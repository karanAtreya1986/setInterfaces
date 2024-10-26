package com.setInterfaces;

import java.util.LinkedHashSet;

public class LinkedHashSetWorking {

	// unique values, insertion and retrieval order maintained.
	// no duplicates.
	// insertion and retrieval order maintained.
	// rest same, foreach and iterator can be used for traversal.

	public static void main(String[] args) {

		LinkedHashSet<String> hSet = new LinkedHashSet<>();
		hSet.add("tiger");
		hSet.add("tiger");
		hSet.add(null);
		hSet.add(null);
		hSet.add("lion");

		// returns list of values.
		System.out.println(hSet);

	}

}
