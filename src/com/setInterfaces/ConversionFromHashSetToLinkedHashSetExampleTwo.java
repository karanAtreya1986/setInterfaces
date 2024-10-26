package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConversionFromHashSetToLinkedHashSetExampleTwo {

	public static void main(String[] args) {

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
		hashSet1.add(null);
		hashSet1.add(null);
		hashSet1.add("gorilla");

		// adding hash set into link hash set directly.
		// first hash set added to link hash set.
		// all elements from hash set displayed first, then all elements from link hash
		// set.
		// uniqueness will always be there.

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>(hashSet1);
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("chimp");

		System.out.println("hash set " + hashSet1);
		System.out.println("updated link hash set " + linkHashSet1);

	}

}
