package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AddTwoCollectionsOfDifferentTypesExampleTwo {

	// No “set” method in hash set. Set is used for replacing and in set we cannot
	// have update because we can create duplicates.

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(0);
		a1.add(0);
		a1.add(1);

		// compile time error.
		// Cannot infer type arguments for HashSet<>
//		HashSet<String> hSet = new HashSet<>(a1);
//		hSet.add("tiger");
//		hSet.add("tiger");
//		hSet.add(null);
//		hSet.add(null);
//		hSet.add("lion");

	}

}
