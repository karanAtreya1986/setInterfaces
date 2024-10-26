package com.setInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ConversionFromLinkedHashSetToHashSetExampleOne {

	public static void main(String[] args) {

		// link hash set to hash set

		LinkedHashSet<String> linkHashSet1 = new LinkedHashSet<>();
		linkHashSet1.add("tiger");
		linkHashSet1.add("tiger");
		linkHashSet1.add(null);
		linkHashSet1.add(null);
		linkHashSet1.add("gorilla");

		HashSet<String> hashSet1 = new HashSet<>();
		hashSet1.add("tiger");
		hashSet1.add("tiger");
		hashSet1.add(null);
		hashSet1.add(null);
		hashSet1.add("chimp");

		// using addall method
		// add link hash set into hash set
		// unique values only in set.

		System.out.println("original hash set is " + hashSet1);
		boolean b1 = hashSet1.addAll(linkHashSet1);
		System.out.println(b1);

		System.out.println("original link hash set is " + linkHashSet1);
		System.out.println("updated hash set is " + hashSet1);

	}

}
