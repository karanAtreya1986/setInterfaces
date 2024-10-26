package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConversionFromLinkedHashSetToHashSetExampleTwo {

	public static void main(String[] args) {

		// link hash set to hash set

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		// another way to add collections.

		HashSet<String> hashSet1 = new HashSet<>(linkHashSet1);
		hashSet1.add("tiger");
		hashSet1.add("tiger");
		hashSet1.add(null);
		hashSet1.add(null);
		hashSet1.add("chimp");

		// unique elements only for set.
		// link hash set added to hash set.

		System.out.println("hash set " + hashSet1);
		System.out.println("updated link hash set " + linkHashSet1);

	}

}
