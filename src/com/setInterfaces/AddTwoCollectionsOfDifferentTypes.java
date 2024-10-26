package com.setInterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AddTwoCollectionsOfDifferentTypes {

	// No “set” method in hash set. Set is used for replacing and in set we cannot
	// have update because we can create duplicates.

	public static void main(String[] args) {

//		HashSet<String> hSet = new HashSet<>();
//		hSet.add("tiger");
//		hSet.add("tiger");
//		hSet.add(null);
//		hSet.add(null);
//		hSet.add("lion");
//
//		ArrayList<Integer> a1 = new ArrayList<>();
//		a1.add(1);
//		a1.add(2);
//		a1.add(0);
//		a1.add(0);
//		a1.add(1);

		// compile time error.
		// The method addAll(Collection<? extends String>) in the type
		// AbstractCollection<String> is not applicable for the arguments
		// (ArrayList<Integer>)
//		boolean b1 = hSet.addAll(a1);
//		System.out.println(b1);

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
